/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.unimelb.distributedsystems.whiteboard.client.tools.shape;

import au.edu.unimelb.distributedsystems.whiteboard.client.tools.StrokeStyle;
import au.edu.unimelb.distributedsystems.whiteboard.client.tools.draw.PaintElement;

import java.awt.*;

public abstract class DragElement extends PaintElement
{
    protected Point sPoint;
    protected Point fPoint;

    public DragElement(Color clr, Point pt1, Point pt2, int dim, StrokeStyle style)
    {
        super(clr, dim, style);
        
        sPoint = pt1;
        fPoint = pt2;
    }

    public Point getSPoint()
    {
        return sPoint;
    }

    public Point getFPoint()
    {
        return fPoint; 
    }

    public abstract void update(Graphics g);
}