import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MonServiceRMIImpl extends UnicastRemoteObject implements MonServiceRMI {
    protected MonServiceRMIImpl() throws RemoteException {
        super();
    }

    @Override
    public String effectuerTraitement(String input) throws RemoteException {
        // Implémentez votre traitement ici
        return "Traitement effectué : " + input;
    }

    @Override
    public String convertirChaine(String input) throws RemoteException {
        // Implémentez la logique de conversion de chaîne ici
        return "Chaine convertie : " + input.toUpperCase(); // Exemple de conversion (toutes les lettres en majuscules)
    }

    @Override
    public String inverserChaine(String input) throws RemoteException {
        // Implémentez la logique d'inversion de chaîne ici
        StringBuilder reversed = new StringBuilder(input).reverse();
        return "Chaine inversée : " + reversed.toString();
    }
}
