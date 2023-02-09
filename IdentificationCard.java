public class IdentificationCard {
//variables
  private String name;
  private String identificationNumber;
  private String school;
  private String nl = System.getProperty("line.separator");
  private String seperator = "---------------------------------------------";
  public class ObjectList{
  private Object[] list = new Object[10];
  }
//constructors
  public IdentificationCard(String name, String identificationNumber, String school) {
    this.name = name;
    this.identificationNumber = identificationNumber;
    this.school = school;
  }
//methods
  public String getName() {
	 return name;
  }
  public void setName(String name) {
	 this.name = name;
  }
  public String getIdentificationNumber() {
	 return identificationNumber;
  }
  public void setIdentificationNumber(String identificationNumber) {
	 this.identificationNumber = identificationNumber;
  }
  public String getSchool() {
	 return school;
  }
  public void setSchool(String school) {
	 this.school = school;
  }
  public String getID() {
    return name + nl + identificationNumber + nl + school + nl + seperator;
  }
}