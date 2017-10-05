/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboardtools;

import java.awt.*;

import whiteboarddrawtools.PaintElement;
import whiteboardtools.AbstractTool;
import whiteboardtools.StrokeStyle;


public abstract class PaintTool extends AbstractTool
{   
    protected PaintElement element; 

    public PaintTool(Color clr, int dim)
    {
        super(clr, dim);
        
        isDrawing = false;
    }
    
    public PaintElement getElement()
    {
        return element; 
    }

    public abstract void drawElement(Graphics g);
}
