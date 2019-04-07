package Vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Bouton extends JButton implements MouseListener{
	
	public Bouton(String f)
	
	{
		JLabel g=new JLabel(f);
		
		g.setFont(new Font("Times New Roman", Font.BOLD,40 ));g.setForeground(Color.WHITE);
		
		this.add(g);
		
		this.setForeground(Color.WHITE);
		
		this.setOpaque(true);
		
		this.setFont(new Font("Times New Roman", Font.BOLD,30 ));
		
		this.setContentAreaFilled(false);
		
		this.addMouseListener(this);
		 
		
	//	this.setBorderPainted(false);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		this.setContentAreaFilled(true);
		this.setBackground(new Color(82, 35, 100));
		 
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		this.setContentAreaFilled(true);
		this.setBackground(new Color(82, 35, 100));
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		this.setContentAreaFilled(false);
		
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
