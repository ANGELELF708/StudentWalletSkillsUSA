import java.io.*;
import java.util.*;

public class StudentWalletScreenCredDebIt {                                                         //screen for the CredDebIt options
  public static void print() {                                                                      //prints the following:
    // title
    NewScreen reset = new NewScreen("Student Wallet", "Credit/Debit");                              //creates an object for the screen formatting class "NewScreen" with header "Student Wallet" and subheader "Credit/Debit"
    reset.newScreen();                                                                              //clears the screen and executes the formating options above (see line: 7)
    //CredDebIt info
    CredDebIt defaultCredDebIt = new CredDebIt(true, "1234567890", "7/23", "2309", "John", "Doe");  //creates a default CredDebIt object for testing purposes
    System.out.println(defaultCredDebIt.getCredDebIt());                                            //print the default CredDebIt Obejct
     for (int index = 0; index < StudentWalletArrayListsStorage.credDebItList.size();index++) { 	  //for every entry in CredDebitList:	  
      System.out.println(StudentWalletArrayListsStorage.credDebItList.get(index).getCredDebIt());   //print the corresponding CredDebit;
    }
    // menu
    System.out.println("(0) Go Back");                                                              //prints the menu instruction to go back to the home screen
    System.out.println("(1) Add New");                                                              //print the menu instruction to add a new credit/debit card
    Scanner reader = new Scanner(System.in);                                                        //creates a scanner object for reading user inputs
    String menuOptions = reader.next();                                                             //creates a string variable to accept and read user inputs from the above scanner class (see line: 18)
    switch (menuOptions) {                                                                          //a switch statement to execute the users menu choice
      case "0":                                                                                     //when pressing go back:
        StudentWalletScreenHome.print();                                                            //print the home screen;
      break;
      case "1":                                                                                     //when pressing add new:
        StudentWalletScreenAddCredDebIt.print();                                                    //print the add new CredDebIt screen;;
      break;
    }
  }
}
