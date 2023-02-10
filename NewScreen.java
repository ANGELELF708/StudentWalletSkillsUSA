class NewScreen { //class for reseting the screen and sets the format when opening a new screen
//variables
  private String header = "0"; //for saving the title header (set to 0 as a default so a title object can be set up prematurely
  private String subheader = "1"; //for saving the title subheader (set to 1 as a default so a title object can be set up prematurely
  static private String clear = "\033[H\033[2J"; //saves the clear escape code as a string
  private Title title = new Title(header, subheader); //creates a title object using the previously mentioned header and subheader strings (see lines: 3-4)
//constructors
  public NewScreen(String header, String subheader) { //constructors
    this.header = header;
    this.subheader = subheader;
  }

//methods
  public static void clear() { //clears the screen
    System.out.print(clear); 
    System.out.flush(); //dont ask me what this does. I got this off StackOverflow (it seems to work without it, but I don't wanna mess with it)
  } 
  public void newScreen() { //clears the screen and formats with a title object
    NewScreen.clear();
    title.setTitle(header, subheader);
    System.out.println(title.getTitle());
  }
}
