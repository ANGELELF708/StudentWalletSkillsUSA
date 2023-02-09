import java.io.*;
import java.util.*;
public class StudentWalletScreenHome {
  public static void print() {
//Title
    NewScreen reset = new NewScreen("Student Wallet", "Home");
    reset.newScreen();
    System.out.println("Welcome " + Login.username + "!");    
//Menu Options
    System.out.println("(0) Log Out");
    System.out.println("(1) ID");
    System.out.println("(2) Credit/Debit");
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
  