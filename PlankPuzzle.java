import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class PlankPuzzle extends JFrame implements ActionListener
{
	JPanel p = new JPanel();
	JButton buttons[][] = new JButton[13][9];
	JButton Man;
	
	public static void main(String args[])
	{
		new PlankPuzzle();
	}
	
	public PlankPuzzle()
	{
		super("PlankPuzzle");
		
		p.setLayout(new GridLayout(13,9));
		
		/*for(int j=0; j<9; j++){
			buttons[0][j] = new JButton(new ImageIcon("bank2.JPG"));
			
			p.add(buttons[0][j]);
			
		}*/
		
		for(int i=0; i<13; i++)
		{
			for(int j=0; j < 9; j++){
				
				buttons[i][j]= new JButton(new ImageIcon("water1.JPG"));

				p.add(buttons[i][j]);
				buttons[i][j].addActionListener(this);
			}
		}
		for(int j=0; j<9; j++){
		buttons[0][j].setIcon(new ImageIcon("bank2.JPG"));
			
			
			
		}
		
		for(int xindex=0; xindex<9; xindex++){
			buttons[12][xindex].setIcon(new ImageIcon("bank1.JPG"));
		//buttons[12][0].addActionListener (new manStart()); 	
			
			}
		/*bank stump2man */
		
		for(int yindex=2; yindex<3; yindex++){
			buttons[12][yindex].setIcon(new ImageIcon("stump2_man.JPG"));
			buttons[12][2].addActionListener (new manStart());
			Man = buttons[12][2];
		}
		
			/*plank2 first position */
			
		for(int aindex=2; aindex<3; aindex++){
			buttons[11][aindex].setIcon(new ImageIcon("plank2.JPG"));
		}
		
		for(int bindex=2; bindex<3; bindex++){
			buttons[10][bindex].setIcon(new ImageIcon("plank2.JPG"));
		}
		
		for(int cindex=2; cindex<3; cindex++){
			buttons[9][cindex].setIcon(new ImageIcon("plank2.JPG"));
		}
		
		/* Puts man on first stump 8,2 */
		

			buttons[8][2].setIcon(new ImageIcon("stump1.JPG"));
			buttons[8][2].addActionListener (new manStart());
 
			
		/* second vertical stump */
		
		for(int eindex=2; eindex<3; eindex++){
			buttons[7][eindex].setIcon(new ImageIcon("plank2.JPG"));
		}
		
		for(int findex=2; findex<3; findex++){
			buttons[6][findex].setIcon(new ImageIcon("stump1.JPG"));
			
		}
		
		for(int gindex=6; gindex<7; gindex++) {
			buttons[6][gindex].setIcon(new ImageIcon("stump1.JPG"));
		}
		
		for(int hindex=6; hindex<7; hindex++) {
			buttons[4][hindex].setIcon(new ImageIcon("stump1.JPG"));
		}
		/*bank stump added*/ 
		
		for(int iindex=6; iindex<7; iindex++) {
			buttons[0][iindex].setIcon(new ImageIcon("stump3.JPG"));
		}

		for(int jindex=2; jindex<3; jindex++){
			buttons[4][jindex].setIcon(new ImageIcon("water4.JPG"));
		}
		
		/*fish added*/
		
		for(int kindex=4; kindex<5; kindex++){
			buttons[5][kindex].setIcon(new ImageIcon("water3.JPG"));
		}

	
		//JButton btn = new JButton("t");
			//p.add(btn);
			
		add(p);
		//this.setContentPane(p);
		setSize(350,350);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	

} 

	/*public class manStart implements ActionListener
	{
	public manStart()
	{
	/*man.addActionListener(this);
	} */
	public void actionPerformed(ActionEvent e)
	{
		JButton b = (JButton) e.getSource();
		
		b.setIcon(new ImageIcon("stump1_man.JPG"));
		buttons[12][2].setIcon (new ImageIcon("stump2.JPG"));
	}
	
	public void actionPerformedsecondStump(ActionEvent e)
	{
	buttons[6][2].setIcon(new ImageIcon("stump1_man.JPG"));
	buttons[12][2].setIcon (new ImageIcon("stump2.JPG"));
	}
} 



