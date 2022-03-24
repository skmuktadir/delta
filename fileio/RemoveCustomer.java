package fileio;
import java.io.*;
import java.util.*;
import java.lang.*;

public class RemoveCustomer {
    public void ReCustomer()
   {
        try {

             Scanner input=new Scanner(System.in);
                 System.out.println("Write Customer ID:");
                String ID= input.nextLine();
            File inputFile = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\customer.txt");
            if (!inputFile.isFile()) {
                System.out.println("File does not exist");
                return;
            }
            //Construct the new file that will later be renamed to the original filename

            File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileIo\\customer.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line = null;

            //Read from the original file and write to the new
            //unless content matches data to be removed.

            while ((line = br.readLine()) != null) {
               
                if (!line.startsWith(ID)) {
                    pw.println(line);
                    System.out.println("Customer removed");
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            ///Delete the original file
            if (!inputFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inputFile))
                System.out.println("Could not rename file");
            }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}