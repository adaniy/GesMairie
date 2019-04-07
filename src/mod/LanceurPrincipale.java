package mod;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;

import Vue.AllerG;
import Vue.BaseDes;
import Vue.BaseNais;
import Vue.Bouton;
import Vue.Choix;
import Vue.Deco;
import Vue.Deplacement;
import Vue.JPanelo;
import Vue.Login;
import Vue.SplashScreen;
import Vue.Warning;
import controller.Connect;

 

public class LanceurPrincipale implements Runnable,MouseListener
{
	JFrame fenetre=new JFrame();
	SpringLayout sp=new SpringLayout();
	Bouton bou=new Bouton("Soumettre");
	Bouton i=new Bouton("i");
	Login premierAffichage=new Login(fenetre,bou,i);
	AllerG allern=new AllerG("Gerer","Naissance");
	AllerG allerd=new AllerG("Gerer","Deces",8);
	Choix choixPremier;
	Deco humu=new Deco("Deconexion",6,6,6);
	Deco humur=new Deco("Retour",6,6,6);
	Deco humurd=new Deco("Retour",6,6,6);
	BaseNais baseNaissance=new BaseNais(fenetre,"Etablir Acte de  Naissance"," ","Consulter Acte de Naissance",humur);
	BaseDes baseDesces=new BaseDes(fenetre,"Etablir Acte de Deces"," ","Consulter Acte de Deces",humurd);	
	
	
	public LanceurPrincipale()
	{
		
	}
	
	public void run() 
	{
	
		SplashScreen splash=new SplashScreen();		
	 	Thread threadUn=new Thread(splash);		
	 	threadUn.start();
	 	try { Thread.sleep(7100);threadUn.stop(); } catch (InterruptedException e) { e.printStackTrace(); } 
		splash.setVisible(false); 
		
		
		//récuperer la dimension de l'écran
		Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
		int longueur = tailleMoniteur.width ;//* 2/3;
		int hauteur = tailleMoniteur.height ;//* 2/3;
		//régler la taille de JFrame à 2/3 la taille de l'écran
		fenetre.setSize(longueur, hauteur);
	 	
	 	
		fenetre.setLayout(sp);
	//	fenetre.setSize(1590, 810);	
		 
		fenetre.setUndecorated(true);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try { Image img = ImageIO.read(new File("logo.png")); fenetre.setIconImage(img); }
		
		catch (IOException e1)  { e1.printStackTrace(); }
				 
		
		
		Deplacement deplace1=new Deplacement(fenetre);
		SpringLayout.Constraints s2=sp.getConstraints(deplace1);		
		s2.setX(Spring.constant(0));		
		s2.setY(Spring.constant(0));
		fenetre.add(deplace1);
		
		
		
		 
		bou.addMouseListener(this);		
		SpringLayout.Constraints paf=sp.getConstraints(premierAffichage);		
		paf.setX(Spring.constant(0));		
		paf.setY(Spring.constant(25)); 
		
		i.addMouseListener(this);	
		
		humu.addMouseListener(this);
		humur.addMouseListener(this);
		humurd.addMouseListener(this);
		choixPremier=new Choix(fenetre,allern,allerd,premierAffichage.renvoieId(),humu);  
		SpringLayout.Constraints chop=sp.getConstraints(choixPremier);		
		chop.setX(Spring.constant(0));		
		chop.setY(Spring.constant(25)); 
		
		
		allern.addMouseListener(this);	
		SpringLayout.Constraints bana=sp.getConstraints(baseNaissance);		
		bana.setX(Spring.constant(0));		
		bana.setY(Spring.constant(25)); 
		
		
		
		allerd.addMouseListener(this);	
		SpringLayout.Constraints bade=sp.getConstraints(baseDesces);		
		bade.setX(Spring.constant(0));		
		bade.setY(Spring.constant(25)); 
		
		JPanelo io=new JPanelo();
		SpringLayout.Constraints badec=sp.getConstraints(io);		
		badec.setX(Spring.constant(200));		
		badec.setY(Spring.constant(125)); 
		
		fenetre.getContentPane().add(choixPremier); choixPremier.setVisible(false);
		fenetre.getContentPane().add(baseNaissance); baseNaissance.setVisible(false); 
		fenetre.getContentPane().add(baseDesces);	baseDesces.setVisible(false); 
		
		
		
	
		
		fenetre.add(premierAffichage);
	//	choixPremier.setVisible(true);
	//	fenetre.getContentPane().add(choixPremier); 
		fenetre.getContentPane().add(io); 
	 	fenetre.setVisible(true);
	 	
	 	
	}
	
	

	public void mouseClicked(MouseEvent e) 
	{
		Connect n=new Connect();
		
		
		if(e.getSource()==i)
		{
			Warning hu=new Warning(true, 0, null);
		}
	
		if(e.getSource()==bou)
		{
			 
			try {
				if(n.recherch(premierAffichage.renvoieId(), premierAffichage.renvoieMdp())=="oui")
				 {	
					premierAffichage.setVisible(false);
					choixPremier.setVisible(true);; 
				 }	
			else if(n.recherch(premierAffichage.renvoieId(), premierAffichage.renvoieMdp())==null)
				{ Warning oh=new Warning(); }
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
			
		}
		
		if(e.getSource()==humu)
		{
			choixPremier.setVisible(false); 
			premierAffichage.setVisible(true);
		}
		
		if(e.getSource()==humur)
		{
			baseNaissance.setVisible(false); 
			choixPremier.setVisible(true);
		}
		
		if(e.getSource()==humurd)
		{
			baseDesces.setVisible(false); 
			choixPremier.setVisible(true);
		}
		

		
		if(e.getSource()==allern)
		{
			choixPremier.setVisible(false);
			baseNaissance.setVisible(true);  
		}
		
		if(e.getSource()==allerd)
		{
			choixPremier.setVisible(false);
			baseDesces.setVisible(true); 
			
		}
	}

 
	public void mouseEntered(MouseEvent e) { 
	}

 
	public void mouseExited(MouseEvent e) { 
	}

 
	public void mousePressed(MouseEvent e) { 
	}

 
	public void mouseReleased(MouseEvent e) { 
	}

}
