import java.awt.*;
class First{
    First(){
        Frame f = new Frame();
        Button b = new Button("Click Here");
        b.setBounds(30, 40, 90, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);


    }
}

public class AWTExamplebyAssociation {
    public static void main(String args[]){
        First f = new First();

    }
}

