package network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class Server extends Network {

	public void listen(int port) {
		boolean success = false;

		while (!success) {
			try {
				serverSock = new ServerSocket(port);
				serverSock.setReuseAddress(true);
				sock = serverSock.accept(); // wait for client to connect
				success = true;

				os = new BufferedOutputStream(sock.getOutputStream());
				is = new BufferedInputStream(sock.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // create socket and bind to port
		}

	}
}
