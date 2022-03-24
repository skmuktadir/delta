package fileio;
import java.io.*;
import java.util.*;
import java.lang.*;
public class AddCustomer {






	 public void getAdd()
	{
		try{
			FileWriter fw =new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\customer.txt",true);
			PrintWriter pw =new PrintWriter(fw);
			Scanner input= new Scanner(System.in);
			System.out.print("Enter User ID:");
			String iD= input.nextLine();
			System.out.print("Enter User Name:");
			String name= input.nextLine();
			System.out.print("Enter User Contract:");
			String con= input.nextLine();
			pw.println(iD+"   "+name+"      "+con);
			System.out.println("New customer added");
			pw.close();
		}
	     catch (IOException e)
	{
		e.printStackTrace();
	}
}
}