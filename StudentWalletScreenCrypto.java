import java.io.*;
import java.util.*;
public class StudentWalletScreenCrypto {
  public static void print() {
     NewScreen reset = new NewScreen("Student Wallet", "Crypto");
    reset.newScreen();
    
    Crypto cryptoDefault = new Crypto("JohnDoe", "df8s98", "Delivery Course Monkey Watch 6");
    for (int index = 0; index < StudentWalletArrayListsStorage.cryptoWalletsList.size();index++) { 	//for every entry in arrayList called cryptoWalletList:	  
      System.out.println(StudentWalletArrayListsStorage.cryptoWalletsList.get(index).getCryptoInfo()); //print the corresponding Crypto Wallet.
    }
    System.out.println(cryptoDefault.getCryptoInfo());
    //menu
    System.out.println("(0) Go Back");
    System.out.println("(1) Add New Crypto Wallet");
     Scanner reader = new Scanner(System.in);
    String menuOptions = reader.next(); 
    switch (menuOptions) {
      case "0":
        StudentWalletScreenHome.print();
        break;
      case "1":
        StudentWalletScreenAddCrypto.print();
        break;
    }
  }
}