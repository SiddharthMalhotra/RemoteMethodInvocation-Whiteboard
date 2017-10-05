/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboardcontrols;

import whiteboardutilities.*;
import whiteboardvisuals.*;

import javax.swing.*;

import whiteboardtools.Tool;

import java.awt.*;
import java.awt.event.*;

public class PaintToolPanel extends JPanel
{
    protected ToolButton[] buttons;
    
    public ToolOptionPanel toolOptionPanel; 
    
    public PaintToolPanel(ToolOptionPanel toolOptionPanel)
    {
        setBackground   (Color.gray           );
        setPreferredSize(new Dimension   (182,0));
        setLayout       (new BorderLayout( 8,   8 ));
        
        JPanel toolPanel =  new JPanel(        );
        toolPanel.setLayout(new GridLayout(5,2));
        toolPanel.setBackground(Color.gray );
        toolPanel.setPreferredSize(new Dimension(292,350));
        
        this.toolOptionPanel = toolOptionPanel;

        buttons = new ToolButton[7];

        Icon[] icons = new ImageIcon[7];
        String[] names = {"pencil.png", "eraser.png"};
        for(int i=0; i<icons.length; i++)
        {

        }
        Icon pencil      = new ImageIcon(getClass().getResource("pencil.png"));
        Icon eraser      = new ImageIcon(getClass().getResource("eraser.png"));
        Icon rectangle   = new ImageIcon(getClass().getResource("rectangle.png"));
        Icon oval        = new ImageIcon(getClass().getResource("oval.png"));
        Icon polygon     = new ImageIcon(getClass().getResource("rounded_rectangle.png"));
        Icon lineTool    = new ImageIcon(getClass().getResource("line.png"));
        Icon writeTool    = new ImageIcon(getClass().getResource("write.png"));

        buttons[0] = new ToolButton(pencil, Tool.PENCIL);
        buttons[1] = new ToolButton(eraser, Tool.ERASER);
        buttons[2] = new ToolButton(rectangle, Tool.RECTANGLE);
        buttons[3] = new ToolButton(oval, Tool.OVAL);
        buttons[4] = new ToolButton(lineTool, Tool.LINE);
        buttons[5] = new ToolButton(polygon, Tool.ROUND_RECT);
        buttons[6] = new ToolButton(writeTool, Tool.WRITER);

        for(int i=0; i<buttons.length; i++)
        {
            toolPanel.add(buttons[i]);
        }

        add(toolPanel, BorderLayout.NORTH);
        add(toolOptionPanel, BorderLayout.SOUTH);

    }
    
    public void setToolOptionPanel (ToolOptionPanel panel)
    {
        this.remove(toolOptionPanel);
        toolOptionPanel = panel;
        add(toolOptionPanel, BorderLayout.SOUTH);
        revalidate();
        repaint();
    }
}
