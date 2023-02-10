public class Title { 								//class for creating a title at the top of the screen
  private String header; 							//string for storing a title header
  private String subheader; 							//string for storing a title subheader
  private String nl = System.getProperty("line.separator"); 			//creates a new line for formatting in the toString method
  private String seperator = "---------------------------------------------"; 	//seperates lines for readability in the toString method
//constructors
  public Title(String header, String subheader) { 				//constructors
    this.header = header;
    this.subheader = subheader;
  }
//methods
  public String getHeader() { 							//returns just the header
	 return header;
  }
  public void setHeader(String header) { 					//set the header to something else
	 this.header = header;
  }
  public String getSubheader() { 						//returns just the subheader
	 return subheader;
  }
  public void setSubheader(String subheader) { 					//set the subheader to something else
	 this.subheader = subheader;
  }
  public void setTitle(String header, String subheader) { 			//setst the entire title to something else
    this.header = header;
    this.subheader = subheader;
  }
  public String getTitle() { 							//toString method for printing the whole title
    return seperator + nl + header + nl + subheader + nl + seperator;
  }
}
