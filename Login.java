public class Login {
  static public String username;
  private String password;
  private String usernameCust;
  private String passwordCust;
  private String usernameDev;
  private String passwordDev;
//costructors
  public Login (String usernameCust, String passwordCust, String usernameDev, String passwordDev) {
    this.usernameCust = usernameCust;
    this.passwordCust = passwordCust;
    this.usernameDev = usernameDev;
    this.passwordDev = passwordDev;
    }
//methods
 //setters 
  public void setUsername(String username) {
    this.username = username;
  }
  public void setPassword(String password) {
    this.password = password;  
  }
 //getters
  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
  //authenticators
  public boolean authenticateCustomer() {
    boolean userCustAuth = username.equals(usernameCust);
    boolean passCustAuth = password.equals(passwordCust);
    boolean customerAuth = userCustAuth && passCustAuth;
    return customerAuth;
  }
  public boolean authenticateDeveloper() {
    boolean userDevAuth = username.equals(usernameDev);
    boolean passDevAuth = password.equals(passwordDev);
    boolean developerAuth = userDevAuth && passDevAuth;
    return developerAuth;
  }
  
}