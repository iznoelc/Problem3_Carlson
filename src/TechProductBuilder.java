public interface TechProductBuilder {
    void setProductName(String productName);
    void setProcessor(String processor);
    void setRAM(int ram);
    void setStorage(int storage);
    void setGraphics(String graphics);
    void setOperatingSystem(String operatingSystem);
    void setPrice(float price);
    TechProduct build();
}
