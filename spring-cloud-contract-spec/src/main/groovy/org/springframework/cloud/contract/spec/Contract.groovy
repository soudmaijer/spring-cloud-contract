/*
 *  Copyright 2013-2017 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.contract.spec

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TypeChecked

/**
 * The point of entry to the DSL
 *
 * @since 1.0.0
 */
@TypeChecked
@EqualsAndHashCode
@ToString(includePackage = false, includeNames = true)
class Contract extends ContractSpec {

    protected Contract() {}

    /**
     * Factory method to create the DSL
     */
    static Contract make(@DelegatesTo(Contract) Closure closure) {
        Contract dsl = new Contract()
        closure.delegate = dsl
        closure()
        return dsl
    }

    void request(@DelegatesTo(RequestSpec) Closure closure) {
        this.request = new RequestSpec()
        closure.delegate = request
        closure()
    }

    void response(@DelegatesTo(ResponseSpec) Closure closure) {
        this.response = new ResponseSpec()
        closure.delegate = response
        closure()
    }

    void input(@DelegatesTo(InputSpec) Closure closure) {
        this.input = new InputSpec()
        closure.delegate = input
        closure()
    }

    void outputMessage(@DelegatesTo(OutputMessageSpec) Closure closure) {
        this.outputMessage = new OutputMessageSpec()
        closure.delegate = outputMessage
        closure()
    }
}
