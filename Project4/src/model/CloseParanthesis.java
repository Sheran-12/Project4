package model;
import java.awt.Color;
import java.awt.Graphics;

public class CloseParanthesis extends Shape{
	
	public CloseParanthesis(int x, int y, boolean rightPanel){
		super(")",x,y);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } 
        else {
            g.setColor(getBackground());
        }
        g.fillRect(0, 0, getSize().width, getSize().height);
        super.paintComponent(g);
    }
	
    protected void paintBorder(Graphics g) 
    {
        g.setColor(getForeground());
        g.drawRect(0, 0, getSize().width, getSize().height);
        g.fillRect(10, getSize().height/2, 10, 10);
    }
}