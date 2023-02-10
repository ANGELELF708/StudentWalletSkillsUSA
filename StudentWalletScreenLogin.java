import java.io.*;
import java.util.*;
public class StudentWalletScreenLogin {                         //A screen for the user to login with

//methods
static public void print() {                                    //print:
//New Screen
  NewScreen reset = new NewScreen("Student Wallet", "Login");   //create an object for screen formatting with the header "Student Wallet" and the subheader "Login"
  reset.newScreen();                                            //clear the screen and execute the formatting mentioned above (see line: 8)
//Login
  //username
  Login login = new Login ("JohnDoe", "123", "Chad", "123");    //creates a customer account with the username "JohnDoe" and the password "123" (the latter 2 constructors are for the developer account which is unused in this program)
  System.out.println("Username: ");                             //asks the user for the username
  Scanner reader = new Scanner(System.in);                      //creates a reader object for taking user inputs
  String username = reader.next();                              //creates a string variable for reading user inputs
  login.setUsername(username);                                  //gives the user inputted username to the login class for later authenitification
  //password
  System.out.println("Password:");                              //asks the user for their password
  String password = reader.next();                              //creates a string to read the user input (perhaps i could've used the same variable from earlier)
  login.setPassword(password);                                  //gives the user inputted password to the login class for authentification later
  //authenticate
   if(login.authenticateCustomer() == true) {                   //authenticates the users login
      StudentWalletScreenHome.print();                          //if the information is accurate it prints the homescreen
    }
    else {                                                      //if the information is inaccurate
        reset.newScreen();                                      //resets the screen and reformats
        System.out.println("Invalid Credentials");              //lets the user know that the login information was incorrect
        System.out.println("1) Go Back");                       //gives the option for the user to go back to the login screen
        if (reader.next() == "1"); {                            //if the user wants to go back:
          StudentWalletScreenLogin.print();                     //reprint the screen;
      }    
    }    
  }
}
