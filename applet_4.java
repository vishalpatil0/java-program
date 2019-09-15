import java.applet.*;
import java.awt.*;
public class applet_4 extends Applet
{
   public void paint(Graphics g)
   {
   int value1=10;
   int value2=20;
   int sum=value1+value2;
   String s="sum:"+String.valueOf(sum);
   g.drawString(s,100,100);
   }
}