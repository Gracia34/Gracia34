class Camion extends Vehicule {
    private int chargementMax;
    public Camion(int id, String marque, String modele, int chargementMax)
    {
        super(id, marque, modele);
        this.chargementMax = chargementMax;
    }
    public int getChargementMax() {
        return chargementMax;
    }
}