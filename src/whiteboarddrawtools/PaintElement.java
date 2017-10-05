/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboarddrawtools;

import java.awt.*;
import java.io.Serializable;

import whiteboardtools.StrokeStyle;

public abstract class PaintElement implements Serializable
{
    protected Point coors; 
    protected Color color;
    
    protected StrokeStyle strokeStyle; 
    
    protected int strokeWidth;
    
    public PaintElement(Point pt, Color clr, int dim, StrokeStyle style)
    {
        coors = pt ;
        color = clr;
        
        strokeStyle = style; 
        strokeWidth = dim;
    }

    public PaintElement(Point pt, Color clr, int dim)
    {
        coors = pt ;
        color = clr;

        strokeWidth = dim;
        strokeStyle = StrokeStyle.FILL_RECT;
    }

    public PaintElement(Color clr, int dim, StrokeStyle style)
    {
        color  = clr;
        strokeWidth = dim;
        strokeStyle = style; 
    }

    public PaintElement(Color clr)
    {
        color = clr; 
    }
    
    public PaintElement()
    {
        
    }
    
    public Point getCoors()
    {
        return coors;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setColor(Color clr)
    {
        color = clr;
    }
    
    public int getStroke()
    {
        return strokeWidth;
    }
    
    public void setStrokeWidth(int str)
    {
        strokeWidth = str;
    }
    
    public StrokeStyle getStrokeStyle()
    {
        return strokeStyle; 
    }
    
    public void setStrokeStyle(StrokeStyle style)
    {
        strokeStyle = style; 
    }
    
    public abstract void update(Graphics g);
}
