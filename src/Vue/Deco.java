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

public class Deco extends JPanel implements MouseListener
{
	JLabel conf;
	
	Deco(String dt)
	
	{
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		Font fcc=new Font("Time new Roman", Font.BOLD,20);

		this.setPreferredSize(new Dimension(1230, 100));
		this.setBackground(new Color(82, 35, 100));		
 
	//	pr.add(this);
		        				SpringLayout spirb=new SpringLayout();this.setLayout(spirb);
		        				conf=new JLabel(dt); conf.setFont(font);conf.setForeground(Color.white);
		        				SpringLayout.Constraints sctf=spirb.getConstraints(conf);		
		        				sctf.setX(Spring.constant(440));		
		        				sctf.setY(Spring.constant(30));
		        				this.add(conf);
	}
	
	Deco(String dt,int y)
	
	{
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		Font fcc=new Font("Time new Roman", Font.BOLD,20);

		this.setPreferredSize(new Dimension(1230, 100));
		this.setBackground(new Color(82, 35, 100));		
 
	//	pr.add(this);
		        				SpringLayout spirb=new SpringLayout();this.setLayout(spirb);
		        				conf=new JLabel(dt); conf.setFont(font);conf.setForeground(Color.white);
		        				SpringLayout.Constraints sctf=spirb.getConstraints(conf);		
		        				sctf.setX(Spring.constant(40));		
		        				sctf.setY(Spring.constant(30));
		        				this.add(conf);
	}
	
	
	Deco(String dt,int y,int c)
	
	{
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		Font fcc=new Font("Time new Roman", Font.BOLD,20);

		this.setPreferredSize(new Dimension(920, 100));
		this.setBackground(new Color(82, 35, 100));		
 
	//	pr.add(this);
		        				SpringLayout spirb=new SpringLayout();this.setLayout(spirb);
		        				conf=new JLabel(dt); conf.setFont(font);conf.setForeground(Color.white);
		        				
		        				
		        				SpringLayout.Constraints sctf=spirb.getConstraints(conf);		
		        				sctf.setX(Spring.constant(40));		
		        				sctf.setY(Spring.constant(30));
		        				this.add(conf);
	}
	
	public Deco(String dt,int y,int c,int h)
	
	{
		Font font=new Font("Time new Roman", Font.BOLD,20);
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		Font fcc=new Font("Time new Roman", Font.BOLD,20);

		this.setPreferredSize(new Dimension(190, 50));
		this.setBackground(new Color(82, 35, 100));		
 
	//	pr.add(this);
		        				SpringLayout spirb=new SpringLayout();this.setLayout(spirb);
		        				conf=new JLabel(dt); conf.setFont(font);conf.setForeground(Color.white);
		        				
		        				
		        				SpringLayout.Constraints sctf=spirb.getConstraints(conf);		
		        				sctf.setX(Spring.constant(40));		
		        				sctf.setY(Spring.constant(10));
		        				this.add(conf);
		        				
		        				this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		this.setBackground(new Color(221, 109, 75));		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		this.setBackground(new Color(82, 35, 100));		
		
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
