package Vue;

import java.awt.Color;

import javax.swing.JWindow;

public class SplashScreen extends JWindow implements Runnable
	{
	


		public  SplashScreen()
		{

		}
		
 	
		
		


		
		public void run() 
		{
			Color couleurUn=new Color(255,119,119);
			
			Color couleurDeux=new Color(122,20,171 );
			
			Color blanc=new Color(255,255,255 );
			
			
			
			
			

			
			
			
			
	 
			
			Fond paneauUn=new Fond();
						
			this.setSize(800, 500);
			
			this.setLocationRelativeTo(null);  
			
			this.getContentPane().add(paneauUn);  
			
 
 		
			this.setVisible(true);
			
			 
			
		}
		

		
		
}



