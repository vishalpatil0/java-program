import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class testmark extends Applet implements ActionListener
{
	TextField t1=new TextField(2);
	TextField t2=new TextField(2);
	TextField t3=new TextField(2);
	TextField t4=new TextField(2);
	TextField t5=new TextField(4);
	Label l1=new Label("First Test: ");
	Label l2=new Label("Second Test: ");
	Label l3=new Label("Third Test: ");
	Label l4=new Label("Total");
	Label l5=new Label("Average");
	Button b=new Button("Total");
	Button c=new Button("Find Average");
	public void init()
	{
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
		
		add(l4);
		add(t4);
		
		add(l5);
		add(t5);
		
		add(b);
		add(c);
		
		b.addActionListener(this);
		c.addActionListener(this);
	}
    public void actionPerformed(ActionEvent e)
	{
       int n1=Integer.parseInt(t1.getText());
       int n2=Integer.parseInt(t2.getText());
	   int n3=Integer.parseInt(t3.getText());
	   int tot=n1+n2+n3;
	   if(e.getSource()==b)
	   {
		   t4.setText(""+tot);
	   }
	   else if(e.getSource()==c)
	   {
		   t5.setText(""+(tot/3));
	   }
	}
}

		
		