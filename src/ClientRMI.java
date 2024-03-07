import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            // Obtention du registre RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Récupération du service RMI distant
            MonServiceRMI monService = (MonServiceRMI) registry.lookup("MonServiceRMI");

            // Appel de la méthode d'inversion de chaîne
            String chaineInversee = monService.inverserChaine("test");

            // Affichage du résultat de l'inversion de chaîne
            System.out.println("Résultat de l'inversion de chaîne : " + chaineInversee);
        } catch (Exception e) {
            System.err.println("Erreur lors de l'appel du service RMI : " + e.getMessage());
        }
    }
}
