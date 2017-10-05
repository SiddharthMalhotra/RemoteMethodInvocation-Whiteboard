/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardshapetools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Point;

import whiteboardtools.*;

public class RectangleElement extends DragElement
{
    public RectangleElement(Color clr, Point pt1, Point pt2, int dim, StrokeStyle style)
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

        if (strokeStyle == StrokeStyle.OPEN_RECT)
        {
            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.drawRect(fPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.drawRect(sPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.drawRect(sPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.drawRect(fPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }
        }
        if (strokeStyle == StrokeStyle.FILL_RECT)
        {
            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.fillRect(fPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.fillRect(sPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.fillRect(sPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.fillRect(fPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }
        }
    }
}
