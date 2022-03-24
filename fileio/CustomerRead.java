package fileio;
import java.io.*;
import java.util.*;

public class CustomerRead
{
	public void read()
	{
		try{
		File file = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\customer.txt");  //location must be the path where the file is saved
		Scanner sc = new Scanner(file);


				while(sc.hasNext())
				{
					String line1 = sc.nextLine();
					String line2 = sc.nextLine();
                                        String line3 = sc.nextLine();
					String line4 = sc.nextLine();
                                        String line5 = sc.nextLine();
				 	System.out.println(line1);
					System.out.println(line2);
                                        System.out.println(line3);
					System.out.println(line4);
                                        System.out.println(line5);
				}
			System.out.println(file.getName());
			sc.close();   //closing the file 
 			
		}
		catch(Exception ex)
		{
			return;
		}
	}
}