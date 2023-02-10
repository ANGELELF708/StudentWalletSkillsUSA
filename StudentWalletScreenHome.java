import java.io.*;
import java.util.*;
public class StudentWalletScreenHome { //This is the homescreen for the program 
  public static void print() { //prints the following:
//Title
    NewScreen reset = new NewScreen("Student Wallet", "Home"); //creates and object to format the Screen with the header "Student Wallet" and the subheader "Home"
    reset.newScreen(); //clears the screen and formats as mentioned above (see line: 6)
    System.out.println("Welcome " + Login.username + "!");    //Prints a welcome message using the username
//Menu Options
    System.out.println("(0) Log Out"); //prints insturction for log out menu option
    System.out.println("(1) ID"); //prints instruction to access the ids
    System.out.println("(2) Credit/Debit"); //print instruciton to access the credit/debit card options
    System.out.println("(3) Crypto");  
    Scanner reader = new Scanner(System.in);
    String menuOptions = reader.next();
    switch(menuOptions) {
      case "0":
        StudentWalletScreenLogin.print();
        break;
      case "1":
        StudentWalletScreenIdentification.print();
        break;
      case "2":
        StudentWalletScreenCredDebIt.print();
        break;
      case "3":
        StudentWalletScreenCrypto.print();
        break;
    }
  }
}
  
