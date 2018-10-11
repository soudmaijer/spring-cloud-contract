package org.springframework.cloud.contract.spec;

import groovy.lang.Closure;
import groovy.lang.DelegatesTo;
import org.springframework.cloud.contract.spec.internal.Input;
import org.springframework.cloud.contract.spec.internal.OutputMessage;
import org.springframework.cloud.contract.spec.internal.Request;
import org.springframework.cloud.contract.spec.internal.Response;

public abstract class AbstractContract {

    /**
     * You can set the level of priority of this contract. If there are two contracts
     * mapped for example to the same endpoint, then the one with greater priority should
     * take precedence. A priority of 1 is highest and takes precedence over a priority of 2.
     */
    Integer priority;
    /**
     * The HTTP request part of the contract
     */
    Request request;
    /**
     * The HTTP response part of the contract
     */
    Response response;
    /**
     * The label by which you'll reference the contract on the message consumer side
     */
    String label;
    /**
     * Description of a contract. May be used in the documentation generation.
     */
    String description;
    /**
     * Name of the generated test / stub. If not provided then the file name will be used.
     * If you have multiple contracts in a single file and you don't provide this value
     * then a prefix will be added to the file with the index number while iterating
     * over the collection of contracts.
     *
     * Remember to have a unique name for every single contract. Otherwise you might
     * generate tests that have two identical methods or you will override the stubs.
     */
    String name;
    /**
     * The input side of a messaging contract.
     */
    Input input;
    /**
     * The output side of a messaging contract.
     */
    OutputMessage outputMessage;

    /**
     * Whether the contract should be ignored or not.
     */
    boolean ignored;

    public AbstractContract() {}

    protected void priority(int priority) {
        this.priority = priority;
    }

    protected void name(String name) {
        this.name = name;
    }

    protected void label(String label) {
        this.label = label;
    }

    protected void description(String description) {
        this.description = description;
    }

    protected void ignored() {
        this.ignored = true;
    }

    // Language specific
//    /**
//     * Factory method to create the DSL
//     */
//    static Contract make(@DelegatesTo(Contract) Closure closure) {
//        Contract dsl = new Contract()
//        closure.delegate = dsl
//        closure()
//        return dsl
//    }

    // Language specific
//    void request(@DelegatesTo(Request) Closure closure) {
//        this.request = new Request()
//        closure.delegate = request
//        closure()
//    }

    // Language specific
//    void response(@DelegatesTo(Response) Closure closure) {
//        this.response = new Response()
//        closure.delegate = response
//        closure()
//    }

    // Language specific
//    void input(@DelegatesTo(Input) Closure closure) {
//        this.input = new Input()
//        closure.delegate = input
//        closure()
//    }

    // Language specific
//    void outputMessage(@DelegatesTo(OutputMessage) Closure closure) {
//        this.outputMessage = new OutputMessage()
//        closure.delegate = outputMessage
//        closure()
//    }

}
