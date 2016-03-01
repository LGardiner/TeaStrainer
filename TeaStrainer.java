/* @author Leo Gardiner
 * 
 * This is my TeaStrainer class that contains the main method that uses a recursive algorithm to generate a
 * visual representation of a recursive algorithm i.e. Sierpinski type pattern.
 * 
 * If it is not working for you try numbers lower than 8 (it is resource intensive)
 */ 

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class TeaStrainer{
  
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number above 0");
    int index = input.nextInt();
    if (index > 0){
      JFrame frame = new JFrame();
      frame.setResizable(false);
      frame.setTitle("Tea Strainer");
      //Abitarily chosen size (difference each side of 800 for looks)
      frame.setSize(795,805);
      Container pane = frame.getContentPane();
      
      pane.add(new RectDrawCarpet(index));
      frame.show();
    }
    else {
      System.out.println("That number was not larger than 0");
    }
  }
}