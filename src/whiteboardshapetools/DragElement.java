/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardshapetools;

import whiteboardtools.*;

import java.awt.*;

import whiteboarddrawtools.*;

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