import java.awt.*;
import java.awt.event.*;
public class AWTCheckboxGroupwithItemListener {
    AWTCheckboxGroupwithItemListener(){
        Frame f = new Frame();
        final Label lab = new Label();
        lab.setAlignment(Label.CENTER);
        Checkbox chk1, chk2;
        CheckboxGroup cbg = new CheckboxGroup();
        cbg = new CheckboxGroup();
        chk1 = new Checkbox("C++", cbg, false);
        chk2 = new Checkbox("Java", cbg, false);
        chk1.setBounds(100, 100, 50, 50);
        chk2.setBounds(100, 150, 50, 50);
        f.add(chk1);
        f.add(chk2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        chk1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lab.setText("C++ checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        chk2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lab.setText("Java checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
            }
        });
    }
    public static void main(String args[]){
        new AWTCheckboxGroupwithItemListener();
    }
}
