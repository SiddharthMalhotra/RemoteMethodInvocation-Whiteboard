/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unimelb.distributedsystems.whiteboard.client.controls;

import au.edu.unimelb.distributedsystems.whiteboard.client.tools.Tool;

import javax.swing.*;
import java.awt.*;

public class PaintToolPanel extends JPanel
{
    protected ToolButton[] buttons;

    private static final String BASE_DIR = "client/src/main/resources/";
    private static final String ICON_PENCIL = BASE_DIR+"pencil.png";
    private static final String ICON_ERASER = BASE_DIR+"eraser.png";
    private static final String ICON_RECTANGLE = BASE_DIR+"rectangle.png";
    private static final String ICON_OVAL = BASE_DIR+"oval.png";
    private static final String ICON_LINE = BASE_DIR+"line.png";
    private static final String ICON_ROUNDED_RECT = BASE_DIR+"rounded_rectangle.png";
    private static final String ICON_WRITE = BASE_DIR+"write.png";

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

        Icon pencil      = new ImageIcon(ICON_PENCIL);
        Icon eraser      = new ImageIcon(ICON_ERASER);
        Icon rectangle   = new ImageIcon(ICON_RECTANGLE);
        Icon oval        = new ImageIcon(ICON_OVAL);
        Icon roundedRectangle     = new ImageIcon(ICON_ROUNDED_RECT);
        Icon lineTool    = new ImageIcon(ICON_LINE);
        Icon writeTool    = new ImageIcon(ICON_WRITE);

        buttons[0] = new ToolButton(pencil, Tool.PENCIL);
        buttons[1] = new ToolButton(eraser, Tool.ERASER);
        buttons[2] = new ToolButton(rectangle, Tool.RECTANGLE);
        buttons[3] = new ToolButton(oval, Tool.OVAL);
        buttons[4] = new ToolButton(lineTool, Tool.LINE);
        buttons[5] = new ToolButton(roundedRectangle, Tool.ROUND_RECT);
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
