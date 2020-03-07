package model;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class Shape extends JButton{
	Shape(String label, int x, int y){
		super(label);
	    Dimension size = getPreferredSize();
	    size.width = size.height = Math.max(size.width,size.height);
	    setPreferredSize(size);
	    //setBounds(x, y, size.width, size.height);
	    setBounds(x, y, size.width, size.height);
	    setBorder(new EmptyBorder(x, y, 5, 5));
	}
}
