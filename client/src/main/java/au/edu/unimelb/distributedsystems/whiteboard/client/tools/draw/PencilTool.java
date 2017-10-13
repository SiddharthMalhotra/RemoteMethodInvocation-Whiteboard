/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unimelb.distributedsystems.whiteboard.client.tools.draw;

import au.edu.unimelb.distributedsystems.whiteboard.client.tools.PaintTool;

import java.awt.*;


public class PencilTool extends PaintTool
{
    public PencilTool(Color clr, int dim)
    {
        super(clr, dim);
        element = new PencilElement();
        strokeWidth = dim;
        isDrawing   = false;
    }
    
    @Override
    public void drawElement(Graphics g)
    {
        element.update(g);
    }
}
