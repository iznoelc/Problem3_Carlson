public interface TechProductBuilder {
    // Setters for the tech product.
    // Return the product itself after each step, creating a fluent interface.
    // Allows for the builder to string multiple calls together (see Client)
    TechProductBuilder setProductName(String productName);
    TechProductBuilder setProcessor(String processor);
    TechProductBuilder setRAM(int ram);
    TechProductBuilder setStorage(int storage);
    TechProductBuilder setGraphics(String graphics);
    TechProductBuilder setOperatingSystem(String operatingSystem);
    TechProductBuilder setPrice(float price);
    TechProduct build();
}
