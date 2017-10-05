/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardshapetools;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import whiteboardtools.StrokeStyle;

public class WriterElement extends DragElement
{
	Point pt1;
	Point pt2;
	StringBuffer writeString = new StringBuffer();
	int dim;
	Dimension maxPanelDim;
    
	public WriterElement(Color clr, Point pt1, Point pt2, int dim, StrokeStyle style, Dimension maxPanelDim)
    {
        super(clr, pt1, pt2, dim, style);
        this.pt1=pt1;
        this.pt2=pt2;
        this.dim=dim;
        this.maxPanelDim = maxPanelDim;
    }
    

    @Override
    public void update(Graphics g)
    {
    	int maxLength = (int)pt2.getX() - (int)pt1.getX();
    	int startY= (int)pt1.getY();
    	ArrayList<String> StringLines = new ArrayList<String>();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font(Font.SERIF, Font.PLAIN, dim));
        g2d.setColor(color);
        String lines[] = writeString.toString().split("\\r?\\n");
        for (String string : lines) {
        	if(string.length() * (dim/2) >= maxPanelDim.getWidth()){
        			addLinebreaks(string, maxPanelDim.width, StringLines, dim,pt1.x);       		
        	}else{      
        		StringLines.add(string);
        	}
		}
        
        for (String string : StringLines) {
        	g2d.drawString(string, (int)pt1.getX(), startY);	
    		startY = startY + dim; 
		}
        
    }
    
    public void addLinebreaks(String input, int maxLineLength, ArrayList<String> list, int fontSize, int initPoint) {
    	StringBuffer sb = new StringBuffer();
        int lineLen = 0;
        for (int i = 0; i < input.length(); i++) {
        	if((sb.toString().length()*(dim/2) + ((initPoint * (dim/2)))- maxLineLength)  >= maxLineLength){
        		list.add(sb.toString());
        		sb = new StringBuffer();
        	}else{
        		sb.append(input.charAt(i));        		
        	}
		}
        list.add(sb.toString());
        
//        String lines[] = output.toString().split("\\r?\\n");
//        for (String string : lines) {
//        	list.add(string);
//		}
    }
    
    public void setWriteString(char c) {
    	if(c == '\b'){  
    		if(!this.writeString.toString().isEmpty()){
    			if(this.writeString.length() > 1)
    				writeString.deleteCharAt(writeString.length()-1);
    			else
    				this.writeString = new StringBuffer();
    		}
    	}else if ((c >= 48 && c <=57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == ' ') || (c == '\n')){
    		writeString.append(c);    		
    	}
    		
	}
}
