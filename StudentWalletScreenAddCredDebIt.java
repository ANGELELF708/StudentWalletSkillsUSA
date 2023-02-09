import java.io.*; //imports
import java.util.*; //imports
public class StudentWalletScreenAddCredDebIt { //when class StudentWalletScreenAddCredDebIt is invoked
  public static void print() { //when print function is ran print:
    NewScreen reset = new NewScreen("Student Wallet", "Add Credit/Debit Card");//declare a newscreen "reset" with the header "Student Wallet", and the subheader "Add Credit/Debit Card"
    reset.newScreen(); //run reset
    Scanner reader = new Scanner(System.in);//create Scanner "reader" to take user inputs
    boolean credit = false; //declare boolean for checking if the user is inputing a credit or debit card later
    System.out.println("Credit or Debit");//ask user if it is a credit or debit card
    System.out.println("(1) Credit");
    System.out.println("(2) Debit");
    String chooseCreditOrDebit = reader.next(); //create char variable to use in switch statement
    switch (chooseCreditOrDebit) { //create switch statement
      case "1":  //if user inputs 1(Credit):
        credit = true; //set credit boolean to true
      break; //end instructions for if user inputs 1
      case "2"://if user inputs 2(Debit):
        credit = false;//set credit boolean to false
      break; //end instructions for if user inputs 1
      default: //in case of unspecified response
        StudentWalletScreenAddCredDebIt.print(); //reprint the screen
      break; //end instructions for unspecified response;
      }
    System.out.println("Card Number:"); //ask user for card number
    String cardNumber = reader.next();//save response in string
    System.out.println("Expiration Date:");//ask user for expiration date
    String expirationDate = reader.next();//save response in string
    System.out.println("Security Code:");//ask user for security code
    String securityCode = reader.next();//save response in string
    System.out.println("First Name:");//ask user for first name
    String firstName = reader.next();//save response in string
    System.out.println("Last Name"); //ask user for last name
    String lastName = reader.next();//save response in string
    CredDebIt addNewCredDebIt = new CredDebIt(credit, cardNumber, expirationDate, securityCode, firstName, lastName);//create new Credit/Debit object
    StudentWalletArrayListsStorage.credDebItList.add(addNewCredDebIt); //add to credit/debit arrayList saved in IdentificationList.java (will be renamed later)
    StudentWalletScreenCredDebIt.print();
  }
}