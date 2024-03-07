import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRMI {
    public static void main(String[] args) {
        try {
            // Création du registre RMI
            Registry registry = LocateRegistry.createRegistry(1099);

            // Création de l'objet du service RMI
            MonServiceRMI monService = new MonServiceRMIImpl();

            // Enregistrement du service dans le registre
            registry.rebind("MonServiceRMI", monService);

            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            System.err.println("Erreur lors de la création du serveur RMI : " + e.getMessage());
        }
    }
}
