package whiteboardapplication;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IWhiteboardCommunication extends Remote{

	public void sendMessage(String s) throws RemoteException;
}
