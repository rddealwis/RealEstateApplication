/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.UserLogin;

import Classes.RealEstate.Listable;

/**
 *
 * @author rasdlk
 */
public class ListUserLogin implements Listable {

    private String userName;
    private String password;

   public ListUserLogin(String userName, String password) 
   {
      this.userName = userName;
      this.password = password;
   }

   public Listable copy() // Returns a copy of this ListHouse
    {
        ListUserLogin result = new ListUserLogin(userName, password);
        return result;
    }

    public int compareTo(Listable otherListHouse) // Houses are compared based on their lot numbers
    {
//        ListUserLogin other = (ListUserLogin) otherListHouse;
//        return (this.loginId - other.loginId);
        return 0;
    }
        
    public String userName() {
        return userName;
    }

    public String password() {
        return password;
    }
}
