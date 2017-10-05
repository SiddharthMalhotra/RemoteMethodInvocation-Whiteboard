package whiteboardapplication;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
	public static void main(String[] args) {

		int port = 3000;
		if (args.length > 0) {
			try {
				port = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Argument " + args[0] + " must be an integer.");
				System.exit(1);
			}
		}

		try {
			Registry registry = LocateRegistry.createRegistry(port);
			IWhiteboardCommunication paint = new WhiteboardCommunication();
			IWhiteboardCommunication stub = (IWhiteboardCommunication) UnicastRemoteObject.exportObject(paint,0);
			registry.rebind("Whiteboard", paint);
			System.out.println("Whiteboard server ready: Port " + port);
		} catch (RemoteException e) {
			System.out.println("Whiteboard server main " + e.getMessage());
		}

	}
}
