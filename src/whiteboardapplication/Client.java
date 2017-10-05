/*
 * Paint Launcher
 */
package whiteboardapplication;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client 
{
    public static PaintApplication paint; 
    
    public static void main(String[] args) 
    {
    	// Default values for host and port number.
    			String host = "localhost";
    			int portNo = 3000;
    			IWhiteboardCommunication iWhiteboardCommunication = null;
    			
    			if(args.length > 0){
    				host = args[0];
    				portNo = Integer.parseInt(args[1]);
    	        }
    			
    			try {
    			Registry registry = LocateRegistry.getRegistry(host, portNo);
    			iWhiteboardCommunication = (IWhiteboardCommunication) registry.lookup("Whiteboard");
    	        System.out.println("Found server");

    	        paint = new PaintApplication();
    			}catch(Exception e) {
    				e.printStackTrace();
    			}
        
    }
}
