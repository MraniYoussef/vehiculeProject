public class Launcher {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Peugeot", "308", "noir");
        System.out.println("création voiture---------------------------");
        voiture.déplacer();
        voiture.accélérer(50);
        voiture.freiner();
        System.out.println("------------------------------------------");
        System.out.println("création moto---------------------------");

        // création d'une instance de Moto
        Moto moto = new Moto("Yamaha", "MT-07", "bleu");
        moto.déplacer();
        moto.accélérer(80);
        moto.freiner();
        System.out.println("------------------------------------------");

        // création d'une instance de VoitureElectrique
        System.out.println("création voitureElectrique---------------------------");

        VoitureElectrique voitureElectrique = new VoitureElectrique("Tesla", "Model S", "rouge");
        voitureElectrique.déplacer();
        voitureElectrique.accélérer(100);
        voitureElectrique.obtenirNiveauBatterie();
        voitureElectrique.freiner();
        voitureElectrique.recharger();
        System.out.println("-------------------------------------------");

    }
    }





