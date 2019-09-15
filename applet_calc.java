import java.awt.*;
import java.awt.event.*;
public class applet_calc implements ActionListener
{
  Frame frm;
  Panel pl;
  Label lno1,lno2,lans;
  Textfield tno1,tno2,tans;
  Button badd,bsub;
  public applet_calc()
  {
	   frm=new Frame("calculator ver 2020");
	   frm.setsize(400,400);
	   frm.setvisible(true);
	   pl=new panel();
	   frm.add(pl);
	   pl.setBackground(Color.yellow);
	   GridLayout gl=new GridLayout(4,2);
	   pl.setLayout(gl);
	   
	   lno1=new Label("Number 1");
	   lno2=new Label("Number 2");
	   lans=new Label("Number 1");
	   tno1=new TextField(10);
	   tno2=new TextField(10);
	   tans=new TextField(10);
	   badd=new button("-");
	   
	   p1.add(lno1);
	   p1.add(tno1);
	   p1.add(lno2);
	   p1.add(tno2);
	   p1.add(lans);
	   p1.add(tans);
	   p1.add(badd);
	   p1.add(bsub);
	   badd.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
	  if(e.getsource()==badd)
	  {
		  String s1=tno1.getText();
		  String s2=tno2.getText();
          int n1=Integer.ParseInt(s1);		 
		  int n2=Integer.ParseInt(s2);
		  int sum=n1+n2;
		  tans.setText(Integer.toString(sum));
	  }
  }
  public static void main(String args[])
  {
	  applet_calc c=new applet_calc();
  }
}