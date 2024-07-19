class Moto extends Vehicule {
    private int cylindree;
    public Moto(int id, String marque, String modele, int cylindree) {
        super(id, marque, modele);
        this.cylindree = cylindree;
    }
    public int getCylindree() {
        return cylindree;
    }
}