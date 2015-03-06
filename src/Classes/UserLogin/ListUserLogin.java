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

    private int loginId;
    private String userName;
    private String password;

   public ListUserLogin(int loginId, String userName, String password) 
   {
      this.loginId = loginId;
      this.userName = userName;
      this.password = password;
   }

   public Listable copy() // Returns a copy of this ListHouse
    {
        ListUserLogin result = new ListUserLogin(loginId, userName, password);
        return result;
    }

    public int compareTo(Listable otherListHouse) // Houses are compared based on their lot numbers
    {
        ListUserLogin other = (ListUserLogin) otherListHouse;
        return (this.loginId - other.loginId);
    }

}
