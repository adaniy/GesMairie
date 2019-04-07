package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

public class Warning  implements MouseListener

{	int oldX,oldY;
JPanel p=new JPanel();
JFrame fen=new JFrame();
JLabel label5=new JLabel("Clicker pour Fermer");

JLabel lab5=new JLabel(" Fermer");

JLabel fer=new JLabel("Clicker pour Fermer");
	public Warning()
	{
		
		fen.setUndecorated(true);
		fen.setLocation(500,200);
		fen.setSize(600,400);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.addMouseListener(new MouseAdapter()
        {
            @Override public void mousePressed(MouseEvent e) 
            {	 
            	if(SwingUtilities.isLeftMouseButton(e))
                {
                    oldX = e.getX();
                    oldY = e.getY();
                }
            }
 
            public void mouseReleased(MouseEvent e) 
            {
                oldX = e.getX();
                oldY = e.getY();
            }           
        });
 
        p.addMouseMotionListener(new MouseMotionAdapter()
        {                     
            @Override public void mouseDragged(MouseEvent e) 
            {
                
                Point p = new Point(e.getLocationOnScreen());
                fen.setLocation(p.x-oldX,p.y-oldY);	
            }	
        });

		
		
		
		
		
		
		p.setBackground(new Color(82, 35, 100));
		
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,20);Font fc1=new Font("Time new Roman", Font.BOLD,18);
		Font fcc=new Font("Time new Roman", Font.BOLD,35);
		
		
		
		
		
		SpringLayout sp=new SpringLayout();p.setLayout(sp);
		
		JLabel label=new JLabel("UNE ERREUR C'EST PRODUITE !!");label.setFont(fcc);label.setForeground(Color.white);
		SpringLayout.Constraints b1=sp.getConstraints(label);		
		b1.setX(Spring.constant(10));		
		b1.setY(Spring.constant(50));
		p.add(label);
		
		
		JLabel label1=new JLabel("Verifier que vous avez respectez les conditions suivante:");label1.setFont(fc);label1.setForeground(Color.white);
		SpringLayout.Constraints b11=sp.getConstraints(label1);		
		b11.setX(Spring.constant(10));		
		b11.setY(Spring.constant(150));
		p.add(label1);
		
		
		JLabel label2=new JLabel("1-L'Identifiant entrer est bien celui d'un Administrateur");label2.setFont(fc1);label2.setForeground(Color.white);
		SpringLayout.Constraints b111=sp.getConstraints(label2);		
		b111.setX(Spring.constant(30));		
		b111.setY(Spring.constant(200));
		p.add(label2);
		
		
		JLabel label3=new JLabel("2-Le Mot de Passe entrer est Correct ");label3.setFont(fc1);label3.setForeground(Color.white);
		SpringLayout.Constraints b1111=sp.getConstraints(label3);		
		b1111.setX(Spring.constant(30));		
		b1111.setY(Spring.constant(230));
		p.add(label3);
		
		
		JLabel label4=new JLabel("3-Les Champs du Formulaire ne sont pas Vide");label4.setFont(fc1);label4.setForeground(Color.white);
		SpringLayout.Constraints b11111=sp.getConstraints(label4);		
		b11111.setX(Spring.constant(30));		
		b11111.setY(Spring.constant(260));
		p.add(label4);
		
		
		label5.setFont(fc1);label5.setForeground(Color.white);
		SpringLayout.Constraints b111111=sp.getConstraints(label5);		
		b111111.setX(Spring.constant(410));		
		b111111.setY(Spring.constant(360));
		p.add(label5); label5.addMouseListener(this);
		
		
		
		fen.getContentPane().add(p);
		
