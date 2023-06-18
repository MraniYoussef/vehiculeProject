public class VoitureElectrique implements VehiculeElectrique{
    private String marque;
    private String modèle;
    private String couleur;
    private double vitesse;
    private double niveauBatterie;

    public VoitureElectrique(String marque, String modèle, String couleur) {
        this.marque = marque;
        this.modèle = modèle;
        this.couleur = couleur;
        this.vitesse = 0;
        this.niveauBatterie = 100;
    }

    @Override
    public void déplacer() {
        System.out.println("La voiture électrique se déplace");
    }

    @Override
    public void accélérer(double vitesse) {
        this.vitesse += vitesse;
        System.out.println("La voiture électrique accélère et atteint une vitesse de " + this.vitesse + " km/h");
    }

    @Override
    public void freiner() {
        this.vitesse = 0;
        System.out.println("La voiture électrique freine et s'arrête");
    }

    @Override
    public void recharger() {
        this.niveauBatterie = 100;
        System.out.println("La voiture électrique est rechargée");
    }

    @Override
    public double obtenirNiveauBatterie() {
        return this.niveauBatterie;
    }

    // Ajout d'une méthode pour afficher les informations de la voiture électrique
    public void afficherInfos() {
        System.out.println("Marque : " + this.marque);
        System.out.println("Modèle : " + this.modèle);
        System.out.println("Couleur : " + this.couleur);
        System.out.println("Vitesse : " + this.vitesse + " km/h");
        System.out.println("Niveau de batterie : " + this.niveauBatterie + " %");
    }
}
