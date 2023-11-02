package fr.entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adress1 = new AdressePostale(5,"Rue Rimbaud","34080","Montpellier");
        AdressePostale adress2 = new AdressePostale(1,"Avenue des Mirtilles","34080","Montpellier");
        Personne pers1 = new Personne("Dupont","Arsène", adress1);

        Personne pers2 = new Personne("Lupin","Arsène",adress2);


//System.out.println( pers1.nom +" "+pers1.prenom+" "+pers1.adresse.numeroRue);
        System.out.println( pers1.nom +" "+pers1.prenom+" "+pers1.adresse.numeroRue);
        System.out.println( pers2.nom +" "+pers2.prenom+" "+pers2.adresse.libelleRue);

    }
}
