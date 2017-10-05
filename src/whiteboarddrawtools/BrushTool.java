/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboarddrawtools;

import whiteboardtools.StrokeStyle;

import java.awt.*;

import whiteboardcontrols.*;

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
