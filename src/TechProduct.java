public class TechProduct {
    private String productName;
    private String processor;
    private int ram;
    private int storage;
    private String graphics;
    private String operatingSystem;
    private float price;

    TechProduct(String name, String processor, int ram, int storage, String graphics, String operatingSystem, float price){
        this.productName = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphics = graphics;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public void printTechSpecifications() {
        System.out.println("Product: " + productName);
        System.out.println("Specifications: { Processor=" + processor + ", Storage=" + storage +
                "GB, Graphics Card=" + graphics + ", Operating System=" + operatingSystem + ", RAM=" +
                ram + "GB }");
        System.out.printf("Price: $%.2f", price);
    }
}
