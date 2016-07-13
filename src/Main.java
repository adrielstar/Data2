import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    private final static String CSV_FILE = "data.csv";
    public static void main(String[] args) throws IOException {
        Main application = new Main();
        application.readCsv();

    }

    public void readCsv() {

        String csvFile = CSV_FILE;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);

                System.out.println("Data [Time= " + data[0]
                        + " , Demand=" + data[1] + "]");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//        System.out.println("Done");
    }
}
