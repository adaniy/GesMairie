
package Vue;
 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Login extends JPanel implements MouseListener

{
 
	JTextField id=new JTextField(); 
	
	JPasswordField mdp=new JPasswordField();
	
	public String renvoieId() { return id.getText();}
	public  void renId() {  id.setText(" ");}
	
	public String renvoieMdp() 
	{
		 
		return mdp.getText();
	}
	public void renMdp() { mdp.setText(" ");}

 

	


	SpringLayout spring=new SpringLayout();
	
	public Login(JFrame fenetre,Bouton bou,Bouton i)
	
	{
		Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
		int longueur = tailleMoniteur.width ;//* 2/3;
		int hauteur = tailleMoniteur.height ;//* 2/3;
		

		this.setBackground(new Color(69, 82, 92));
		this.setPreferredSize(new Dimension(longueur,hauteur));
		this.setLayout(spring);
 
		JLabel label=new JLabel(" BIENVENUE SUR GES-MAIRIE"); label.setFont(new Font("Times New Roman", Font.BOLD,90 ));label.setForeground(Color.WHITE);
		SpringLayout.Constraints b1=spring.getConstraints(label);		
		b1.setX(Spring.constant(110));		
		b1.setY(Spring.constant(80));	
		
		
		
		
		
		JLabel label1=new JLabel(" Veuillez Entrer Vos Identifiants"); label1.setFont(new Font("Times New Roman", Font.BOLD,40 ));label1.setForeground(Color.WHITE);
		SpringLayout.Constraints b2=spring.getConstraints(label1);		
		b2.setX(Spring.constant(415));		
		b2.setY(Spring.constant(250));	
		
		
		
		
		JLabel label2=new JLabel("Identifiant : "); label2.setFont(new Font("Times New Roman", Font.BOLD,40 ));label2.setForeground(Color.WHITE);
		SpringLayout.Constraints b3=spring.getConstraints(label2);		
		b3.setX(Spring.constant(480));		
		b3.setY(Spring.constant(365));	
		
		
		
		
		id.setFont(new Font("Times New Roman", Font.BOLD,40 ));id.setForeground(Color.WHITE);id.setPreferredSize(new Dimension(500,50));id.setOpaque(false);
		SpringLayout.Constraints b4=spring.getConstraints(id);		
		b4.setX(Spring.constant(700));		
		b4.setY(Spring.constant(370));	
		
		
		
		
		JLabel label3=new JLabel("Mot De passe : "); label3.setFont(new Font("Times New Roman", Font.BOLD,40 ));label3.setForeground(Color.WHITE);
		SpringLayout.Constraints b5=spring.getConstraints(label3);		
		b5.setX(Spring.constant(431));		
		b5.setY(Spring.constant(465));	
		
		
		
		
		 mdp.setFont(new Font("Times New Roman", Font.BOLD,40 ));mdp.setForeground(Color.WHITE);mdp.setPreferredSize(new Dimension(500,50));mdp.setOpaque(false);//mdp.setBorder(null);
		
		
		
		SpringLayout.Constraints b6=spring.getConstraints(mdp);		
		b6.setX(Spring.constant(700));		
		b6.setY(Spring.constant(467));	
		
		
		
		
		
		JTextField i3=new JTextField(); i3.setFont(new Font("Times New Roman", Font.BOLD,40 ));i3.setForeground(Color.BLACK);i3.setPreferredSize(new Dimension(900,200));i3.setOpaque(false);i3.setEditable(false);		
		SpringLayout.Constraints b7=spring.getConstraints(i3);		
		b7.setX(Spring.constant(370));		
		b7.setY(Spring.constant(350));	
		
		
		
		SpringLayout.Constraints bbb=spring.getConstraints(bou);
		bbb.setX(Spring.constant(1062));		
		bbb.setY(Spring.constant(580));	
		bou.addMouseListener(this);
		
		SpringLayout.Constraints bbb1=spring.getConstraints(i);
		bbb1.setX(Spring.constant(1000));		
		bbb1.setY(Spring.constant(580));	
		
 		
			this.add(bou);	 
			this.add(label3);			
			this.add(label1);		
			this.add(mdp);		
			this.add(id);		
			this.add(i3);		
			this.add(label);
			this.add(label2);
			this.add(i);

			
			
			
			
	}
	
 
	
	public void mouseClicked(MouseEvent arg0) {  }

 
	public void mouseEntered(MouseEvent arg0) { }

 
	public void mouseExited(MouseEvent arg0) { }

 
	public void mousePressed(MouseEvent arg0) { }
 
	public void mouseReleased(MouseEvent arg0) { }

	
}