import java.util.Random;
import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;
import java.io.*;
import javax.swing.*;
public class Start
{
    public static void main(String []args)
    {
        System.out.println("***                 ***                    **        *  **            ***          **                            ");
        System.out.println("***       ***       ***         ****       **     *        *      *        *         *   **    **          ***");
        System.out.println("***      ** **      ***      *        *    **    *       * *     *            *        *     *     *      *       *");
        System.out.println("***     **   **     ***    *    ****       **   *               *             *       *     *     *    *    ****");
        System.out.println("***    **     **    ***    *               **    *              *            *        *     *     *    *");
        System.out.println("***   **       **   ***      *             **     *               *        *          *     *     *     *");
        System.out.println("***  **         **  ***         *****      **          ***            ***             *     *     *         *****");
        System.out.println(" ");





        System.out.println("WELCOME TO TRAVEL AGENCY");
        Scanner input = new Scanner(System.in);

        String choose, user, admin, pass, adminpass, adminuser, user1, pass1, a, b;


        boolean repeat = true;

        while (repeat) 
        {

            System.out.println("1.Enter 1 For Create a new Profile ");
            System.out.println("2.ENTER 2 Admin Login ");
            System.out.println("3.ENTER 3 About Us  ");
            System.out.println("4.ENTER 4 Review   ");
            System.out.println(" ");
            System.out.print("\tYour Choice : ");
            choose = input.nextLine();


            switch(choose)
            {
            case "1":
                System.out.println("\t\t\t\t--------------------------------------------------");
                System.out.println("\t\t\t\t***** WELCOME to regestation page ***** ");
                System.out.println("\t\t\t\t--------------------------------------------------");

                Registation reg = new Registation();
                System.out.print("\tEnter your name     : ");
                a = input.nextLine();
                System.out.print("\tWrite a password    : ");
                b = input.nextLine();
                System.out.print("\tRe-Write your pass  : ");
                String pass_re = input.nextLine();
                reg.set();
                if(b.equals(pass_re))
                {
                    System.out.println("\t\t\t\t-----------------------------------------------------------------");
                    System.out.println("\t\t\t\t***** Thank you " + a + " !Your regestation is complecte ***** ");
                    System.out.println("\t\t\t\t-----------------------------------------------------------------");

                }

                else
                {
                    System.out.println("\tPassword not matching !!!!");
                }
                System.out.println(" ");

                System.out.print("\tPlease Enter 1 For User login: ");
                String userlogin;
                userlogin = input.nextLine();
                System.out.print("\tEnter Your user name : ");
                user = input.nextLine();
                System.out.print("\tEnter Your user password : ");
                pass = input.nextLine();




                switch (userlogin)
                {
                case "1":

                    if ( user.equals(a) && pass.equals(b))
                    {
                        System.out.println(" ");

                        System.out.println(" ");
                        // create a string of all characters
                        String alphabet = "ABCD@!4678";

                        // create random string builder
                        StringBuilder sb = new StringBuilder();

                        // create an object of Random class
                        Random random = new Random();

                        // specify length of random string
                        int length = 7;

                        for(int i = 0; i < length; i++)
                        {

                            // generate random index number
                            int index = random.nextInt(alphabet.length());

                            // get character specified by index
                            // from the string
                            char randomChar = alphabet.charAt(index);

                            // append the character to string builder
                            sb.append(randomChar);







                        }
                        String randomString = sb.toString();
                        System.out.println("\tYour OTP IS: " + randomString);
                        System.out.print("\tPlease Write OTP :");
                        String otp = input.nextLine();

                        if (otp.equals(randomString))
                        {

                            System.out.println(" ");
                            System.out.println("\t........😊.......Your Login is Successful.........😊........");
                            System.out.println("-------------------------------------------");
                            System.out.println("What do you want to do?");
                            System.out.println("-------------------------------------------");
                            System.out.println("\t1. Show All Packages");

                            System.out.println("\t3.Log Out");
                            System.out.print("Your option: ");
                        }
                        else
                        {
                            System.out.println("\tYour OTP is Incorrect");
                        }
                    }

                    else
                    {
                        System.out.println("Invalid your user name or password");
                    }
                    String option1 = input.nextLine();
                    boolean repeat1 = true;

                    while (repeat1)
                    {



                        switch(option1)
                        {



                        case "1":
                            System.out.println("-------------------------------------------");
                            System.out.println("Show All Packages");
                            System.out.println("-------------------------------------------");
                            YourPackage pac1 = new YourPackage();
                            pac1.pack();
                            System.out.println(" ");
                            System.out.print("\tYour option: ");
                            int place = input.nextInt();

                            //boolean repeat1= true;



                            switch(place)
                            {
                            case (1):
                                System.out.println("-------------------------------------------");
                                System.out.println("Dhaka to COXS BAZAR ");
                                System.out.println("-------------------------------------------");
                                System.out.print("\tHow many days do you want to stay in COXS BAZAR :");
                                int days = input.nextInt();
                                Travel b1 = new Travel();
                                b1.set();



                                System.out.print("\tYour option: ");

                                String trav = input.next();


                                switch(trav)
                                {
                                case("1"):
                                {


                                    int result = days * 2500;
                                    System.out.println("\tPlease Pay Your Bill :" + result);

                                    /*Payment p= new Payment();
                                    p.GetPayment(); */

                                    CovidCheck Cov = new CovidCheck();
                                    Cov.set();

                                   Payment p= new Payment();
                                    p.GetPayment();

                                    repeat = false;
                                    repeat1 = false;

                                    break;
                                }
                                case("2"):


                                    int result2 = days * 1500;
                                    System.out.print("\tPlease Pay Your Bill :" + result2);
                                    CovidCheck Cov1 = new CovidCheck();
                                    Cov1.set();
                                     Payment p1= new Payment();
                                    p1.GetPayment();
                                    repeat = false;
                                    repeat1 = false;

                                    // repeat = false;

                                    break;
                                case("3"):


                                    int result3 = days * 7000;
                                    System.out.print("\tPlease Pay Your Bill :" + result3);
                                    CovidCheck Cov2 = new CovidCheck();
                                    Cov2.set();
                                    Payment p2= new Payment();
                                    p2.GetPayment();
                                    //repeat = false;
                                    repeat = false;
                                    repeat1 = false;

                                    break;

                                case("4"):
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Going Back................");
                                    System.out.println("-------------------------------------------");


                                    break;

                                default:
                                    System.out.println("-------------------------------------------");
                                    System.out.println("\tSorry You have Choose Invalid Option...............");
                                    System.out.println("-------------------------------------------");
                                    // repeat = false;
                                    break;


                                }
                                break;
                            case(2):
                                System.out.println("-------------------------------------------");
                                System.out.println("Dhaka to SAINTMARTIN ");
                                System.out.println("-------------------------------------------");
                                System.out.print("\tHow many days do you want to stay in SAINTMARTIN :");
                                int days1 = input.nextInt();
                                Travel b2 = new Travel();
                                b2.set();



                                System.out.print("\tYour option: ");

                                int trav2 = input.nextInt();

                                switch(trav2)
                                {
                                case(1):


                                    int result4 = days1 * 2500;
                                    System.out.print("\tPlease Paid Your Bill :" + result4);
                                    CovidCheck Cov3 = new CovidCheck();
                                    Cov3.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(2):


                                    int result5 = days1 * 1500;
                                    System.out.print("\tPlease Paid Your Bill :" + result5);
                                    CovidCheck Cov4 = new CovidCheck();
                                    Cov4.set();
                                    //System.out.println("hlw ok..................");
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(3):


                                    int result6 = days1 * 7000;
                                    System.out.print("\tPlease Paid Your Bill :" + result6);
                                    CovidCheck Cov5 = new CovidCheck();
                                    Cov5.set();
                                    repeat = false;
                                    repeat1 = false;


                                    break;
                                case(4):
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Going Back................");
                                    System.out.println("-------------------------------------------");

                                    break;



                                }
                                //repeat = false;

                                break;
                            case(3):
                                System.out.println("-------------------------------------------");
                                System.out.println("Dhaka to SUNDARBANS ");
                                System.out.println("-------------------------------------------");
                                System.out.print("\tHow many days do you want to stay in SUNDARBANS :");
                                int Sundays1 = input.nextInt();
                                Travel b3 = new Travel();
                                b3.set();



                                System.out.print("\tYour option: ");

                                int Suntrav2 = input.nextInt();

                                switch(Suntrav2)
                                {
                                case(1):


                                    int result4 = Sundays1 * 2500;
                                    System.out.print("\tPlease Paid Your Bill :" + result4);
                                    CovidCheck Cov6 = new CovidCheck();
                                    Cov6.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(2):


                                    int result5 = Sundays1 * 1500;
                                    System.out.print("\tPlease Paid Your Bill :" + result5);
                                    CovidCheck Cov15 = new CovidCheck();
                                    Cov15.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(3):


                                    int result6 = Sundays1 * 7000;
                                    System.out.print("\tPlease Paid Your Bill :" + result6);
                                    CovidCheck Cov7 = new CovidCheck();
                                    Cov7.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(4):
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Going Back................");
                                    System.out.println("-------------------------------------------");

                                    break;



                                }
                            case(4):
                                System.out.println("-------------------------------------------");
                                System.out.println("Dhaka to CHITTAGONG HILL TRACKS ");
                                System.out.println("-------------------------------------------");
                                System.out.print("\tHow many days do you want to stay in CHITTAGONG HILL TRACKS :");
                                int ChitDays1 = input.nextInt();
                                Travel b4 = new Travel();
                                b4.set();



                                System.out.print("\tYour option: ");

                                int ChitSuntrav2 = input.nextInt();

                                switch(ChitSuntrav2)
                                {
                                case(1):


                                    int result4 = ChitDays1 * 2500;
                                    System.out.print("\tPlease Paid Your Bill :" + result4);
                                    CovidCheck Cov8 = new CovidCheck();
                                    Cov8.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(2):


                                    int result5 = ChitDays1 * 1500;
                                    System.out.print("\tPlease Paid Your Bill :" + result5);
                                    CovidCheck Cov9 = new CovidCheck();
                                    Cov9.set();
                                    repeat = false;
                                    repeat1 = false;

                                    break;
                                case(3):


                                    int result6 = ChitDays1 * 7000;
                                    System.out.print("\tPlease Paid Your Bill :" + result6);
                                    CovidCheck Cov10 = new CovidCheck();
                                    Cov10.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(4):
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Going Back................");
                                    System.out.println("-------------------------------------------");

                                    break;



                                }

                            case(5):
                                System.out.println("-------------------------------------------");
                                System.out.println("Dhaka to SRIMANGAL ");
                                System.out.println("-------------------------------------------");
                                System.out.print("\tHow many days do you want to stay in SRIMANGAL :");
                                int SRIMANGALtDays1 = input.nextInt();
                                Travel b5 = new Travel();
                                b5.set();



                                System.out.print("\tYour option: ");

                                int SRIMANGALtrav2 = input.nextInt();

                                switch(SRIMANGALtrav2)
                                {
                                case(1):


                                    int result4 = SRIMANGALtDays1 * 2500;
                                    System.out.print("\tPlease Paid Your Bill :" + result4);
                                    CovidCheck Cov11 = new CovidCheck();
                                    Cov11.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(2):


                                    int result5 = SRIMANGALtDays1 * 1500;
                                    System.out.print("\tPlease Paid Your Bill :" + result5);
                                    CovidCheck Cov12 = new CovidCheck();
                                    Cov12.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(3):


                                    int result6 = SRIMANGALtDays1 * 7000;
                                    System.out.print("\tPlease Paid Your Bill :" + result6);
                                    CovidCheck Cov14 = new CovidCheck();
                                    Cov14.set();
                                    repeat = false;
                                    repeat1 = false;
                                    break;
                                case(4):
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Going Back................");
                                    System.out.println("-------------------------------------------");

                                    break;



                                }

                                repeat = false;

                                break;
                            }

                            break;

                        case "3":
                            System.out.println("-------------------------------------------");
                            System.out.println("\t Log Out ");
                            System.out.println("-------------------------------------------");

                            repeat = false;
                            repeat1 = false;

                            break;
                        }

                    }
                    break;
                case "3":

                    break;

                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("\tSorry You have Choose Invalid Option...............");
                    System.out.println("-------------------------------------------");
                    break;

                }


                break;



            case "2":

            {

                boolean repeat10 = true;

                String uname =  JOptionPane.showInputDialog("Enter Your Name");
                String passw =  JOptionPane.showInputDialog("Enter Your password");

                if(uname.equals("admin") && passw.equals("admin"))
               // boolean repeat7=true;
                {
                    //JOptionPane.showMessageDialog(null, "welcome");
                    String alphabet = "123";

                    // create random string builder
                    StringBuilder sb = new StringBuilder();

                    // create an object of Random class
                    Random random = new Random();

                    // specify length of random string
                    int length = 2;

                    for(int i = 0; i < length; i++)
                    {

                        // generate random index number
                        int index = random.nextInt(alphabet.length());

                        // get character specified by index
                        // from the string
                        char randomChar = alphabet.charAt(index);

                        // append the character to string builder
                        sb.append(randomChar);



                    }
                    String randomString = sb.toString();
                    //  System.out.println("\tYour OTP IS: " + randomString);
                    JOptionPane.showMessageDialog(null, "Your user name and password is correct.Please click OK for get your OTP");
                    String otp = JOptionPane.showInputDialog(null, randomString + " is your OTP.Enter it below ");

                    if (otp.equals(randomString))
                    {

                        JOptionPane.showMessageDialog(null, "Welcome " ); //...................................................................
                        
                           while (repeat10)
                           {

                        System.out.println(" Choose Your Option:");
                        System.out.println("");
                        System.out.println("1. Customer management:");
                        System.out.println("2. Services");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Go back");
                        boolean repeat5 = true;
                        String choose1 = input.nextLine();
                        
                        switch(choose1)
                        {
                        case "1":
                        {
                            boolean repeat6=true;
                           // while(repeat6){
                            System.out.println("");
                            System.out.println("welcome to Customer management section:");

                            System.out.println(" Choose Your Option:");
                            System.out.println("");
                            System.out.println("1.Add Customer:");
                            System.out.println("2.Remove Customer:");
                            System.out.println("3.Search Customer:");
                            System.out.println("4.Show all customer:");
                            System.out.println("5.Go back");
                            System.out.println("");
                            String choose2 = input.nextLine();

                            switch(choose2)
                            {
                            case "1":
                            {
                                AddCustomer a1 = new AddCustomer();
                                a1.getAdd();
                                break;
                            }
                            case "2":
                            {

                                RemoveCustomer b1 = new RemoveCustomer();
                                b1.ReCustomer();
                                break;
                            }
                            case "3":
                            {

                                SearchCustomer sc = new SearchCustomer();
                                sc.SeaCus();
                                break;

                            }
                            case "4":
                            {
                                CustomerRead c = new CustomerRead();
                                c.read();

                            }
                            case "5":
                            {
                                break;
                            }
                             }
                            

                            break;
                            //..............................
                        }

                        case "2":
                        {   


                            System.out.println("Customer Comments Read");
                            Read r1 = new Read();
                            r1.getRead();

                            break;
                        }

                        case "3":
                        {
                             AmountRead ar= new AmountRead();
                             ar.getARead();

                            break;
                        }
                        case "4":
                        {
                            System.out.println("-------------------------------------------");
                            System.out.println("Going Back................");
                            System.out.println("-------------------------------------------");

                            break;
                        }


                        }





                    }//.........................................end if
                }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "wrong OTP");
                    }


                }
                else
                {
                    JOptionPane.showMessageDialog(null, "password wrong");
                }
            










              

            }
        





           // repeat = true;
             break;
            case "3":
            AboutUs au =new AboutUs();
            au.GetAbout();
             break;
              case "4":
                   {
                      WriteComment wc=new WriteComment();
                      wc.ComWri();  

                   }
            
             break;

            case "5":
                System.out.println("\t-------------------------------------------");
                System.out.println("\tYou have choose to Exit");
                System.out.println("\t-------------------------------------------");

                repeat = false;

                break;

            default:
                System.out.println("\t-------------------------------------------");
                System.out.println("\t Sorry You have Choose Invalid Option...............");
                System.out.println("\t-------------------------------------------");
                break;

            }




        }
    }
}
