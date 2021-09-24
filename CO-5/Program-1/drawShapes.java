   
import java.awt.*;
import java.applet.*;
/*
<applet code="drawShapes" width=800 height=800>
</applet>
*/
public class drawShapes extends Applet {
  public void paint(Graphics g) {
    g.drawLine(10, 10, 100, 100);
    g.drawRect(200, 250, 200, 350);
    g.drawOval(500, 500, 300, 300);
  }
}