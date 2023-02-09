public class Crypto {
//variables
  private String name;
  private String passPhrase;
  private String walletAddress;
  private String nl = System.getProperty("line.separator");
  private String seperator = "---------------------------------------------";
//constructors
  public Crypto(String name, String passPhrase, String walletAddress) {
    this.name = name;
    this.passPhrase = passPhrase;  
    this.walletAddress = walletAddress;
  }
//methods
  public String getCryptoInfo() {
    return name + nl + walletAddress + nl + passPhrase + nl + seperator;
  }
} 