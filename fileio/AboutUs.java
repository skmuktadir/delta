package fileio;
import java.io.*;
import java.util.*;

public class AboutUs
{
	public void GetAbout()
	{
		try{
		File file = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\AboutUs.txt");  //location must be the path where the file is saved
		Scanner sc = new Scanner(file);


				while(sc.hasNext())
				{
					String line1 = sc.nextLine();
					String line2 = sc.nextLine();
					//String line3 = sc.nextLine();

				 	System.out.println(line1);
					System.out.println(line2);
					//System.out.println(line3);
					//System.out.println("////////////////////////////");
					//System.out.println("File has been read ");

				}
			sc.close();   //closing the file 
 			
		}


		catch(Exception ex)
		{
			return;
		}
	}
}