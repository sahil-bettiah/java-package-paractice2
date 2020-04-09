import java.awt.*;
public class AWTButtonClassdeclaration {
    public static void main(String args[]){
        Button b1 = new Button("click here");
        Button b2 = new Button("click here");
        Frame f = new Frame("AWTButton");
        b1.setBounds(0, 40, 300, 40);
        b2.setBounds(300, 40, 300, 40);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300, 400);
    }

}
