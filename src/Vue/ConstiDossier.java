package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;

import controller.Connect;

public class ConstiDossier extends JPanel implements MouseListener
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
	
	
	
	JCheckBox check1 = new JCheckBox("DECLARATION DE NAISSANCE");
    JCheckBox check2 = new JCheckBox("ACTE DE MARIAGE DES PARENTS");
	JCheckBox check3 = new JCheckBox("PRESENCE D'UN TEMOIN");
	JCheckBox check4 = new JCheckBox("CNI DES PARENTS");
//	JCheckBox check6= new JCheckBox("Element 6 du Dossier");
//    JCheckBox check5 = new JCheckBox("Element 5 du Dossier");
    
    
    
    
    Champ centreEtatCivil=new Champ();
    Champ arrondissement=new Champ();
    Liste list=new Liste();
    Champ departement=new Champ();
    Champ dateE=new Champ(8);
    Champ nom=new Champ(8);
    Champ lieuE=new Champ(8);
    Liste sexeE=new Liste(8);
    Champ datep=new Champ(8);
    Champ nomp=new Champ(8);
    Champ domicilep=new Champ(8);
    Champ professionp=new Champ(8);
    Champ datem=new Champ(8);
    Champ nomm=new Champ(8);
    Champ domicilem=new Champ(8);
    Champ professionm=new Champ(8);
    Champ assiste=new Champ(8);
    Champ declaration=new Champ(8);
    Champ declareur=new Champ(8);
    Champ date=new Champ(8);
    Champ lieuP=new Champ(8);
    Champ lieuM=new Champ(8);
    Champ numero =new Champ(8);
	
	
    Deco bon;
	ConstiDossier(JPanel pan)
	
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
		
		
		Deco consti=new Deco("CONSTITUTION DU DOSSIER POUR UNE NAISSANCE",9); consti.setFont(font);
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
        ck2.setX(Spring.constant(540));		
        ck2.setY(Spring.constant(260));
        constidossier.add(check2);
		
        
        check3.setFont(fc); 
		SpringLayout.Constraints ck3=sp.getConstraints(check3);		
        ck3.setX(Spring.constant(40));		
        ck3.setY(Spring.constant(360));
        constidossier.add(check3);
        
        
        
        check4.setFont(fc); 
		SpringLayout.Constraints ck4=sp.getConstraints(check4);		
        ck4.setX(Spring.constant(540));		
        ck4.setY(Spring.constant(360));
        constidossier.add(check4);
		
