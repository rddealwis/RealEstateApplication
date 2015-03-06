/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes.General;

import java.awt.*;
import javax.swing.JComponent;
import javax.swing.plaf.ButtonUI;

/**
 *
 * @author Ras
 */
public class Button extends ButtonUI{
    
    public void paint(Graphics g, JComponent c, String d) {
            
      if (d.equalsIgnoreCase("Entry"))
      {
         c.setForeground(Color.black);
      } 
      else 
      {
         c.setForeground(Color.white);
      }

   }
    
}