		fen.setVisible(true);
	}
	
	
	Warning(boolean b)
	{
		
		fen.setUndecorated(true);
		fen.setLocation(500,200);
		fen.setSize(600,400);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.addMouseListener(new MouseAdapter()
        {
            @Override public void mousePressed(MouseEvent e) 
            {	 
            	if(SwingUtilities.isLeftMouseButton(e))
                {
                    oldX = e.getX();
                    oldY = e.getY();
                }
            }
 
            public void mouseReleased(MouseEvent e) 
            {
                oldX = e.getX();
                oldY = e.getY();
            }           
        });
 
        p.addMouseMotionListener(new MouseMotionAdapter()
        {                     
            @Override public void mouseDragged(MouseEvent e) 
            {
                
                Point p = new Point(e.getLocationOnScreen());
                fen.setLocation(p.x-oldX,p.y-oldY);	
            }	
        });

		
		
		
		
		
		
		p.setBackground(new Color(82, 35, 100));
		
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,20);Font fc1=new Font("Time new Roman", Font.BOLD,18);
		Font fcc=new Font("Time new Roman", Font.BOLD,35);
		
		
		
		
		
		SpringLayout sp=new SpringLayout();p.setLayout(sp);
 
		
		
		JLabel label1=new JLabel("Verifier que vous avez respectez les conditions suivante:");label1.setFont(fc);label1.setForeground(Color.white);
		SpringLayout.Constraints b11=sp.getConstraints(label1);		
		b11.setX(Spring.constant(10));		
		b11.setY(Spring.constant(150));
		p.add(label1);
		
 
		
		
		lab5.setFont(fc1);lab5.setForeground(Color.white);
		SpringLayout.Constraints b111111=sp.getConstraints(lab5);		
		b111111.setX(Spring.constant(410));		
		b111111.setY(Spring.constant(360));
		p.add(lab5); lab5.addMouseListener(this);
		
		
		
		fen.getContentPane().add(p);
		
		fen.setVisible(true);
	}
	
	
	
	
	JLabel la=new JLabel("OK");
	JFrame fe=new JFrame();
	
	
	
	Warning(boolean b,int y)
	{
		
		fe.setUndecorated(true);
		fe.setLocation(400,300);
		fe.setSize(400,200);
		fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.addMouseListener(new MouseAdapter()
        {
            @Override public void mousePressed(MouseEvent e) 
            {	 
            	if(SwingUtilities.isLeftMouseButton(e))
                {
                    oldX = e.getX();
                    oldY = e.getY();
                }
            }
 
            public void mouseReleased(MouseEvent e) 
            {
                oldX = e.getX();
                oldY = e.getY();
            }           
        });
 
        p.addMouseMotionListener(new MouseMotionAdapter()
        {                     
            @Override public void mouseDragged(MouseEvent e) 
            {
                
                Point p = new Point(e.getLocationOnScreen());
                fe.setLocation(p.x-oldX,p.y-oldY);	
            }	
        });

		
		
		
		
		
		
		p.setBackground(new Color(82, 35, 100));
		
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,20);Font fc1=new Font("Time new Roman", Font.BOLD,18);
		Font fcc=new Font("Time new Roman", Font.BOLD,35);
		
		
		
		
		
		SpringLayout sp=new SpringLayout();p.setLayout(sp);
 
		
		
		JLabel label1=new JLabel("Acte Enregistrer Avec SUCCESS !!");label1.setFont(fc);label1.setForeground(Color.white);
		SpringLayout.Constraints b11=sp.getConstraints(label1);		
		b11.setX(Spring.constant(10));		
		b11.setY(Spring.constant(50));
		p.add(label1);
		
 
		
		
		la.setFont(fc1);la.setForeground(Color.white);
		SpringLayout.Constraints b111111=sp.getConstraints(la);		
		b111111.setX(Spring.constant(100));		
		b111111.setY(Spring.constant(80));
		p.add(la); la.addMouseListener(this);
		
		
		
		fe.getContentPane().add(p);
		
		fe.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public Warning(boolean b,int y,String h)
	{
		
		fe.setUndecorated(true);
		fe.setLocation(500,300);
		fe.setSize(700,300);
		fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.addMouseListener(new MouseAdapter()
        {
            @Override public void mousePressed(MouseEvent e) 
            {	 
            	if(SwingUtilities.isLeftMouseButton(e))
                {
                    oldX = e.getX();
                    oldY = e.getY();
                }
            }
 
            public void mouseReleased(MouseEvent e) 
            {
                oldX = e.getX();
                oldY = e.getY();
            }           
        });
 
        p.addMouseMotionListener(new MouseMotionAdapter()
        {                     
            @Override public void mouseDragged(MouseEvent e) 
            {
                
                Point p = new Point(e.getLocationOnScreen());
                fe.setLocation(p.x-oldX,p.y-oldY);	
            }	
        });

		
		
		
		
		
		
		p.setBackground(new Color(82, 35, 100));
		
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,20);Font fc1=new Font("Time new Roman", Font.BOLD,18);
		Font fcc=new Font("Time new Roman", Font.BOLD,35);
		
		
		
		
		
		SpringLayout sp=new SpringLayout();p.setLayout(sp);
 
		
		
		JLabel label1=new JLabel("Ges-Mairie est une Application concu pour etre au service des Mairies afin ");label1.setFont(fc);label1.setForeground(Color.white);
		SpringLayout.Constraints b11=sp.getConstraints(label1);		
		b11.setX(Spring.constant(10));		
		b11.setY(Spring.constant(50));
		p.add(label1);
		
		
		JLabel label11=new JLabel("de faciliter,l'etablissement et d'un Acte ");label11.setFont(fc);label11.setForeground(Color.white);
		SpringLayout.Constraints b111=sp.getConstraints(label11);		
		b111.setX(Spring.constant(10));		
		b111.setY(Spring.constant(100));
		p.add(label11);
		
		JLabel label111=new JLabel(" De Consulter et d'imprimer les Actes prealablement Enregistrer !!");label111.setFont(fc);label111.setForeground(Color.white);
		SpringLayout.Constraints b1111=sp.getConstraints(label111);		
		b1111.setX(Spring.constant(10));		
		b1111.setY(Spring.constant(150));
		p.add(label111);
		
 
		
		
		la.setFont(fc1);la.setForeground(Color.white);
		SpringLayout.Constraints b111111=sp.getConstraints(la);		
		b111111.setX(Spring.constant(200));		
		b111111.setY(Spring.constant(200));
		p.add(la); la.addMouseListener(this);
		
		
		
		fe.getContentPane().add(p);
		
		fe.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private JScrollPane scroll = new JScrollPane(p);

	static JPanel pan=new JPanel();
	
	JPanel print=new JPanel();JLabel clo=new JLabel("Fermer");
	JLabel prin=new JLabel("IMPRIMEZ");
	
	JPanel close=new JPanel();
	
	

	
	
	public static String nomx;
	
	
	Warning(String province, String departement,String arrondissement,String cec,String numeo,String nomEnfant,String dateEnfant,String lieuEnfant,String sexeEnfant,String nomPere,String datePere,String lieuPere,String domicilePere,String professionPere,String nomMere,String dateMere,String lieuMere,String domicileMere,String professionMere,String dressele,String declarerPar,String numdeclaration )
	{

		print.setBackground(Color.WHITE);
		print.add(prin);
		print.addMouseListener(this);
		
		close.setBackground(Color.WHITE);
		close.add(clo);
		close.addMouseListener(this);
//		           	   
		
		JLabel label111=new JLabel(province);
		JLabel label1111111=new JLabel(departement);
		JLabel label11111111111=new JLabel(arrondissement);
		JLabel label11111111111111111=new JLabel(cec);
		JLabel lab =new JLabel(numeo);
		JLabel jkn=new JLabel(nomEnfant);
		JLabel jkn1=new JLabel(dateEnfant );
		JLabel jkn11=new JLabel(lieuEnfant);
		JLabel jkn111=new JLabel(nomEnfant);
		JLabel jkn1111=new JLabel(sexeEnfant);
		JLabel jkn11111=new JLabel(nomPere);
		JLabel jkn111111=new JLabel(datePere+"  ,  "+lieuPere);
		JLabel jkn1111111=new JLabel(domicilePere);
		JLabel jkn11111111=new JLabel(professionPere);
		JLabel jkn111111111=new JLabel(nomMere);
		JLabel jkn1111111111=new JLabel(lieuMere);
		JLabel jkn11111111111=new JLabel(dateMere );
		JLabel jkn111111111111=new JLabel(domicileMere);
		JLabel jkn1111111111111=new JLabel(professionMere);
		JLabel jkn11111111111111=new JLabel(dressele );
		JLabel jkn111111111111111=new JLabel(declarerPar);
		JLabel jkn11111111111111s=new JLabel(cec);
		JLabel jkn11111111111111s1=new JLabel(numdeclaration);
		
		
		Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
		int l = tailleMoniteur.width ;//* 2/3;
		int h = tailleMoniteur.height ;//* 2/3;
		fen.setUndecorated(true); 
		fen.setLocation(200,1);
		fen.setSize(1200,800);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.addMouseListener(new MouseAdapter()
        {
            @Override public void mousePressed(MouseEvent e) 
            {	 
            	if(SwingUtilities.isLeftMouseButton(e))
                {
                    oldX = e.getX();
                    oldY = e.getY();
                }
            }
 
            public void mouseReleased(MouseEvent e) 
            {
                oldX = e.getX();
                oldY = e.getY();
            }           
        });
 
        p.addMouseMotionListener(new MouseMotionAdapter()
        {                     
            @Override public void mouseDragged(MouseEvent e) 
            {
                
                Point p = new Point(e.getLocationOnScreen());
                fen.setLocation(p.x-oldX,p.y-oldY);	
            }	
        });

		
		
		
		
		
		
		p.setBackground(new Color(82, 35, 100));	
		pan.setBackground(Color.white);
		pan.setPreferredSize(new Dimension(950,2500));
		
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.BOLD ,20);Font fc1=new Font("Time new Roman", Font.BOLD,18);
		Font fcc=new Font("Time new Roman", Font.BOLD,35);   //HANGING_BASELINE
		Font fw=new Font("Time new Roman", Font.ROMAN_BASELINE ,18);
		Font fw1=new Font("Time new Roman", Font.HANGING_BASELINE ,26);
		Font fc0=new Font("Time new Roman", Font.BOLD ,30);
		Font fw0=new Font("Time new Roman", Font.ROMAN_BASELINE ,30);
		
		
		
		
		
		SpringLayout sp=new SpringLayout();pan.setLayout(sp);
		
		
		JLabel w2=new JLabel("REPUBLIQUE  DU  CAMEROUN");w2.setFont(fc);w2.setForeground(Color.black);		 
		SpringLayout.Constraints bw=sp.getConstraints(w2);		 							 		
		bw.setX(Spring.constant(606));														 		
		bw.setY(Spring.constant(30)); 													 
		pan.add(w2);	
		
		JLabel w21=new JLabel("Paix - Travail - Patrie");w21.setFont(fc);w21.setForeground(Color.black);		 
		SpringLayout.Constraints bw1=sp.getConstraints(w21);		 							 		
		bw1.setX(Spring.constant(656));														 		
		bw1.setY(Spring.constant(60)); 													 
		pan.add(w21);	
		
		
		JLabel w211=new JLabel("REPUBLIC  OF  CAMEROON");w211.setFont(fc);w211.setForeground(Color.black);		 
		SpringLayout.Constraints bw11=sp.getConstraints(w211);		 							 		
		bw11.setX(Spring.constant(616));														 		
		bw11.setY(Spring.constant(100)); 													 
		pan.add(w211);	
		
		
		JLabel w2111=new JLabel("Peace - Work - Fatherland");w2111.setFont(fc);w2111.setForeground(Color.black);		 
		SpringLayout.Constraints bw111=sp.getConstraints(w2111);		 							 		
		bw111.setX(Spring.constant(626));														 		
		bw111.setY(Spring.constant(130)); 													 
		pan.add(w2111);	
		
		JLabel w21111=new JLabel("__________");w21111.setFont(fc);w21111.setForeground(Color.black);		 
		SpringLayout.Constraints bw1111=sp.getConstraints(w21111);		 							 		
		bw1111.setX(Spring.constant(686));														 		
		bw1111.setY(Spring.constant(140)); 													 
		pan.add(w21111);	
		
		
		JLabel label=new JLabel("REGION");label.setFont(fc);label.setForeground(Color.black);		 
		SpringLayout.Constraints b1=sp.getConstraints(label);		 							 		
		b1.setX(Spring.constant(130));														 		
		b1.setY(Spring.constant(30)); 													 
		pan.add(label);		
		
		JLabel label1=new JLabel("REGION");label1.setFont(fw);label1.setForeground(Color.black);		 
		SpringLayout.Constraints b11=sp.getConstraints(label1);		 							 		
		b11.setX(Spring.constant(134));														 		
		b11.setY(Spring.constant(55)); 													 
		pan.add(label1);	
		
		JLabel label11=new JLabel("________________________");label11.setFont(fc);label11.setForeground(Color.black);		 
		SpringLayout.Constraints b111=sp.getConstraints(label11);		 							 		
		b111.setX(Spring.constant(54));														 		
		b111.setY(Spring.constant(90)); 													 
		pan.add(label11);
		
		
		label111.setFont(fw1);label111.setForeground(Color.blue);		 
		SpringLayout.Constraints b1111=sp.getConstraints(label111);		 							 		
		b1111.setX(Spring.constant(110));														 		
		b1111.setY(Spring.constant(80)); 													 
		pan.add(label111);
		
		
		JLabel label111z=new JLabel("__________");label111z.setFont(fc);label111z.setForeground(Color.black);		 
		SpringLayout.Constraints b1111z=sp.getConstraints(label111z);		 							 		
		b1111z.setX(Spring.constant(120));														 		
		b1111z.setY(Spring.constant(110)); 													 
		pan.add(label111z);
		
		
		JLabel label1111=new JLabel("DEPARTEMENT");label1111.setFont(fc);label1111.setForeground(Color.black);		 
		SpringLayout.Constraints b11111=sp.getConstraints(label1111);		 							 		
		b11111.setX(Spring.constant(100));														 		
		b11111.setY(Spring.constant(140)); 													 
		pan.add(label1111);
		
		
		JLabel label11111=new JLabel("DIVISION");label11111.setFont(fw);label11111.setForeground(Color.black);		 
		SpringLayout.Constraints b111111=sp.getConstraints(label11111);		 							 		
		b111111.setX(Spring.constant(140));														 		
		b111111.setY(Spring.constant(165)); 													 
		pan.add(label11111);
		
		
		JLabel label111111=new JLabel("________________________");label111111.setFont(fc);label111111.setForeground(Color.black);		 
		SpringLayout.Constraints b1111111=sp.getConstraints(label111111);		 							 		
		b1111111.setX(Spring.constant(54));														 		
		b1111111.setY(Spring.constant(200)); 													 
		pan.add(label111111);
		
		
		label1111111.setFont(fw1);label1111111.setForeground(Color.blue);		 
		SpringLayout.Constraints b11111111=sp.getConstraints(label1111111);		 							 		
		b11111111.setX(Spring.constant(110));														 		
		b11111111.setY(Spring.constant(190)); 													 
		pan.add(label1111111);
		
		JLabel label11111111=new JLabel("__________");label11111111.setFont(fc);label11111111.setForeground(Color.black);		 
		SpringLayout.Constraints b111111111=sp.getConstraints(label11111111);		 							 		
		b111111111.setX(Spring.constant(120));														 		
		b111111111.setY(Spring.constant(220)); 													 
		pan.add(label11111111);
		
		JLabel label111111111=new JLabel("ARRONDISSEMENT");label111111111.setFont(fc);label111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b1111111111=sp.getConstraints(label111111111);		 							 		
		b1111111111.setX(Spring.constant(90));														 		
		b1111111111.setY(Spring.constant(250)); 													 
		pan.add(label111111111);		
		
		JLabel label1111111111=new JLabel("SUBDIVISION");label1111111111.setFont(fw);label1111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b11111111111=sp.getConstraints(label1111111111);		 							 		
		b11111111111.setX(Spring.constant(130));														 		
		b11111111111.setY(Spring.constant(275)); 													 
		pan.add(label1111111111);
		
		
		JLabel label111111z=new JLabel("________________________");label111111z.setFont(fc);label111111z.setForeground(Color.black);		 
		SpringLayout.Constraints b1111111z=sp.getConstraints(label111111z);		 							 		
		b1111111z.setX(Spring.constant(54));														 		
		b1111111z.setY(Spring.constant(310)); 													 
		pan.add(label111111z);
		
		
		label11111111111.setFont(fw1);label11111111111.setForeground(Color.blue);		 
		SpringLayout.Constraints b111111111111=sp.getConstraints(label11111111111);		 							 		
		b111111111111.setX(Spring.constant(130));														 		
		b111111111111.setY(Spring.constant(300)); 													 
		pan.add(label11111111111);
		
		JLabel label111111111111=new JLabel("__________");label111111111111.setFont(fc);label111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b1111111111111=sp.getConstraints(label111111111111);		 							 		
		b1111111111111.setX(Spring.constant(120));														 		
		b1111111111111.setY(Spring.constant(325)); 													 
		pan.add(label111111111111);
		
		
		JLabel label1111111111111=new JLabel("CENTRE D'ETAT CIVIL");label1111111111111.setFont(fc0);label1111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b11111111111111=sp.getConstraints(label1111111111111);		 							 		
		b11111111111111.setX(Spring.constant(320));														 		
		b11111111111111.setY(Spring.constant(385)); 													 
		pan.add(label1111111111111);
		
		
		JLabel label11111111111111=new JLabel("CIVIL STATUS REGISTRATION CENTRE");label11111111111111.setFont(fw0);label11111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b111111111111111=sp.getConstraints(label11111111111111);		 							 		
		b111111111111111.setX(Spring.constant(210));														 		
		b111111111111111.setY(Spring.constant(425)); 													 
		pan.add(label11111111111111);
		
		JLabel label111111111111111=new JLabel("De - Of");label111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));label111111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b1111111111111111=sp.getConstraints(label111111111111111);		 							 		
		b1111111111111111.setX(Spring.constant(90));														 		
		b1111111111111111.setY(Spring.constant(500)); 													 
		pan.add(label111111111111111);
		
		
		JLabel label1111111111111111=new JLabel("______________________________________________");label1111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));label1111111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b11111111111111111=sp.getConstraints(label1111111111111111);		 							 		
		b11111111111111111.setX(Spring.constant(190));														 		
		b11111111111111111.setY(Spring.constant(500)); 													 
		pan.add(label1111111111111111);
		
		
		label11111111111111111.setFont(fw1);label11111111111111111.setForeground(Color.blue);		 
		SpringLayout.Constraints b111111111111111111=sp.getConstraints(label11111111111111111);		 							 		
		b111111111111111111.setX(Spring.constant(390));														 		
		b111111111111111111.setY(Spring.constant(490)); 													 
		pan.add(label11111111111111111);
		
		JLabel label111111111111111111=new JLabel("ACTE DE NAISSANCE");label111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 35));label111111111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b1111111111111111111=sp.getConstraints(label111111111111111111);		 							 		
		b1111111111111111111.setX(Spring.constant(120));														 		
		b1111111111111111111.setY(Spring.constant(560)); 													 
		pan.add(label111111111111111111);
		
		JLabel label1111111111111111111=new JLabel("BIRTH CERTIFICATE");label1111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 35));label1111111111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b11111111111111111111=sp.getConstraints(label1111111111111111111);		 							 		
		b11111111111111111111.setX(Spring.constant(120));														 		
		b11111111111111111111.setY(Spring.constant(600)); 													 
		pan.add(label1111111111111111111);
		
		JLabel label11111111111111111111=new JLabel("N");label11111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));label11111111111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b111111111111111111111=sp.getConstraints(label11111111111111111111);		 							 		
		b111111111111111111111.setX(Spring.constant(660));														 		
		b111111111111111111111.setY(Spring.constant(590)); 													 
		pan.add(label11111111111111111111);
		
		
		JLabel label111111111111111111111=new JLabel("______________");label111111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));label111111111111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b1111111111111111111111=sp.getConstraints(label111111111111111111111);		 							 		
		b1111111111111111111111.setX(Spring.constant(684));														 		
		b1111111111111111111111.setY(Spring.constant(590)); 													 
		pan.add(label111111111111111111111);
		
		
		lab.setFont(fw1);lab.setForeground(Color.blue);		 
		SpringLayout.Constraints bbn=sp.getConstraints(lab);		 							 		
		bbn.setX(Spring.constant(710));														 		
		bbn.setY(Spring.constant(586)); 													 
		pan.add(lab);
		
		
		JLabel label1111111111111111111111=new JLabel("__________________");label1111111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));label1111111111111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints b11111111111111111111111=sp.getConstraints(label1111111111111111111111);		 							 		
		b11111111111111111111111.setX(Spring.constant(324));														 		
		b11111111111111111111111.setY(Spring.constant(650)); 													 
		pan.add(label1111111111111111111111);
		
		
		JLabel jko=new JLabel("Nom de l'enfant ");jko.setFont(new Font("Times New Roman", Font.BOLD, 25));jko.setForeground(Color.black);		 
		SpringLayout.Constraints jkom=sp.getConstraints(jko);		 							 		
		jkom.setX(Spring.constant(90));														 		
		jkom.setY(Spring.constant(750)); 													 
		pan.add(jko);
		
		JLabel ssbn=new JLabel("............................................................................................................");ssbn.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn.setForeground(Color.black);		 
		SpringLayout.Constraints sbn=sp.getConstraints(ssbn);		 							 		
		sbn.setX(Spring.constant(280));														 		
		sbn.setY(Spring.constant(756)); 													 
		pan.add(ssbn);
		
		JLabel jkp=new JLabel("Name of the child");jkp.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp=sp.getConstraints(jkp);		 							 		
		jkomp.setX(Spring.constant(90));														 		
		jkomp.setY(Spring.constant(775)); 													 
		pan.add(jkp);
		
		
		jkn.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon=sp.getConstraints(jkn);		 							 		
		jkon.setX(Spring.constant(300));														 		
		jkon.setY(Spring.constant(745)); 													 
		pan.add(jkn);
		
		
		
		
		
		JLabel jko1=new JLabel("Le -  ");jko1.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1.setForeground(Color.black);		 
		SpringLayout.Constraints jkom1=sp.getConstraints(jko1);		 							 		
		jkom1.setX(Spring.constant(90));														 		
		jkom1.setY(Spring.constant(800)); 													 
		pan.add(jko1);
		
		JLabel ssbn1=new JLabel("............................................................................................................");ssbn1.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn1.setForeground(Color.black);		 
		SpringLayout.Constraints sbn1=sp.getConstraints(ssbn1);		 							 		
		sbn1.setX(Spring.constant(280));														 		
		sbn1.setY(Spring.constant(806)); 													 
		pan.add(ssbn1);
		
		JLabel jkp1=new JLabel(" On the");jkp1.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp1.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp1=sp.getConstraints(jkp1);		 							 		
		jkomp1.setX(Spring.constant(130));														 		
		jkomp1.setY(Spring.constant(800)); 													 
		pan.add(jkp1);
		
		
		jkn1.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn1.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon1=sp.getConstraints(jkn1);		 							 		
		jkon1.setX(Spring.constant(300));														 		
		jkon1.setY(Spring.constant(795)); 													 
		pan.add(jkn1);
		
		
		
		
		JLabel jko11=new JLabel("Est ne a ");jko11.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11.setForeground(Color.black);		 
		SpringLayout.Constraints jkom11=sp.getConstraints(jko11);		 							 		
		jkom11.setX(Spring.constant(90));														 		
		jkom11.setY(Spring.constant(850)); 													 
		pan.add(jko11);
		
		JLabel ssbn11=new JLabel("............................................................................................................");ssbn11.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn11.setForeground(Color.black);		 
		SpringLayout.Constraints sbn11=sp.getConstraints(ssbn11);		 							 		
		sbn11.setX(Spring.constant(280));														 		
		sbn11.setY(Spring.constant(856)); 													 
		pan.add(ssbn11);
		
		JLabel jkp11=new JLabel(" Was Born At");jkp11.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp11=sp.getConstraints(jkp11);		 							 		
		jkomp11.setX(Spring.constant(90));														 		
		jkomp11.setY(Spring.constant(875)); 													 
		pan.add(jkp11);
		
		
		jkn11.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon11=sp.getConstraints(jkn11);		 							 		
		jkon11.setX(Spring.constant(300));														 		
		jkon11.setY(Spring.constant(845)); 													 
		pan.add(jkn11);
		
		
		
		
		JLabel jko111=new JLabel("Nom de l'enfant  ");jko111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom111=sp.getConstraints(jko111);		 							 		
		jkom111.setX(Spring.constant(90));														 		
		jkom111.setY(Spring.constant(900)); 													 
		pan.add(jko111);
		
		JLabel ssbn111=new JLabel("............................................................................................................");ssbn111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn111=sp.getConstraints(ssbn111);		 							 		
		sbn111.setX(Spring.constant(280));														 		
		sbn111.setY(Spring.constant(906)); 													 
		pan.add(ssbn111);
		
		JLabel jkp111=new JLabel(" Name of the Child");jkp111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp111=sp.getConstraints(jkp111);		 							 		
		jkomp111.setX(Spring.constant(90));														 		
		jkomp111.setY(Spring.constant(925)); 													 
		pan.add(jkp111);
		
		
		jkn111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon111=sp.getConstraints(jkn111);		 							 		
		jkon111.setX(Spring.constant(300));														 		
		jkon111.setY(Spring.constant(895)); 													 
		pan.add(jkn111);
		
		
		
		
		
		JLabel jko1111=new JLabel("De sexe - ");jko1111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom1111=sp.getConstraints(jko1111);		 							 		
		jkom1111.setX(Spring.constant(90));														 		
		jkom1111.setY(Spring.constant(950)); 													 
		pan.add(jko1111);

		JLabel ssbn1111=new JLabel("............................................................................................................");ssbn1111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn1111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn1111=sp.getConstraints(ssbn1111);		 							 		
		sbn1111.setX(Spring.constant(280));														 		
		sbn1111.setY(Spring.constant(956)); 													 
		pan.add(ssbn1111);
		
		JLabel jkp1111=new JLabel(" sex");jkp1111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp1111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp1111=sp.getConstraints(jkp1111);		 							 		
		jkomp1111.setX(Spring.constant(190));														 		
		jkomp1111.setY(Spring.constant(950)); 													 
		pan.add(jkp1111);
		
		
		jkn1111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn1111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon1111=sp.getConstraints(jkn1111);		 							 		
		jkon1111.setX(Spring.constant(300));														 		
		jkon1111.setY(Spring.constant(945)); 													 
		pan.add(jkn1111);
		
		
		
		JLabel jko11111=new JLabel("De  -  ");jko11111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom11111=sp.getConstraints(jko11111);		 							 		
		jkom11111.setX(Spring.constant(90));														 		
		jkom11111.setY(Spring.constant(1000)); 													 
		pan.add(jko11111);
		
		JLabel ssbn11111=new JLabel("............................................................................................................");ssbn11111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn11111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn11111=sp.getConstraints(ssbn11111);		 							 		
		sbn11111.setX(Spring.constant(280));														 		
		sbn11111.setY(Spring.constant(1006)); 													 
		pan.add(ssbn11111);
		
		JLabel jkp11111=new JLabel(" Of");jkp11111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp11111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp11111=sp.getConstraints(jkp11111);		 							 		
		jkomp11111.setX(Spring.constant(150));														 		
		jkomp11111.setY(Spring.constant(1000)); 													 
		pan.add(jkp11111);
		
		
		jkn11111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon11111=sp.getConstraints(jkn11111);		 							 		
		jkon11111.setX(Spring.constant(300));														 		
		jkon11111.setY(Spring.constant(995)); 													 
		pan.add(jkn11111);
		
		
		
		
		
		JLabel jko111111=new JLabel("Ne a  - ");jko111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom111111=sp.getConstraints(jko111111);		 							 		
		jkom111111.setX(Spring.constant(90));														 		
		jkom111111.setY(Spring.constant(1050)); 													 
		pan.add(jko111111);
		
		
		JLabel ssbn111111=new JLabel("............................................................................................................");ssbn111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn111111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn111111=sp.getConstraints(ssbn111111);		 							 		
		sbn111111.setX(Spring.constant(280));														 		
		sbn111111.setY(Spring.constant(1056)); 													 
		pan.add(ssbn111111);
		
		JLabel jkp111111=new JLabel(" Born at");jkp111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp111111=sp.getConstraints(jkp111111);		 							 		
		jkomp111111.setX(Spring.constant(150));														 		
		jkomp111111.setY(Spring.constant(1050)); 													 
		pan.add(jkp111111);
		
		
		jkn111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon111111=sp.getConstraints(jkn111111);		 							 		
		jkon111111.setX(Spring.constant(300));														 		
		jkon111111.setY(Spring.constant(1045)); 													 
		pan.add(jkn111111);
		
		
		
		
		
		JLabel jko1111111=new JLabel("Domicilie a  ");jko1111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom1111111=sp.getConstraints(jko1111111);		 							 		
		jkom1111111.setX(Spring.constant(90));														 		
		jkom1111111.setY(Spring.constant(1100)); 													 
		pan.add(jko1111111);
		
		JLabel ssbn1111111=new JLabel("............................................................................................................");ssbn1111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn1111111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn1111111=sp.getConstraints(ssbn1111111);		 							 		
		sbn1111111.setX(Spring.constant(280));														 		
		sbn1111111.setY(Spring.constant(1106)); 													 
		pan.add(ssbn1111111);
		
		JLabel jkp1111111=new JLabel(" Resident at");jkp1111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp1111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp1111111=sp.getConstraints(jkp1111111);		 							 		
		jkomp1111111.setX(Spring.constant(90));														 		
		jkomp1111111.setY(Spring.constant(1125)); 													 
		pan.add(jkp1111111);
		
		
		jkn1111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn1111111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon1111111=sp.getConstraints(jkn1111111);		 							 		
		jkon1111111.setX(Spring.constant(300));														 		
		jkon1111111.setY(Spring.constant(1095)); 													 
		pan.add(jkn1111111);
		
		
		
		
		JLabel jko11111111=new JLabel("Profession -  ");jko11111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom11111111=sp.getConstraints(jko11111111);		 							
		jkom11111111.setX(Spring.constant(90));														 		
		jkom11111111.setY(Spring.constant(1150)); 													 
		pan.add(jko11111111);
		
		
		JLabel ssbn11111111=new JLabel("............................................................................................");ssbn11111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn11111111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn11111111=sp.getConstraints(ssbn11111111);		 							 		
		sbn11111111.setX(Spring.constant(360));														 		
		sbn11111111.setY(Spring.constant(1156)); 													 
		pan.add(ssbn11111111);
		
		JLabel jkp11111111=new JLabel(" Occupation");jkp11111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp11111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp11111111=sp.getConstraints(jkp11111111);		 							 		
		jkomp11111111.setX(Spring.constant(230));														 		
		jkomp11111111.setY(Spring.constant(1150)); 													 
		pan.add(jkp11111111);
		
		
		jkn11111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon11111111=sp.getConstraints(jkn11111111);		 							 		
		jkon11111111.setX(Spring.constant(365));														 		
		jkon11111111.setY(Spring.constant(1145)); 													 
		pan.add(jkn11111111);
		
		
		
		
		
		JLabel jko111111111=new JLabel("Et de -");jko111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom111111111=sp.getConstraints(jko111111111);		 							
		jkom111111111.setX(Spring.constant(90));														 		
		jkom111111111.setY(Spring.constant(1200)); 													 
		pan.add(jko111111111);
		
		JLabel ssbn111111111=new JLabel("............................................................................................................");ssbn111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn111111111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn111111111=sp.getConstraints(ssbn111111111);		 							 		
		sbn111111111.setX(Spring.constant(280));														 		
		sbn111111111.setY(Spring.constant(1206)); 													 
		pan.add(ssbn111111111);
		
		JLabel jkp111111111=new JLabel(" And of ");jkp111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp111111111=sp.getConstraints(jkp111111111);		 							 		
		jkomp111111111.setX(Spring.constant(180));														 		
		jkomp111111111.setY(Spring.constant(1200)); 													 
		pan.add(jkp111111111);
		
		
		jkn111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111111111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon111111111=sp.getConstraints(jkn111111111);		 							 		
		jkon111111111.setX(Spring.constant(300));														 		
		jkon111111111.setY(Spring.constant(1195)); 													 
		pan.add(jkn111111111);
		
		
		
		JLabel jko1111111111=new JLabel("Ne a  - ");jko1111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom1111111111=sp.getConstraints(jko1111111111);		 							
		jkom1111111111.setX(Spring.constant(90));														 		
		jkom1111111111.setY(Spring.constant(1250)); 													 
		pan.add(jko1111111111);
		
		
		JLabel ssbn1111111111=new JLabel("............................................................................................................");ssbn1111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn1111111111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn1111111111=sp.getConstraints(ssbn1111111111);		 							 		
		sbn1111111111.setX(Spring.constant(280));														 		
		sbn1111111111.setY(Spring.constant(1256)); 													 
		pan.add(ssbn1111111111);
		
		JLabel jkp1111111111=new JLabel(" Born at ");jkp1111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp1111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp1111111111=sp.getConstraints(jkp1111111111);		 							 		
		jkomp1111111111.setX(Spring.constant(180));														 		
		jkomp1111111111.setY(Spring.constant(1250)); 													 
		pan.add(jkp1111111111);
		
		
		jkn1111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn1111111111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon1111111111=sp.getConstraints(jkn1111111111);		 							 		
		jkon1111111111.setX(Spring.constant(322));														 		
		jkon1111111111.setY(Spring.constant(1245)); 													 
		pan.add(jkn1111111111);
		
		
		
		
		JLabel jko11111111111=new JLabel("Le    - ");jko11111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom11111111111=sp.getConstraints(jko11111111111);		 							
		jkom11111111111.setX(Spring.constant(90));														 		
		jkom11111111111.setY(Spring.constant(1300)); 													 
		pan.add(jko11111111111);
		
		
		JLabel ssbn11111111111=new JLabel("............................................................................................................");ssbn11111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn11111111111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn11111111111=sp.getConstraints(ssbn11111111111);		 							 		
		sbn11111111111.setX(Spring.constant(280));														 		
		sbn11111111111.setY(Spring.constant(1306)); 													 
		pan.add(ssbn11111111111);
		
		JLabel jkp11111111111=new JLabel(" On  the");jkp11111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp11111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp11111111111=sp.getConstraints(jkp11111111111);		 							 		
		jkomp11111111111.setX(Spring.constant(180));														 		
		jkomp11111111111.setY(Spring.constant(1300)); 													 
		pan.add(jkp11111111111);
		
		
		jkn11111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111111111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon11111111111=sp.getConstraints(jkn11111111111);		 							 		
		jkon11111111111.setX(Spring.constant(300));														 		
		jkon11111111111.setY(Spring.constant(1295)); 													 
		pan.add(jkn11111111111);
		
		
		
		
		
		
		
		JLabel jko111111111111=new JLabel("Domicilie a  ");jko111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom111111111111=sp.getConstraints(jko111111111111);		 							
		jkom111111111111.setX(Spring.constant(90));														 		
		jkom111111111111.setY(Spring.constant(1350)); 													 
		pan.add(jko111111111111);
		
		
		JLabel ssbn111111111111=new JLabel("............................................................................................................");ssbn111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn111111111111=sp.getConstraints(ssbn111111111111);		 							 		
		sbn111111111111.setX(Spring.constant(280));														 		
		sbn111111111111.setY(Spring.constant(1356)); 													 
		pan.add(ssbn111111111111);
		
		
		JLabel jkp111111111111=new JLabel(" Resident at");jkp111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp111111111111=sp.getConstraints(jkp111111111111);		 							 		
		jkomp111111111111.setX(Spring.constant(90));														 		
		jkomp111111111111.setY(Spring.constant(1375)); 													 
		pan.add(jkp111111111111);
		
		
		jkn111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111111111111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon111111111111=sp.getConstraints(jkn111111111111);		 							 		
		jkon111111111111.setX(Spring.constant(300));														 		
		jkon111111111111.setY(Spring.constant(1345)); 													 
		pan.add(jkn111111111111);
		
		
		
		JLabel jko1111111111111=new JLabel("Profession - ");jko1111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkom1111111111111=sp.getConstraints(jko1111111111111);		 							
		jkom1111111111111.setX(Spring.constant(90));														 		
		jkom1111111111111.setY(Spring.constant(1400)); 													 
		pan.add(jko1111111111111);
		
		
		JLabel ssbn1111111111111=new JLabel("...............................................................................................");ssbn1111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ssbn1111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints sbn1111111111111=sp.getConstraints(ssbn1111111111111);		 							 		
		sbn1111111111111.setX(Spring.constant(340));														 		
		sbn1111111111111.setY(Spring.constant(1406)); 													 
		pan.add(ssbn1111111111111);
		
		JLabel jkp1111111111111=new JLabel(" Occupation");jkp1111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp1111111111111.setForeground(Color.black);		 
		SpringLayout.Constraints jkomp1111111111111=sp.getConstraints(jkp1111111111111);		 							 		
		jkomp1111111111111.setX(Spring.constant(215));														 		
		jkomp1111111111111.setY(Spring.constant(1400)); 													 
		pan.add(jkp1111111111111);
		
		
		jkn1111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn1111111111111.setForeground(Color.blue);		 
		SpringLayout.Constraints jkon1111111111111=sp.getConstraints(jkn1111111111111);		 							 		
		jkon1111111111111.setX(Spring.constant(372));														 		
		jkon1111111111111.setY(Spring.constant(1395)); 													 
		pan.add(jkn1111111111111);
		
		
		

