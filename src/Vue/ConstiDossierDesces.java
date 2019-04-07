package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

import controller.Connect;

public class ConstiDossierDesces extends JPanel implements MouseListener

{
	JButtonU b=new JButtonU("Continuer");
	JButtonU bt1=new JButtonU("Continuer");
	JButtonU bte=new JButtonU("Continuer");
	JButtonU btp=new JButtonU("Continuer");
	JButtonU btm=new JButtonU("Continuer");
	JButtonU bta=new JButtonU("Continuer");
	
	JPanel constidossier=new JPanel();
	
	
	JPanel AM=new JPanel();
	JPanel ActedeNaissinfosMairie=new JPanel();
	JPanel ActedeNaissinfosMEnfant=new JPanel();
	JPanel ActedeNaissinfosMPere=new JPanel();
	JPanel ActedeNaissinfosMere=new JPanel();
	JPanel ActedeNaissinfosA=new JPanel();
	JLabel conf;
	
	
	
	JCheckBox check1 = new JCheckBox("Declaration de Deces");
    JCheckBox check2 = new JCheckBox("CNI Du D'un Parent Proche");
	JCheckBox check3 = new JCheckBox("CNI Du DEFUN");
//	JCheckBox check4 = new JCheckBox("Element 4 du Dossier");
//	JCheckBox check6= new JCheckBox("Element 6 du Dossier");
 //   JCheckBox check5 = new JCheckBox("Element 5 du Dossier");
    
    
    
    
    Champ centreEtatCivil=new Champ();
    Champ arrondissement=new Champ();
    Liste list=new Liste();
    Champ departement=new Champ();
    Champ dateDeces=new Champ(8);
    Champ nomD=new Champ(8);
    Champ lieuDeces=new Champ(8);
    Champ ageD=new Champ(8);
  
    Champ nomp=new Champ(8);
    Champ domicilep=new Champ(8);
  
 
    Champ nomm=new Champ(8);
    Champ domicilem=new Champ(8);
  
    Champ assiste=new Champ(8);
    Champ declaration=new Champ(8);
    Champ declareur=new Champ(8);
    Champ date=new Champ(8);
 
    Champ numero =new Champ(8);
    
    
    Champ nele=new Champ(8);Champ professionD=new Champ(8);Champ domicileD=new Champ(8); Champ neaD=new Champ(8);
    
    
    Deco bon;
	ConstiDossierDesces(JPanel pan)
	
