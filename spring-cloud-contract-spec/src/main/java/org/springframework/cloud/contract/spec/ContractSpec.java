package org.springframework.cloud.contract.spec;


public abstract class ContractSpec {

    /**
     * You can set the level of priority of this contract. If there are two contracts
     * mapped for example to the same endpoint, then the one with greater priority should
     * take precedence. A priority of 1 is highest and takes precedence over a priority of 2.
     */
    private Integer priority;
    /**
     * The label by which you'll reference the contract on the message consumer side
     */
    private String label;
    /**
     * Description of a contract. May be used in the documentation generation.
     */
    private String description;
    /**
     * Name of the generated test / stub. If not provided then the file name will be used.
     * If you have multiple contracts in a single file and you don't provide this value
     * then a prefix will be added to the file with the index number while iterating
     * over the collection of contracts.
     * <p>
     * Remember to have a unique name for every single contract. Otherwise you might
     * generate tests that have two identical methods or you will override the stubs.
     */
    private String name;
    /**
     * Whether the contract should be ignored or not.
     */
    private boolean ignored;
    /**
     * The HTTP request part of the contract
     */
    protected RequestSpec request;
    /**
     * The HTTP response part of the contract
     */
    protected ResponseSpec response;
    /**
     * The input side of a messaging contract.
     */
    protected InputSpec input;
    /**
     * The output side of a messaging contract.
     */
    protected OutputMessageSpec outputMessage;

    public ContractSpec() {
    }

    public void priority(int priority) {
        this.priority = priority;
    }

    public void name(String name) {
        this.name = name;
    }

    public void label(String label) {
        this.label = label;
    }

    public void description(String description) {
        this.description = description;
    }

    public void ignored() {
        this.ignored = true;
    }
}
