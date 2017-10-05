/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboardcontrols;

import whiteboardapplication.*;
import whiteboardtools.*;

import javax.swing.*;
import java.awt.*;

public abstract class ToolOptionPanel extends JPanel 
{
    Tool tool;
    Color color;
    
    public ToolOptionPanel(Tool tool)
    {
        this.tool = tool;
        
        setPreferredSize(new Dimension(150,220));
        setBackground(Color.gray);
    }

    public void setColor(Color clr)
    {
        color = clr;
    }
    public Color getColor()
    {
        return color; 
    }
}
