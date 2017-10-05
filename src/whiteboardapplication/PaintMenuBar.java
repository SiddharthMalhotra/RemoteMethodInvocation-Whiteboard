/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whiteboardapplication;

import javax.swing.*; 
import java.awt.*; 
import javax.swing.event.*;

import whiteboardtools.*;

import java.awt.event.*;
import java.util.ArrayList; 
import java.io.*;

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
        PaintMenuBar.ItemHandler itemHandler = new PaintMenuBar.ItemHandler();

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
            	Client.paint.saveFile();
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