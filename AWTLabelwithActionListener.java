import java.awt.*;
import java.awt.event.*;
public class AWTLabelwithActionListener extends Frame implements ActionListener{
    TextField tf;
    Label l;
    Button b;
    AWTLabelwithActionListener(){
        tf = new TextField();
        tf.setBounds(50, 50, 150, 30);
        l = new Label("hello");
        l.setBounds(50, 50, 250, 30);
        b = new Button("Find ip");
        b.setBounds(50, 150, 60, 40);
        b.addActionListener(this);
        add(b);
        add(tf);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+ host + "is : "+ip);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String args[]){
        new AWTLabelwithActionListener();
    }

}
