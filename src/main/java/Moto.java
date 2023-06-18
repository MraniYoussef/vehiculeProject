public class Moto implements Vehicule{
    private String marque;
    private String modèle;
    private String couleur;
    private double vitesse;

    public Moto(String marque, String modèle, String couleur) {
        this.marque = marque;
        this.modèle = modèle;
        this.couleur = couleur;
        this.vitesse = 0;
    }

    @Override
    public void déplacer() {
        System.out.println("La moto se déplace");
    }

    @Override
    public void accélérer(double vitesse) {
        this.vitesse += vitesse;
        System.out.println("La moto accélère et atteint une vitesse de " + this.vitesse + " km/h");
    }

    @Override
    public void freiner() {
        this.vitesse = 0;
        System.out.println("La moto freine et s'arrête");
    }
}
