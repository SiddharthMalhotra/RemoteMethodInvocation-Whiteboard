/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardshapetools;

import java.awt.*;

import whiteboardtools.*;

public class LineElement extends DragElement
{
    public LineElement(Color clr, Point pt1, Point pt2, int dim, StrokeStyle style)
    {
        super(clr, pt1, pt2, dim, style);
        strokeStyle = style; 
    }

    @Override
    public void update(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(color);
        g2d.setStroke(new BasicStroke(strokeWidth,
                          BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        switch(strokeStyle)
        {
            case LINE:
            {
                g.drawLine(sPoint.x, sPoint.y, fPoint.x, fPoint.y);
                break;
            }
            case DOT_RECT:
            {
                //double dash = Math.sqrt(((sPoint.x-fPoint.x)*(sPoint.x-fPoint.x)+(sPoint.y-fPoint.y)*(sPoint.y-fPoint.y)));
                //float[] dashes = {(float)dash/20};
                float[] dashes = {24};
                g2d.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND ,
                                                           BasicStroke.JOIN_ROUND, 32, dashes, 0));
                g.drawLine(sPoint.x, sPoint.y, fPoint.x, fPoint.y);
                break;
            }
        }
    }
}
