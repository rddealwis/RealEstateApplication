/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
      int loginId = 0;
      String userName = "xxxxx";
      String password = "xxxxx";
      Element eElement = (Element) nNode;

      loginId = Integer.parseInt(eElement.getAttribute("id"));
      userName = eElement.getElementsByTagName("UserName").item(0).getTextContent();
      password = eElement.getElementsByTagName("Password").item(0).getTextContent();

      ListUserLogin house = new ListUserLogin(loginId, userName, password);

      return house;
   }

}
