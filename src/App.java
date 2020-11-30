import java.applet.*;
import java.awt.*;

public class App extends Applet{
    public void paint(Graphics g){
        g.drawLine(100,100,200,200);
        g.drawRect(300,40,100,400);
        g.drawOval(100,40,100,60);
    }
}
