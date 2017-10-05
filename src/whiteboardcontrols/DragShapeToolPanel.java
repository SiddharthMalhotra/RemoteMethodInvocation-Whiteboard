/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardcontrols;

import whiteboardvisuals.*;

import java.awt.*;

import whiteboardtools.*; 

public class DragShapeToolPanel extends BrushToolPanel
{
    public DragShapeToolPanel(Tool tool, int stroke)
    {
        super(tool, stroke);
        buttonHolder.remove(strokeStyles[0]);

        buttonHolder.setLayout(new GridLayout(2, 1));
        buttonHolder.setPreferredSize(new Dimension(100, 92));

        buttonHolder.remove(strokeStyles[1]);
        buttonHolder.remove(strokeStyles[2]);

        strokeStyles[1].remove(styleIcons[1]);
        styleIcons[1] = new ToolOptionIcon(StrokeStyle.LINE_DASHED);
        strokeStyles[1].add(styleIcons[1]);
        
        buttonHolder.add(strokeStyles[2]);
        buttonHolder.add(strokeStyles[1]);
    }
}
