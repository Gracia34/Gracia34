import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
class ParcVehicules {
    private Map<Integer, Vehicule> vehicules;
    public ParcVehicules() {
        this.vehicules = new HashMap<>();
    }
    public void ajouterVehicule(Vehicule v) {
        vehicules.put(v.getId(), v);
    }
    public void supprimerVehicule(int id) {
        vehicules.remove(id);
    }
    public void modifierVehicule(int id, Vehicule nouvelleInstance) {
        vehicules.put(id, nouvelleInstance);
    }
    public Vehicule rechercherVehicule(String nom) {
        for (Vehicule v : vehicules.values()) {
            if (v.getMarque().equalsIgnoreCase(nom) ||
                    v.getModele().equalsIgnoreCase(nom)) {
                return v;
            }
        }
        return null;
    }
    public void listerVehicules(char lettre) {
        for (Vehicule v : vehicules.values()) {
            if (v.getMarque().toUpperCase().charAt(0) == lettre) {
                System.out.println(v);
            }
        }
    }
    public int getNombreVehicules() {
        return vehicules.size();
    }
}