/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardshapetools;

import java.awt.*;

import whiteboardtools.*;

public class LineTool extends DragTool
{
    public LineTool(Color clr, int dim, StrokeStyle style)
    {
        super(clr, dim);
        strokeStyle = style;
    }
}
