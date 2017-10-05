package whiteboardapplication;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class WhiteboardCommunication implements IWhiteboardCommunication {

	protected WhiteboardCommunication() throws RemoteException {

	}

	public void sendMessage(String s) throws RemoteException{
        System.out.printf("Message from %s: %s", s);
    }
}
