/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardshapetools;

import java.awt.*;

import whiteboardtools.*;

public class RoundRectElement extends RectangleElement
{
    public RoundRectElement(Color clr, Point pt1, Point pt2, int dim, StrokeStyle style)
    {
        super(clr, pt1, pt2, dim, style);
    }

    @Override
    public void update(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(color);
        g2d.setStroke(new BasicStroke(strokeWidth,
                          BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));

        int[] arcs = new int[2];
        arcs[0] = 32;  //Math.abs(fPoint.x-sPoint.x)/4;
        arcs[1] = 32;  //Math.abs(fPoint.x-sPoint.x)/4;

        if (strokeStyle == StrokeStyle.OPEN_ROUND_RECT)
        {
            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.drawRoundRect(fPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x), 
                         Math.abs(fPoint.y- sPoint.y),arcs[0], arcs[1]);
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.drawRoundRect(sPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                         Math.abs(fPoint.y- sPoint.y),arcs[0], arcs[1]);
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.drawRoundRect(sPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                         Math.abs(fPoint.y- sPoint.y),arcs[0], arcs[1]);
            }

            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.drawRoundRect(fPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x), 
                         Math.abs(fPoint.y- sPoint.y),arcs[0], arcs[1]);
            }
        }
        if (strokeStyle == StrokeStyle.FILL_ROUND_RECT)
        {
            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.fillRoundRect(fPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x), 
                         Math.abs(fPoint.y- sPoint.y),arcs[0], arcs[1]);
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.fillRoundRect(sPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x), 
                         Math.abs(fPoint.y- sPoint.y),arcs[0], arcs[1]);
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.fillRoundRect(sPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                         Math.abs(fPoint.y- sPoint.y),arcs[0], arcs[1]);
            }

            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.fillRoundRect(fPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x), 
                         Math.abs(fPoint.y- sPoint.y),arcs[0], arcs[1]);
            }
        }
    }
}
