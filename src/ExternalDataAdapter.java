import java.util.List;

public interface ExternalDataAdapter {
    /**
     * A method to fetch data from an external data source (i.e. csv file)
     * @return List of the data stored as string arrays.
     */
    List<String[]> fetchData();

    /**
     * Search for a specific product within the external data.
     * @param productName, the product being searched for.
     * @return all specifications of the found product or null if the product cannot be found.
     */
    String[] searchForProduct(String productName);
}
