
package whiteboardapplication;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Dimension;

public class ColorOptionBox extends JPanel
{
    Color   color;
    boolean selected; 

    public ColorOptionBox(Color clr)
    {
        color = clr; 
        selected = false;

        setBackground(color);

        setPreferredSize(new Dimension(48, 48));

        MouseHandler handler = new MouseHandler();
        addMouseListener(handler);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.lightGray);
        g.drawRect(0,0,getWidth(),getHeight());

        if (selected)
        {
            g.setColor(Color.lightGray);
            g.drawRect(0,0,getWidth(), getHeight());

            g.setColor(Color.black);
            g.drawRect(-1,-1,getWidth(), getHeight());
        }
    }

    private class MouseHandler extends MouseAdapter
    {
        @Override
        public void mousePressed(MouseEvent event) 
        {
            Client.paint.colorPicker.deselectAll();
            selected = true;
            Client.paint.drawPanel.setBrushColor(color);
            Client.paint.colorPicker.currentClrPanel.setBackground(color);
            Client.paint.repaint();
        }

        @Override
        public void mouseReleased(MouseEvent event)
        {
        }
        
        @Override
        public void mouseClicked(MouseEvent event)
        {
        }
        
        @Override
        public void mouseEntered(MouseEvent event)
        {
            
        }
    }
}
