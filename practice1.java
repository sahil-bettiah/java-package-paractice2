import java.applet.*;
import java.awt.*;
class practice extends Applet{
    String msg;
    //set the foreground and background colors.
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside init()--";
    }
    //Initilize the string to be display.
    public void start(){
        msg += "Inside start() --";
    }
    //Display msg in applet window.
    public void paint(Graphics g){
        msg += "Inside paint().";
        g.drawString(msg, 10, 30);
    }
}
