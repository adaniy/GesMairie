package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Spring;
import javax.swing.SpringLayout;

import controller.Connect;

public class ConsulterNaiss extends JPanel implements MouseListener

{
	JLabel conf;
	
	JPanel pre=new JPanel();
	JLabel req=new JLabel(); 
	JPanel recoit=new JPanel();
	JScrollPane scroll = new JScrollPane(recoit);
	
	Champ nomrech=new Champ(8);
	Champ numeorech=new Champ(8);
	
	
	Champ declaration=new Champ(8);
	JButton bta=new JButton();JLabel g=new JLabel("Rechercher");
	SpringLayout spirj=new SpringLayout();

	
	
	ConsulterNaiss(JPanel p,JFrame fenetre)
	{
		this.setBackground(new Color(255,255,255));
		this.setPreferredSize(new Dimension(1230, 650));
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		Font fcc=new Font("Time new Roman", Font.BOLD,20); req.setFont(fcc);
		
		SpringLayout spi=new SpringLayout();this.setLayout(spi);
		
		JPanel pr=new JPanel();
		pr.setPreferredSize(new Dimension(1230, 100));
		pr.setBackground(new Color(82, 35, 100));		
		SpringLayout.Constraints sckh=spi.getConstraints(pr);		
        sckh.setX(Spring.constant(0));		
        sckh.setY(Spring.constant(0));
		this.add(pr);
		        				SpringLayout spirb=new SpringLayout();pr.setLayout(spirb);
		        				conf=new JLabel("CONSULTER UN ACTE NAISSANCE"); conf.setFont(font);conf.setForeground(Color.white);
		        				SpringLayout.Constraints sctf=spirb.getConstraints(conf);		
		        				sctf.setX(Spring.constant(50));		
		        				sctf.setY(Spring.constant(30));
		        				pr.add(conf);
		
		
		pre.setPreferredSize(new Dimension(1230, 650));
		pre.setBackground(new Color(255,255,255));		
		SpringLayout.Constraints sck=spi.getConstraints(pre);		
        sck.setX(Spring.constant(0));		
        sck.setY(Spring.constant(0));
		this.add(pre);
		SpringLayout spir=new SpringLayout();pre.setLayout(spir);
		
		
		 
								
						        JLabel xjia2=new JLabel("Nom"); xjia2.setFont(fcc);   				 
						        SpringLayout.Constraints poa1=spir.getConstraints(xjia2); 					SpringLayout.Constraints x22211a=spir.getConstraints(nomrech);		
						        poa1.setX(Spring.constant(50));												x22211a.setX(Spring.constant(260));		
						        poa1.setY(Spring.constant(158)); 											x22211a.setY(Spring.constant(155));
						        pre.add(xjia2);																pre.add(nomrech);

						        JLabel xjia2e=new JLabel("Numero Naissance"); xjia2e.setFont(fcc);   				 
						        SpringLayout.Constraints poa1e=spir.getConstraints(xjia2e); 					SpringLayout.Constraints x22211ae=spir.getConstraints(numeorech);		
						        poa1e.setX(Spring.constant(50));												x22211ae.setX(Spring.constant(260));		
						        poa1e.setY(Spring.constant(258)); 												x22211ae.setY(Spring.constant(255));
						        pre.add(xjia2e);																pre.add(numeorech);

        						
        						g.setFont(fc);bta.setBackground(new Color(43, 146, 194));bta.add(g);
        						SpringLayout.Constraints bbtm1a=spir.getConstraints(bta);		
        				        bbtm1a.setX(Spring.constant(810));		
        				        bbtm1a.setY(Spring.constant(150));
        				        pre.add(bta);
        				        bta.addMouseListener(this);
        
	}

	public void mouseClicked(MouseEvent e) 
	{
		if(e.getSource()==bta)
		{
			if(nomrech.getText().length()<1 || numeorech.getText().length()<1 )
			{
				Warning hu=new Warning(9);
			}
			
			else if(nomrech.getText().length()>0 && numeorech.getText().length()>0 )
			{
			
				
				Connect con=new Connect();

				try {
					String province=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[0];
					String departement=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[1];
					String arrondissement=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[2];				
					String cec=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[3];
					String numeo=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[4];
					
					String nomEnfant=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[5];
					String dateEnfant=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[6];
					String lieuEnfant=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[7];
					String sexeEnfant=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[8];
					
					String nomPere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[9];
					String datePere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[10];
					String lieuPere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[11];
					String domicilePere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[12];
					String professionPere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[13];
					
	
                    String nomMere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[14];
                    String dateMere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[15];
                    String lieuMere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[16];
                    String domicileMere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[17];
                    String professionMere=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[18];
                    
                    
                    String  dressele=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[19];
                    String  declarerPar=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[20];
                    String  numdeclaration=con.reche(nomrech.getText().toLowerCase(), numeorech.getText().toLowerCase())[21];
					
                    Warning hu=new Warning(province, departement, arrondissement, cec, numeo, nomEnfant, dateEnfant, lieuEnfant, sexeEnfant, nomPere, datePere, lieuPere, domicilePere, professionPere, nomMere	,dateMere, lieuMere, domicileMere, professionMere, dressele, declarerPar, numdeclaration );
                    nomrech.setText("");numeorech.setText("");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
//			if(jo.length()<3) {String hjo="ACUNE CORRESPONDANCE N'A ETE TROUVER";req.setText(hjo); }
//			else if(jo.length()>3) {req.setText(jo); }
				
				 
				 
			}
		}
	}				

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource()==bta)
		{
			bta.setBackground(new Color(255,255,255));
			bta.setForeground(new Color(43, 146, 194));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		if(e.getSource()==bta)
		{
			bta.setBackground(new Color(43, 146, 194));
			bta.setForeground(new Color(0,0,0)); 
		}
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		 
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		 
	}

}
