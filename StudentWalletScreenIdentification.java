import java.io.*; //imports
import java.util.*; //imports
public class StudentWalletScreenIdentification { //When class 'StudentWalletScreenIdentification' is called:
  public static void print() { //print:
    // Title
    NewScreen reset = new NewScreen("Student Wallet", "ID"); // when the function "reset" is ran, clear the screen and create a title with the header "Student Wallet" and the subheader "ID"
    reset.newScreen(); //run the function "reset" (clear the screen and print the screen title(see: line 6))
    // IDs
    ID defaultID = new ID("John Doe", "123456789", "Evergreen Highschool"); //Save a default ID (for test purposes) object for John Doe with the student number "123456789," and his school as "Evergreen Highschool"
    // print
    for (int index = 0; index < StudentWalletArrayListsStorage.idList.size();index++) { 	//for ever entry in arrayList called idList (stored in the IdentificationList class):	          
      System.out.println(StudentWalletArrayListsStorage.idList.get(index).getID()); //print the corresponding ID.
    }
    System.out.println(defaultID.getID()); //print the default ID

    // Options
    System.out.println("(0) Go Back"); //print the instructions to go back to home screen using the menu
    System.out.println("(1) Add New"); //print the instructions to add a new ID using the menu
    Scanner reader = new Scanner(System.in); //create a scanner called "reader" for reading user inputs for the menu
    String menuOptions = reader.next();  //declare a string to connect save the inputs of reader to be read by a switch statement
    switch (menuOptions) { //if menuOptions is equal to (if someone inputs) one of the following:
      case "0": // if 0 is inputted
        StudentWalletScreenHome.print(); //print the Home Screen ("StudentWalletScreenHome")
        break; //end the 0 input instructions
      // add new
      case "1": //if 1 is inputted
        StudentWalletScreenAddIdentification.print(); //print the StudentWalletScreenAddIdentification Screen thats saved in another class
        break; // end the instructions for if 1 is inputted;;;
    }
  }
}