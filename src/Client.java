public class Client {
    public static void main(String[] args){
        TechProductBuilder builder = new CustomTechProductBuilder();
        TechProduct testCase1;

        System.out.println("---TECH STORE---");
        System.out.println("Our default products (csv contents):");
        // print products from csv here

        // TEST CASE ONE: build a custom product
        System.out.println(">> BUILDING CUSTOM LAPTOP >>");
        builder.setProductName("Custom laptop");
        builder.setProcessor("Intel i7");
        builder.setRAM(8);
        builder.setStorage(128);
        builder.setGraphics("N/A");
        builder.setOperatingSystem("Windows 11");

        testCase1 = builder.build();

        System.out.println("CUSTOM LAPTOP BUILT.........");
        System.out.println(">> PRINTING SPECIFICATIONS >>");
        testCase1.printTechSpecifications();

        // TEST CASE TWO: build a product from the csv file
    }
}