JLabel jko11111111111111=new JLabel("Dresse le  ");jko11111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111=sp.getConstraints(jko11111111111111);		 							
jkom11111111111111.setX(Spring.constant(90));														 		
jkom11111111111111.setY(Spring.constant(1450)); 													 
pan.add(jko11111111111111);

JLabel ss1111111111111=new JLabel("......................................................................................................");ss1111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss1111111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss1111111111111=sp.getConstraints(ss1111111111111);		 							 		
sss1111111111111.setX(Spring.constant(300));														 		
sss1111111111111.setY(Spring.constant(1456)); 													 
pan.add(ss1111111111111);

JLabel jkp11111111111111=new JLabel("Drawn up on the");jkp11111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111=sp.getConstraints(jkp11111111111111);		 							 		
jkomp11111111111111.setX(Spring.constant(90));														 		
jkomp11111111111111.setY(Spring.constant(1475)); 													 
pan.add(jkp11111111111111);


jkn11111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111111111111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon11111111111111=sp.getConstraints(jkn11111111111111);		 							 		
jkon11111111111111.setX(Spring.constant(372));														 		
jkon11111111111111.setY(Spring.constant(1445)); 													 
pan.add(jkn11111111111111);



JLabel jko111111111111111=new JLabel("Sur la declaration de ");jko111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom111111111111111=sp.getConstraints(jko111111111111111);		 							
jkom111111111111111.setX(Spring.constant(90));														 		
jkom111111111111111.setY(Spring.constant(1550)); 													 
pan.add(jko111111111111111);


