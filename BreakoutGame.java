/*


Programme Conceptualised And Developed By:
Nishant Tomar
Dipak Rai
Keshav Bansal
Anshika Singhal


Batch:     B7

UNIVERSITY :  JIIT, NOIDA SECTOR 62

Project Title: Break-Out Game
Copyright:  2015

Last Update On: 25.11.2015
All Rights Reserved To The 4 Programmers Of This Program Only


*/

package breakout2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BreakoutGame
{
	
	public static void main( String[] args )
	{
		//Play p = new Play(); 
		final ImageIcon icon = new ImageIcon("/Users/nishanttomar21/Documents/workspace/breakout2/src/images/5.jpg");
		JOptionPane.showMessageDialog(null, "", "GAME!", JOptionPane.INFORMATION_MESSAGE, icon);
		
		// Creating Object.
		Play p = new Play();
		JFrame f = new JFrame();
		f.add(p);
		f.setSize(400,600);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("BREAKOUT!");
		
	}

}
