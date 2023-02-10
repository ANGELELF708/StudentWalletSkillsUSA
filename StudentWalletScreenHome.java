import java.io.*;
import java.util.*;
public class StudentWalletScreenHome {                          //This is the homescreen for the program 
  public static void print() {                                  //prints the following:
//Title
    NewScreen reset = new NewScreen("Student Wallet", "Home");  //creates and object to format the Screen with the header "Student Wallet" and the subheader "Home"
    reset.newScreen();                                          //clears the screen and formats as mentioned above (see line: 6)
    System.out.println("Welcome " + Login.username + "!");      //Prints a welcome message using the username
//Menu Options
    System.out.println("(0) Log Out");                          //prints insturction for log out menu option
    System.out.println("(1) ID");                               //prints instruction to access the ids
    System.out.println("(2) Credit/Debit");                     //print instruciton to access the credit/debit card options
    System.out.println("(3) Crypto");                           //print instruction to access the crypto options
    Scanner reader = new Scanner(System.in);                    //create a reader object to accept user inputs
    String menuOptions = reader.next();                         //create a string to read user inputs
    switch(menuOptions) {                                       //creates a switch statement to execute user inputs
      case "0":                                                 //if the user wants to log out:
        StudentWalletScreenLogin.print();                       //print the login screen
        break;                                                  //end instructions for login screen;
      case "1":                                                 //if user wants to access id screen:
        StudentWalletScreenIdentification.print();              //print identification screen
        break;                                                  //end instruction for id screen;
      case "2":                                                 //if user wants to access the Credit/Debit Card screen:
        StudentWalletScreenCredDebIt.print();                   //print the CredDebIt screen
        break;                                                  //end instructions for executing the Credit/Debit card screen;
      case "3":                                                 //if user wants to access the crypto screen:
        StudentWalletScreenCrypto.print();                      //print the crypto screen
        break;                                                  //end instructions for executing the crypto screen
    }
  }
}
  
