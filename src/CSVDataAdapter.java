import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVDataAdapter implements ExternalDataAdapter {
    private String filePath; // file path of csv data
    private BufferedReader reader = null; // buffered reader to read in csv data
    private String line = ""; // used to store lines of specifications as they are read in

    // ideally, it would probably be better if this was an array list of array list of strings. but
    // i have spent too long on reading this csv data, and this is what has worked. so i will leave it as
    // this.
    private List<String[]> data;

    /**
     * Constructor to initialize the CSVDataAdapter with the file path of where it will
     * retrieve the data from.
     * @param filePath, the file path of the csv data
     */
    public CSVDataAdapter(String filePath){
        this.filePath = filePath;
    }

    /**
     * Fetch the default product specifications from the csv file, printing out each one as it is
     * retrieved.
     * @return a List of string arrays containing specifications
     */
    public List<String[]> fetchData() {
        try {
            System.out.println("CSV Contents:");
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine(); // skip header

            data = new ArrayList<>();
            while((line = reader.readLine()) != null){
                String[] specifications = line.split(",");
                System.out.println(Arrays.toString(specifications));
                data.add(specifications);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        return data;
    }

    /**
     * Search for a specific product from the default product csv.
     * @param productName, the product we are searching for
     * @return the product we searched for and found, or null if the product could not be found.
     */
    public String[] searchForProduct(String productName){
        if (data == null){
            System.out.println("Could not search for product because there is no data.");
            return null;
        }

        System.out.println("Searching for " + productName);

        // look through all string arrays in arraylist of products
        for(String[] product : data){
            // if the first slot (product name) is equal to the product name we are searching for,
            // return it
            if (productName.equalsIgnoreCase(product[0])){
                System.out.println("Found " + productName);
                return product;
            }
        }

        // otherwise, we did not find the product so return null
        System.out.println("Product not found");
        return null;
    }

}