	{
		this.setBackground(new Color(255,255,255));
		this.setPreferredSize(new Dimension(1230, 650));
		Font font=new Font("Time new Roman", Font.BOLD,40);
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		Font fcc=new Font("Time new Roman", Font.BOLD,20);
		
		SpringLayout spi=new SpringLayout();SpringLayout spfi=new SpringLayout();
		
		AM.setPreferredSize(new Dimension(1230, 650));
		AM.setBackground(new Color(255,255,255));
		this.setLayout(spi);
		SpringLayout.Constraints scki=spi.getConstraints(AM);		
        scki.setX(Spring.constant(0));		
        scki.setY(Spring.constant(0));
		this.add(AM);
		AM.setVisible(false);
		AM.setLayout(spfi);
		
		
		
		conf=new JLabel("Acte Enregistree avec Success!!"); conf.setFont(font);conf.setForeground(new Color(57, 177, 41));
        SpringLayout.Constraints sctf=spfi.getConstraints(conf);		
        sctf.setX(Spring.constant(310));		
        sctf.setY(Spring.constant(220));
        
        bon=new Deco("Recommence",6,6,6);
        SpringLayout.Constraints sctf1=spfi.getConstraints(bon);		
        sctf1.setX(Spring.constant(490));		
        sctf1.setY(Spring.constant(350));
        bon.addMouseListener(this);
        
        AM.add(conf);
		AM.add(bon);
        
		
		constidossier.setPreferredSize(new Dimension(1230, 650));
		constidossier.setBackground(new Color(255,255,255));
		this.setLayout(spi);
		SpringLayout.Constraints sck=spi.getConstraints(constidossier);		
        sck.setX(Spring.constant(0));		
        sck.setY(Spring.constant(0));
		this.add(constidossier);
			

		
		
		
		SpringLayout sp=new SpringLayout();constidossier.setLayout(sp);
		
		
		Deco consti=new Deco("CONSTITUTION DU DOSSIER POUR UN DECES",9); consti.setFont(font);
        SpringLayout.Constraints sct=sp.getConstraints(consti);		
        sct.setX(Spring.constant(0));		
        sct.setY(Spring.constant(0));
        constidossier.add(consti);
		
		check1.setFont(fc); 
		SpringLayout.Constraints ck1=sp.getConstraints(check1);		
        ck1.setX(Spring.constant(40));		
        ck1.setY(Spring.constant(260));
        constidossier.add(check1);

		check2.setFont(fc); 
		SpringLayout.Constraints ck2=sp.getConstraints(check2);		
        ck2.setX(Spring.constant(480));		
        ck2.setY(Spring.constant(260));
        constidossier.add(check2);
		
        
        check3.setFont(fc); 
		SpringLayout.Constraints ck3=sp.getConstraints(check3);		
        ck3.setX(Spring.constant(40));		
        ck3.setY(Spring.constant(360));
        constidossier.add(check3);
        
        
        
   /*     check4.setFont(fc); 
		SpringLayout.Constraints ck4=sp.getConstraints(check4);		
        ck4.setX(Spring.constant(480));		
        ck4.setY(Spring.constant(360));
        constidossier.add(check4);
		
		
		check5.setFont(fc); 
		SpringLayout.Constraints ck5=sp.getConstraints(check5);		
        ck5.setX(Spring.constant(40));		
        ck5.setY(Spring.constant(460));
        constidossier.add(check5);
		
		
		check6.setFont(fc); 
		SpringLayout.Constraints ck6=sp.getConstraints(check6);		
        ck6.setX(Spring.constant(480));		
        ck6.setY(Spring.constant(460));
        constidossier.add(check6);
        
      */
        b.setFont(fc);b.setBackground(new Color(43, 146, 194));
		SpringLayout.Constraints bb=sp.getConstraints(b);		
        bb.setX(Spring.constant(990));		
        bb.setY(Spring.constant(360));
        constidossier.add(b);
        b.addMouseListener(this);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // ACTE DE NAISSANCE MAIRIE
        
		ActedeNaissinfosMairie.setPreferredSize(new Dimension(1230, 650));
		ActedeNaissinfosMairie.setBackground(new Color(255,255,255)); 
		SpringLayout.Constraints acn=spi.getConstraints(ActedeNaissinfosMairie);		
        acn.setX(Spring.constant(0));		
        acn.setY(Spring.constant(0));
	//	this.add(ActedeNaissinfosMairie);
        
		
		
		SpringLayout spacte=new SpringLayout();ActedeNaissinfosMairie.setLayout(spacte);
		
		Deco enr=new Deco("ENREGISTREMENT ACTE (INFOS SUR LA MAIRIE)",0); enr.setFont(font);
        SpringLayout.Constraints infe=spacte.getConstraints(enr);		
        infe.setX(Spring.constant(0));		
        infe.setY(Spring.constant(0));
        ActedeNaissinfosMairie.add(enr);
        
        
        
        JLabel l1=new JLabel("REGION"); l1.setFont(fcc); 			 
        SpringLayout.Constraints lre=spacte.getConstraints(l1); 	 SpringLayout.Constraints lis=spacte.getConstraints(list);		
        lre.setX(Spring.constant(110));								 lis.setX(Spring.constant(360));		
        lre.setY(Spring.constant(220)); 							 lis.setY(Spring.constant(210));
        ActedeNaissinfosMairie.add(l1);							 	 ActedeNaissinfosMairie.add(list);
        
        
        JLabel l2=new JLabel("DEPARTEMENT"); l2.setFont(fcc);   			 
        SpringLayout.Constraints l22=spacte.getConstraints(l2); 			SpringLayout.Constraints l222=spacte.getConstraints(departement);		
        l22.setX(Spring.constant(110));										l222.setX(Spring.constant(360));		
        l22.setY(Spring.constant(320)); 									l222.setY(Spring.constant(310));
        ActedeNaissinfosMairie.add(l2);												ActedeNaissinfosMairie.add(departement);
        
        
        JLabel l3=new JLabel("ARRONDISSEMENT"); l3.setFont(fcc);   			 
        SpringLayout.Constraints l33=spacte.getConstraints(l3); 			SpringLayout.Constraints l333=spacte.getConstraints(arrondissement);		
        l33.setX(Spring.constant(110));										l333.setX(Spring.constant(360));		
        l33.setY(Spring.constant(420)); 									l333.setY(Spring.constant(410));
        ActedeNaissinfosMairie.add(l3);												ActedeNaissinfosMairie.add(arrondissement);
        
        
        
        
        JLabel l4=new JLabel("CENTRE D'ETAT CIVIL"); l4.setFont(fcc);   	 
        SpringLayout.Constraints l44=spacte.getConstraints(l4); 			SpringLayout.Constraints l444=spacte.getConstraints(centreEtatCivil);		
        l44.setX(Spring.constant(110));										l444.setX(Spring.constant(360));		
        l44.setY(Spring.constant(520)); 									l444.setY(Spring.constant(510));
        ActedeNaissinfosMairie.add(l4);												ActedeNaissinfosMairie.add(centreEtatCivil);

		
        bt1.setFont(fc);bt1.setBackground(new Color(43, 146, 194));
		SpringLayout.Constraints bbt1=spacte.getConstraints(bt1);		
        bbt1.setX(Spring.constant(990));		
        bbt1.setY(Spring.constant(360));
        ActedeNaissinfosMairie.add(bt1);
        bt1.addMouseListener(this);
        
        
        
        
        
        
        //INFOS ENFANT
        
        ActedeNaissinfosMEnfant.setPreferredSize(new Dimension(1230, 650));
        ActedeNaissinfosMEnfant.setBackground(new Color(255,255,255)); 
		SpringLayout.Constraints acne=spi.getConstraints(ActedeNaissinfosMEnfant);		
        acne.setX(Spring.constant(0));		
        acne.setY(Spring.constant(0));
     //   this.add(ActedeNaissinfosMEnfant); 
        
        
        
        ActedeNaissinfosMEnfant.setLayout(spacte);
		
        Deco enf=new Deco("ENREGISTREMENT ACTE (INFOS SUR LE DEFUN)",9); enf.setFont(font);
        SpringLayout.Constraints infen=spacte.getConstraints(enf);		
        infen.setX(Spring.constant(0));		
        infen.setY(Spring.constant(0));
        ActedeNaissinfosMEnfant.add(enf);
        
        
        
        JLabel l5=new JLabel("NOM (complet)"); l5.setFont(fcc);   			 
        SpringLayout.Constraints l55=spacte.getConstraints(l5); 			SpringLayout.Constraints l555=spacte.getConstraints(nomD);		
        l55.setX(Spring.constant(50));										l555.setX(Spring.constant(300));		
        l55.setY(Spring.constant(155)); 									l555.setY(Spring.constant(150));
        ActedeNaissinfosMEnfant.add(l5);									ActedeNaissinfosMEnfant.add(nomD);

        
        JLabel l6=new JLabel("DECEDE LE (en lettre) "); l6.setFont(fcc);   		 
        SpringLayout.Constraints l66=spacte.getConstraints(l6); 			SpringLayout.Constraints l666=spacte.getConstraints(dateDeces);		
        l66.setX(Spring.constant(50));										l666.setX(Spring.constant(300));		
        l66.setY(Spring.constant(205)); 									l666.setY(Spring.constant(200));
        ActedeNaissinfosMEnfant.add(l6);									ActedeNaissinfosMEnfant.add(dateDeces);


        JLabel l7=new JLabel("LIEU DE DECES"); l7.setFont(fcc);   		 
        SpringLayout.Constraints l77=spacte.getConstraints(l7); 			SpringLayout.Constraints l777=spacte.getConstraints(lieuDeces);		
        l77.setX(Spring.constant(50));										l777.setX(Spring.constant(300));		
        l77.setY(Spring.constant(255)); 									l777.setY(Spring.constant(250));
        ActedeNaissinfosMEnfant.add(l7);									ActedeNaissinfosMEnfant.add(lieuDeces);
	
        
        JLabel num=new JLabel("NUMERO DE DECES"); num.setFont(fcc);   		 
        SpringLayout.Constraints numu=spacte.getConstraints(num); 			SpringLayout.Constraints l777w=spacte.getConstraints(numero);		
        numu.setX(Spring.constant(50));										l777w.setX(Spring.constant(300));		
        numu.setY(Spring.constant(305)); 									l777w.setY(Spring.constant(300));
        ActedeNaissinfosMEnfant.add(num);									ActedeNaissinfosMEnfant.add(numero);
	
        
        JLabel l8=new JLabel("AGE"); l8.setFont(fcc);   					 
        SpringLayout.Constraints l88=spacte.getConstraints(l8); 			SpringLayout.Constraints l888=spacte.getConstraints(ageD);		
        l88.setX(Spring.constant(50));										l888.setX(Spring.constant(300));		
        l88.setY(Spring.constant(355)); 									l888.setY(Spring.constant(350));
        ActedeNaissinfosMEnfant.add(l8);									ActedeNaissinfosMEnfant.add(ageD);
        
        
        JLabel l81=new JLabel("NE LE "); l81.setFont(fcc);   				 
        SpringLayout.Constraints l881=spacte.getConstraints(l81); 			SpringLayout.Constraints l8881=spacte.getConstraints(nele);		
        l881.setX(Spring.constant(50));										l8881.setX(Spring.constant(300));		
        l881.setY(Spring.constant(405)); 									l8881.setY(Spring.constant(400));
        ActedeNaissinfosMEnfant.add(l81);									ActedeNaissinfosMEnfant.add(nele);
        
        JLabel l8111s=new JLabel("NE A "); l8111s.setFont(fcc);  				 
        SpringLayout.Constraints l88111s=spacte.getConstraints(l8111s); 	SpringLayout.Constraints l888111s=spacte.getConstraints(neaD);		
        l88111s.setX(Spring.constant(50));									l888111s.setX(Spring.constant(300));		
        l88111s.setY(Spring.constant(455)); 								l888111s.setY(Spring.constant(450));
        ActedeNaissinfosMEnfant.add(l8111s);								ActedeNaissinfosMEnfant.add(neaD);
	        
        JLabel l811=new JLabel("PROFESSION "); l811.setFont(fcc);   		
        SpringLayout.Constraints l8811=spacte.getConstraints(l811); 		SpringLayout.Constraints l88811=spacte.getConstraints(professionD);		
        l8811.setX(Spring.constant(50));									l88811.setX(Spring.constant(300));		
        l8811.setY(Spring.constant(535)); 									l88811.setY(Spring.constant(530));
        ActedeNaissinfosMEnfant.add(l811);									ActedeNaissinfosMEnfant.add(professionD);
        
        
        JLabel l8111=new JLabel("DOMICILE "); l8111.setFont(fcc);   				 
        SpringLayout.Constraints l88111=spacte.getConstraints(l8111); 		SpringLayout.Constraints l888111=spacte.getConstraints(domicileD);		
        l88111.setX(Spring.constant(50));									l888111.setX(Spring.constant(300));		
        l88111.setY(Spring.constant(585)); 									l888111.setY(Spring.constant(580));
        ActedeNaissinfosMEnfant.add(l8111);									ActedeNaissinfosMEnfant.add(domicileD);
	
        
        bte.setFont(fc);bte.setBackground(new Color(43, 146, 194));
		SpringLayout.Constraints bbte=spacte.getConstraints(bte);		
        bbte.setX(Spring.constant(990));		
        bbte.setY(Spring.constant(360));
        ActedeNaissinfosMEnfant.add(bte);
        bte.addMouseListener(this);
        
        
        
        
        
        
        
        // PERE
        
        
        ActedeNaissinfosMPere.setPreferredSize(new Dimension(1230, 650));
        ActedeNaissinfosMPere.setBackground(new Color(255,255,255)); 
		SpringLayout.Constraints acnp=spi.getConstraints(ActedeNaissinfosMPere);		
        acne.setX(Spring.constant(0));		
        acne.setY(Spring.constant(0));
    //    this.add(ActedeNaissinfosMPere); 
        
        
        
        
        ActedeNaissinfosMPere.setLayout(spacte);
		
        Deco pere=new Deco("ENREGISTREMENT ACTE (INFOS SUR LE PERE)",8); pere.setFont(font);
        SpringLayout.Constraints infep=spacte.getConstraints(pere);		
        infep.setX(Spring.constant(0));		
        infep.setY(Spring.constant(0));
        ActedeNaissinfosMPere.add(pere);
        
        
        
        
        JLabel l9=new JLabel("NOM (complet)"); l9.setFont(fcc);   		 
        SpringLayout.Constraints l99=spacte.getConstraints(l9); 			SpringLayout.Constraints l999=spacte.getConstraints(nomp);		
        l99.setX(Spring.constant(50));										l999.setX(Spring.constant(260));		
        l99.setY(Spring.constant(185)); 									l999.setY(Spring.constant(180));
        ActedeNaissinfosMPere.add(l9);										ActedeNaissinfosMPere.add(nomp);

 
        JLabel x2=new JLabel("DOMICILE"); x2.setFont(fcc);   				 
        SpringLayout.Constraints x221=spacte.getConstraints(x2); 			SpringLayout.Constraints x222=spacte.getConstraints(domicilep);		
        x221.setX(Spring.constant(50));										x222.setX(Spring.constant(260));		
        x221.setY(Spring.constant(275)); 									x222.setY(Spring.constant(270));
        ActedeNaissinfosMPere.add(x2);										ActedeNaissinfosMPere.add(domicilep);
 
        btp.setFont(fc);btp.setBackground(new Color(43, 146, 194));
		SpringLayout.Constraints bbt11=spacte.getConstraints(btp);		
        bbt11.setX(Spring.constant(990));		
        bbt11.setY(Spring.constant(360));
        ActedeNaissinfosMPere.add(btp);
        btp.addMouseListener(this);
        
        
        
        
        
        //MERE
        
        ActedeNaissinfosMere.setPreferredSize(new Dimension(1230, 650));
        ActedeNaissinfosMPere.setBackground(new Color(255,255,255)); 
		SpringLayout.Constraints acnm=spi.getConstraints(ActedeNaissinfosMere);		
        acnm.setX(Spring.constant(0));		
        acnm.setY(Spring.constant(0));
    //    this.add(ActedeNaissinfosMere); 
        
        
        
        
        ActedeNaissinfosMere.setLayout(spacte);
		
        Deco mere=new Deco("ENREGISTREMENT ACTE  (INFOS SUR LA MERE)",9); mere.setFont(font);
        SpringLayout.Constraints infem=spacte.getConstraints(mere);		
        infem.setX(Spring.constant(0));		
        infem.setY(Spring.constant(0));
        ActedeNaissinfosMere.add(mere);
        
        
        
        JLabel llp=new JLabel("NOM (complet)"); llp.setFont(fcc);   			 
        SpringLayout.Constraints l99nj=spacte.getConstraints(llp); 			SpringLayout.Constraints l9991=spacte.getConstraints(nomm);		
        l99nj.setX(Spring.constant(50));										l9991.setX(Spring.constant(260));		
        l99nj.setY(Spring.constant(185)); 									l9991.setY(Spring.constant(180));
        ActedeNaissinfosMere.add(llp);										ActedeNaissinfosMere.add(nomm);

 
        JLabel xji2=new JLabel("DOMICILE"); xji2.setFont(fcc);   				 
        SpringLayout.Constraints po1=spacte.getConstraints(xji2); 			SpringLayout.Constraints x22211=spacte.getConstraints(domicilem);		
        po1.setX(Spring.constant(50));										x22211.setX(Spring.constant(260));		
        po1.setY(Spring.constant(275)); 									x22211.setY(Spring.constant(270));
        ActedeNaissinfosMere.add(xji2);										ActedeNaissinfosMere.add(domicilem);

 
        btm.setFont(fc);btm.setBackground(new Color(43, 146, 194));
		SpringLayout.Constraints bbtm1=spacte.getConstraints(btm);		
        bbtm1.setX(Spring.constant(990));		
        bbtm1.setY(Spring.constant(360));
        ActedeNaissinfosMere.add(btm);
        btm.addMouseListener(this);
        
        
        
        
        //ADMINISTRATION
        
        
        ActedeNaissinfosA.setPreferredSize(new Dimension(1230, 650));
        ActedeNaissinfosMPere.setBackground(new Color(255,255,255)); 
		SpringLayout.Constraints acnA=spi.getConstraints(ActedeNaissinfosA);		
        acnA.setX(Spring.constant(0));		
        acnA.setY(Spring.constant(0));
   //     this.add(ActedeNaissinfosA); 
        
        
        
        
        
        
        
        
        
        ActedeNaissinfosA.setLayout(spacte);
		
        Deco mA=new Deco("ENREGISTREMENT ACTE (ADMINISTRATION)",5); mA.setFont(font);
        SpringLayout.Constraints infemA=spacte.getConstraints(mA);		
        infemA.setX(Spring.constant(0));		
        infemA.setY(Spring.constant(0));
        ActedeNaissinfosA.add(mA);
        
        
        
        
        JLabel dl=new JLabel("DRESSE LE"); dl.setFont(fcc);   					 
        SpringLayout.Constraints l99njdl=spacte.getConstraints(dl); 				SpringLayout.Constraints l999d1d=spacte.getConstraints(date);		
        l99njdl.setX(Spring.constant(50));											l999d1d.setX(Spring.constant(360));		
        l99njdl.setY(Spring.constant(215)); 										l999d1d.setY(Spring.constant(210));
        ActedeNaissinfosA.add(dl);													ActedeNaissinfosA.add(date);

        
        JLabel dp=new JLabel("SUR LA DECLARATION DE"); dp.setFont(fcc);   			 
        SpringLayout.Constraints l99njd=spacte.getConstraints(dp); 					SpringLayout.Constraints l999d1=spacte.getConstraints(declareur);		
        l99njd.setX(Spring.constant(50));											l999d1.setX(Spring.constant(360));		
        l99njd.setY(Spring.constant(315)); 											l999d1.setY(Spring.constant(310));
        ActedeNaissinfosA.add(dp);													ActedeNaissinfosA.add(declareur);

        
        JLabel xhud1=new JLabel("DECLARATION DE DECES"); xhud1.setFont(fcc);   		 
        SpringLayout.Constraints x11d1=spacte.getConstraints(xhud1); 					SpringLayout.Constraints x221s11=spacte.getConstraints(declaration);		
        x11d1.setX(Spring.constant(50));												x221s11.setX(Spring.constant(360));		
        x11d1.setY(Spring.constant(415)); 												x221s11.setY(Spring.constant(410));
        ActedeNaissinfosA.add(xhud1);													ActedeNaissinfosA.add(declaration);

        
        JLabel xjia2=new JLabel("ASSISTE PAR "); xjia2.setFont(fcc);   				 
        SpringLayout.Constraints poa1=spacte.getConstraints(xjia2); 				SpringLayout.Constraints x22211a=spacte.getConstraints(assiste);		
        poa1.setX(Spring.constant(50));												x22211a.setX(Spring.constant(360));		
        poa1.setY(Spring.constant(515)); 											x22211a.setY(Spring.constant(510));
        ActedeNaissinfosA.add(xjia2);												ActedeNaissinfosA.add(assiste);

        
  
        bta.setFont(fc);bta.setBackground(new Color(43, 146, 194));
		SpringLayout.Constraints bbtm1a=spacte.getConstraints(bta);		
        bbtm1a.setX(Spring.constant(990));		
        bbtm1a.setY(Spring.constant(360));
        ActedeNaissinfosA.add(bta);
        bta.addMouseListener(this);
        
        
        
        
        
        
        
        
        
        
        this.add(ActedeNaissinfosA);this.add(ActedeNaissinfosMere);this.add(ActedeNaissinfosMPere);this.add(ActedeNaissinfosMEnfant );this.add(ActedeNaissinfosMairie);
        ActedeNaissinfosA .setVisible(false);
        ActedeNaissinfosMere.setVisible(false); ActedeNaissinfosMPere.setVisible(false); ActedeNaissinfosMPere.setVisible(false); ActedeNaissinfosMEnfant.setVisible(false); ActedeNaissinfosMairie.setVisible(false);
        
        
        
        
	}
	
