public class CustomTechProductBuilder implements TechProductBuilder {
    private String productName;
    private String processor;
    private int ram;
    private int storage;
    private String graphics;
    private String operatingSystem;
    private float price = 800.00f; // default price of custom products

    /**
     * Set the tech product's name.
     * @param productName, name tech product should have (i.e. model).
     * @return the TechProductBuilder for stringing together calls.
     */
    @Override
    public TechProductBuilder setProductName(String productName){
        this.productName = productName;
        return this;
    }

    /**
     * Set the tech product's processor.
     * @param processor, the processor the tech product should have.
     * @return the TechProductBuilder for stringing together calls.
     */
    @Override
    public TechProductBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    /**
     * Set the tech product's RAM.
     * @param ram, amount of ram tech product should have.
     * @return the TechProductBuilder for stringing together calls.
     */
    @Override
    public TechProductBuilder setRAM(int ram) {
        this.ram = ram;
        return this;
    }

    /**
     * Set the tech product's storage in GB.
     * @param storage, amount of storage tech product should have in GB.
     * @return the TechProductBuilder for stringing together calls.
     */
    @Override
    public TechProductBuilder setStorage(int storage){
        this.storage = storage;
        return this;
    }

    /**
     * Set the tech product's graphics card.
     * @param graphics, graphics card tech product should have.
     * @return the TechProductBuilder for stringing together calls.
     */
    @Override
    public TechProductBuilder setGraphics(String graphics) {
        this.graphics = graphics;
        return this;
    }

    /**
     * Set the tech product's operating system.
     * @param operatingSystem, operating system tech product should have.
     * @return the TechProductBuilder for stringing together calls.
     */
    @Override
    public TechProductBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * Set the tech product's price.
     * @param price, price the tech product should have.
     * @return the TechProductBuilder for stringing together calls.
     */
    @Override
    public TechProductBuilder setPrice(float price) {
        this.price = price;
        return this;
    }

    @Override
    public TechProduct build(){
        return new TechProduct(productName, processor, ram, storage, graphics, operatingSystem, price);
    }
}
