import java.awt.*;
import java.awt.event.*;

public class AWTButtonwithActionListener {
    public static void main(String args[]){
        Frame f = new Frame("Title of frame");
        final TextField tf = new TextField("press on 'click here' button to reveal contents");
        tf.setBounds(50, 50, 1500, 40);
        Button b = new Button("click here");
        b.setBounds(50, 100, 60, 40);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to java");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
