import java.io.*;
import java.util.*;
public class StudentWalletScreenLogin {

//methods
static public void print() {
//New Screen
  NewScreen reset = new NewScreen("Student Wallet", "Login");
  reset.newScreen();
//Login
  //username
  Login login = new Login ("JohnDoe", "123", "Chad", "123");
  System.out.println("Username: ");
  Scanner reader = new Scanner(System.in);
  String username = reader.next();
  login.setUsername(username);
  //password
  System.out.println("Password:");
  String password = reader.next();
  login.setPassword(password);
  //authenticate
   if(login.authenticateCustomer() == true) {
      StudentWalletScreenHome.print();
    }
    else {
        reset.newScreen();
        System.out.println("Invalid Credentials");
        System.out.println("1) Go Back");
        if (reader.next() == "1"); {
          StudentWalletScreenLogin.print();
      }    
    }    
  }
}