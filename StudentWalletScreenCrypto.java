import java.io.*;
import java.util.*;
public class StudentWalletScreenCrypto {                                                                //class for the screen to access the crypto options
  public static void print() {                                                                          //prints the follwoing: 
     NewScreen reset = new NewScreen("Student Wallet", "Crypto");                                       //creates and object formatting of the screen with the header "Student Wallet" and the subeheader "Crypto"
    reset.newScreen();                                                                                  //clears the screen and formats as mentioned above (see line: 4)
    
    Crypto cryptoDefault = new Crypto("JohnDoe", "df8s98", "Delivery Course Monkey Watch 6");           //creates a default crypto wallet for testing purposes
    for (int index = 0; index < StudentWalletArrayListsStorage.cryptoWalletsList.size();index++) { 	    //for every entry in arrayList called cryptoWalletList:	  
      System.out.println(StudentWalletArrayListsStorage.cryptoWalletsList.get(index).getCryptoInfo());  //print the corresponding Crypto Wallet.
    }
    System.out.println(cryptoDefault.getCryptoInfo());                                                  //prints the default crypto wallet mentioned above (see line: 8)
    //menu
    System.out.println("(0) Go Back");                                                                  //prints the instruction to go back
    System.out.println("(1) Add New Crypto Wallet");                                                    //prints the instruction to add a new crypto wallet
     Scanner reader = new Scanner(System.in);                                                           //creates a scanner to take user inputs
    String menuOptions = reader.next();                                                                 //creates a string to save and reade user inputs
    switch (menuOptions) {                                                                              //creates a switch statement to execute user options
      case "0":                                                                                         //if user wants to go back
        StudentWalletScreenHome.print();                                                                //print the home screen:
        break;
      case "1":                                                                                         //if user wants to add a new crypto wallet:
        StudentWalletScreenAddCrypto.print();                                                           //print the add crypto screen;;
        break;
    }
  }
}
