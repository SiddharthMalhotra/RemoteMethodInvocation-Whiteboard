/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unimelb.distributedsystems.whiteboard.client.tools;

import au.edu.unimelb.distributedsystems.whiteboard.client.tools.draw.PaintElement;

import java.awt.*;


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
