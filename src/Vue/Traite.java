package Vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Traite extends JLabel implements MouseListener
{
	String lo;
	
	public String getLo() {
		return lo;
	}

	public void setLo(String lo) {
		this.lo = lo;
	}

	Traite(String pl,JPanel p1,String str,SpringLayout dp,int x,int y)
	
	{
		this.setText(str);lo=pl;
		SpringLayout.Constraints l1=dp.getConstraints(this);
		
		l1.setX(Spring.constant(x));
		
		l1.setY(Spring.constant(y));
		
		this.setFont(new Font("Times New Roman", Font.BOLD,25 ));
		
		this.addMouseListener(this);
		
		p1.add(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
