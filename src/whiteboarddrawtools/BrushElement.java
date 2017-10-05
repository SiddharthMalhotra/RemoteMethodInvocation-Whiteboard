
package whiteboarddrawtools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import whiteboardtools.PaintTool;
import whiteboardtools.StrokeStyle;

import java.awt.*;
import java.awt.Graphics2D;

public class BrushElement extends PencilElement
{
    
    public BrushElement(Point pt, Color clr, int dim, StrokeStyle style)
    {
        super(pt, clr, dim, style);
        setStrokeWidth(dim);
    }
    
    public BrushElement(Point pt1, Point pt2, Color clr, int dim, StrokeStyle style)
    {
        super(pt1, clr, dim, style);
        setStrokeWidth(dim);
        
        previousPt = pt2;
    }
    
    public BrushElement()
    {
        super();
    }
    
    @Override
    public void update(Graphics g)
    {
        if (strokeStyle == StrokeStyle.DOT_CIRC)
        {
            g.setColor(getColor());
            g.fillOval(getCoors().x, getCoors().y, strokeWidth+1, strokeWidth+1);
            g.drawOval(getCoors().x, getCoors().y, strokeWidth, strokeWidth);
        }
        if ( strokeStyle == StrokeStyle.DOT_RECT)
        {
            g.setColor(getColor());
            g.fillRect(getCoors().x, getCoors().y, strokeWidth+1, strokeWidth+1);
            g.drawRect(getCoors().x, getCoors().y, strokeWidth, strokeWidth);
        }
        if ( strokeStyle == StrokeStyle.LINE)
        {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setPaint(color);
            g2d.setStroke(new BasicStroke(strokeWidth,
                              BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2d.drawLine(coors.x, coors.y, previousPt.x, previousPt.y);
            g2d.setStroke(new BasicStroke(1));
        }
    }
}