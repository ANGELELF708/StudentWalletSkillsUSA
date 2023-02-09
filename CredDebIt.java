public class CredDebIt { //Object class for credit/debit card information
//variables
  private boolean credit; //"is this a credit card?" boolean
  private String cardNum; //string for storing the card number
  private String expDate; //string for storing the experation date
  private String secCode; //string for storing the security code
  private String nameFirst; //String for storing user's first name
  private String nameLast; //string for storing user's last name
  private String seperator = "---------------------------------------------"; //this is a seperator for readibility when printing (probs would've been worth to just make this a class)
  private String nl = System.getProperty("line.separator");
  private String creditOrDebit;
//constructors 
  public CredDebIt(boolean credit, String cardNum, String expDate, String secCode, String nameFirst, String nameLast) {
    this.credit = credit;
    this.cardNum = cardNum;
    this.expDate = expDate;
    this.secCode = secCode;
    this.nameFirst = nameFirst;
    this.nameLast = nameLast;
    if (credit == true) {
      creditOrDebit = "Credit Card:";
    }
    else {
     creditOrDebit = "Debit Card:";
    }
  }

//methods
  public boolean isCredit() {
	 return credit;
  }
  public void setCredit(boolean credit) {
	 this.credit = credit;
  }
  public String getCardNum() {
	 return cardNum;
  }
  public void setCardNum(String cardNum) {
	 this.cardNum = cardNum;
  }
  public String getExpDate() {
	 return expDate;
  }
  public void setExpDate(String expDate) {
	 this.expDate = expDate;
  }
  public String getSecCode() {
	 return secCode;
  }
  public void setSecCode(String secCode) {
	 this.secCode = secCode;
  }
  public String getNameFirst() {
	 return nameFirst;
  }
  public void setNameFirst(String nameFirst) {
	 this.nameFirst = nameFirst;
  }
  public String getNameLast() {
	 return nameLast;
  }
  public void setNameLast(String nameLast) {
	 this.nameLast = nameLast;
  }  
  public String getCredDebIt() {
    return creditOrDebit + nl + nameFirst + " " + nameLast + nl + cardNum + nl + secCode + nl +   expDate + nl + seperator;
  }
}
