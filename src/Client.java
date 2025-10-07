import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        TechProductBuilder builder = new CustomTechProductBuilder();
        ExternalDataAdapter adapter = new CSVDataAdapter("src\\sampleCSV.csv");
        TechProduct testCase1, testCase2;

        System.out.println("---TECH STORE---");
        adapter.fetchData(); // fetch csv data from the adapter and print it out

        System.out.println();

        // TEST CASE ONE: build a custom product
        System.out.println(">> BUILDING CUSTOM LAPTOP >>");
        testCase1 = builder
                    .setProductName("Custom laptop")
                    .setProcessor("Intel i7")
                    .setRAM(8)
                    .setStorage(128)
                    .setGraphics("N/A")
                    .setOperatingSystem("Windows 11")
                    .build();

        System.out.println("CUSTOM LAPTOP BUILT.........");
        System.out.println(">> PRINTING SPECIFICATIONS >>");
        testCase1.printTechSpecifications();

        System.out.println();
        System.out.println();

        // TEST CASE TWO: build a product from the csv file
        System.out.println(">> BUILDING A DEFAULT PRODUCT (SMARTPHONE MODEL X) >>");
        String[] defaultProduct;
        if((defaultProduct = adapter.searchForProduct("Smartphone Model X")) != null) {
            System.out.println("Building Smartphone Model X");
            testCase2 = builder
                    .setProductName(defaultProduct[0])
                    .setProcessor(defaultProduct[1])
                    .setRAM(Integer.parseInt(defaultProduct[2]))
                    .setStorage(Integer.parseInt(defaultProduct[3]))
                    .setGraphics(defaultProduct[4])
                    .setOperatingSystem(defaultProduct[5])
                    .setPrice(Float.parseFloat(defaultProduct[6]))
                    .build();
            System.out.println("SMARTPHONE MODEL X BUILT.........");
            System.out.println(">> PRINTING SPECIFICATIONS >>");
            testCase2.printTechSpecifications();
        } else {
            System.out.println(("Could not build"));
        }
    }
}