JLabel ss11111111111111=new JLabel("...............................................................................................");ss11111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss11111111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss11111111111111=sp.getConstraints(ss11111111111111);		 							 		
sss11111111111111.setX(Spring.constant(320));														 		
sss11111111111111.setY(Spring.constant(1556)); 													 
pan.add(ss11111111111111);


JLabel jkp111111111111111=new JLabel("In accordance with the declaration of");jkp111111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp111111111111111=sp.getConstraints(jkp111111111111111);		 							 		
jkomp111111111111111.setX(Spring.constant(90));														 		
jkomp111111111111111.setY(Spring.constant(1575)); 													 
pan.add(jkp111111111111111);


jkn111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111111111111111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon111111111111111=sp.getConstraints(jkn111111111111111);		 							 		
jkon111111111111111.setX(Spring.constant(372));														 		
jkon111111111111111.setY(Spring.constant(1545)); 													 
pan.add(jkn111111111111111);


JLabel jko111111111111111s=new JLabel("...................................................................................................................................");jko111111111111111s.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111111111111s.setForeground(Color.black);		 
SpringLayout.Constraints jkom111111111111111s=sp.getConstraints(jko111111111111111s);		 							
jkom111111111111111s.setX(Spring.constant(90));														 		
jkom111111111111111s.setY(Spring.constant(1620)); 													 
pan.add(jko111111111111111s);


JLabel jko1111111111111111=new JLabel("Lesquels ont certifie la sincerite de la presente declaration,");jko1111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom1111111111111111=sp.getConstraints(jko1111111111111111);		 							
jkom1111111111111111.setX(Spring.constant(90));														 		
jkom1111111111111111.setY(Spring.constant(1700)); 													 
pan.add(jko1111111111111111);

JLabel jkp1111111111111111=new JLabel("Who attested to the truth of this declaration,");jkp1111111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp1111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp1111111111111111=sp.getConstraints(jkp1111111111111111);		 							 		
jkomp1111111111111111.setX(Spring.constant(90));														 		
jkomp1111111111111111.setY(Spring.constant(1725)); 													 
pan.add(jkp1111111111111111);


JLabel jko11111111111111111=new JLabel("Par nous,................................................................................................ Officier");jko11111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111111=sp.getConstraints(jko11111111111111111);		 							
jkom11111111111111111.setX(Spring.constant(90));														 		
jkom11111111111111111.setY(Spring.constant(1775)); 													 
pan.add(jko11111111111111111);



JLabel jko11111111111111s=new JLabel("Du Centre d'etat civil de   ...................................................................................Centre");jko11111111111111s.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s=sp.getConstraints(jko11111111111111s);		 							
jkom11111111111111s.setX(Spring.constant(90));														 		
jkom11111111111111s.setY(Spring.constant(1850)); 													 
pan.add(jko11111111111111s);

JLabel jkp11111111111111s=new JLabel("By us, Civil Status for");jkp11111111111111s.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s=sp.getConstraints(jkp11111111111111s);		 							 		
jkomp11111111111111s.setX(Spring.constant(90));														 		
jkomp11111111111111s.setY(Spring.constant(1875)); 													 
pan.add(jkp11111111111111s);


jkn11111111111111s.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111111111111s.setForeground(Color.blue);		 
SpringLayout.Constraints jkon11111111111111s=sp.getConstraints(jkn11111111111111s);		 							 		
jkon11111111111111s.setX(Spring.constant(372));														 		
jkon11111111111111s.setY(Spring.constant(1845)); 													 
pan.add(jkn11111111111111s);





JLabel jko11111111111111s1=new JLabel("Assiste   ");jko11111111111111s1.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s1.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s1=sp.getConstraints(jko11111111111111s1);		 							
jkom11111111111111s1.setX(Spring.constant(90));														 		
jkom11111111111111s1.setY(Spring.constant(1900)); 													 
pan.add(jko11111111111111s1);

JLabel ss111111111111111=new JLabel("......................................................................................................");ss111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss111111111111111=sp.getConstraints(ss111111111111111);		 							 		
sss111111111111111.setX(Spring.constant(300));														 		
sss111111111111111.setY(Spring.constant(1906)); 													 
pan.add(ss111111111111111);

JLabel jkp11111111111111s1=new JLabel("In the presence of");jkp11111111111111s1.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s1.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s1=sp.getConstraints(jkp11111111111111s1);		 							 		
jkomp11111111111111s1.setX(Spring.constant(90));														 		
jkomp11111111111111s1.setY(Spring.constant(1925)); 													 
pan.add(jkp11111111111111s1);

