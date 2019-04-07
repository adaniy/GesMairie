package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComboBox;

public class Liste extends JComboBox

{
	Liste()
	
	{
		this.addItem("Extrême-Nord");this.addItem("Nord");this.addItem("Adamaoua");this.addItem("Est");this.addItem("Centre");
		this.addItem("Sud");this.addItem("Littoral");this.addItem("Ouest");this.addItem("Nord-Ouest");this.addItem("Sud-Ouest");
	 
		Font fcc=new Font("Time new Roman", Font.BOLD,25);
		this.setPreferredSize(new Dimension(194,42));
		
		this.setFont(fcc);
		
		this.setBackground(Color.white);
		
		this.setFocusable(false);
	}
	
	Liste(int v)
	
	{
		this.addItem("Masculin");this.addItem("Feminin");
		Font fcc=new Font("Time new Roman", Font.BOLD,25);
		this.setPreferredSize(new Dimension(194,42));
	
		this.setFont(fcc);
	
		this.setBackground(Color.white);
	
		this.setFocusable(false);
}
}