	public void mouseClicked(MouseEvent e) 
	{		
		if(e.getSource()==b && check1.isSelected() && check2.isSelected() && check3.isSelected() /*&& check4.isSelected() && check5.isSelected() && check6.isSelected() */)
		{

			
		 
			
			constidossier.setVisible(false);
			AM.setVisible(false);
			ActedeNaissinfosMairie.setVisible(true);
		}		
		
		if(e.getSource()==bt1 )
		{
			if( centreEtatCivil.getText().length() >2 && arrondissement.getText().length()>2  &&  departement.getText().length()>2)
			
			{
				
				ActedeNaissinfosMairie.setVisible(false);
				ActedeNaissinfosMEnfant.setVisible(true);
				
			} 
			
			//System.out.println(centreEtatCivil);
			 
		} 
		
		if(e.getSource()==bte &&  nomD.getText().length() >2 && dateDeces.getText().length() >2 && lieuDeces.getText().length() >2  && domicileD.getText().length() >2 && neaD.getText().length() >2 && nele.getText().length() >2 && professionD.getText().length() >2 && ageD.getText().length() >2)
		{
			 
			
			ActedeNaissinfosMEnfant.setVisible(false);
			ActedeNaissinfosMPere.setVisible(true);
			
		}
 
		if(e.getSource()==btp && nomp.getText().length() >2 && domicilep.getText().length() >2 )
		{
			
			ActedeNaissinfosMPere.setVisible(false);
			ActedeNaissinfosMere.setVisible(true);
			}
		
		if(e.getSource()==btm && nomm.getText().length() >2  &&  domicilem.getText().length() >2 )
		{
			
			ActedeNaissinfosMere.setVisible(false);
			ActedeNaissinfosA.setVisible(true);
			}
		
		if(e.getSource()==bta && date.getText().length() >2 &&  declareur.getText().length() >2 &&  declaration.getText().length() >2 &&  assiste.getText().length() >2  )
		{
			
			ActedeNaissinfosA.setVisible(false);
			AM.setVisible(true);
		}
		
		if(e.getSource()==bon)
		{
		 	check1.setSelected(false);//check4.setSelected(false);
		 	check2.setSelected(false);//check5.setSelected(false);
		 	check3.setSelected(false);//check6.setSelected(false);  //sexeE.getSelectedItem()
		 	
		 	
//		 	Connect(String region,String departement,String arrondissement,String centreEtatCivil,String numeo,String nomEnfant,String dateNaissanceEnfant,String lieuNaissanceEnfant,String sexeEnfant,String nomPere,String dateNaissancePere,String lieuNaissancePere,String domicilePere,String professionPere,String nomMere,String dateNaissanceMere,String lieuNaissanceMere,String domicileMere,String professionMere,String dateDressement,String surLaDeclarationDe,String assistePar)
		 	
		 	String m1= (String)list.getSelectedItem();
		 	String m2=departement.getText();
		 	String m3=arrondissement.getText();
		 	String m4=centreEtatCivil.getText();
		 	String m5=numero.getText();
		 	

		 	
		 	
		 	String m6=nomD.getText().toLowerCase();
		 	String m7=dateDeces.getText().toLowerCase();
		 	String m8=lieuDeces.getText().toLowerCase();
		 	String m9=ageD.getText().toLowerCase();
		 	String x1=nele.getText().toLowerCase();
		 	String xx=neaD.getText().toLowerCase();
		 	String x2=professionD.getText().toLowerCase();
		 	String x3=domicileD.getText().toLowerCase();
		 	
		 	String m10=nomp.getText().toLowerCase();    	String m13=domicilep.getText().toLowerCase(); 
		 	
		 	String m15= nomm.getText().toLowerCase();  		String m18=domicilem.getText().toLowerCase(); 		 	
		 	
		 	String m20= date.getText().toLowerCase();  		String m21= declareur.getText().toLowerCase();   	String m22=declaration.getText().toLowerCase();   	String m23=assiste.getText().toLowerCase();
		 	
		 	
		  
			try {
				Connect con=new Connect(1,m1,m2,m3,m4,m5         ,m6,m7,m8,m9        ,x1,xx,x2,x3          ,m10,m13        ,m15,m18       ,m20,m21,m22,m23);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		 	
			
		 	list.getSelectedItem();ageD.getText().toLowerCase();
			centreEtatCivil.setText("");arrondissement.setText("");departement.setText("");
			nomD.setText(""); dateDeces.setText("");lieuDeces.setText("");numero.setText("");
			nomp.setText("");domicilep.setText("");
			nomm.setText("");domicilem.setText("");
			date.setText("");declareur.setText("");declaration.setText("");assiste.setText("");
			domicileD.setText("");neaD.setText("");nele.setText("");professionD.setText("");ageD.setText("");
			AM.setVisible(false);
			constidossier.setVisible(true);			
		}
 
 
	}


 
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource()==bta || e.getSource()==b || e.getSource()==bt1 || e.getSource()==bte || e.getSource()==btp || e.getSource()==btm)
		{
			b.setBackground(new Color(255,255,255));
			b.setForeground(new Color(43, 146, 194));
			
			bt1.setBackground(new Color(255,255,255));
			bt1.setForeground(new Color(43, 146, 194));
			
			bte.setBackground(new Color(255,255,255));
			bte.setForeground(new Color(43, 146, 194));
			
			btp.setBackground(new Color(255,255,255));
			btp.setForeground(new Color(43, 146, 194));
			
			btm.setBackground(new Color(255,255,255));
			btm.setForeground(new Color(43, 146, 194));
			
			bta.setBackground(new Color(255,255,255));
			bta.setForeground(new Color(43, 146, 194));
		}		
		
 
	}


	public void mouseExited(MouseEvent e) 
	{
		if(e.getSource()==bta || e.getSource()==b || e.getSource()==bt1 || e.getSource()==bte || e.getSource()==btp || e.getSource()==btm)
		{ 
			b.setBackground(new Color(43, 146, 194));
			b.setForeground(new Color(0,0,0)); 
			
			bt1.setBackground(new Color(43, 146, 194));
			bt1.setForeground(new Color(0,0,0)); 
			
			bte.setBackground(new Color(43, 146, 194));
			bte.setForeground(new Color(0,0,0)); 
			
			btp.setBackground(new Color(43, 146, 194));
			btp.setForeground(new Color(0,0,0)); 
			
			btm.setBackground(new Color(43, 146, 194));
			btm.setForeground(new Color(0,0,0)); 
			
			bta.setBackground(new Color(43, 146, 194));
			bta.setForeground(new Color(0,0,0)); 
		} 
	}

 
	public void mousePressed(MouseEvent e) {
		 
		
	}


 
	public void mouseReleased(MouseEvent e) { 
	}
	
}
