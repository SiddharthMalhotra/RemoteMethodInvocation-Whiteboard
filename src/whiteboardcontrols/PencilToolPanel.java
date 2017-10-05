/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboardcontrols;

import whiteboardapplication.*;
import whiteboarddrawtools.*;
import whiteboardtools.*;
import whiteboardutilities.*;
import whiteboardvisuals.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class PencilToolPanel extends ToolOptionPanel
{

    public StrokeStyle[] strokeStyleList ={StrokeStyle.DOT_CIRC, StrokeStyle.DOT_RECT,
                                           StrokeStyle.LINE,     StrokeStyle.TRIANGLE,
                                           StrokeStyle.RIBBON };
    protected JSlider strokeSlider;

    protected JPanel showStrokePanel;

    protected StrokePanel showStroke;

    public PencilToolPanel(Tool tool, int stroke)
    {
        super(tool);

        setLayout(new FlowLayout());

        strokeSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 20, 1);
        strokeSlider.setPaintTicks(false);
        strokeSlider.setMaximum(20);
        strokeSlider.setMinimum(1);
        strokeSlider.setMajorTickSpacing(1);

        strokeSlider.setValue(stroke);
        strokeSlider.revalidate();

        SlideChangeListener listener = new SlideChangeListener();
        strokeSlider.addChangeListener(listener);

        for(int i=0; i<3; i++)
        {
       //     styleIcons[i] = new ImageIcon(getClass().getResource("style"+(i+1)+".png"));
        }

        showStroke = new StrokePanel();
        showStrokePanel = new JPanel();
        showStrokePanel.setPreferredSize(new Dimension(62, 72));
        showStrokePanel.setLayout(new FlowLayout());
        showStrokePanel.add(showStroke, BorderLayout.CENTER);

        add(showStrokePanel);
        add(strokeSlider);
    }

    private class SlideChangeListener implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent event)
        {
            Client.paint.drawPanel.tool.setStrokeWidth(strokeSlider.getValue());
            repaint();
            //System.out.println("Tool: "+Client.paint.drawPanel.tool+"  - - Stroke: "+ Client.paint.drawPanel.tool.getStroke());
        }
    }
}


/* To add in ribbon and Triangle
/*
    protected JButton[] strokeStyles;

    private ToolOptionIcon[] styleIcons;

    public BrushToolPanel(Tool tool)
    {
        super(tool);

        setLayout(new FlowLayout());

        strokeStyles = new JButton[3];

        styleIcons = new ToolOptionIcon[3];

        styleIcons[0] = new ToolOptionIcon(StrokeStyle.DOT_CIRC);
        styleIcons[1] = new ToolOptionIcon(StrokeStyle.DOT_RECT);
        styleIcons[2] = new ToolOptionIcon(StrokeStyle.LINE);

        ButtonHandler handler = new ButtonHandler();

        JPanel buttonHolder = new JPanel();
        buttonHolder.setBackground(Color.gray);
        buttonHolder.setPreferredSize(new Dimension(100, 100));
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
                    Main.paint.drawPanel.tool.setStrokeStyle(strokeStyleList[i]);
                    System.out.println("Style clicked: "+strokeStyleList[i]);
                }
            }
        }
    }
    */