

package au.edu.unimelb.distributedsystems.whiteboard.client.visuals;

import au.edu.unimelb.distributedsystems.whiteboard.client.app.Client;
import au.edu.unimelb.distributedsystems.whiteboard.client.tools.StrokeStyle;

import javax.swing.*;
import java.awt.*;

public class StrokePanel extends JPanel
{
    public StrokeStyle style;

    public StrokePanel()
    {
        setPreferredSize(new Dimension(84, 84));
        style = StrokeStyle.DOT_RECT;
    }

    public void setStyle(StrokeStyle style)
    {
        this.style = style; 
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Client.paint.drawPanel.tool.getColor());

        if ( ( style == StrokeStyle.DOT_RECT) || (style == StrokeStyle.SQUARE) ||
             ( style == StrokeStyle.LINE)     || (style == StrokeStyle.FILL_RECT ))
        {
            g.fillRect(getWidth ()/2-Client.paint.drawPanel.tool.getStroke()/2,
                   getHeight()/2-Client.paint.drawPanel.tool.getStroke()/2,
                                 Client.paint.drawPanel.tool.getStroke(),
                                 Client.paint.drawPanel.tool.getStroke());

            g.setColor(Color.black);
            g.drawRect(getWidth ()/2-Client.paint.drawPanel.tool.getStroke()/2,
                   getHeight()/2-Client.paint.drawPanel.tool.getStroke()/2,
                                 Client.paint.drawPanel.tool.getStroke(),
                                 Client.paint.drawPanel.tool.getStroke());
        }
        if ( (style == StrokeStyle.DOT_CIRC) || (style == StrokeStyle.CIRCLE) ||
             (style == StrokeStyle.FILL_OVAL) )
        {
            g.fillOval(getWidth ()/2-Client.paint.drawPanel.tool.getStroke()/2,
                   getHeight()/2-Client.paint.drawPanel.tool.getStroke()/2,
                                 Client.paint.drawPanel.tool.getStroke(),
                                 Client.paint.drawPanel.tool.getStroke());

            g.setColor(Color.black);
            g.drawOval(getWidth ()/2-Client.paint.drawPanel.tool.getStroke()/2,
                   getHeight()/2-Client.paint.drawPanel.tool.getStroke()/2,
                                 Client.paint.drawPanel.tool.getStroke(),
                                 Client.paint.drawPanel.tool.getStroke());
        }
        if ( (style == StrokeStyle.OPEN_OVAL) )
        {
            g.drawOval(getWidth ()/2-Client.paint.drawPanel.tool.getStroke()/2,
                   getHeight()/2-Client.paint.drawPanel.tool.getStroke()/2,
                                 Client.paint.drawPanel.tool.getStroke(),
                                 Client.paint.drawPanel.tool.getStroke());
        }
        if ( (style == StrokeStyle.OPEN_RECT) )
        {
            g.drawRect(getWidth ()/2-Client.paint.drawPanel.tool.getStroke()/2,
                   getHeight()/2-Client.paint.drawPanel.tool.getStroke()/2,
                                 Client.paint.drawPanel.tool.getStroke(),
                                 Client.paint.drawPanel.tool.getStroke());
        }
    }
}