import java.awt.*;
public class AWTCheckboxGroupExample {
    AWTCheckboxGroupExample(){
        Frame f = new Frame();
        Checkbox chk1, chk2;
        CheckboxGroup cbg = new CheckboxGroup();
        cbg = new CheckboxGroup();
        chk1 = new Checkbox("C++", cbg, false);
        chk2 = new Checkbox("Java", cbg, true);
        chk1.setBounds(100, 100, 50, 50);
        chk2.setBounds(100, 150, 50, 50);
        f.add(chk1);
        f.add(chk2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String args[]){
        new AWTCheckboxGroupExample();
    }

}
