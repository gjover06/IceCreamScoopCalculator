/** Author:George Samu
 * purpose:The progrma wil compute and display the
 * volume of ice cream that an ice cream cone can hold.
 * 
 */

import javax.swing.JOptionPane;

public class iceCreamScoop
{
  public static void main(String[] args)
  {
//Commenting on line and show as update
   //pi*r^2*h/3

   //showing the radius
   String r= JOptionPane.showInputDialog("Enter the number of"+
   "radius of the cone");
   //showing the height(h)
    String h=JOptionPane.showInputDialog("What is the height of the cone");
    Double radius= Double.parseDouble(r);
   Double height= Double.parseDouble(h);
   double volume=(Math.PI*radius*height) / 3;
   JOptionPane.showMessageDialog(null, "The volme of ice cream this cone can hold is"+
                   String.format("%.2f",volume));
                         