package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Fond extends JPanel

{
	private Thread t;
	private JProgressBar bar;
	
	Fond()
	{
		t = new Thread(new Traitement());
		
		bar = new JProgressBar();
		
		bar.setMaximum(500);
		
		bar.setMinimum(0);
		
		bar.setStringPainted(true);
		
		bar.setForeground(new Color(0,65,125));
		
		bar.setBackground(Color.WHITE);
		
		bar.setPreferredSize(new Dimension(730,15));
		
		t = new Thread(new Traitement());
		
		t.start();
		
		
		
		
		SpringLayout spring=new SpringLayout();
		
		this.setLayout(spring);
		
		
		
		
		JLabel labela=new JLabel("GESTION-MAIRIE"); labela.setFont(new Font("Bradley Hand ITC", Font.BOLD,80 ));labela.setForeground(Color.WHITE);
		
		SpringLayout.Constraints ba1=spring.getConstraints(labela);
		
		ba1.setX(Spring.constant(40));
		
		ba1.setY(Spring.constant(80));
		
		
		JLabel decor=new JLabel("0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0"); decor.setFont(new Font("Bradley Hand ITC", Font.BOLD,10 ));decor.setForeground(Color.WHITE);
		
		SpringLayout.Constraints de1=spring.getConstraints(decor);
		
		de1.setX(Spring.constant(50));
		
		de1.setY(Spring.constant(180));
		
		
		JLabel presente=new JLabel("Concu Par : "); presente.setFont(new Font("Times New Roman", Font.BOLD,20 ));presente.setForeground(Color.WHITE);
		
		SpringLayout.Constraints p1=spring.getConstraints(presente);
		
		p1.setX(Spring.constant(340));
		
		p1.setY(Spring.constant(200));
		
		
		
		JLabel njam=new JLabel("Njammy Patchakwe Jovani"); njam.setFont(new Font("Times New Roman", Font.BOLD,20 ));njam.setForeground(Color.WHITE);
		
		SpringLayout.Constraints n1=spring.getConstraints(njam);
		
		n1.setX(Spring.constant(50));
		
		n1.setY(Spring.constant(300));
		
		
		
		
		JLabel ran=new JLabel("Nuekuimo Tamo Periane"); ran.setFont(new Font("Times New Roman", Font.BOLD,20 ));ran.setForeground(Color.WHITE);
		
		SpringLayout.Constraints r1=spring.getConstraints(ran);
		
		r1.setX(Spring.constant(530));
		
		r1.setY(Spring.constant(300));
		
		
		
		
		JLabel Encadre=new JLabel("Encadre Par : "); Encadre.setFont(new Font("Times New Roman", Font.BOLD,20 ));Encadre.setForeground(Color.WHITE);
		
		SpringLayout.Constraints e1=spring.getConstraints(Encadre);
		
		e1.setX(Spring.constant(340));
		
		e1.setY(Spring.constant(350));
		
		
		
		
		JLabel mme=new JLabel("Mme. DJIKA BLANDINE "); mme.setFont(new Font("Times New Roman", Font.BOLD,25 ));mme.setForeground(Color.WHITE);
		
		SpringLayout.Constraints mm=spring.getConstraints(mme);
		
		mm.setX(Spring.constant(240));
		
		mm.setY(Spring.constant(400));
		
		
		JLabel ms=new JLabel("--------------------------------------"); ms.setFont(new Font("Times New Roman", Font.BOLD,25 ));ms.setForeground(Color.WHITE);
		
		SpringLayout.Constraints mm1=spring.getConstraints(ms);
		
		mm1.setX(Spring.constant(240));
		
		mm1.setY(Spring.constant(410));
		
		
		this.add(ms);
		
		this.add(mme);
		
		this.add(Encadre);
		
		this.add(ran);
		
		this.add(njam);
		
		this.add(presente);
		
		this.add(decor);
		
		this.add(labela);
		
		
		
		
		
		

		
		SpringLayout.Constraints jk= spring.getConstraints(bar);
		
		jk.setX(Spring.constant(30));
		
		jk.setY(Spring.constant(480)); 
		
		this.add(bar);
	}
	
	
	
	public void paintComponent(Graphics g){ try { Image img = ImageIO.read(new File("p.jpg"));  g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);} catch (IOException e) {e.printStackTrace();}}

	
	
	class Traitement implements Runnable
	{
		public void run()
		{
				for(int val = 0; val <= 500; val++)
				{
					
					
					bar.setValue(val);
		
					try {t.sleep(20); } catch (InterruptedException e) {e.printStackTrace();}
					
					val+=1;
				}
				 
				
		}
	}

}