jkn11111111111111s1.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111111111111s1.setForeground(Color.blue);		 
SpringLayout.Constraints jkon11111111111111s1=sp.getConstraints(jkn11111111111111s1);		 							 		
jkon11111111111111s1.setX(Spring.constant(312));														 		
jkon11111111111111s1.setY(Spring.constant(1895)); 													 
pan.add(jkn11111111111111s1);


JLabel jko11111111111111s11=new JLabel("Secretaire D'etat Civil");jko11111111111111s11.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s11.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s11=sp.getConstraints(jko11111111111111s11);		 							
jkom11111111111111s11.setX(Spring.constant(90));														 		
jkom11111111111111s11.setY(Spring.constant(1975)); 													 
pan.add(jko11111111111111s11);

JLabel jkp11111111111111s11=new JLabel("Civil Status Registrar");jkp11111111111111s11.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s11.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s11=sp.getConstraints(jkp11111111111111s11);		 							 		
jkomp11111111111111s11.setX(Spring.constant(90));														 		
jkomp11111111111111s11.setY(Spring.constant(2000)); 													 
pan.add(jkp11111111111111s11);


JLabel jko11111111111111s111=new JLabel("Le Secretaire");jko11111111111111s111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s111=sp.getConstraints(jko11111111111111s111);		 							
jkom11111111111111s111.setX(Spring.constant(150));														 		
jkom11111111111111s111.setY(Spring.constant(2050)); 													 
pan.add(jko11111111111111s111);

JLabel jkp11111111111111s111=new JLabel("Secretary");jkp11111111111111s111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s111=sp.getConstraints(jkp11111111111111s111);		 							 		
jkomp11111111111111s111.setX(Spring.constant(180));														 		
jkomp11111111111111s111.setY(Spring.constant(2075)); 													 
pan.add(jkp11111111111111s111);


JLabel jko11111111111111s1111=new JLabel("Signature de l'Officier d'etat Civil");jko11111111111111s1111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s1111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s1111=sp.getConstraints(jko11111111111111s1111);		 							
jkom11111111111111s1111.setX(Spring.constant(550));														 		
jkom11111111111111s1111.setY(Spring.constant(2050)); 													 
pan.add(jko11111111111111s1111);

JLabel jkp11111111111111s1111=new JLabel("Signature of civil Statut Registrar");jkp11111111111111s1111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s1111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s1111=sp.getConstraints(jkp11111111111111s1111);		 							 		
jkomp11111111111111s1111.setX(Spring.constant(600));														 		
jkomp11111111111111s1111.setY(Spring.constant(2075)); 													 
pan.add(jkp11111111111111s1111);


		
		
	
		
		 
		
		
		
	 
		
		
		label5.setFont(fc1);label5.setForeground(Color.black);
		SpringLayout.Constraints bn=sp.getConstraints(label5);		
		bn.setX(Spring.constant(410));		
		bn.setY(Spring.constant(160));
		pan.add(label5); label5.addMouseListener(this);
		
		p.add(print);
		p.add(close);
		p.add(pan);
		
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		fen.getContentPane().add(scroll);
		
		nomx=jkn.getText();
		
		fen.setVisible(true);
	}
	
	
	JPanel printo=new JPanel();	JPanel closeo=new JPanel(); String nomDe;
	
	Warning(int u,String  province,String  departement,String  arrondissement,String  cec,String  numeo,
				String  nomD,String dateD,String lieuD,String ageD,String naissDefun,String lieuNaissDefun,
				String professionD,String domicileD,String PereD,String domicilePereD,String mereD,String domicileMereD,String dateDresseD,String declarerPar,String declarationD,String assisteD)
	
	{
		
		printo.setBackground(Color.WHITE);
		printo.add(prin);
		print.addMouseListener(this);
		
		closeo.setBackground(Color.WHITE);
		closeo.add(clo);
		closeo.addMouseListener(this);

//    	   

JLabel label111=new JLabel(province);
JLabel label1111111=new JLabel(departement);
JLabel label11111111111=new JLabel(arrondissement);
JLabel label11111111111111111=new JLabel(cec);
JLabel lab =new JLabel(numeo);
JLabel jkn=new JLabel(nomD);nomDe=jkn.getText();
JLabel jkn1=new JLabel(dateD);
JLabel jkn11=new JLabel(lieuD);
JLabel jkn111=new JLabel(nomD);
JLabel vch=new JLabel(ageD);
JLabel vch1=new JLabel(naissDefun);
JLabel vch11=new JLabel(lieuNaissDefun);
JLabel vch1111=new JLabel(domicileD);
JLabel vch111=new JLabel(professionD);
JLabel jkn11111=new JLabel(PereD); 
JLabel jkn1111111=new JLabel(domicilePereD); 
JLabel jkn111111111=new JLabel(mereD); 
JLabel jkn111111111111=new JLabel(domicileMereD); 
JLabel jkn11111111111111=new JLabel(dateDresseD);
JLabel jkn111111111111111=new JLabel(declarerPar);
JLabel jkn11111111111111s=new JLabel(cec);
JLabel jkn11111111111111s1=new JLabel(declarationD);


Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
int l = tailleMoniteur.width ;//* 2/3;
int h = tailleMoniteur.height ;//* 2/3;
fen.setUndecorated(true); 
fen.setLocation(200,1);
fen.setSize(1200,800);
fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

p.addMouseListener(new MouseAdapter()
{
@Override public void mousePressed(MouseEvent e) 
{	 
	if(SwingUtilities.isLeftMouseButton(e))
 {
     oldX = e.getX();
     oldY = e.getY();
 }
}

public void mouseReleased(MouseEvent e) 
{
 oldX = e.getX();
 oldY = e.getY();
}           
});

p.addMouseMotionListener(new MouseMotionAdapter()
{                     
@Override public void mouseDragged(MouseEvent e) 
{
 
 Point p = new Point(e.getLocationOnScreen());
 fen.setLocation(p.x-oldX,p.y-oldY);	
}	
});







p.setBackground(new Color(82, 35, 100));	
pan.setBackground(Color.white);
pan.setPreferredSize(new Dimension(950,2500));

Font font=new Font("Time new Roman", Font.BOLD,40);
Font fc=new Font("Time new Roman", Font.BOLD ,20);Font fc1=new Font("Time new Roman", Font.BOLD,18);
Font fcc=new Font("Time new Roman", Font.BOLD,35);   //HANGING_BASELINE
Font fw=new Font("Time new Roman", Font.ROMAN_BASELINE ,18);
Font fw1=new Font("Time new Roman", Font.HANGING_BASELINE ,26);
Font fc0=new Font("Time new Roman", Font.BOLD ,30);
Font fw0=new Font("Time new Roman", Font.ROMAN_BASELINE ,30);





SpringLayout sp=new SpringLayout();pan.setLayout(sp);


JLabel w2=new JLabel("REPUBLIQUE  DU  CAMEROUN");w2.setFont(fc);w2.setForeground(Color.black);		 
SpringLayout.Constraints bw=sp.getConstraints(w2);		 							 		
bw.setX(Spring.constant(606));														 		
bw.setY(Spring.constant(30)); 													 
pan.add(w2);	

JLabel w21=new JLabel("Paix - Travail - Patrie");w21.setFont(fc);w21.setForeground(Color.black);		 
SpringLayout.Constraints bw1=sp.getConstraints(w21);		 							 		
bw1.setX(Spring.constant(656));														 		
bw1.setY(Spring.constant(60)); 													 
pan.add(w21);	


JLabel w211=new JLabel("REPUBLIC  OF  CAMEROON");w211.setFont(fc);w211.setForeground(Color.black);		 
SpringLayout.Constraints bw11=sp.getConstraints(w211);		 							 		
bw11.setX(Spring.constant(616));														 		
bw11.setY(Spring.constant(100)); 													 
pan.add(w211);	


JLabel w2111=new JLabel("Peace - Work - Fatherland");w2111.setFont(fc);w2111.setForeground(Color.black);		 
SpringLayout.Constraints bw111=sp.getConstraints(w2111);		 							 		
bw111.setX(Spring.constant(626));														 		
bw111.setY(Spring.constant(130)); 													 
pan.add(w2111);	

JLabel w21111=new JLabel("__________");w21111.setFont(fc);w21111.setForeground(Color.black);		 
SpringLayout.Constraints bw1111=sp.getConstraints(w21111);		 							 		
bw1111.setX(Spring.constant(686));														 		
bw1111.setY(Spring.constant(140)); 													 
pan.add(w21111);	


JLabel label=new JLabel("REGION");label.setFont(fc);label.setForeground(Color.black);		 
SpringLayout.Constraints b1=sp.getConstraints(label);		 							 		
b1.setX(Spring.constant(130));														 		
b1.setY(Spring.constant(30)); 													 
pan.add(label);		

JLabel label1=new JLabel("REGION");label1.setFont(fw);label1.setForeground(Color.black);		 
SpringLayout.Constraints b11=sp.getConstraints(label1);		 							 		
b11.setX(Spring.constant(134));														 		
b11.setY(Spring.constant(55)); 													 
pan.add(label1);	

JLabel label11=new JLabel("________________________");label11.setFont(fc);label11.setForeground(Color.black);		 
SpringLayout.Constraints b111=sp.getConstraints(label11);		 							 		
b111.setX(Spring.constant(54));														 		
b111.setY(Spring.constant(90)); 													 
pan.add(label11);


label111.setFont(fw1);label111.setForeground(Color.blue);		 
SpringLayout.Constraints b1111=sp.getConstraints(label111);		 							 		
b1111.setX(Spring.constant(130));														 		
b1111.setY(Spring.constant(80)); 													 
pan.add(label111);


JLabel label111z=new JLabel("__________");label111z.setFont(fc);label111z.setForeground(Color.black);		 
SpringLayout.Constraints b1111z=sp.getConstraints(label111z);		 							 		
b1111z.setX(Spring.constant(120));														 		
b1111z.setY(Spring.constant(110)); 													 
pan.add(label111z);


JLabel label1111=new JLabel("DEPARTEMENT");label1111.setFont(fc);label1111.setForeground(Color.black);		 
SpringLayout.Constraints b11111=sp.getConstraints(label1111);		 							 		
b11111.setX(Spring.constant(100));														 		
b11111.setY(Spring.constant(140)); 													 
pan.add(label1111);


JLabel label11111=new JLabel("DIVISION");label11111.setFont(fw);label11111.setForeground(Color.black);		 
SpringLayout.Constraints b111111=sp.getConstraints(label11111);		 							 		
b111111.setX(Spring.constant(140));														 		
b111111.setY(Spring.constant(165)); 													 
pan.add(label11111);


JLabel label111111=new JLabel("________________________");label111111.setFont(fc);label111111.setForeground(Color.black);		 
SpringLayout.Constraints b1111111=sp.getConstraints(label111111);		 							 		
b1111111.setX(Spring.constant(54));														 		
b1111111.setY(Spring.constant(200)); 													 
pan.add(label111111);


label1111111.setFont(fw1);label1111111.setForeground(Color.blue);		 
SpringLayout.Constraints b11111111=sp.getConstraints(label1111111);		 							 		
b11111111.setX(Spring.constant(130));														 		
b11111111.setY(Spring.constant(190)); 													 
pan.add(label1111111);

JLabel label11111111=new JLabel("__________");label11111111.setFont(fc);label11111111.setForeground(Color.black);		 
SpringLayout.Constraints b111111111=sp.getConstraints(label11111111);		 							 		
b111111111.setX(Spring.constant(120));														 		
b111111111.setY(Spring.constant(220)); 													 
pan.add(label11111111);

JLabel label111111111=new JLabel("ARRONDISSEMENT");label111111111.setFont(fc);label111111111.setForeground(Color.black);		 
SpringLayout.Constraints b1111111111=sp.getConstraints(label111111111);		 							 		
b1111111111.setX(Spring.constant(90));														 		
b1111111111.setY(Spring.constant(250)); 													 
pan.add(label111111111);		

JLabel label1111111111=new JLabel("SUBDIVISION");label1111111111.setFont(fw);label1111111111.setForeground(Color.black);		 
SpringLayout.Constraints b11111111111=sp.getConstraints(label1111111111);		 							 		
b11111111111.setX(Spring.constant(130));														 		
b11111111111.setY(Spring.constant(275)); 													 
pan.add(label1111111111);


JLabel label111111z=new JLabel("________________________");label111111z.setFont(fc);label111111z.setForeground(Color.black);		 
SpringLayout.Constraints b1111111z=sp.getConstraints(label111111z);		 							 		
b1111111z.setX(Spring.constant(54));														 		
b1111111z.setY(Spring.constant(310)); 													 
pan.add(label111111z);


label11111111111.setFont(fw1);label11111111111.setForeground(Color.blue);		 
SpringLayout.Constraints b111111111111=sp.getConstraints(label11111111111);		 							 		
b111111111111.setX(Spring.constant(130));														 		
b111111111111.setY(Spring.constant(300)); 													 
pan.add(label11111111111);

JLabel label111111111111=new JLabel("__________");label111111111111.setFont(fc);label111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b1111111111111=sp.getConstraints(label111111111111);		 							 		
b1111111111111.setX(Spring.constant(120));														 		
b1111111111111.setY(Spring.constant(325)); 													 
pan.add(label111111111111);


JLabel label1111111111111=new JLabel("CENTRE D'ETAT CIVIL");label1111111111111.setFont(fc0);label1111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b11111111111111=sp.getConstraints(label1111111111111);		 							 		
b11111111111111.setX(Spring.constant(320));														 		
b11111111111111.setY(Spring.constant(385)); 													 
pan.add(label1111111111111);


JLabel label11111111111111=new JLabel("CIVIL STATUS REGISTRATION CENTRE");label11111111111111.setFont(fw0);label11111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b111111111111111=sp.getConstraints(label11111111111111);		 							 		
b111111111111111.setX(Spring.constant(210));														 		
b111111111111111.setY(Spring.constant(425)); 													 
pan.add(label11111111111111);

JLabel label111111111111111=new JLabel("De - Of");label111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));label111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b1111111111111111=sp.getConstraints(label111111111111111);		 							 		
b1111111111111111.setX(Spring.constant(90));														 		
b1111111111111111.setY(Spring.constant(500)); 													 
pan.add(label111111111111111);


