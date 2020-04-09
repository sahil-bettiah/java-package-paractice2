import java.awt.*;

public class AWTTextAreaClassDeclaration {
    AWTTextAreaClassDeclaration() {
        Frame f = new Frame();
        TextArea area = new TextArea("Welcome to textarea.");
        area.setBounds(10, 40, 300, 300);
        f.add(area);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String args[]){
        new AWTTextAreaClassDeclaration();
    }
}
