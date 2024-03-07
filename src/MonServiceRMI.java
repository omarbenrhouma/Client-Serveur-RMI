import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MonServiceRMI extends Remote {
    String effectuerTraitement(String input) throws RemoteException;
    String convertirChaine(String input) throws RemoteException;
    String inverserChaine(String input) throws RemoteException;
}