JLabel label1111111111111111=new JLabel("______________________________________________");label1111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));label1111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b11111111111111111=sp.getConstraints(label1111111111111111);		 							 		
b11111111111111111.setX(Spring.constant(190));														 		
b11111111111111111.setY(Spring.constant(500)); 													 
pan.add(label1111111111111111);


label11111111111111111.setFont(fw1);label11111111111111111.setForeground(Color.blue);		 
SpringLayout.Constraints b111111111111111111=sp.getConstraints(label11111111111111111);		 							 		
b111111111111111111.setX(Spring.constant(390));														 		
b111111111111111111.setY(Spring.constant(490)); 													 
pan.add(label11111111111111111);

JLabel label111111111111111111=new JLabel("ACTE DE DECES");label111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 35));label111111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b1111111111111111111=sp.getConstraints(label111111111111111111);		 							 		
b1111111111111111111.setX(Spring.constant(120));														 		
b1111111111111111111.setY(Spring.constant(560)); 													 
pan.add(label111111111111111111);

JLabel label1111111111111111111=new JLabel("DEATH CERTIFICATE");label1111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 35));label1111111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b11111111111111111111=sp.getConstraints(label1111111111111111111);		 							 		
b11111111111111111111.setX(Spring.constant(120));														 		
b11111111111111111111.setY(Spring.constant(600)); 													 
pan.add(label1111111111111111111);

JLabel label11111111111111111111=new JLabel("N");label11111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));label11111111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b111111111111111111111=sp.getConstraints(label11111111111111111111);		 							 		
b111111111111111111111.setX(Spring.constant(660));														 		
b111111111111111111111.setY(Spring.constant(590)); 													 
pan.add(label11111111111111111111);


JLabel label111111111111111111111=new JLabel("______________");label111111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));label111111111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b1111111111111111111111=sp.getConstraints(label111111111111111111111);		 							 		
b1111111111111111111111.setX(Spring.constant(684));														 		
b1111111111111111111111.setY(Spring.constant(590)); 													 
pan.add(label111111111111111111111);


lab.setFont(fw1);lab.setForeground(Color.blue);		 
SpringLayout.Constraints bbn=sp.getConstraints(lab);		 							 		
bbn.setX(Spring.constant(710));														 		
bbn.setY(Spring.constant(586)); 													 
pan.add(lab);


JLabel label1111111111111111111111=new JLabel("__________________");label1111111111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));label1111111111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints b11111111111111111111111=sp.getConstraints(label1111111111111111111111);		 							 		
b11111111111111111111111.setX(Spring.constant(324));														 		
b11111111111111111111111.setY(Spring.constant(650)); 													 
pan.add(label1111111111111111111111);


JLabel jko=new JLabel("Nom du decede(e)  ");jko.setFont(new Font("Times New Roman", Font.BOLD, 25));jko.setForeground(Color.black);		 
SpringLayout.Constraints jkom=sp.getConstraints(jko);		 							 		
jkom.setX(Spring.constant(90));														 		
jkom.setY(Spring.constant(750)); 													 
pan.add(jko);

JLabel ss=new JLabel("......................................................................................................");ss.setFont(new Font("Times New Roman", Font.BOLD, 25));ss.setForeground(Color.black);		 
SpringLayout.Constraints sss=sp.getConstraints(ss);		 							 		
sss.setX(Spring.constant(300));														 		
sss.setY(Spring.constant(756)); 													 
pan.add(ss);

JLabel jkp=new JLabel("Name of  deceased");jkp.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp.setForeground(Color.black);		 
SpringLayout.Constraints jkomp=sp.getConstraints(jkp);		 							 		
jkomp.setX(Spring.constant(90));														 		
jkomp.setY(Spring.constant(775)); 													 
pan.add(jkp);


jkn.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn.setForeground(Color.blue);		 
SpringLayout.Constraints jkon=sp.getConstraints(jkn);		 							 		
jkon.setX(Spring.constant(300));														 		
jkon.setY(Spring.constant(745)); 													 
pan.add(jkn);





JLabel jko1=new JLabel("Le -  ");jko1.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1.setForeground(Color.black);		 
SpringLayout.Constraints jkom1=sp.getConstraints(jko1);		 							 		
jkom1.setX(Spring.constant(90));														 		
jkom1.setY(Spring.constant(800)); 													 
pan.add(jko1);

JLabel ss1=new JLabel("......................................................................................................");ss1.setFont(new Font("Times New Roman", Font.BOLD, 25));ss1.setForeground(Color.black);		 
SpringLayout.Constraints sss1=sp.getConstraints(ss1);		 							 		
sss1.setX(Spring.constant(300));														 		
sss1.setY(Spring.constant(806)); 													 
pan.add(ss1);

JLabel jkp1=new JLabel(" On the");jkp1.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp1.setForeground(Color.black);		 
SpringLayout.Constraints jkomp1=sp.getConstraints(jkp1);		 							 		
jkomp1.setX(Spring.constant(130));														 		
jkomp1.setY(Spring.constant(800)); 													 
pan.add(jkp1);


jkn1.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn1.setForeground(Color.blue);		 
SpringLayout.Constraints jkon1=sp.getConstraints(jkn1);		 							 		
jkon1.setX(Spring.constant(300));														 		
jkon1.setY(Spring.constant(795)); 													 
pan.add(jkn1);




JLabel jko11=new JLabel("Est decede a  ");jko11.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11.setForeground(Color.black);		 
SpringLayout.Constraints jkom11=sp.getConstraints(jko11);		 							 		
jkom11.setX(Spring.constant(90));														 		
jkom11.setY(Spring.constant(850)); 													 
pan.add(jko11);


JLabel ss11=new JLabel("......................................................................................................");ss11.setFont(new Font("Times New Roman", Font.BOLD, 25));ss11.setForeground(Color.black);		 
SpringLayout.Constraints sss11=sp.getConstraints(ss11);		 							 		
sss11.setX(Spring.constant(300));														 		
sss11.setY(Spring.constant(856)); 													 
pan.add(ss11);



JLabel jkp11=new JLabel(" Deceased At");jkp11.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11=sp.getConstraints(jkp11);		 							 		
jkomp11.setX(Spring.constant(90));														 		
jkomp11.setY(Spring.constant(875)); 													 
pan.add(jkp11);


jkn11.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11.setForeground(Color.blue);		 
SpringLayout.Constraints jkon11=sp.getConstraints(jkn11);		 							 		
jkon11.setX(Spring.constant(300));														 		
jkon11.setY(Spring.constant(845)); 													 
pan.add(jkn11);




JLabel jko111=new JLabel("M /   Mr  ");jko111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111.setForeground(Color.black);		 
SpringLayout.Constraints jkom111=sp.getConstraints(jko111);		 							 		
jkom111.setX(Spring.constant(90));														 		
jkom111.setY(Spring.constant(900)); 													 
pan.add(jko111);

JLabel ss111=new JLabel("......................................................................................................");ss111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss111.setForeground(Color.black);		 
SpringLayout.Constraints sss111=sp.getConstraints(ss111);		 							 		
sss111.setX(Spring.constant(300));														 		
sss111.setY(Spring.constant(906)); 													 
pan.add(ss111);

JLabel jkp111=new JLabel(" Name of deceased");jkp111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp111=sp.getConstraints(jkp111);		 							 		
jkomp111.setX(Spring.constant(90));														 		
jkomp111.setY(Spring.constant(925)); 													 
pan.add(jkp111);


jkn111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon111=sp.getConstraints(jkn111);		 							 		
jkon111.setX(Spring.constant(300));														 		
jkon111.setY(Spring.constant(895)); 													 
pan.add(jkn111);


JLabel vc=new JLabel("Age de - ");vc.setFont(new Font("Times New Roman", Font.BOLD, 25));vc.setForeground(Color.black);		 
SpringLayout.Constraints cf=sp.getConstraints(vc);		 							 		
cf.setX(Spring.constant(90));														 		
cf.setY(Spring.constant(950)); 													 
pan.add(vc);

JLabel ss1111=new JLabel("......................................................................................................");ss1111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss1111.setForeground(Color.black);		 
SpringLayout.Constraints sss1111=sp.getConstraints(ss1111);		 							 		
sss1111.setX(Spring.constant(300));														 		
sss1111.setY(Spring.constant(956)); 													 
pan.add(ss1111);

JLabel jki=new JLabel(" Aged");jki.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jki.setForeground(Color.black);		 
SpringLayout.Constraints hj=sp.getConstraints(jki);		 							 		
hj.setX(Spring.constant(180));														 		
hj.setY(Spring.constant(950)); 													 
pan.add(jki);


vch.setFont(new Font("Times New Roman", Font.BOLD, 28));vch.setForeground(Color.blue);		 
SpringLayout.Constraints ghb=sp.getConstraints(vch);		 							 		
ghb.setX(Spring.constant(300));														 		
ghb.setY(Spring.constant(945)); 													 
pan.add(vch);


JLabel vc1=new JLabel("Ne  le - ");vc1.setFont(new Font("Times New Roman", Font.BOLD, 25));vc1.setForeground(Color.black);		 
SpringLayout.Constraints cf1=sp.getConstraints(vc1);		 							 		
cf1.setX(Spring.constant(90));														 		
cf1.setY(Spring.constant(1000)); 													 
pan.add(vc1);

JLabel ss11111=new JLabel("......................................................................................................");ss11111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss11111.setForeground(Color.black);		 
SpringLayout.Constraints sss11111=sp.getConstraints(ss11111);		 							 		
sss11111.setX(Spring.constant(300));														 		
sss11111.setY(Spring.constant(1006)); 													 
pan.add(ss11111);

