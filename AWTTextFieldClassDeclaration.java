import java.awt.*;
public class AWTTextFieldClassDeclaration {
    public static void main(String args[]){
        Frame f = new Frame("Title of Frame");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        TextField tf1, tf2;
        tf1 = new TextField("text field1");
        tf2 = new TextField("text field2");
        tf1.setBounds(50, 100, 200, 30);
        tf2.setBounds(50, 150, 200, 30);
        f.add(tf1);
        f.add(tf2);


    }
}
