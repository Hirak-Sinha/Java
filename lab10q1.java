import java.applet.Applet;
import java.awt.*;
public class lab10q1 extends Applet {
 public void paint(Graphics g) {
  g.setColor(Color.yellow);
  g.fillOval(20,20,150,150);   // For face
  g.setColor(Color.black);
  g.fillOval(50,60,15,25);     // Left Eye 
  g.fillOval(120,60,15,25);    // Right Eye
  int x[] = {95,85,106,95};
  int y[] = {85,104,104,85};
  g.drawPolygon(x, y, 4);      // Nose
  g.drawArc(55,95,78,50,0,-180);  // Smile
  g.drawLine(50,126,60,116);   // Smile arc1
  g.drawLine(128,115,139,126);  // Smile arc2
 }
}