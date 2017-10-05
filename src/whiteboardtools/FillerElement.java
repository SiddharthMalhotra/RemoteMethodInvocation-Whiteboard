/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardtools;

import whiteboardapplication.Client;
import whiteboarddrawtools.PaintElement;

import java.awt.Graphics;
import java.awt.Color;

public class FillerElement extends PaintElement
{
    public FillerElement(Color clr)
    {
        super(clr);
    }

    @Override
    public void update(Graphics g)
    {
        Client.paint.drawPanel.setBackground(color);
        Client.paint.drawPanel.backgroundColor = color;
        Client.paint.drawPanel.repaint();
    }
}
