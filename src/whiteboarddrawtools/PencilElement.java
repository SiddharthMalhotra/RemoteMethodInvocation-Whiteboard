
package whiteboarddrawtools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Point;

import whiteboardtools.StrokeStyle;

public class PencilElement extends PaintElement
{
    Point previousPt;

    public PencilElement(Point pt, Color clr, int dim, StrokeStyle style)
    {
        super(pt, clr, dim, style);
        setStrokeWidth(dim);
    }

    public PencilElement(Point pt1, Point pt2, Color clr, int dim)
    {
        super(pt1, clr, dim);
        setStrokeWidth(dim);

        previousPt = pt2;
    }

    public PencilElement(Point pt1, Color clr, int dim)
    {
        super(pt1, clr, dim);
        setStrokeWidth(dim); 
    }

    public PencilElement()
    {
        super();
    }

    @Override
    public void update(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(color);
        g2d.setStroke(new BasicStroke(strokeWidth,
                          BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawLine(coors.x, coors.y, previousPt.x, previousPt.y);
        g2d.setStroke(new BasicStroke(1));
    }
}

/*
 *         g.setColor(getColor());
        for(int i= -1*strokeWidth/2; i < strokeWidth/2; i++)
        {
            g.drawLine(coors.x, coors.y, previousPt.x+i, previousPt.y-i);
        }
 */