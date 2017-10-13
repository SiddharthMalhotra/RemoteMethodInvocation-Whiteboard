/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unimelb.distributedsystems.whiteboard.client.utils;

import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel
{
    public ColorPanel(Color clr)
    {
        setBackground(clr);
    }

    public ColorPanel(Color clr, int x, int y)
    {
        setBackground(clr);
        setPreferredSize(new Dimension(x, y));
    }
}
