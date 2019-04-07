package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect 
{
	Connection connexion;
 
	public Connect(){}
	public Connect(String region,String departement,String arrondissement,String centreEtatCivil,String numeo,String nomEnfant,String dateNaissanceEnfant,String lieuNaissanceEnfant,String sexeEnfant,String nomPere,String dateNaissancePere,String lieuNaissancePere,String domicilePere,String professionPere,String nomMere,String dateNaissanceMere,String lieuNaissanceMere,String domicileMere,String professionMere,String dateDressement,String surLaDeclarationDe,String declarationNaiss,String AssisterPar) throws SQLException
	{
		try { Class.forName( "com.mysql.jdbc.Driver" ); connexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mairie", "root", "" );} 
		catch ( ClassNotFoundException e ) {  System.out.println("oups Errreur");}
		
		Statement state = connexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);																																																																																										//	'region','departement','arrondissement','centreEtatCivil','numeo','nomEnfant','dateNaissanceEnfant','lieuNaissanceEnfant','sexeEnfant','nomPere','dateNaissancePere','lieuNaissancePere','domicilePere','professionPere','nomMere','dateNaissanceMere','lieuNaissanceMere','domicileMere','professionMere','dateDressement','surLaDeclarationDe','assistePar'
		String query = "INSERT INTO actenaissance (region,departement,arrondissement,centreEtatCivil,numeo,nomEnfant,dateNaissanceEnfant,lieuNaissanceEnfant,sexeEnfant,nomPere,dateNaissancePere,lieuNaissancePere,domicilePere,professionPere,nomMere,dateNaissanceMere,lieuNaissanceMere,domicileMere,professionMere,dateDressement,surLaDeclarationDe,declarationNaiss,assisterPar) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";		
						
		PreparedStatement prepare = connexion.prepareStatement(query);
		String d="toto";
		
		prepare.setString(1, region);prepare.setString(2, departement);prepare.setString(3, arrondissement);prepare.setString(4, centreEtatCivil);
		prepare.setString(5, numeo); prepare.setString(6, nomEnfant);prepare.setString(7, dateNaissanceEnfant);prepare.setString(8, lieuNaissanceEnfant);
		prepare.setString(9, sexeEnfant);prepare.setString(10, nomPere);
		 
		prepare.setString(11, dateNaissancePere);prepare.setString(12, lieuNaissancePere);prepare.setString(13, domicilePere);prepare.setString(14, professionPere);
		prepare.setString(15, nomMere); prepare.setString(16, dateNaissanceMere);prepare.setString(17, lieuNaissanceMere);prepare.setString(18, domicileMere);
		prepare.setString(19, professionMere);prepare.setString(20, dateDressement);prepare.setString(21, surLaDeclarationDe);prepare.setString(22, declarationNaiss); prepare.setString(23, AssisterPar);  
		int statut = prepare.executeUpdate(); 			
		
		prepare.close();
		state.close();
	} 
	
	
	
	
	
	
	public void Conexion(String user,String date) throws SQLException
	{
		try { Class.forName( "com.mysql.jdbc.Driver" ); connexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mairie", "root", "" );} 
		catch ( ClassNotFoundException e ) {  System.out.println("oups Errreur");}
		
		Statement state = connexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);																																																																																										//	'region','departement','arrondissement','centreEtatCivil','numeo','nomEnfant','dateNaissanceEnfant','lieuNaissanceEnfant','sexeEnfant','nomPere','dateNaissancePere','lieuNaissancePere','domicilePere','professionPere','nomMere','dateNaissanceMere','lieuNaissanceMere','domicileMere','professionMere','dateDressement','surLaDeclarationDe','assistePar'
		String query = "INSERT INTO conexion (user,date ) VALUES (?,?)";		
						
		PreparedStatement prepare = connexion.prepareStatement(query);
		String d="toto";
		
		prepare.setString(1, user);prepare.setString(2, date);
		 
		int statut = prepare.executeUpdate(); 			
		
		prepare.close();
		state.close();
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Connect(int h,String region,String departement,String arrondissement,String centreEtatCivil,String numeo,String nomDa,String dateD,String lieuD,String ageD,String naissDefun,String lieuNaissDefun,String professionD,String domicilD,String PereD,String domicilPereD,String mereD,String domicilMereD,String dateDresseD,String declarerPar,String declarationD,String assisteD) throws SQLException
	{
		try { Class.forName( "com.mysql.jdbc.Driver" ); connexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mairie", "root", "" );} 
		catch ( ClassNotFoundException e ) {  System.out.println("oups Errreur");}
		           	
		Statement state = connexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);																																																																																										//	'region','departement','arrondissement','centreEtatCivil','numeo','nomEnfant','dateNaissanceEnfant','lieuNaissanceEnfant','sexeEnfant','nomPere','dateNaissancePere','lieuNaissancePere','domicilePere','professionPere','nomMere','dateNaissanceMere','lieuNaissanceMere','domicileMere','professionMere','dateDressement','surLaDeclarationDe','assistePar'
		String query = "INSERT INTO actedesces (region,departement,arrondissement,centreEtatCivil,numeo,nomD,dateD,lieuD,ageD,naissDefun,lieuNaissDefun,professionD,domicilD,PereD,domicilPereD,mereD,domicilMereD,dateDresseD,declarerPar,declarationD,assisteD) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";		
						
		PreparedStatement prepare = connexion.prepareStatement(query);
		String d="toto";
		
		prepare.setString(1, region);prepare.setString(2, departement);prepare.setString(3, arrondissement);prepare.setString(4, centreEtatCivil);
		prepare.setString(5, numeo); prepare.setString(6, nomDa);prepare.setString(7, dateD);prepare.setString(8, lieuD);
		prepare.setString(9, ageD);prepare.setString(10, naissDefun);
																					 
		prepare.setString(11, lieuNaissDefun);prepare.setString(12, professionD);prepare.setString(13, domicilD);
		prepare.setString(14, PereD); prepare.setString(15, domicilPereD);prepare.setString(16, mereD);prepare.setString(17, domicilMereD);
		prepare.setString(18, dateDresseD);prepare.setString(19, declarerPar);prepare.setString(20, declarationD);prepare.setString(21,  assisteD);
		int statut = prepare.executeUpdate(); 			
		
		prepare.close();
		state.close();
	} 
	
	
	public String[] reche(String nom,String numeo) throws SQLException
	{
		try { Class.forName( "com.mysql.jdbc.Driver" ); connexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mairie", "root", "" );} 
		catch ( ClassNotFoundException e ) {  System.out.println("oups Errreur");}
		
		Statement state = connexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);																																																																																										//	'region','departement','arrondissement','centreEtatCivil','numeo','nomEnfant','dateNaissanceEnfant','lieuNaissanceEnfant','sexeEnfant','nomPere','dateNaissancePere','lieuNaissancePere','domicilePere','professionPere','nomMere','dateNaissanceMere','lieuNaissanceMere','domicileMere','professionMere','dateDressement','surLaDeclarationDe','assistePar'
		String query = "SELECT * FROM actenaissance WHERE nomEnfant=? && numeo=?" ;		
						
		PreparedStatement prepare = connexion.prepareStatement(query);
		prepare.setString(1, nom);
		prepare.setString(2, numeo);
		ResultSet statut = prepare.executeQuery(); String []p=new String[22];int n=0;
		ResultSetMetaData resultMeta = statut.getMetaData();



		while ( statut.next() ) 
			{ 
				for(int i = 2; i <= 23; i++){p[n]=statut.getObject(i).toString();n+=1;}	 
			} 
		
		
		
		
		prepare.close();
		state.close();return p;
	} 
	
	
	
	
	
	
	public String[] recheD(int y,String nom,String numeo) throws SQLException
	{
		try { Class.forName( "com.mysql.jdbc.Driver" ); connexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mairie", "root", "" );} 
		catch ( ClassNotFoundException e ) {  System.out.println("oups Errreur");}
		
		Statement state = connexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);																																																																																										//	'region','departement','arrondissement','centreEtatCivil','numeo','nomEnfant','dateNaissanceEnfant','lieuNaissanceEnfant','sexeEnfant','nomPere','dateNaissancePere','lieuNaissancePere','domicilePere','professionPere','nomMere','dateNaissanceMere','lieuNaissanceMere','domicileMere','professionMere','dateDressement','surLaDeclarationDe','assistePar'
		String query = "SELECT * FROM actedesces WHERE nomD=? && numeo=?" ;		
						
		PreparedStatement prepare = connexion.prepareStatement(query);
		prepare.setString(1, nom);
		prepare.setString(2, numeo);
		ResultSet statut = prepare.executeQuery(); String []p=new String[22];int n=0;
		ResultSetMetaData resultMeta = statut.getMetaData();



		while ( statut.next() ) 
			{ 
				for(int i = 1; i <= 22; i++){p[n]=statut.getObject(i).toString();n+=1;}	 
			} 
		
		
		
		
		prepare.close();
		state.close();return p;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
 public static	String oh=null;
	
 
	public  String recherch(String a,String b) throws SQLException
	{
		try { Class.forName( "com.mysql.jdbc.Driver" ); connexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mairie", "root", "" );} catch ( ClassNotFoundException e ) {  System.out.println("oups Errreur");}		
		Statement statement = connexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);	
		String query="SELECT mdp FROM  admin WHERE identifiant= ?;";
		PreparedStatement prepare = connexion.prepareStatement(query); 
		
		prepare.setString(1, a); 		
		ResultSet statut = prepare.executeQuery(); 				
		String k=null;
		while ( statut.next() ) {  k=statut.getString( "mdp" );} 
		
	//	System.out.println(k);
	 
		if(k.equals(b))
		{
			oh="oui";
		}
		 	
		return oh;
		 
	}
	public static String getOh() {
		return oh;
	}
	public static void setOh(String oh) {
		Connect.oh = oh;
	}
	
 
}
