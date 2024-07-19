abstract class Vehicule {
    protected int id;
    protected String marque;
    protected String modele;
    public Vehicule(int id, String marque, String modele) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
    }
    public int getId() {
        return id;
    }
    public String getMarque() {
        return marque;
    }
    public String getModele() {
        return modele;
    }
}