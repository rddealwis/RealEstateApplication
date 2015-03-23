package Classes.UserLogin;

import Classes.RealEstate.Listable;

public class ListUserLogin implements Listable {

    private String userName;
    private String password;

   public ListUserLogin(String userName, String password) 
   {
      this.userName = userName;
      this.password = password;
   }

   public Listable copy() 
    {
        ListUserLogin result = new ListUserLogin(userName, password);
        return result;
    }

    public int compareTo(Listable otherListHouse) 
    {
        return 0;
    }
        
    public String userName() {
        return userName;
    }

    public String password() {
        return password;
    }
}