JLabel jki1=new JLabel(" Born On the");jki1.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jki1.setForeground(Color.black);		 

SpringLayout.Constraints hj1=sp.getConstraints(jki1);		 							 		
hj1.setX(Spring.constant(160));														 		
hj1.setY(Spring.constant(1000)); 													 
pan.add(jki1);


vch1.setFont(new Font("Times New Roman", Font.BOLD, 28));vch1.setForeground(Color.blue);		 
SpringLayout.Constraints ghb1=sp.getConstraints(vch1);		 							 		
ghb1.setX(Spring.constant(300));														 		
ghb1.setY(Spring.constant(995)); 													 
pan.add(vch1);







JLabel vc11=new JLabel("A - ");vc11.setFont(new Font("Times New Roman", Font.BOLD, 25));vc11.setForeground(Color.black);		 
SpringLayout.Constraints cf11=sp.getConstraints(vc11);		 							 		
cf11.setX(Spring.constant(90));														 		
cf11.setY(Spring.constant(1050)); 													 
pan.add(vc11);

JLabel ss111111=new JLabel("......................................................................................................");ss111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss111111.setForeground(Color.black);		 
SpringLayout.Constraints sss111111=sp.getConstraints(ss111111);		 							 		
sss111111.setX(Spring.constant(300));														 		
sss111111.setY(Spring.constant(1056)); 													 
pan.add(ss111111);

JLabel jki11=new JLabel(" At");jki11.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jki11.setForeground(Color.black);		 

SpringLayout.Constraints hj11=sp.getConstraints(jki11);		 							 		
hj11.setX(Spring.constant(180));														 		
hj11.setY(Spring.constant(1050)); 													 
pan.add(jki11);


vch11.setFont(new Font("Times New Roman", Font.BOLD, 28));vch11.setForeground(Color.blue);		 
SpringLayout.Constraints ghb11=sp.getConstraints(vch11);		 							 		
ghb11.setX(Spring.constant(300));														 		
ghb11.setY(Spring.constant(1045)); 													 
pan.add(vch11);





JLabel vc111=new JLabel("Profession - ");vc111.setFont(new Font("Times New Roman", Font.BOLD, 25));vc111.setForeground(Color.black);		 
SpringLayout.Constraints cf111=sp.getConstraints(vc111);		 							 		
cf111.setX(Spring.constant(90));														 		
cf111.setY(Spring.constant(1100)); 													 
pan.add(vc111);

JLabel ss1111111=new JLabel("..........................................................................................");ss1111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss1111111.setForeground(Color.black);		 
SpringLayout.Constraints sss1111111=sp.getConstraints(ss1111111);		 							 		
sss1111111.setX(Spring.constant(370));														 		
sss1111111.setY(Spring.constant(1106)); 													 
pan.add(ss1111111);

JLabel jki111=new JLabel(" Occupation");jki111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jki111.setForeground(Color.black);		 

SpringLayout.Constraints hj111=sp.getConstraints(jki111);		 							 		
hj111.setX(Spring.constant(220));														 		
hj111.setY(Spring.constant(1100)); 													 
pan.add(jki111);


vch111.setFont(new Font("Times New Roman", Font.BOLD, 28));vch111.setForeground(Color.blue);		 
SpringLayout.Constraints ghb111=sp.getConstraints(vch111);		 							 		
ghb111.setX(Spring.constant(370));														 		
ghb111.setY(Spring.constant(1095)); 													 
pan.add(vch111);




JLabel vc1111=new JLabel("Domicile a ");vc1111.setFont(new Font("Times New Roman", Font.BOLD, 25));vc1111.setForeground(Color.black);		 
SpringLayout.Constraints cf1111=sp.getConstraints(vc1111);		 							 		
cf1111.setX(Spring.constant(90));														 		
cf1111.setY(Spring.constant(1150)); 													 
pan.add(vc1111);

JLabel ss11111111=new JLabel("......................................................................................................");ss11111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss11111111.setForeground(Color.black);		 
SpringLayout.Constraints sss11111111=sp.getConstraints(ss11111111);		 							 		
sss11111111.setX(Spring.constant(300));														 		
sss11111111.setY(Spring.constant(1156)); 													 
pan.add(ss11111111);

JLabel jki1111=new JLabel(" Resident At");jki1111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jki1111.setForeground(Color.black);		 

SpringLayout.Constraints hj1111=sp.getConstraints(jki1111);		 							 		
hj1111.setX(Spring.constant(90));														 		
hj1111.setY(Spring.constant(1175)); 													 
pan.add(jki1111);


vch1111.setFont(new Font("Times New Roman", Font.BOLD, 28));vch1111.setForeground(Color.blue);		 
SpringLayout.Constraints ghb1111=sp.getConstraints(vch1111);		 							 		
ghb1111.setX(Spring.constant(300));														 		
ghb1111.setY(Spring.constant(1145)); 													 
pan.add(vch1111);





JLabel jko11111=new JLabel("Fils/Fille de   - ");jko11111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111=sp.getConstraints(jko11111);		 							 		
jkom11111.setX(Spring.constant(90));														 		
jkom11111.setY(Spring.constant(1200)); 													 
pan.add(jko11111);

JLabel ss111111111=new JLabel("......................................................................................................");ss111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss111111111=sp.getConstraints(ss111111111);		 							 		
sss111111111.setX(Spring.constant(300));														 		
sss111111111.setY(Spring.constant(1206)); 													 
pan.add(ss111111111);

JLabel jkp11111=new JLabel("son-daughter");jkp11111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111=sp.getConstraints(jkp11111);		 							 		
jkomp11111.setX(Spring.constant(90));														 		
jkomp11111.setY(Spring.constant(1225)); 													 
pan.add(jkp11111);


jkn11111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon11111=sp.getConstraints(jkn11111);		 							 		
jkon11111.setX(Spring.constant(300));														 		
jkon11111.setY(Spring.constant(1195)); 													 
pan.add(jkn11111);





 





JLabel jko1111111=new JLabel("Domicilie a  ");jko1111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom1111111=sp.getConstraints(jko1111111);		 							 		
jkom1111111.setX(Spring.constant(90));														 		
jkom1111111.setY(Spring.constant(1250)); 													 
pan.add(jko1111111);

JLabel ss1111111111=new JLabel("......................................................................................................");ss1111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss1111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss1111111111=sp.getConstraints(ss1111111111);		 							 		
sss1111111111.setX(Spring.constant(300));														 		
sss1111111111.setY(Spring.constant(1256)); 													 
pan.add(ss1111111111);

JLabel jkp1111111=new JLabel(" Resident at");jkp1111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp1111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp1111111=sp.getConstraints(jkp1111111);		 							 		
jkomp1111111.setX(Spring.constant(90));														 		
jkomp1111111.setY(Spring.constant(1275)); 													 
pan.add(jkp1111111);


jkn1111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn1111111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon1111111=sp.getConstraints(jkn1111111);		 							 		
jkon1111111.setX(Spring.constant(300));														 		
jkon1111111.setY(Spring.constant(1245)); 													 
pan.add(jkn1111111);



 




JLabel jko111111111=new JLabel("Et de - ");jko111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom111111111=sp.getConstraints(jko111111111);		 							
jkom111111111.setX(Spring.constant(90));														 		
jkom111111111.setY(Spring.constant(1300)); 													 
pan.add(jko111111111);


JLabel ss11111111111=new JLabel("......................................................................................................");ss11111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss11111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss11111111111=sp.getConstraints(ss11111111111);		 							 		
sss11111111111.setX(Spring.constant(300));														 		
sss11111111111.setY(Spring.constant(1306)); 													 
pan.add(ss11111111111);

JLabel jkp111111111=new JLabel(" And of ");jkp111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 25));jkp111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp111111111=sp.getConstraints(jkp111111111);		 							 		
jkomp111111111.setX(Spring.constant(180));														 		
jkomp111111111.setY(Spring.constant(1300)); 													 
pan.add(jkp111111111);


jkn111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111111111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon111111111=sp.getConstraints(jkn111111111);		 							 		
jkon111111111.setX(Spring.constant(300));														 		
jkon111111111.setY(Spring.constant(1295)); 													 
pan.add(jkn111111111);



 


JLabel jko111111111111=new JLabel("Domicilie a ");jko111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom111111111111=sp.getConstraints(jko111111111111);		 							
jkom111111111111.setX(Spring.constant(90));														 		
jkom111111111111.setY(Spring.constant(1350)); 													 
pan.add(jko111111111111);

JLabel ss111111111111=new JLabel("......................................................................................................");ss111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss111111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss111111111111=sp.getConstraints(ss111111111111);		 							 		
sss111111111111.setX(Spring.constant(300));														 		
sss111111111111.setY(Spring.constant(1356)); 													 
pan.add(ss111111111111);

JLabel jkp111111111111=new JLabel("Resident at");jkp111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp111111111111=sp.getConstraints(jkp111111111111);		 							 		
jkomp111111111111.setX(Spring.constant(90));														 		
jkomp111111111111.setY(Spring.constant(1375)); 													 
pan.add(jkp111111111111);


jkn111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111111111111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon111111111111=sp.getConstraints(jkn111111111111);		 							 		
jkon111111111111.setX(Spring.constant(300));														 		
jkon111111111111.setY(Spring.constant(1345)); 													 
pan.add(jkn111111111111);


 



JLabel jko11111111111111=new JLabel("Dresse le  ");jko11111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111=sp.getConstraints(jko11111111111111);		 							
jkom11111111111111.setX(Spring.constant(90));														 		
jkom11111111111111.setY(Spring.constant(1450)); 													 
pan.add(jko11111111111111);

JLabel ss1111111111111=new JLabel("......................................................................................................");ss1111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss1111111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss1111111111111=sp.getConstraints(ss1111111111111);		 							 		
sss1111111111111.setX(Spring.constant(300));														 		
sss1111111111111.setY(Spring.constant(1456)); 													 
pan.add(ss1111111111111);

JLabel jkp11111111111111=new JLabel("Drawn up on the");jkp11111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111=sp.getConstraints(jkp11111111111111);		 							 		
jkomp11111111111111.setX(Spring.constant(90));														 		
jkomp11111111111111.setY(Spring.constant(1475)); 													 
pan.add(jkp11111111111111);


jkn11111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111111111111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon11111111111111=sp.getConstraints(jkn11111111111111);		 							 		
jkon11111111111111.setX(Spring.constant(372));														 		
jkon11111111111111.setY(Spring.constant(1445)); 													 
pan.add(jkn11111111111111);



JLabel jko111111111111111=new JLabel("Sur la declaration de ");jko111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom111111111111111=sp.getConstraints(jko111111111111111);		 							
jkom111111111111111.setX(Spring.constant(90));														 		
jkom111111111111111.setY(Spring.constant(1550)); 													 
pan.add(jko111111111111111);


JLabel ss11111111111111=new JLabel("...............................................................................................");ss11111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss11111111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss11111111111111=sp.getConstraints(ss11111111111111);		 							 		
sss11111111111111.setX(Spring.constant(320));														 		
sss11111111111111.setY(Spring.constant(1556)); 													 
pan.add(ss11111111111111);


JLabel jkp111111111111111=new JLabel("In accordance with the declaration of");jkp111111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp111111111111111=sp.getConstraints(jkp111111111111111);		 							 		
jkomp111111111111111.setX(Spring.constant(90));														 		
jkomp111111111111111.setY(Spring.constant(1575)); 													 
pan.add(jkp111111111111111);


jkn111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn111111111111111.setForeground(Color.blue);		 
SpringLayout.Constraints jkon111111111111111=sp.getConstraints(jkn111111111111111);		 							 		
jkon111111111111111.setX(Spring.constant(372));														 		
jkon111111111111111.setY(Spring.constant(1545)); 													 
pan.add(jkn111111111111111);


