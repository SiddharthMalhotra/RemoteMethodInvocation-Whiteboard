/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardshapetools;

import java.awt.*;

import whiteboardtools.*;

public class RoundRectTool extends RectangleTool
{
    public RoundRectTool (Color clr, int dim)
    {
        super(clr, dim);
        strokeStyle = StrokeStyle.OPEN_ROUND_RECT;
    }
}
