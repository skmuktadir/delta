package fileio;
import java.io.*;
import java.util.*;

public class AmountRead
{
	public void getARead()
	{
		try{
		File file = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\amount.txt");  //location must be the path where the file is saved
		Scanner sc = new Scanner(file);


				while(sc.hasNext())
				{
					int line1 = sc.nextInt();
				        int  a =line1;
                                        int p=1230;
                                        int sum= a+p;

                             System.out.println("............................................................");
                              System.out.println("Your Old balance is "+p);
                              System.out.println("Your New added balance is "+a);
                             System.out.println("............................................................");
                                System.out.println("Total :"+sum);
				
				}
			sc.close();   //closing the file 
 			
		}
		catch(Exception ex)
		{
			return;
		}
	}
}