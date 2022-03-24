package fileio;
import java.io.*;
import java.util.*;
public class SearchCustomer
{
   public void SeaCus()
   {
   	 Scanner s= new Scanner(System.in);
   	 System.out.print("Enter customer id");
   	 String sid=s.next();
   	 String line;
   	 try
   	 {
       FileInputStream fin =new FileInputStream("/Users/skmuktadir/Desktop/Project/TRAVEL_AGENCY_PROJECT-3/TRAVEL Delta AGENCY PROJECT/Swich case/fileio/customer.txt");
       Scanner sc=new Scanner(fin);
       while(sc.hasNextLine())
       {
       	line=sc.nextLine();
       	if(line.startsWith(sid))
       	{
     
       		System.out.println(line);
            System.out.println("Search Complected");

       	}
       }
       sc.close();
   	 }
   	 catch(IOException ioe)
   	 {
   	 	ioe.printStackTrace();
   	 }
   }

}