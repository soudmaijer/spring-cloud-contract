// We need to be in the same package as the Contract to be able to instantiate it.
package org.springframework.cloud.contract.spec

/**
 * Top level Contract Dsl initializer
 */
fun contract(init: ContractDsl.() -> Unit) = ContractDsl().apply(init)

/**
 * Kotlin contract definition, delegates the real functionality to the Groovy Contract class.
 *
 * @author Stephan Oudmaijer
 * @since 2.1.0
 */
open class ContractDsl : ContractSpec() {

    fun ContractSpec.input(init: InputSpec.() -> Unit) {
        val i = InputSpec()
        i.init()
        this.input = i
    }

    fun ContractSpec.outputMessage(init: OutputMessageSpec.() -> Unit) {
        val o = OutputMessageSpec()
        o.init()
        this.outputMessage = o
    }

    fun ContractSpec.request(init: RequestSpec.() -> Unit) {
        val r = RequestSpec()
        r.init()
        this.request = r
    }

    fun ContractSpec.response(init: ResponseSpec.() -> Unit) {
        val r = ResponseSpec()
        r.init()
        this.response = r
    }
}
