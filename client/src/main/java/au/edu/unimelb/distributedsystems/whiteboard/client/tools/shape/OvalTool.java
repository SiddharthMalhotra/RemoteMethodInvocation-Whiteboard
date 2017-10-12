/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.unimelb.distributedsystems.whiteboard.client.tools.shape;

import au.edu.unimelb.distributedsystems.whiteboard.client.tools.StrokeStyle;

import java.awt.*;

public class OvalTool extends DragTool
{
    public OvalTool(Color clr, int dim)
    {
        super(clr, dim);
        strokeStyle = StrokeStyle.OPEN_OVAL;
    }
}
