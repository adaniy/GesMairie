package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JPanelo extends JPanel implements MouseListener
{
	public JPanelo(){
		
		
		this.setPreferredSize(new Dimension(600,400));
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g)
	
	{
		try { Image img = ImageIO.read(new File("p.jpg")); //	g.drawImage(img, 0, 0, this); //Pour une image de fond
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this); } catch (IOException e) { e.printStackTrace(); }
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	//	this.printAll(arg0);
		System.out.print("ok");
		
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
