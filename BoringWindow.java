import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;


public class BoringWindow extends JFrame {

	public static void main(String[] args) {
	
		JFrame f = new BoringWindow();
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setTitle("My First Frame");
         f.setSize(500,300);
        Container c=f.getContentPane(); 
         c.setBackground(Color.blue);
         f.setVisible(true);
         
	}

}
