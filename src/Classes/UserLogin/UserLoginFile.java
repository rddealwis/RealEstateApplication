/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.UserLogin;

import java.io.IOException;
import org.w3c.dom.*;

/**
 *
 * @author rasdlk
 */
public class UserLoginFile {
   
   public static ListUserLogin getNextUserLogin(Node nNode) throws IOException // Gets and returns user login information from the user login details file
                                                                               // Precondition: inFile is open and holds more user login information
    {    
      String userName = "xxxxx";
      String password = "xxxxx";
      Element eElement = (Element) nNode;

      userName = eElement.getAttribute("UserName");
      password = eElement.getElementsByTagName("Password").item(0).getTextContent();

      ListUserLogin userLogin = new ListUserLogin(userName, password);

      return userLogin;
   }

}
