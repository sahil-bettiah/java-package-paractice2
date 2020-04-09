import java.awt.*;
public class AWTCheckboxExample {
    AWTCheckboxExample(){
        Frame f = new Frame("Frame title");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        Checkbox chkbx1 , chkbx2;
        chkbx1 = new Checkbox("C++");
        chkbx2 = new Checkbox("Java", true);
        chkbx1.setBounds(100, 100, 50, 50);
        chkbx2.setBounds(100, 150, 50, 50);
        f.add(chkbx1);
        f.add(chkbx2);

    }
    public static void main(String args[]){
        new AWTCheckboxExample();
    }

}
