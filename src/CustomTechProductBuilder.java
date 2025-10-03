public class CustomTechProductBuilder implements TechProductBuilder {
    private String productName;
    private String processor;
    private int ram;
    private int storage;
    private String graphics;
    private String operatingSystem;
    private float price = 800.00f; // default price of custom products

    @Override
    public void setProductName(String productName){ this.productName = productName; }

    @Override
    public void setProcessor(String processor) { this.processor = processor; }

    @Override
    public void setRAM(int ram) { this.ram = ram; }

    @Override
    public void setStorage(int storage){ this.storage = storage; }

    @Override
    public void setGraphics(String graphics) { this.graphics = graphics; }

    @Override
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }

    @Override
    public void setPrice(float price) { this.price = price; }

    @Override
    public TechProduct build(){
        return new TechProduct(productName, processor, ram, storage, graphics, operatingSystem, price);
    }
}
