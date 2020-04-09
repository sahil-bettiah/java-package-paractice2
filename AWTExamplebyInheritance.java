import java.awt.*;
class first extends Frame{
    first(){
        Button b = new Button("Click Here");
        b.setBounds(30, 100, 80, 30);//setting position of button.
        add(b);//adding button in frame.
        setSize(300, 300);//frame size 300 width and 300 height.
        setLayout(null);//no layout manager.
        setVisible(true);//now frame will be visible, by default not visit.
    }
}
public class AWTExamplebyInheritance {
    public static void main(String args[]) {
        first f = new first();

    }
}