JLabel jko111111111111111s=new JLabel("...................................................................................................................................");jko111111111111111s.setFont(new Font("Times New Roman", Font.BOLD, 25));jko111111111111111s.setForeground(Color.black);		 
SpringLayout.Constraints jkom111111111111111s=sp.getConstraints(jko111111111111111s);		 							
jkom111111111111111s.setX(Spring.constant(90));														 		
jkom111111111111111s.setY(Spring.constant(1620)); 													 
pan.add(jko111111111111111s);


JLabel jko1111111111111111=new JLabel("Lesquels ont certifie la sincerite de la presente declaration,");jko1111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko1111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom1111111111111111=sp.getConstraints(jko1111111111111111);		 							
jkom1111111111111111.setX(Spring.constant(90));														 		
jkom1111111111111111.setY(Spring.constant(1700)); 													 
pan.add(jko1111111111111111);

JLabel jkp1111111111111111=new JLabel("Who attested to the truth of this declaration,");jkp1111111111111111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp1111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp1111111111111111=sp.getConstraints(jkp1111111111111111);		 							 		
jkomp1111111111111111.setX(Spring.constant(90));														 		
jkomp1111111111111111.setY(Spring.constant(1725)); 													 
pan.add(jkp1111111111111111);


JLabel jko11111111111111111=new JLabel("Par nous,................................................................................................ Officier");jko11111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111111=sp.getConstraints(jko11111111111111111);		 							
jkom11111111111111111.setX(Spring.constant(90));														 		
jkom11111111111111111.setY(Spring.constant(1775)); 													 
pan.add(jko11111111111111111);



JLabel jko11111111111111s=new JLabel("Du Centre d'etat civil de   ...................................................................................Centre");jko11111111111111s.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s=sp.getConstraints(jko11111111111111s);		 							
jkom11111111111111s.setX(Spring.constant(90));														 		
jkom11111111111111s.setY(Spring.constant(1850)); 													 
pan.add(jko11111111111111s);

JLabel jkp11111111111111s=new JLabel("By us, Civil Status for");jkp11111111111111s.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s=sp.getConstraints(jkp11111111111111s);		 							 		
jkomp11111111111111s.setX(Spring.constant(90));														 		
jkomp11111111111111s.setY(Spring.constant(1875)); 													 
pan.add(jkp11111111111111s);


jkn11111111111111s.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111111111111s.setForeground(Color.blue);		 
SpringLayout.Constraints jkon11111111111111s=sp.getConstraints(jkn11111111111111s);		 							 		
jkon11111111111111s.setX(Spring.constant(372));														 		
jkon11111111111111s.setY(Spring.constant(1845)); 													 
pan.add(jkn11111111111111s);





JLabel jko11111111111111s1=new JLabel("Assiste   ");jko11111111111111s1.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s1.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s1=sp.getConstraints(jko11111111111111s1);		 							
jkom11111111111111s1.setX(Spring.constant(90));														 		
jkom11111111111111s1.setY(Spring.constant(1900)); 													 
pan.add(jko11111111111111s1);

JLabel ss111111111111111=new JLabel("......................................................................................................");ss111111111111111.setFont(new Font("Times New Roman", Font.BOLD, 25));ss111111111111111.setForeground(Color.black);		 
SpringLayout.Constraints sss111111111111111=sp.getConstraints(ss111111111111111);		 							 		
sss111111111111111.setX(Spring.constant(300));														 		
sss111111111111111.setY(Spring.constant(1906)); 													 
pan.add(ss111111111111111);

JLabel jkp11111111111111s1=new JLabel("In the presence of");jkp11111111111111s1.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s1.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s1=sp.getConstraints(jkp11111111111111s1);		 							 		
jkomp11111111111111s1.setX(Spring.constant(90));														 		
jkomp11111111111111s1.setY(Spring.constant(1925)); 													 
pan.add(jkp11111111111111s1);

jkn11111111111111s1.setFont(new Font("Times New Roman", Font.BOLD, 28));jkn11111111111111s1.setForeground(Color.blue);		 
SpringLayout.Constraints jkon11111111111111s1=sp.getConstraints(jkn11111111111111s1);		 							 		
jkon11111111111111s1.setX(Spring.constant(312));														 		
jkon11111111111111s1.setY(Spring.constant(1895)); 													 
pan.add(jkn11111111111111s1);


JLabel jko11111111111111s11=new JLabel("Secretaire D'etat Civil");jko11111111111111s11.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s11.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s11=sp.getConstraints(jko11111111111111s11);		 							
jkom11111111111111s11.setX(Spring.constant(90));														 		
jkom11111111111111s11.setY(Spring.constant(1975)); 													 
pan.add(jko11111111111111s11);

JLabel jkp11111111111111s11=new JLabel("Civil Status Registrar");jkp11111111111111s11.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s11.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s11=sp.getConstraints(jkp11111111111111s11);		 							 		
jkomp11111111111111s11.setX(Spring.constant(90));														 		
jkomp11111111111111s11.setY(Spring.constant(2000)); 													 
pan.add(jkp11111111111111s11);


JLabel jko11111111111111s111=new JLabel("Le Secretaire");jko11111111111111s111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s111=sp.getConstraints(jko11111111111111s111);		 							
jkom11111111111111s111.setX(Spring.constant(150));														 		
jkom11111111111111s111.setY(Spring.constant(2050)); 													 
pan.add(jko11111111111111s111);

JLabel jkp11111111111111s111=new JLabel("Secretary");jkp11111111111111s111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s111=sp.getConstraints(jkp11111111111111s111);		 							 		
jkomp11111111111111s111.setX(Spring.constant(180));														 		
jkomp11111111111111s111.setY(Spring.constant(2075)); 													 
pan.add(jkp11111111111111s111);


JLabel jko11111111111111s1111=new JLabel("Signature de l'Officier d'etat Civil");jko11111111111111s1111.setFont(new Font("Times New Roman", Font.BOLD, 25));jko11111111111111s1111.setForeground(Color.black);		 
SpringLayout.Constraints jkom11111111111111s1111=sp.getConstraints(jko11111111111111s1111);		 							
jkom11111111111111s1111.setX(Spring.constant(550));														 		
jkom11111111111111s1111.setY(Spring.constant(2050)); 													 
pan.add(jko11111111111111s1111);

JLabel jkp11111111111111s1111=new JLabel("Signature of civil Statut Registrar");jkp11111111111111s1111.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));jkp11111111111111s1111.setForeground(Color.black);		 
SpringLayout.Constraints jkomp11111111111111s1111=sp.getConstraints(jkp11111111111111s1111);		 							 		
jkomp11111111111111s1111.setX(Spring.constant(600));														 		
jkomp11111111111111s1111.setY(Spring.constant(2075)); 													 
pan.add(jkp11111111111111s1111);









printo.addMouseListener(this);
closeo.addMouseListener(this);
p.add(printo);
p.add(closeo);

label5.setFont(fc1);label5.setForeground(Color.black);
SpringLayout.Constraints bn=sp.getConstraints(label5);		
bn.setX(Spring.constant(410));		
bn.setY(Spring.constant(160));
pan.add(label5); label5.addMouseListener(this);

p.add(pan);

scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
fen.getContentPane().add(scroll);

fen.setVisible(true);
}



				
				
	
	
	Warning(int b)
	{
		
		fen.setUndecorated(true);
		fen.setLocation(500,300);
		fen.setSize(600,400);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.addMouseListener(new MouseAdapter()
        {
            @Override public void mousePressed(MouseEvent e) 
            {	 
            	if(SwingUtilities.isLeftMouseButton(e))
                {
                    oldX = e.getX();
                    oldY = e.getY();
                }
            }
 
            public void mouseReleased(MouseEvent e) 
            {
                oldX = e.getX();
                oldY = e.getY();
            }           
        });
 
        p.addMouseMotionListener(new MouseMotionAdapter()
        {                     
            @Override public void mouseDragged(MouseEvent e) 
            {
                
                Point p = new Point(e.getLocationOnScreen());
                fen.setLocation(p.x-oldX,p.y-oldY);	
            }	
        });

		
		
		
		
		
		
		p.setBackground(new Color(82, 35, 100));
		
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,20);Font fc1=new Font("Time new Roman", Font.BOLD,18);
		Font fcc=new Font("Time new Roman", Font.BOLD,35);
		
		
		
		
		
		SpringLayout sp=new SpringLayout();p.setLayout(sp);
		
		JLabel label=new JLabel("UNE ERREUR C'EST PRODUITE !!");label.setFont(fcc);label.setForeground(Color.white);
		SpringLayout.Constraints b1=sp.getConstraints(label);		
		b1.setX(Spring.constant(10));		
		b1.setY(Spring.constant(50));
		p.add(label);
		
		
		JLabel label1=new JLabel("Verifier que vous avez respectez les conditions suivante:");label1.setFont(fc);label1.setForeground(Color.white);
		SpringLayout.Constraints b11=sp.getConstraints(label1);		
		b11.setX(Spring.constant(10));		
		b11.setY(Spring.constant(150));
		p.add(label1);
		
		
		JLabel label2=new JLabel("1-Le Champs Nom a ete remplit");label2.setFont(fc1);label2.setForeground(Color.white);
		SpringLayout.Constraints b111=sp.getConstraints(label2);		
		b111.setX(Spring.constant(30));		
		b111.setY(Spring.constant(200));
		p.add(label2);
		
		
		JLabel label3=new JLabel("2-Le Champs Numero Naissance a ete remplit");label3.setFont(fc1);label3.setForeground(Color.white);
		SpringLayout.Constraints b1111=sp.getConstraints(label3);		
		b1111.setX(Spring.constant(30));		
		b1111.setY(Spring.constant(230));
		p.add(label3);
		
		
		
		fer.setFont(fc1);fer.setForeground(Color.black);
		SpringLayout.Constraints b111111=sp.getConstraints(fer);		
		b111111.setX(Spring.constant(410));		
		b111111.setY(Spring.constant(360));
		p.add(fer); fer.addMouseListener(this);
		
		
		
		
		fen.getContentPane().add(p);
		
		fen.setVisible(true);
	}
	
	
	

	@Override
	public void mouseClicked(MouseEvent e) 
			{
			
		if(e.getSource()==la) {fe.dispose();}
		
				if(e.getSource()==print )
				{
					
					Warning jko=new Warning(true,3);					
					
					ExportPDF (nomx);
				}
				
				if(e.getSource()==printo)
				{	 					
					ExportPDFde (nomDe);
					Warning jko=new Warning(true,3);
				}
				
				if(e.getSource()==close || e.getSource()==closeo || e.getSource()==label5)
				{
					fen.dispose();
				}
				
				if(e.getSource()==lab5 || e.getSource()==fer)
				{
					System.exit(0);
				}
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
	
	static void ExportPDF (String ne){
		 
		String chemin="C:\\Ges-Mairie\\ACTE NAISSANCE\\Acte de Naissance"+ne+".pdf"; 
		Document document = new Document();
		 
		try {
			document.setPageSize(new Rectangle(1000,2200)); 
		    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(chemin));
		    document.open();
		    PdfContentByte contentByte = writer.getDirectContent();
		    PdfTemplate template = contentByte.createTemplate(1000,2200);
		    Graphics2D g2 = template.createGraphics(1000,2200);
		    pan.print(g2);
		    g2.dispose();
		    contentByte.addTemplate(template, 1, 1);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally{
		    if(document.isOpen()){
		        document.close();}
		    }
 
	}
	
	
	static void ExportPDFde (String ne){
		 
		String chemin="C:\\Ges-Mairie\\ACTE DECES\\Acte_Deces_De_"+ne+".pdf"; 
		Document document = new Document();
		 
		try {
			document.setPageSize(new Rectangle(1000,2200)); 
		    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(chemin));
		    document.open();
		    PdfContentByte contentByte = writer.getDirectContent();
		    PdfTemplate template = contentByte.createTemplate(1000,2200);
		    Graphics2D g2 = template.createGraphics(1000,2200);
		    pan.print(g2);
		    g2.dispose();
		    contentByte.addTemplate(template, 1, 1);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally{
		    if(document.isOpen()){
		        document.close();}
		    }
 
	}
}
