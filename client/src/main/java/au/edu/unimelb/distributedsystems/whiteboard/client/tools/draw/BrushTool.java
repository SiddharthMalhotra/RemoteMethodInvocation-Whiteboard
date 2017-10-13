/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.unimelb.distributedsystems.whiteboard.client.tools.draw;

import au.edu.unimelb.distributedsystems.whiteboard.client.tools.StrokeStyle;

import java.awt.*;

public class BrushTool extends PencilTool
{
    public BrushTool(Color clr, int dim, StrokeStyle style)
    {
        super(clr, dim);

        strokeStyle = style;

        element = new BrushElement();
    }

    @Override
    public void drawElement(Graphics g)
    {
        element.update(g);
    }
}