/**		
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
		
        Deco enf=new Deco("ENREGISTREMENT ACTE (INFOS SUR L'ENFANT)",9); enf.setFont(font);
        SpringLayout.Constraints infen=spacte.getConstraints(enf);		
        infen.setX(Spring.constant(0));		
        infen.setY(Spring.constant(0));
        ActedeNaissinfosMEnfant.add(enf);
        
        
        
        JLabel l5=new JLabel("NOM (complet)"); l5.setFont(fcc);   			 
        SpringLayout.Constraints l55=spacte.getConstraints(l5); 			SpringLayout.Constraints l555=spacte.getConstraints(nom);		
        l55.setX(Spring.constant(50));										l555.setX(Spring.constant(300));		
        l55.setY(Spring.constant(185)); 									l555.setY(Spring.constant(180));
        ActedeNaissinfosMEnfant.add(l5);									ActedeNaissinfosMEnfant.add(nom);

        
        JLabel l6=new JLabel("NE LE (en lettre) "); l6.setFont(fcc);   		 
        SpringLayout.Constraints l66=spacte.getConstraints(l6); 			SpringLayout.Constraints l666=spacte.getConstraints(dateE);		
        l66.setX(Spring.constant(50));										l666.setX(Spring.constant(300));		
        l66.setY(Spring.constant(275)); 									l666.setY(Spring.constant(270));
        ActedeNaissinfosMEnfant.add(l6);									ActedeNaissinfosMEnfant.add(dateE);


        JLabel l7=new JLabel("LIEU DE NAISSANCE"); l7.setFont(fcc);   		 
        SpringLayout.Constraints l77=spacte.getConstraints(l7); 			SpringLayout.Constraints l777=spacte.getConstraints(lieuE);		
        l77.setX(Spring.constant(50));										l777.setX(Spring.constant(300));		
        l77.setY(Spring.constant(365)); 									l777.setY(Spring.constant(360));
        ActedeNaissinfosMEnfant.add(l7);									ActedeNaissinfosMEnfant.add(lieuE);
	
        
        JLabel num=new JLabel("NUMERO DE NAISSANCE"); num.setFont(fcc);   		 
        SpringLayout.Constraints numu=spacte.getConstraints(num); 			SpringLayout.Constraints l777w=spacte.getConstraints(numero);		
        numu.setX(Spring.constant(50));										l777w.setX(Spring.constant(300));		
        numu.setY(Spring.constant(455)); 									l777w.setY(Spring.constant(450));
        ActedeNaissinfosMEnfant.add(num);									ActedeNaissinfosMEnfant.add(numero);
	
        
        JLabel l8=new JLabel("SEXE"); l8.setFont(fcc);   					 
        SpringLayout.Constraints l88=spacte.getConstraints(l8); 			SpringLayout.Constraints l888=spacte.getConstraints(sexeE);		
        l88.setX(Spring.constant(50));										l888.setX(Spring.constant(300));		
        l88.setY(Spring.constant(545)); 									l888.setY(Spring.constant(540));
        ActedeNaissinfosMEnfant.add(l8);									ActedeNaissinfosMEnfant.add(sexeE);
	
        
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

        
        JLabel x1=new JLabel("NE LE (en lettre) "); x1.setFont(fcc);   		 
        SpringLayout.Constraints x11=spacte.getConstraints(x1); 			SpringLayout.Constraints x22=spacte.getConstraints(datep);		
        x11.setX(Spring.constant(50));										x22.setX(Spring.constant(260));		
        x11.setY(Spring.constant(275)); 									x22.setY(Spring.constant(270));
        ActedeNaissinfosMPere.add(x1);										ActedeNaissinfosMPere.add(datep);
        
        JLabel x1q=new JLabel("NE A "); x1q.setFont(fcc);   		 
        SpringLayout.Constraints x1q1=spacte.getConstraints(x1q); 			SpringLayout.Constraints x22q=spacte.getConstraints(lieuP);		
        x1q1.setX(Spring.constant(50));										x22q.setX(Spring.constant(260));		
        x1q1.setY(Spring.constant(365)); 									x22q.setY(Spring.constant(360));
        ActedeNaissinfosMPere.add(x1q);										ActedeNaissinfosMPere.add(lieuP);

        
        JLabel x2=new JLabel("DOMICILE"); x2.setFont(fcc);   				 
        SpringLayout.Constraints x221=spacte.getConstraints(x2); 			SpringLayout.Constraints x222=spacte.getConstraints(domicilep);		
        x221.setX(Spring.constant(50));										x222.setX(Spring.constant(260));		
        x221.setY(Spring.constant(455)); 									x222.setY(Spring.constant(450));
        ActedeNaissinfosMPere.add(x2);										ActedeNaissinfosMPere.add(domicilep);

        
        JLabel x21=new JLabel("PROFESSION"); x21.setFont(fcc);   				
        SpringLayout.Constraints x2211=spacte.getConstraints(x21); 				SpringLayout.Constraints x2221=spacte.getConstraints(professionp);		
        x2211.setX(Spring.constant(50));										x2221.setX(Spring.constant(260));		
        x2211.setY(Spring.constant(545)); 										x2221.setY(Spring.constant(540));
        ActedeNaissinfosMPere.add(x21);											ActedeNaissinfosMPere.add(professionp);

        
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

        
        JLabel xhu1=new JLabel("NE LE (en lettre) "); xhu1.setFont(fcc);   		 
        SpringLayout.Constraints x111=spacte.getConstraints(xhu1); 			SpringLayout.Constraints x22111=spacte.getConstraints(datem);		
        x111.setX(Spring.constant(50));										x22111.setX(Spring.constant(260));		
        x111.setY(Spring.constant(275)); 									x22111.setY(Spring.constant(270));
        ActedeNaissinfosMere.add(xhu1);										ActedeNaissinfosMere.add(datem);
        
        
        JLabel x1qm=new JLabel("NE A "); x1qm.setFont(fcc);   		 
        SpringLayout.Constraints x1q1m=spacte.getConstraints(x1qm); 			SpringLayout.Constraints x22qm=spacte.getConstraints(lieuM);		
        x1q1m.setX(Spring.constant(50));										x22qm.setX(Spring.constant(260));		
        x1q1m.setY(Spring.constant(365)); 										x22qm.setY(Spring.constant(360));
        ActedeNaissinfosMere.add(x1qm);										ActedeNaissinfosMere.add(lieuM);

        
        JLabel xji2=new JLabel("DOMICILE"); xji2.setFont(fcc);   				 
        SpringLayout.Constraints po1=spacte.getConstraints(xji2); 			SpringLayout.Constraints x22211=spacte.getConstraints(domicilem);		
        po1.setX(Spring.constant(50));										x22211.setX(Spring.constant(260));		
        po1.setY(Spring.constant(455)); 									x22211.setY(Spring.constant(450));
        ActedeNaissinfosMere.add(xji2);										ActedeNaissinfosMere.add(domicilem);

        
        JLabel x2pro1=new JLabel("PROFESSION"); x2pro1.setFont(fcc);   				 
        SpringLayout.Constraints po11=spacte.getConstraints(x2pro1); 				SpringLayout.Constraints x22m21=spacte.getConstraints(professionm);		
        po11.setX(Spring.constant(50));												x22m21.setX(Spring.constant(260));		
        po11.setY(Spring.constant(545)); 											x22m21.setY(Spring.constant(540));
        ActedeNaissinfosMere.add(x2pro1);											ActedeNaissinfosMere.add(professionm);

        
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

        
        JLabel xhud1=new JLabel("DECLARATION DE NAISSANCE"); xhud1.setFont(fcc);   		 
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
		if(e.getSource()==b && check1.isSelected() && check2.isSelected() && check3.isSelected() && check4.isSelected()/* && check5.isSelected() && check6.isSelected() */)
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
		
		if(e.getSource()==bte &&  nom.getText().length() >2 && dateE.getText().length() >2 && lieuE.getText().length() >2 )
		{
			 
			
			ActedeNaissinfosMEnfant.setVisible(false);
			ActedeNaissinfosMPere.setVisible(true);
			
		}
 
		if(e.getSource()==btp && nomp.getText().length() >2 && datep.getText().length() >2 && domicilep.getText().length() >2  && professionp.getText().length() >2 )
		{
			
			ActedeNaissinfosMPere.setVisible(false);
			ActedeNaissinfosMere.setVisible(true);
			}
		
		if(e.getSource()==btm && nomm.getText().length() >2 &&  datem.getText().length() >2 &&  domicilem.getText().length() >2 &&  professionm.getText().length() >2 )
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
		 	check1.setSelected(false);check4.setSelected(false);
		 	check2.setSelected(false);//check5.setSelected(false);
		 	check3.setSelected(false);//check6.setSelected(false);  //sexeE.getSelectedItem()
		 	
		 	
