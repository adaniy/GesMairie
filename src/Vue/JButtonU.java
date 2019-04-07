package Vue;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class JButtonU extends JButton
{
	JButtonU(String gc)
	{
		JLabel g=new JLabel(gc);
		
		Font fc=new Font("Time new Roman", Font.ITALIC,30);
		
		g.setFont(fc);
		
		this.add(g);
	}
}
