package  fileio;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Payment
{

public  void GetPayment()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How do you want to Pay ? \n");
        System.out.println("1. Bkash \n");
        System.out.println("2. Credit Card/Debit Card  \n");
        System.out.println("Enter your prefered option : \n");
        String pay = input.nextLine();
        if(pay.equals("1"))
        {
            System.out.println("Enter your Bkash Number \n");
			String num = input.nextLine();
			System.out.println("Enter Amount \n");
			String amount = input.nextLine();
			
             try {
      FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\amount.txt");
      myWriter.write(amount);
      myWriter.close();
  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

            System.out.println("Your Paymen is done");
            System.out.println("Thank You \n");


        }
        else if(pay.equals("2"))
        {
            System.out.println("Enter Your Credit or Debit card Number \n");
			String num = input.nextLine();
			System.out.println("Enter Amount \n");
			int amount = input.nextInt();
			System.out.println("Your Paymen is done");
			System.out.println("Thank You \n");
          try {
      FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\TRAVEL_AGENCY_PROJECT\\TRAVEL AGENCY PROJECT\\Swich case\\fileio\\amount.txt");
      myWriter.write(amount);
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        }
        else
        {
            System.out.println("Invalid Inpuy \n");
        }
    }

}