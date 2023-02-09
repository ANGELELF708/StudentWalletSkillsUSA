class NewScreen {
//variables
  private String header = "0";
  private String subheader = "1";
  static private String clear = "\033[H\033[2J";
  private Title title = new Title(header, subheader); //Title.java
//constructors
  public NewScreen(String header, String subheader) {
    this.header = header;
    this.subheader = subheader;
  }

//methods
  public static void clear() {
    System.out.print(clear);
    System.out.flush();
  } 
  public void newScreen() {
    NewScreen.clear();
    title.setTitle(header, subheader);
    System.out.println(title.getTitle());
  }
}