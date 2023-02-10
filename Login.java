public class Login {                                                                                  //class for storing and authenticating two sets of predetermined login info (as a fututre update i would split this into two classes(one for creating and saving login information another for authenticating login attempts, and maybe even a third class for storing a database of logins allowing for multiple accounts)
  static public String username;                                                                      //string where the user inputted username is saved
  private String password;                                                                            //string where the user inputted password is saved
  private String usernameCust;                                                                        //predetermined customer username
  private String passwordCust;                                                                        //predetermined customer password
  private String usernameDev;                                                                         //predetermined developer username (not set for this program (this class was made by me for another project))
  private String passwordDev;                                                                         //predetermined developer password (not set for this program (this class was made by me for another project))
//costructors
  public Login (String usernameCust, String passwordCust, String usernameDev, String passwordDev) {   //constructors
    this.usernameCust = usernameCust;
    this.passwordCust = passwordCust;
    this.usernameDev = usernameDev;
    this.passwordDev = passwordDev;
    }
//methods
 //setters 
  public void setUsername(String username) {                                                          //sets the username
    this.username = username;
  }
  public void setPassword(String password) {                                                          //sets the password
    this.password = password;  
  }
 //getters
  public String getUsername() {                                                                       //gets the username
    return username;
  }
  public String getPassword() {                                                                       //gets the password
    return password;
  }
  //authenticators
  public boolean authenticateCustomer() {                                                             //authenticates login credentials for customer
    boolean userCustAuth = username.equals(usernameCust);
    boolean passCustAuth = password.equals(passwordCust);
    boolean customerAuth = userCustAuth && passCustAuth;
    return customerAuth;
  }
  public boolean authenticateDeveloper() {                                                            //authenticates login credntials for developer (not used in this program)
    boolean userDevAuth = username.equals(usernameDev);
    boolean passDevAuth = password.equals(passwordDev);
    boolean developerAuth = userDevAuth && passDevAuth;
    return developerAuth;
  }
  
}
