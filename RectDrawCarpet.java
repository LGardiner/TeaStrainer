/* @author leogardiner
 * 
 * A drawing class that extends JPanel to create a visual representation of a recursive algorithm
 */ 

import javax.swing.*;
import java.awt.*;

public class RectDrawCarpet extends JPanel {
  
  public int level;
  
  public RectDrawCarpet(int level){
    this.level = level;
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    drawCarpet(level,0,0,780,g);
  }
  
  public void drawCarpet(int level, int x, int y, int length, Graphics g){
    if (level < 0) throw new IllegalArgumentException();
    
    //Base Case
    if(level == 1)
    {
      g.fillRect(x+length/3, y+length/3, length/3, length/3);
    }
    //General Case
    else{
      g.fillRect(x+length/3, y+length/3, length/3, length/3);
      drawCarpet(level - 1, x, y, length/3, g);
      drawCarpet(level - 1, x+length/3, y, length/3, g);
      drawCarpet(level - 1, x+2*length/3, y, length/3, g);
      drawCarpet(level - 1, x, y+length/3, length/3, g);
      drawCarpet(level - 1, x + 2*length/3, y+length/3, length/3, g);
      drawCarpet(level - 1, x, y+2*length/3, length/3, g);
      drawCarpet(level - 1, x + length/3, y+2*length/3, length/3, g);
      drawCarpet(level - 1, x + 2*length/3, y+2*length/3, length/3, g);
    }
    
  }  
}