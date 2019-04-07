package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Choix extends JPanel  

{
	SpringLayout sp=new SpringLayout();
	
	String iu;
	
	public String getIu() {
		return iu;
	}

	public void setIu(String iu) {
		this.iu = iu;
	}

	public Choix (JFrame fenetre,AllerG allerd,AllerG aller,String h,Deco humu)
	{
		iu=h;
		Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
		int longueur = tailleMoniteur.width ;//* 2/3;
		int hauteur = tailleMoniteur.height ;//* 2/3;
		
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		Font fcc=new Font("Time new Roman", Font.BOLD,20);
		
		String str="Bienvenue Admin Que Voulez Vous Gerez : ";
		
		Deco hum=new Deco(str,6,6);
		SpringLayout.Constraints s4s=sp.getConstraints(hum);		
		s4s.setX(Spring.constant(340));		
		s4s.setY(Spring.constant(170));
		this.add(hum);
		
		
		SpringLayout.Constraints s4su=sp.getConstraints(humu);		
		s4su.setX(Spring.constant(700));		
		s4su.setY(Spring.constant(670));
		this.add(humu);
	 
		
		this.setPreferredSize(new Dimension(longueur,hauteur));
		this.setBackground(new Color(69, 82, 92));
		this.setLayout(sp);
		
		
		
		
		         
		SpringLayout.Constraints s4=sp.getConstraints(allerd);		
		s4.setX(Spring.constant(340));		
		s4.setY(Spring.constant(300));
		
		
		SpringLayout.Constraints s5=sp.getConstraints(aller);		
		s5.setX(Spring.constant(860));		
		s5.setY(Spring.constant(300));
		
		this.add(aller);
		this.add(allerd);
		
	//	fenetre.add(this);
	}


}
