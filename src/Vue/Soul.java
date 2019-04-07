package Vue;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Soul extends JPanel

{
	Soul(JPanel p1,int x,int y,int l,int L,SpringLayout dp)
	
	{
        this.setBackground(Color.WHITE);
        
        this.setPreferredSize(new Dimension(l,L));
        
        SpringLayout.Constraints ss1=dp.getConstraints(this);
		
		ss1.setX(Spring.constant(x));
		
		ss1.setY(Spring.constant(y));
		
		p1.add(this);
	}

}
