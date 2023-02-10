import java.io.*;                                                                   //imports
import java.util.*;                                                                 //imports
public class StudentWalletScreenAddIdentification {                                 //when "StudentWalletScreenAddIdentification" is ran
   public static void print() {                                                     //print:
    NewScreen reset = new NewScreen("Student Wallet", "Add ID");                    // when the function "reset" is ran, clear the screen and create a title with the header "Student Wallet" and the subheader "Add ID"
    reset.newScreen();                                                              //run the reset function
    String name;                                                                    //declare a string called "name" (for saving to a new ID)
    String studentNumber;                                                           //declare a string called "studentNumber" (for saving to a new ID)
    String school;                                                                  //declare a string called "school" (for saving to a new ID)
    Scanner reader = new Scanner(System.in);                                        //create a scanner to read the users inputs
    // Name
    System.out.println("Name: ");                                                   //ask for the user for a name
    name = reader.next();                                                           //save the users response
    // Student Number
    System.out.println("Student Number: ");                                         //ask for the user for a Student Number
    studentNumber = reader.next();                                                  //save the user's response
    // School
    System.out.println("School: ");                                                 //ask for the user's school name
    school = reader.next();                                                         //save the user's response
    // Compile Info
    IdentificationCard addID = new IdentificationCard(name, studentNumber, school); //create an ID from the user's responses (see: lines 32-39)
    StudentWalletArrayListsStorage.idList.add(addID);                               //add the ID to a lsit of IDs saved in the class "IdentificationList"
    StudentWalletScreenIdentification.print();                                      //reprint the screen from the begininng  
   }
}
