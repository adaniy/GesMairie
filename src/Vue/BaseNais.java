package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

import controller.Connect;

public class BaseNais extends JPanel implements MouseListener

{
 
 
	JPanel p1=new JPanel(); 
    SpringLayout dp=new SpringLayout();
    Soul SEn=new Soul(p1,12,115,280,4,dp); Soul SSEn=new Soul(p1,12,115,280,4,dp); 
    Soul SCon=new Soul(p1,10,315,300,4,dp);Soul SSCon=new Soul(p1,10,315,300,4,dp); 
    Soul Simp=new Soul(p1,10,515,300,4,dp); Soul SSimp=new Soul(p1,10,515,300,4,dp); 
    
    Traite En,Con,Imp;  
    ConstiDossier cdd=new ConstiDossier(this);
    ConsulterNaiss cnn;
    ImprimerNaiss cii=new ImprimerNaiss(this);
    
    Connect con;
	
	 public BaseNais(JFrame fenetre,String etablir,String consulter,String Naissance,Deco humu)  
	
	{
		 cnn=new ConsulterNaiss(this,fenetre);
		
		 
		Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
		int longueur = tailleMoniteur.width ;//* 2/3;
		int hauteur = tailleMoniteur.height ;//* 2/3;
		this.setPreferredSize(new Dimension(longueur,hauteur));
		
		SpringLayout spring=new SpringLayout();		
		this.setBackground(new Color(69, 82, 92));
				
		this.setLayout(spring);
 
		
	 
         
       
        
        p1.setBackground(new Color(43, 146, 194));        
        p1.setPreferredSize(new Dimension(330,650));        
        p1.setLayout(dp);
        
        SEn.setVisible(false);SSEn.setVisible(false);SSCon.setVisible(false);SSimp.setVisible(false);
        SCon.setVisible(false);
        Simp.setVisible(false);
        
        
        
         En=new Traite("En",p1,etablir,dp,10,80);         
         Con =new Traite("Con",p1,consulter,dp,10,280);        
         Imp =new Traite("Imp",p1,Naissance,dp,10,480); 
         
         En.addMouseListener(this);
        
         Con.addMouseListener(this);
        
         Imp.addMouseListener(this);
         
         
         
         
         
        SpringLayout.Constraints sxs=spring.getConstraints(humu);		
 		sxs.setX(Spring.constant(0));		
 		sxs.setY(Spring.constant(30));
 		this.add(humu);
 		
        
        
        
        
        
        SpringLayout.Constraints sx=spring.getConstraints(p1);		
		sx.setX(Spring.constant(0));		
		sx.setY(Spring.constant(135));
		this.add(p1);
		
		SpringLayout.Constraints cddd=spring.getConstraints(cdd);		
		cddd.setX(Spring.constant(340));		
		cddd.setY(Spring.constant(135));
		cdd.setVisible(false);
		this.add(cdd);
		
		
		SpringLayout.Constraints cddd1=spring.getConstraints(cnn);		
		cddd1.setX(Spring.constant(340));		
		cddd1.setY(Spring.constant(135));
		cnn.setVisible(false);
		this.add(cnn);
		
		
		
		SpringLayout.Constraints cddd11=spring.getConstraints(cii);		
		cddd11.setX(Spring.constant(340));		
		cddd11.setY(Spring.constant(135));
		cii.setVisible(false);
		this.add(cii);
		
		
		
		
		
	}
	
 

 
	public void mouseClicked(MouseEvent e) 
	{		
		if(e.getSource()==En)
		{
			En.setForeground(Color.WHITE); Con.setForeground(Color.BLACK); Imp.setForeground(Color.BLACK);
			SSEn.setVisible(true);SSCon.setVisible(false);SSimp.setVisible(false);
			
			cnn.setVisible(false);
			cdd.setVisible(true);
			cii.setVisible(false);
		}		
		
		if(e.getSource()==Con)
		{
	/*		Con.setForeground(Color.WHITE); En.setForeground(Color.BLACK); Imp.setForeground(Color.BLACK);
			SSEn.setVisible(false);SSCon.setVisible(true);SSimp.setVisible(false);
			cdd.setVisible(false);
			cnn.setVisible(true);
			cii.setVisible(false); */
		}
		
		if(e.getSource()==Imp)
		{
			Imp.setForeground(Color.WHITE); Con.setForeground(Color.BLACK); En.setForeground(Color.BLACK);
			SSEn.setVisible(false);SSCon.setVisible(false);SSimp.setVisible(true);
	/*		cdd.setVisible(false);
			cnn.setVisible(false);
			cii.setVisible(true); */
			
			
			cdd.setVisible(false);
			cnn.setVisible(true);
			cii.setVisible(false);
		}
 
	}


 
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource()==En)
		{
			SEn.setVisible(true);
		}		
		
		if(e.getSource()==Con)
		{
			SCon.setVisible(true);
		}
		
		if(e.getSource()==Imp)
		{
			Simp.setVisible(true);
		}
	}


 
	public void mouseExited(MouseEvent e) 
	{
		if(e.getSource()==En)
		{ 
			SEn.setVisible(false);
		}
		
		if(e.getSource()==Con)
		{
			SCon.setVisible(false);
		}
		
		if(e.getSource()==Imp)
		{
			Simp.setVisible(false);
		}
	}

 
	public void mousePressed(MouseEvent e) {
		 
		
	}


 
	public void mouseReleased(MouseEvent e) { 
	}
	
}

