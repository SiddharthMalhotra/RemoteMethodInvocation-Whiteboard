
package whiteboardshapetools;

import java.awt.*;

import whiteboardtools.*;

public class OvalElement extends DragElement
{
    public OvalElement(Color clr, Point pt1, Point pt2, int dim, StrokeStyle style)
    {
        super(clr, pt1, pt2, dim, style);
    }

    @Override
    public void update(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(color);
        g2d.setStroke(new BasicStroke(strokeWidth,
                          BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        if (strokeStyle == StrokeStyle.OPEN_OVAL)
        {
            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.drawOval(fPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.drawOval(sPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.drawOval(sPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.drawOval(fPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }
        }
        if (strokeStyle == StrokeStyle.FILL_OVAL)
        {
            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.fillOval(fPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y < 0)) )
            {
                g2d.fillOval(sPoint.x, fPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) > 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.fillOval(sPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }

            if ( ((fPoint.x-sPoint.x) < 0) && ((fPoint.y-sPoint.y > 0)) )
            {
                g2d.fillOval(fPoint.x, sPoint.y, Math.abs(fPoint.x-sPoint.x),
                                                 Math.abs(fPoint.y-sPoint.y));
            }
        }
    }
}

