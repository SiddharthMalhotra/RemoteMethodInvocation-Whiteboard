/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unimelb.distributedsystems.whiteboard.client.controls;

import au.edu.unimelb.distributedsystems.whiteboard.client.app.Client;
import au.edu.unimelb.distributedsystems.whiteboard.client.tools.StrokeStyle;
import au.edu.unimelb.distributedsystems.whiteboard.client.tools.Tool;
import au.edu.unimelb.distributedsystems.whiteboard.client.visuals.ToolOptionIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BrushToolPanel extends PencilToolPanel
{
    protected JButton[] strokeStyles; 
    
    protected ToolOptionIcon[] styleIcons;

    protected ButtonHandler handler;

    protected JPanel buttonHolder;

    public BrushToolPanel(Tool tool, int stroke)
    {
        super(tool, stroke);

        setLayout(new FlowLayout());
        
        strokeStyles = new JButton[3];

        styleIcons = new ToolOptionIcon[3];
        
        styleIcons[0] = new ToolOptionIcon(StrokeStyle.DOT_CIRC);
        styleIcons[1] = new ToolOptionIcon(StrokeStyle.DOT_RECT);
        styleIcons[2] = new ToolOptionIcon(StrokeStyle.LINE);

        handler = new ButtonHandler();

        buttonHolder = new JPanel();
        buttonHolder.setBackground(Color.gray);
        buttonHolder.setPreferredSize(new Dimension(80, 80));
        buttonHolder.setLayout(new GridLayout(3, 1));

        for(int i=0; i<strokeStyles.length; i++)
        {   
            strokeStyles[i] = new JButton();
            strokeStyles[i].addActionListener(handler);
            strokeStyles[i].add(styleIcons[i]);
            buttonHolder.add(strokeStyles[i]);
        }
        add(buttonHolder);
    }

    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            for(int i=0; i<strokeStyles.length; i++)
            {   
                if (event.getSource() == strokeStyles[i])
                {
                    Client.paint.drawPanel.tool.setStrokeStyle(strokeStyleList[i]);
                    showStroke.setStyle ( Client.paint.drawPanel.tool.getStrokeStyle() );
                    repaint();
                    System.out.println("Style clicked: "+strokeStyleList[i]);
                }
            }
        }
    }
}
