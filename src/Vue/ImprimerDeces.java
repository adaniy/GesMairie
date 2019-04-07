package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class ImprimerDeces extends JPanel implements MouseListener
{
	
	
	JPanel pre=new JPanel();
	
	
	
	Champ numero=new Champ(8);
	JButton bta=new JButton();JLabel g=new JLabel("Rechercher");
	
	ImprimerDeces(JPanel p)
	{
		this.setBackground(new Color(255,255,255));
		this.setPreferredSize(new Dimension(1230, 650));
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		Font fcc=new Font("Time new Roman", Font.BOLD,20);
		
		SpringLayout spi=new SpringLayout();this.setLayout(spi);
		
		JPanel pr=new JPanel();
		pr.setPreferredSize(new Dimension(1230, 100));
		pr.setBackground(new Color(82, 35, 100));		
		SpringLayout.Constraints sckh=spi.getConstraints(pr);		
        sckh.setX(Spring.constant(0));		
        sckh.setY(Spring.constant(0));
		this.add(pr);
		        				SpringLayout spirb=new SpringLayout();pr.setLayout(spirb);
		        				Deco conf=new Deco("IMPRIMEZ UN ACTE DE DECES",4,4);   
		        				pr.add(conf);
		
		pre.setPreferredSize(new Dimension(1230, 650));
		pre.setBackground(new Color(255,255,255));		
		SpringLayout.Constraints sck=spi.getConstraints(pre);		
        sck.setX(Spring.constant(0));		
        sck.setY(Spring.constant(70));
		this.add(pre);
		SpringLayout spir=new SpringLayout();pre.setLayout(spir);	
										
										
										 
									        JLabel xjia2=new JLabel("Numero"); xjia2.setFont(fcc);   				 
									        SpringLayout.Constraints poa1=spir.getConstraints(xjia2); 					SpringLayout.Constraints x22211a=spir.getConstraints(numero);		
									        poa1.setX(Spring.constant(50));												x22211a.setX(Spring.constant(160));		
									        poa1.setY(Spring.constant(98)); 											x22211a.setY(Spring.constant(95));
									        pre.add(xjia2);																pre.add(numero);

			        				        g.setFont(fc);bta.setBackground(new Color(43, 146, 194));bta.add(g);
			        						SpringLayout.Constraints bbtm1a=spir.getConstraints(bta);		
			        				        bbtm1a.setX(Spring.constant(710));		
			        				        bbtm1a.setY(Spring.constant(90));
			        				        pre.add(bta);
			        				        bta.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
