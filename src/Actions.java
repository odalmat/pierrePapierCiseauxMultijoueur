public class Actions {

    public static void texteDeDepart(){
        System.out.println("Choisissez entre :");
        System.out.println("1 - Pierre ");
        System.out.println("2 - Feuille");
        System.out.println("3 - Ciseaux");
        System.out.println("4 pour quitter le jeu");

    }

    public static void quiquigagne(String prenomJ1, String prenomJ2, int victoires, int defaites){
        System.out.println(prenomJ1 + " a " + victoires + " points et " + prenomJ2 + " a " + defaites + " points");
    }

}



