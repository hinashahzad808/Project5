import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


 class Frame{

	public static void main(String[] args) {
		FrameWithPanel f = new FrameWithPanel();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
 }
class FrameWithPanel extends JFrame
{
      public FrameWithPanel()
      {
    	  setTitle("New Design");
    	  setSize(50,100);
    	  setLocation(100,200);
    	  Panel panel=new Panel();
    	  Container cp=getContentPane();
    	  cp.add(panel);
	
}
}
class Panel extends JPanel
{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Hello", 300, 500);
	}
}
 
