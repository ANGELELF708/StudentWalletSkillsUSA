public class Crypto {                                                           //object class for saving crypto wallet information
//variables
  private String name;                                                          //saves the user's wallet username to a string
  private String passPhrase;                                                    //saves the user's wallet passphrase to a string
  private String walletAddress;                                                 //saves the user's wallet address to a stirng
  private String nl = System.getProperty("line.separator");                     //creates a new line for toString method
  private String seperator = "---------------------------------------------";   //line seperator for readablity when printing the toString method
//constructors
  public Crypto(String name, String passPhrase, String walletAddress) {         //constructors
    this.name = name;
    this.passPhrase = passPhrase;  
    this.walletAddress = walletAddress;
  }
//methods
   public String getCryptoInfo() {                                              //toString method 
    return name + nl + walletAddress + nl + passPhrase + nl + seperator; 
  }
} 
