

package whiteboardcontrols;

import whiteboardapplication.*;
import whiteboardtools.Tool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToolButton extends JButton implements ActionListener
{
    boolean hover;
    boolean selected;

    JLabel label;
    Tool tool;

    public ToolButton(String text, Tool tool)
    {
        label = new JLabel(text);
        add(label);
        this.tool = tool;
        addActionListener(this);
    }

    public ToolButton(Icon icon, Tool tool)
    {
        label = new JLabel(icon);
        this.setLayout(new BorderLayout());
        add(label);
        this.tool = tool;
        addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        Client.paint.drawPanel.setTool(tool);
        System.out.println("Your Tool has been changed to "+this.tool);
        Client.paint.repaint();
    }
}
