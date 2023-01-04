import java.util.Random;

public class Customer
{
   /*********************************************************************
   This is a BLUEPRINT file that defines the fields and methods for
   Customer objects.  When a variable with the datatype of Customer is
   declared in an "actual" program (i.e. with a main() method), this is
   the structure that is created in memory.
   
   Delcare the fields that are members of the class (data type)
   Fields are properties of objects (usually the 'nouns' of a description)
   
   Fields are usually declared as private to protect the data stored in 
   them.  When fields are private, only the methods declared within the
   class file can access and change them.
   
   ********************************************************************/
   
   //Syntax: scope  datatype  variableName;
   private String name;  //Enter the likely datatype for a field called name
   private String homeAddress;  //Enter the scope for the homeAddress field
   private String phoneNum;   //Store the phoneNum field as a String to be able to include parens and dashes
   private int accountNumber;  //Enter the likely datatype for the accountNumber field.  Hint: it is a whole number
   private double accountBalance;  //Create a field that will hold the account balance (accountBalance)
   
   
   
   /********************************************************************
   Once all the fields are declared, declare the methods that will control
   getting and setting the values in the field variables
   ********************************************************************/
   
   //Create the constructor method, which runs whenever a variable with the 
   //Customer datatype is declared in an "actual" program
   //This constructor takes in a name, address, and phonenumber to assign
   //to the object's fields.  Here the scope is public so that the method can
   //be run by other class files, the constructor name MUST be the same as the
   //object class filename, and the parameter variable names are given.  
   //Enter the appropriate parameter variable datatypes
   
   public Customer(String nameIn, String addressIn, String phoneIn)
   {
      //Assign the values from the parameter variables to this new object's fields
      name = nameIn;
      homeAddress = addressIn;
      phoneNum = phoneIn;
   }
   
   //This class method can be called by "actual programs" on objects with the
   //datatype Customer have already been declared.
   public int openAccount()
   {
      //The next line calls the genAccountNumber() method which is declared
      //in this class file as private, which means it can only be called from
      //within this class file.
      accountNumber = genAccountNumber();
      accountBalance = 0.0;
      
      //To complete the following line, check the method header, specifically
      //the return datatype.  Here it is int, which means this method will
      //give back a value to the calling method.  Enter the missing keyword.
      return accountNumber;
   }
   
   private int genAccountNumber()
   {
      //Use a random number to randomly assign an account number 1-1000000
      
      //Remember, Random is actually a classfile that someone else wrote.
      //When we import it, it allows us to create objects, or instances, with
      //the Random datatype.  The new keyword creates the new Random object in
      //memory and then runs the Random constructor.
      Random randNumGen = new Random();
      accountNumber = randNumGen.nextInt(1000000) + 1;
      return accountNumber;   //Enter the name of the variable whose value should be returned
   }
   
   
   //This public class method allows a program to "deposit" an amount into the account, so
   //the amount to deposit must be provided as a parameter variable.  Read the code inside
   //the method to find the correct parameter variable name.
   public void depositMoney(double amount)
   {
      accountBalance += amount;
   }
   
   //Same idea here, except the balance goes down
   public void withdrawMoney(double amount)
   {
      accountBalance -= amount;  //Enter the field variable that is modified (check the list of field variables)
   }

   
   //This method allows the calling program to get information returned on the name and balance for the 
   //object it is called on.  Fill in the return datatype, based on the datatype of the variable in the
   //return statement
   public String accountInquiry()
   {
      String accountInfo;
      accountInfo = "Customer Name: " + name + "    Balance: $" + accountBalance;
      return accountInfo;
   }
}