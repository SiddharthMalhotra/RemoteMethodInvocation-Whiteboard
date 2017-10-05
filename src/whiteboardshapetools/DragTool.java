/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardshapetools;

import java.awt.*;

import whiteboardtools.*;

public abstract class DragTool extends AbstractTool
{
    Point sPoint;
    Point fPoint;

    boolean finished;

    DragElement element; 
    
    public DragTool(Color clr, int dim)
    {
        super(clr, dim);
        finished = false;
    }
    public Point getSPoint()
    {
        return sPoint;
    }

    public void setSPoint(Point pt)
    {
        sPoint  = pt;
    }

    public Point getFPoint()
    {
        return fPoint;
    }

    public void setFPoint(Point pt)
    {
        fPoint  = pt;
    }

    public DragElement getElement()
    {
        return element; 
    }

    public void setElement(DragElement element)
    {
        this.element = element;
    }

    public void setColor(Color clr)
    {
        color = clr;
    }
    
}
