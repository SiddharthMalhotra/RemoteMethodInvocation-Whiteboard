/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unimelb.distributedsystems.whiteboard.client.app;

import au.edu.unimelb.distributedsystems.whiteboard.client.tools.FillerElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class PaintMenuBar extends JMenuBar 
{
    JMenu file;
        JMenuItem closeWhiteboard;
        JMenuItem newWhiteboard;
        JMenuItem openWhiteboard;
        JMenuItem saveWhiteboard; 
        JMenuItem saveAsWhiteboard;

    PaintMenuBar()
    {
        ItemHandler itemHandler = new ItemHandler();

        file   = new JMenu("File");

        newWhiteboard = new JMenuItem("New");
        openWhiteboard = new JMenuItem("Open");
        saveWhiteboard = new JMenuItem("Save");
        saveAsWhiteboard = new JMenuItem("Save As");
        closeWhiteboard = new JMenuItem("Close");

        newWhiteboard.addActionListener(itemHandler);
        openWhiteboard.addActionListener(itemHandler);
        saveWhiteboard.addActionListener(itemHandler);
        saveAsWhiteboard.addActionListener(itemHandler);
        closeWhiteboard.addActionListener(itemHandler);

        file.add(newWhiteboard);
        file.add(openWhiteboard);
        file.add(saveWhiteboard);
        file.add(saveAsWhiteboard);
        file.addSeparator();
        file.add(closeWhiteboard);
        add(file);
    }

    private class ItemHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if ( event.getSource() == closeWhiteboard)
            {
                Client.paint.dispose();
                System.exit(0); 
            }

            if ( event.getSource() == newWhiteboard )
            {
            	Client.paint.drawPanel.elements = new ArrayList();
            	Client.paint.drawPanel.elements.add(new FillerElement(Color.white));
            }

            if ( event.getSource() == saveWhiteboard )
            {
            	Client.paint.saveFile();
            }
            
            if ( event.getSource() == saveAsWhiteboard )
            {
            	Client.paint.saveAsFile();
            }

            if ( event.getSource() == openWhiteboard )
            {
                File fileName = Client.paint.getFileName();
                Client.paint.loadFile(fileName);
                Client.paint.loadElementsFromFile();
                Client.paint.closeFile();
            }
            Client.paint.repaint();
            setFocusable(false);
        }
    }
}