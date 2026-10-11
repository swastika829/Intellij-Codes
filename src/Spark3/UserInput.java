package Spark3;
import java.util.Scanner;
//import java.util.* ; sare libraries ek bar mein import hne k liye.
    class UserInput
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Value");
            int data=sc.nextInt(); /// calling

            System.out.println("your given data" + data);

            ///for printing names using userInput

            System.out.print("Enter First name: ");
            String fname=sc.next(); ///calling

            System.out.print("Enter last name: ");
            String lname=sc.next();

            String fullName=fname+lname;
            System.out.print(fullName);
        }
    }

