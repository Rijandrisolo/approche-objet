package utils;


import static java.lang.Integer.*;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine ="12";
        ////Double.parseDouble si misy virgule
        /// double valeur = Double.parseDouble(chaine)
        int valeur = parseInt(chaine);
        int a = 10;

        System.out.println("la valeur max est : " + max(a, valeur));
        System.out.println("String en int : "+ valeur);
    }
}
