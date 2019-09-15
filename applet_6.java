import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class applet_6 extends Applet implements KeyListener
{
	public void init()
	{
		addKeyListener(this);
	}
	public void KeyTyped(KeyEvent kb)
	{
	}
	public void KeyReleased(KeyEvent kb)
	{
		showStatus("Key is released");
	}
	public void KeyPressed(KeyEvent kb)
	{
		showStatus("Key is pressed");
	}
	Font f1=new Font("Courier New",Font.BOLD,20);
	public void paint(Graphics g)
	{
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("This applet sense the up/down changes from ketboard",20,120);
	}
}
	
	