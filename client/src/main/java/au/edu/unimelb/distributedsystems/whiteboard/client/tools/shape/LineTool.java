/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.unimelb.distributedsystems.whiteboard.client.tools.shape;

import au.edu.unimelb.distributedsystems.whiteboard.client.tools.StrokeStyle;

import java.awt.*;

public class LineTool extends DragTool
{
    public LineTool(Color clr, int dim, StrokeStyle style)
    {
        super(clr, dim);
        strokeStyle = style;
    }
}
