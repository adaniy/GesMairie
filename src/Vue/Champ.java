package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

public class Champ  extends JTextField
{
	Champ()
	{
		Font fcc=new Font("Time new Roman", Font.BOLD,30);
		
		this.setPreferredSize(new Dimension(194,42));
		this.setBackground(Color.WHITE);
		this.setForeground(Color.BLACK);
		this.setFont(fcc);
		
	 
	}
	
	
	Champ(int v)
	{
		Font fcc=new Font("Time new Roman", Font.BOLD,30);
		
		this.setPreferredSize(new Dimension(434,42));
		this.setBackground(Color.WHITE);
		this.setForeground(Color.BLACK);
		this.setFont(fcc);
	}
	
}
