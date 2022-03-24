package classes;
//import interfaces.*;


import java.util.Scanner;
public class CovidCheck{

	public void set()
	{
      Scanner inport=new Scanner(System.in);
      System.out.println(" ");
		System.out.println("\t**************         Please Check Your COVID-19 Pass     *************");
                           System.out.println(" ");
                           System.out.print("\tEnter Your NID Number : ");

                           int coxs1user=inport.nextInt();
                                                         

                           System.out.print("\tEnter Your COVID-19 TEST REGISTRATION NUMBER : ");
                                                           
                           int coxs1pass=inport.nextInt();

                           if ( coxs1user==134&& coxs1pass==123 )
                                                                {
                            System.out.println(" ");
                                
                            System.out.println("\t.........😊.......Congratulations You Can Travel.........😊........");
                                                                }
                              else
                                 {
                                      System.out.println(" ");
                                      System.out.println("......😓.......Sorry You are not allow for travel.......😢........");

                                   }
	}
}