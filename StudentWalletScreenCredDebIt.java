import java.io.*;
import java.util.*;

public class StudentWalletScreenCredDebIt {
  public static void print() {
    // title
    NewScreen reset = new NewScreen("Student Wallet", "Credit/Debit");
    reset.newScreen();
    //CredDebIt info
    CredDebIt defaultCredDebIt = new CredDebIt(true, "1234567890", "7/23", "2309", "John", "Doe");
    System.out.println(defaultCredDebIt.getCredDebIt());
     for (int index = 0; index < StudentWalletArrayListsStorage.credDebItList.size();index++) { 	//for every entry in CredDebitList:	  
      System.out.println(StudentWalletArrayListsStorage.credDebItList.get(index).getCredDebIt()); //print the corresponding CredDebit.
    }
    // menu
    System.out.println("(0) Go Back");
    System.out.println("(1) Add New");
    Scanner reader = new Scanner(System.in);
    String menuOptions = reader.next();
    switch (menuOptions) {
      case "0":
        StudentWalletScreenHome.print();
      break;
      case "1": 
        StudentWalletScreenAddCredDebIt.print();
      break;
    }
  }
}