/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardtools;

import java.awt.*;
import java.io.*;

public class AbstractTool implements Serializable
{
    protected Point pPoint;
    protected Point cPoint;

    protected StrokeStyle strokeStyle;
    protected int         strokeWidth;

    protected boolean isDrawing;

    protected Color color; 

    public AbstractTool(Color clr, int dim)
    {
        color = clr;
        strokeWidth = dim;
    }
   
    public void setPPoint(Point pt)
    {
        pPoint = pt;
    }

    public Point getPPoint()
    {
        return pPoint;
    }

    public void setCPoint(Point pt)
    {
        cPoint = pt;
    }

    public Point getCPoint()
    {
        return cPoint;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color clr)
    {
        color = clr; 
    }

    public StrokeStyle getStrokeStyle()
    {
        return strokeStyle;
    }

    public void setStrokeStyle(StrokeStyle style)
    {
        strokeStyle = style;
    }

    public void setStrokeWidth(int dim)
    {
        strokeWidth = dim;
    }

    public boolean isDrawing()
    {
        return isDrawing;
    }

    public void setDrawing(boolean b)
    {
        isDrawing = b;
    }

    public int getStroke()
    {
        return strokeWidth;
    }

}
