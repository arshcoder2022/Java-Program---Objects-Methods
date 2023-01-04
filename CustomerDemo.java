import java.util.Scanner;

public class CustomerDemo
{
   public static void main(String [] args)
   {
   
   /*********************************************************************
   This is an "actual program" because it has a main method.  This program
   declares a variable with the datatype Customer, which is a "user defined"
   datatype and requires that the Customer.class file be saved in the same
   folder so that Java can figure out what fields make up a Customer variable
   and the methods that can be run upon those objects.
   
   ********************************************************************/

      
      //Enter the datatype for the keyboard variable.  Notice the syntax
      //for this line is the same for when we create any object
      Scanner keyboard = new Scanner(System.in);
      
      String customerName, customerAddress, customerPhone;
      int customerAccountNumber;
      
      //Get input from the user by calling the proper methods defined in 
      //Scanner class for our keyboard object.  Remember, the keyboard variable
      //is a reference variable that holds the address of the Scanner object
      //declared above.  When we call a method on keyboard, it basically tells
      //Java to go to that address and run the method on the fields at that address
      System.out.println("Enter the customer name: ");
      customerName = keyboard.nextLine();
      System.out.println("Enter the customer address: ");
      customerAddress = keyboard.nextLine();
      System.out.println("Enter the customer phone number (999)999-9999: ");  
      customerPhone = keyboard.nextLine();
              
      
      //Now that you have the name, address, and phone, create a Customer object and
      //set the object's fields using the values entered by the user
      
      //Remember, the datatype is the name of the object's BLUEPRINT filename
      //You must call a special keyword to set aside the area in memory where the 
      //object will be stored.  Then you must call the object's constructor (which has
      //the same name as the BLUEPRINT filename.  Make sure you match the constructor
      //header and send the required values (what you just got as input)
      Customer cust1 = new Customer(customerName, customerAddress, customerPhone);
      
      
      //Once a customer object is created by declaring a variable with a datatype
      //of Customer, we can call the openAccount() method on that variable.  Since
      //that method returns a value, we can assign it to a variable declared in this 
      //main method.  Remember, you need to tell Java WHERE to find your object by
      //using the variable.method() syntax.
      customerAccountNumber = cust1.openAccount();
      
      //The depositMoney method, defined in the BLUEPRINT file, takes in a value. Enter an appropriate 
      //value here
      cust1.depositMoney(1000);
      
      //There is a method in the BLUEPRINT file that returns a String with the account info to print,
      //enter it here
      System.out.println(cust1.accountInquiry());
      
      //You can also "withdraw" money by calling the withdrawMoney() method on a Customer variable
      cust1.withdrawMoney(275);
      
      
      //When you call any method, whether it's in the class file with the main method or a 
      //BLUEPRINT file, you must follow the method name with () and include argument values inside
      //the parens.
      System.out.println(cust1.accountInquiry());
      
      /*************************************************************************************
      
      Create another Customer variable, and practice calling the accountInquiry(), deposit(), 
      and withdrawal methods here
      
      **************************************************************************************/

      //Add your code here
      
      Customer cust2 = new Customer(customerName, customerAddress, customerPhone); //Creating another Customer variable called cust2
      
      
      customerAccountNumber = cust2.openAccount(); //Calling the openAccount() method on that variable
      
      cust2.depositMoney(2000); //The depositMoney method, defined in the BLUEPRINT file, takes in a value.  
      //value set to 2000
      
      System.out.println(cust2.accountInquiry()); //accountInquiry() method from BLUEPRINT file returns a String with the account info to print.
      
      
      cust2.withdrawMoney(375); //calling the withdrawMoney() method on a cust2 variable

      
      System.out.println(cust2.accountInquiry()); //accountInquiry() method from BLUEPRINT file returns a String with the account info to print.
       
      
   } 
   
}