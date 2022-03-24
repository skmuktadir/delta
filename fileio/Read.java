package fileio;
import java.io.*;
import java.util.*;

public class Read
{
	public void getRead()
	{
		try{
		File file = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\Comment.txt");  //location must be the path where the file is saved
		Scanner sc = new Scanner(file);


				while(sc.hasNext())
				{
					String line1 = sc.nextLine();
					//String line2 = sc.nextLine();

				 	System.out.println(line1);
					//System.out.println(line2);
				}
			sc.close();   //closing the file 
 			
		}
		catch(Exception ex)
		{
			return;
		}
	}
}