import java.io.*; //imports
import java.util.*; //imports
public class StudentWalletScreenAddCrypto { //class declaration for StudentWalletScreenAddCrypto
  public static void print() { //when print funtion is ran print:
    NewScreen reset = new NewScreen("Student Wallet", "Add Crypto Wallet");//Declare a newScreen with the Header "Student Wallet" and subheader "Add Crypto Wallet"
    reset.newScreen(); //clear the screen and envoke the title mention in line 5.
    Scanner reader = new Scanner(System.in);//declaration of Scanner "reader"
    System.out.println("Name:");//ask user for a name
    String name = reader.next();// save name into string
    System.out.println("Passphrase:");//ask user for a passphrase
    String passphrase = reader.next();//save passphrase into string
    System.out.println("Wallet Address:");//ask user for a walletAddress
    String walletAddress = reader.next();//save walletAddress into String
    Crypto addCrypto = new Crypto(name, passphrase, walletAddress);//create a Crypto Object using the collected info.
   StudentWalletArrayListsStorage.cryptoWalletsList.add(addCrypto); //add to static arrayList in StudentWalletScreenCrypto class
    StudentWalletScreenCrypto.print(); //go back to the Crypto Screen
  }
}