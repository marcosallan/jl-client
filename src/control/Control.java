//Cliente

package control;

import models.Manipulation;
import connection.ClientTCP;
import java.io.IOException;

public class Control {
    private ClientTCP connection = null;
    
    public Control() throws IOException, Exception {
        connection = new ClientTCP("127.0.0.1", 5000);
    }
    
    public void includeData(Object object, Operation operation) throws Exception {
        try {
            String strToServer = object.getClass().getSimpleName() + "#" + operation + "#";
            Manipulation data = (Manipulation) object;
            strToServer += data.dismount();
            connection.sendData(strToServer);
        }
        catch (IOException e) {
            throw e;
        }
    }
    
    public String[] receiveFromServer(Object object, Operation operation) throws Exception {
        try {
            String strToServer = object.getClass().getSimpleName() + "#" + operation + "#";
            strToServer += " ";
            connection.sendData(strToServer);
            String strFromServer = connection.receiveData();
            String[] vectStr = strFromServer.split("\n");
            return vectStr;
        }
        catch (IOException e) {
            throw e;
        }
    }
    
    public void updateData(Object object, Operation operation) throws Exception {
        includeData(object, operation);
    }
}
