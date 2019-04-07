package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class AllerG extends JPanel  implements MouseListener
{
	Color ol=new Color(72,72,72);
	
	JLabel nais;JLabel gesNais;
	
	public AllerG(String a1,String a2)
	{
		this.setPreferredSize(new Dimension(400,300)); 
		
		this.setBackground(ol);
		
		SpringLayout sp=new SpringLayout();
		
		this.setLayout(sp);
		
		this.setForeground(Color.white);
		
			 		 gesNais=new JLabel(a1);gesNais.setFont(new Font("Times New Roman", Font.BOLD,50 ));gesNais.setForeground(Color.WHITE);
		
					  nais=new JLabel(a2);nais.setFont(new Font("Times New Roman", Font.BOLD,50 ));nais.setForeground(Color.WHITE);
			
			
			SpringLayout.Constraints x=sp.getConstraints(gesNais);
			
			x.setX(Spring.constant(110));
			
			x.setY(Spring.constant(40));
			
			
			SpringLayout.Constraints x1=sp.getConstraints(nais);
			
			x1.setX(Spring.constant(60));
			
			x1.setY(Spring.constant(150));
			
			this.add(gesNais);
			
			this.add(nais);
			
			this.addMouseListener(this);
	}

	
	public AllerG(String a1,String a2,int k)
	
	{
		this.setPreferredSize(new Dimension(400,300)); 
		
		this.setBackground(ol);
		
		SpringLayout sp=new SpringLayout();
		
		this.setLayout(sp);
		
		this.setForeground(Color.white);
		
			 		  gesNais=new JLabel(a1);gesNais.setFont(new Font("Times New Roman", Font.BOLD,50 ));gesNais.setForeground(Color.WHITE);
		
					  nais=new JLabel(a2);nais.setFont(new Font("Times New Roman", Font.BOLD,50 ));nais.setForeground(Color.WHITE);
			
			
			SpringLayout.Constraints x=sp.getConstraints(gesNais);
			
			x.setX(Spring.constant(110));
			
			x.setY(Spring.constant(40));
			
			
			SpringLayout.Constraints x1=sp.getConstraints(nais);
			
			x1.setX(Spring.constant(110));
			
			x1.setY(Spring.constant(150));
			
			this.add(gesNais);
			
			this.add(nais);
			
			this.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
 
		
		this.setBackground(new Color(221, 109, 75));
		
		nais.setFont(new Font("Times New Roman", Font.BOLD,70 ));gesNais.setFont(new Font("Times New Roman", Font.BOLD,70 ));
		
		this.setPreferredSize(new Dimension(400,300)); 
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		this.setBackground(ol);
		
		nais.setFont(new Font("Times New Roman", Font.BOLD,50 ));
		
		gesNais.setFont(new Font("Times New Roman", Font.BOLD,50 ));
		
		this.setPreferredSize(new Dimension(400,300)); 
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
 

	 
}
