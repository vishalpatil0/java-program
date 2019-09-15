import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

/*<applet code="SwingComponentDemo.class" height="300" width="300">
</applet>*/
public class SwingComponentDemo extends JApplet 
{
	String msg="";
	JLabel lfname,lmname,llname,laddress,lemail,lmbno,lenroll,lspace,ldiv,lcourses;
	JTextField tfirst,tmiddle,tlast,temail,tmobile,tenroll,tadd;
	JRadioButton div1,div2,div3;
	JCheckBox cbandroid,cbjp2,cbjsp,cbst,cbcs;
	JButton bsub;
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		lenroll=new JLabel("Enrollment Number");
		lfname=new JLabel("Fisrt Name");
		lmname=new JLabel("Middle Name");
		llname=new JLabel("Last Name");
		laddress=new JLabel("Address");
		lemail=new JLabel("Email");
		lmbno=new JLabel("Mobile Number");
		lspace=new JLabel(" ");
		ldiv=new JLabel("Divison");
		lcourses=new JLabel("Courses");
		tfirst=new JTextField(10);
		tmiddle=new JTextField(10);
		tlast=new JTextField(10);
		temail=new JTextField(10);
		tmobile=new JTextField(10);
		tenroll=new JTextField(10);
		tadd=new JTextField(10);
		tadd=new JTextField(10);
		bsub=new JButton("Submit");
		div1=new JRadioButton("A1");
		div2=new JRadioButton("A2");
		div3=new JRadioButton("A3");
		cbandroid=new JCheckBox("Android");
		cbjp2=new JCheckBox("Java Programming 2");
		cbjsp=new JCheckBox("Java Servlet Programming");
		cbst=new JCheckBox("Software Testing");
		cbcs=new JCheckBox("Computer Security");
		ButtonGroup gp=new ButtonGroup();
		gp.add(div1);
		gp.add(div2);
		gp.add(div3);
		cp.add(lenroll);
		cp.add(tenroll);
		cp.add(lfname);
		cp.add(tfirst);
		cp.add(lmname);
		cp.add(tmiddle);
		cp.add(llname);
		cp.add(tlast);
		cp.add(lemail);
		cp.add(temail);
		cp.add(lmbno);
		cp.add(tmobile);
		cp.add(ldiv);
		cp.add(div1);
		cp.add(div2);
		cp.add(div3);
		cp.add(lcourses);
		cp.add(cbandroid);
		cp.add(cbjp2);
		cp.add(cbjsp);
		cp.add(cbst);
		cp.add(cbcs);
	}
}