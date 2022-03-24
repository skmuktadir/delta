package fileio;
import java.util.*;
import java.lang.*;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteComment {
  public  void ComWri() {
        
    try {
         Scanner input=new Scanner(System.in);
         String write=input.nextLine();
      FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\Comment.txt");
     System.out.println("Write a review :");
      myWriter.write(write);
      myWriter.close();
      System.out.println("Successfully wrote your review.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}