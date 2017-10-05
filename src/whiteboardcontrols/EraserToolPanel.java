/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardcontrols;

import whiteboardvisuals.*;
import whiteboardtools.*;

import java.awt.*;
import javax.swing.*;

import whiteboarddrawtools.*;

public class EraserToolPanel extends BrushToolPanel
{
    public EraserToolPanel(Tool tool, int stroke)
    {
        super(tool, stroke);
                
        strokeSlider.setMaximum(64);
        strokeSlider.setMinimum(1);
        strokeSlider.setMajorTickSpacing(4);

        remove(buttonHolder);

        strokeStyles = new JButton[2];
        styleIcons = new ToolOptionIcon[2];

        styleIcons[0] = new ToolOptionIcon(StrokeStyle.CIRCLE);
        styleIcons[1] = new ToolOptionIcon(StrokeStyle.SQUARE);

        JPanel buttonHolder = new JPanel();
        buttonHolder.setBackground(Color.gray);
        buttonHolder.setLayout(new GridLayout(1, 2));
        buttonHolder.setPreferredSize(new Dimension(140, 64));

        for(int i=0; i<strokeStyles.length; i++)
        {
            strokeStyles[i] = new JButton();
            strokeStyles[i].setPreferredSize(new Dimension(150, 150));
            strokeStyles[i].addActionListener(handler);
            strokeStyles[i].add(styleIcons[i]);
            buttonHolder.add(strokeStyles[i]);
        }
        add(buttonHolder);
    }
}
