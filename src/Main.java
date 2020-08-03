import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int victoires = 0;
        int defaites = 0;

        Scanner scany = new Scanner(System.in);
        int choixJ1 = 0;
        int choixJ2 = 0;
        String prenomJ1;
        String prenomJ2;


        System.out.println("Entrez votre prénom s'il vous plait cher joueur 1");
        prenomJ1 = scany.nextLine();
        System.out.println("Entrez votre prénom s'il vous plait cher joueur 2");
        prenomJ2 = scany.nextLine();

        System.out.println("Bienvenue " + prenomJ1 + "et cher " + prenomJ2 + " dans ce jeu de pierre feuille ciseaux ");
        System.out.println("C'est une partie en 3 manches gagnantes");


        while ((defaites !=3 && victoires != 3) && (choixJ1 != 4 && choixJ2 != 4 )) {

            try {

                Actions.texteDeDepart();
                Scanner scan = new Scanner(System.in);

                System.out.println("A " + prenomJ1 + " écris ton choix en cachette bien sur");
                choixJ1 = scan.nextInt();
                if (choixJ1 != 4) {
                    System.out.println(prenomJ2 + " à toi ! t'as pas regardé j'espère =)");
                    choixJ2 = scan.nextInt();
                }
                if (choixJ1 == choixJ2) {
                    System.out.println("égalité, rejouez s'il vous plait ");
                    Actions.quiquigagne(prenomJ1, prenomJ2, victoires, defaites);
                    System.out.println();

                } else if (choixJ1 == 1 && choixJ2 == 3) {
                    System.out.println(prenomJ1 + " GAGNE, la pierre casse les ciseaux");
                    victoires++;
                    Actions.quiquigagne(prenomJ1, prenomJ2, victoires, defaites);
                    System.out.println();
                } else if (choixJ1 == 3 && choixJ2 == 1) {
                    System.out.println(prenomJ2 + " GAGNE, la pierre casse les ciseaux");
                    defaites++;
                    Actions.quiquigagne(prenomJ1, prenomJ2, victoires, defaites);
                    System.out.println();

                } else if (choixJ1 == 2 && choixJ2 == 1) {
                    System.out.println(prenomJ1 + " GAGNE, la feuille recouvre la pierre");
                    victoires++;
                    Actions.quiquigagne(prenomJ1, prenomJ2, victoires, defaites);
                    System.out.println();
                } else if (choixJ1 == 1 && choixJ2 == 2) {
                    System.out.println(prenomJ2 + " GAGNE, la feuille recouvre la pierre");
                    defaites++;
                    Actions.quiquigagne(prenomJ1, prenomJ2, victoires, defaites);
                    System.out.println();

                } else if (choixJ1 == 3 && choixJ2 == 2) {
                    System.out.println(prenomJ1 + " GAGNE, les ciseaux coupent la feuille");
                    victoires++;
                    Actions.quiquigagne(prenomJ1, prenomJ2, victoires, defaites);
                    System.out.println();
                } else if (choixJ1 == 2 && choixJ2 == 3) {
                    System.out.println(prenomJ2 + " GAGNE, les ciseaux coupent la feuille");
                    defaites++;
                    Actions.quiquigagne(prenomJ1, prenomJ2, victoires, defaites);
                    System.out.println();

                } else if (choixJ1 == 4 || choixJ2 == 4) {
                    System.out.println("Vous vous êtes bien amusé quand même " + prenomJ1 + " et " + prenomJ2 + " j'espère.");

                }else {
                    System.out.println(prenomJ1 + " Quand même...T'as pas entré un chiffre entre 1 et 3 pour jouer");
                }

            }catch (InputMismatchException e){
                System.out.println("T'as même pas entré un chiffre t'abuse");
            }
        }

        if (victoires>defaites && victoires!=3){
            System.out.println("ET c'est la victoire, même si t'as quitté le jeu trop tôt");
        }else if (defaites>victoires && defaites!=3){
            System.out.println("ET c'est la défaite avant la limite");
        }else if (victoires==defaites){
            System.out.println("Fin de parti ex aequo avant la limite avec un score de " + victoires + " partout");
        }

        if (victoires == 3) {
            System.out.println("Super bien joué " + prenomJ1 + " t'as gagné");
            System.out.println("Fin de partie");
        } else if (defaites == 3) {
            System.out.println("Super bien joué " + prenomJ2 + " t'as gagné");
            System.out.println("Fin de partie");
        }
    }
}