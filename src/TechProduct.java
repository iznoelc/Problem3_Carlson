public class TechProduct {
    private String productName;
    private String processor;
    private int ram;
    private int storage;
    private String graphics;
    private String operatingSystem;
    private float price;

    /**
     * Constructor to initialize tech product specifications. Only accessible from the builder.
     * @param name, tech product's name.
     * @param processor, tech product's processor.
     * @param ram, amount of RAM in tech product.
     * @param storage, amount of storage in tech product, in GB.
     * @param graphics, graphics card of tech product.
     * @param operatingSystem, operating system of tech product.
     * @param price, price of tech product.
     */
    TechProduct(String name, String processor, int ram, int storage, String graphics, String operatingSystem, float price){
        this.productName = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphics = graphics;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    /**
     * Print out the specifications of the tech product.
     */
    public void printTechSpecifications() {
        System.out.println("Product: " + productName);
        System.out.println("Specifications: { Processor=" + processor + ", Storage=" + storage +
                "GB, Graphics Card=" + graphics + ", Operating System=" + operatingSystem + ", RAM=" +
                ram + "GB }");
        System.out.printf("Price: $%.2f", price);
    }
}
