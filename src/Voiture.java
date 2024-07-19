class Voiture extends Vehicule {
    private int nbPortes;
    public Voiture(int id, String marque, String modele, int nbPortes) {
        super(id, marque, modele);
        this.nbPortes = nbPortes;
    }
    public int getNbPortes() {
        return nbPortes;
    }
}