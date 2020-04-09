import java.awt.*;

public class JavaLabelExample {
    public static void main(String args []){
        Frame f = new Frame("Title frame");
        f.setVisible(true);
        f.setLayout(null);
        f.setBackground(Color.red);
        f.setSize(400, 500);
        Label l1, l2;
        l1 = new Label ("First Label.");
        l2 = new Label("Second Label");
        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(150, 100, 100, 30);
        f.add(l1);
        f.add(l2);

    }
}
