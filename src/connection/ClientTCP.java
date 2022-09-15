// Cliente

package connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientTCP {
    
    private Socket connection = null;
    private DataOutputStream sendToServer = null;
    private DataInputStream receiveFromServer = null;
    
    public ClientTCP(String ipServer, int serverDoor) throws Exception, IOException {
        connection = new Socket(ipServer, serverDoor);
        sendToServer = new DataOutputStream(connection.getOutputStream());
        receiveFromServer = new DataInputStream(connection.getInputStream());
    }
    
    public void sendData(String data) throws IOException {
        sendToServer.writeUTF(data);
        sendToServer.flush();
    }
    
    public String receiveData() throws IOException {
        return receiveFromServer.readUTF();
    }
}
