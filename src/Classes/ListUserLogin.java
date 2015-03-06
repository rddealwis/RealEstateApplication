/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author rasdlk
 */
public class ListUserLogin implements Listable {

   private String userName;
   private String password;
   private int loginId;

   public ListUserLogin(int loginId, String userName, String password) 
   {
      this.loginId = loginId;
      this.userName = userName;
      this.password = password;
   }

   @Override
   public int compareTo(Listable other) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public Listable copy() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

}
