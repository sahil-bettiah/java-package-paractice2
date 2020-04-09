import java.awt.*;
import java.awt.event.*;

public class AWTCheckboxwithItemListener {
    AWTCheckboxwithItemListener(){
        Frame f = new Frame("Frame title");
        final Label lab = new Label();
        lab.setAlignment(Label.CENTER);
        lab.setSize(400, 100);
        Checkbox chk = new Checkbox("C++");
        chk.setBounds(100,100, 50,50);
        Checkbox chk2 = new Checkbox("Java");
        chk2.setBounds(100,150, 50,50);
        f.add(chk);
        f.add(chk2);
        f.add(lab);
        chk.addItemListener(new ItemListener () {
            public void itemStateChanged(ItemEvent e){
            lab.setText("C++ Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        chk2.addItemListener(new ItemListener () {
            public void itemStateChanged(ItemEvent e){
                lab.setText("Java Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);



    }
    public static void main(String args[]){
        new AWTCheckboxwithItemListener();
    }
}
