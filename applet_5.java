import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class applet_5 extends Applet implements ActionListener 
{
 TextField t1,t2,t3;
 public void init()
 {
 t1=new TextField(8);
 t2=new TextField(8);
 t3=new TextField(8);
 Button b=new Button("Add");
 add(t1);
 add(t2);
 add(t3);
 add(b);
 t1.setText("0"); 
 t2.setText("0");
 b.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
	int x=0,y=0,z=0;
    String s1,s2,s3;  
	s1=t1.getText();
    s2=t2.getText();
    x=Integer.parseInt(s1);
    y=Integer.parseInt(s2);
    z=x+y;
    s3=String.valueOf(z);
	t3.setText(s3);
 }
}