//		 	Connect(String region,String departement,String arrondissement,String centreEtatCivil,String numeo,String nomEnfant,String dateNaissanceEnfant,String lieuNaissanceEnfant,String sexeEnfant,String nomPere,String dateNaissancePere,String lieuNaissancePere,String domicilePere,String professionPere,String nomMere,String dateNaissanceMere,String lieuNaissanceMere,String domicileMere,String professionMere,String dateDressement,String surLaDeclarationDe,String assistePar)
		 	
		 	String m1= (String)list.getSelectedItem();
		 	String m2=departement.getText();
		 	String m3=arrondissement.getText();
		 	String m4=centreEtatCivil.getText();
		 	String m5=numero.getText();
		 	String m6=nom.getText().toLowerCase();
		 	String m7=dateE.getText().toLowerCase();
		 	String m8=lieuE.getText().toLowerCase();
		 	String m9=(String)sexeE.getSelectedItem();
		 	String m10=nomp.getText().toLowerCase();
		 	String m11=datep.getText().toLowerCase();
		 	String m12=lieuP.getText().toLowerCase();
		 	String m13=domicilep.getText().toLowerCase();
		 	String m14=professionp.getText().toLowerCase();
		 	String m15= nomm.getText().toLowerCase();
		 	String m16= datem.getText().toLowerCase();
		 	String m17= lieuM.getText().toLowerCase();
		 	String m18=domicilem.getText().toLowerCase();
		 	String m19=professionm.getText().toLowerCase();
		 	String m20= date.getText().toLowerCase();
		 	String m21= declareur.getText().toLowerCase();
		 	String m22=declaration.getText().toLowerCase();
		 	String m23=assiste.getText().toLowerCase();
		 	
		 	
		  
			try {
				Connect con=new Connect(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		 	
		 	list.getSelectedItem();sexeE.getSelectedItem();
			centreEtatCivil.setText("");arrondissement.setText("");departement.setText("");lieuM.setText("");
			nom.setText(""); dateE.setText("");lieuE.setText("");lieuP.setText("");numero.setText("");
			nomp.setText("");datep.setText("");domicilep.setText("");professionp.setText("");
			nomm.setText(""); datem.setText(""); domicilem.setText(""); professionm.setText("");
			date.setText("");declareur.setText("");declaration.setText("");assiste.setText("");
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
