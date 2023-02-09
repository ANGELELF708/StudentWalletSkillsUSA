public class Title {
  private String header;
  private String subheader;
  private String nl = System.getProperty("line.separator");
  private String seperator = "---------------------------------------------";
//constructors
  public Title(String header, String subheader) {
    this.header = header;
    this.subheader = subheader;
  }
//methods
  public String getHeader() {
	 return header;
  }
  public void setHeader(String header) {
	 this.header = header;
  }
  public String getSubheader() {
	 return subheader;
  }
  public void setSubheader(String subheader) {
	 this.subheader = subheader;
  }
  public void setTitle(String header, String subheader) {
    this.header = header;
    this.subheader = subheader;
  }
  public String getTitle() {
    return seperator + nl + header + nl + subheader + nl + seperator;
  }
}