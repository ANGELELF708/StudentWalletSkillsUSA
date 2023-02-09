public class CredDebIt {
//variables
  private boolean credit;
  private String cardNum;
  private String expDate;
  private String secCode;
  private String nameFirst;
  private String nameLast;
  private String seperator = "---------------------------------------------";
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
