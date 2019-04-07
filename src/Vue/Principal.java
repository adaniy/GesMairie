package Vue;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.itextpdf.text.DocumentException;

import mod.LanceurPrincipale;

public class Principal {

	public static void main(String[] args) throws SQLException, FileNotFoundException, DocumentException 
	{ 
				
	 	Thread thread1=new Thread(new LanceurPrincipale());		
	 	thread1.start(); 
		
		
	//	System.out.println(n.recherch("jess", "b"));
		
	
	} 
	
	


}
