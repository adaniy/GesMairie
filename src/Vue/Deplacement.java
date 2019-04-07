package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

public class Deplacement extends JPanel implements MouseListener

{
	int oldX,oldY;
	JPanel fermer;
	
	public Deplacement(JFrame fenetre)
	{
		Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
		int longueur = tailleMoniteur.width ;//* 2/3;
		int hauteur = tailleMoniteur.height ;//* 2/3;
		
		this.addMouseListener(new MouseAdapter()
        {
            @Override public void mousePressed(MouseEvent e) 
            {	 
            	if(SwingUtilities.isLeftMouseButton(e))
                {
                    oldX = e.getX();
                    oldY = e.getY();
                }
            }
 
            public void mouseReleased(MouseEvent e) 
            {
                oldX = e.getX();
                oldY = e.getY();
            }           
        });
 
        this.addMouseMotionListener(new MouseMotionAdapter()
        {                     
            @Override public void mouseDragged(MouseEvent e) 
            {
                
                Point p = new Point(e.getLocationOnScreen());
                fenetre.setLocation(p.x-oldX,p.y-oldY);	
            }	
        });
        
        
        
        
        this.setBackground(new Color(82, 35, 100));
        this.setPreferredSize(new Dimension(longueur,25));
        
        
        
        JLabel X=new JLabel("X");
        Font font=new Font("ROCKWELL", Font.BOLD,15);
        X.setFont(font);
        X.setForeground(Color.white);
        
        
        
        
        SpringLayout sp=new SpringLayout();this.setLayout(sp); 
        fermer=new JPanel();
        fermer.add(X);
        fermer.setBackground(Color.RED);
        
        int lo=longueur-50;
        fermer.setPreferredSize(new Dimension(50,25));
		SpringLayout.Constraints s2=sp.getConstraints(fermer);		
		s2.setX(Spring.constant(lo));		
		s2.setY(Spring.constant(0));
		this.add(fermer);
		fermer.addMouseListener(this);
        
        
	}
 
	public void mouseClicked(MouseEvent arg0) {System.exit(0);}
	public void mouseEntered(MouseEvent arg0) {fermer.setBackground(new Color(235, 133, 133));}
	public void mouseExited(MouseEvent arg0)  {fermer.setBackground(Color.RED);}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0){}

}
