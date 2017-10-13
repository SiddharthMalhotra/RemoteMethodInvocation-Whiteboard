package au.edu.unimelb.distributedsystems.whiteboard.server;

import java.rmi.RemoteException;

public class WhiteboardCommunication implements IWhiteboardCommunication {

	protected WhiteboardCommunication() throws RemoteException {

	}

	public void sendMessage(String s) throws RemoteException{
        System.out.printf("Message from %s: %s", s);
    }
}
