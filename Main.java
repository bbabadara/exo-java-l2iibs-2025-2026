import java.util.Scanner;

class Main{
    public static void main(String[] args) {
       final int taille = 100;
       Scanner sc = new Scanner(System.in);
       String[] noms = new String[taille];
       String[] prenoms = new String[taille];
       int[] ages = new int[taille];
       double[] notes = new double[taille];
       int choix;
        do {
            System.out.println("1- Ajouter");
            System.out.println("2- Lister");
            System.out.println("3- Quitter");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("choix: Ajouter");
                    
                    break;
                case 2:
                    System.out.println("choix: Lister");
                    break;
                case 3:
                    System.out.println("Au revoir!");

                    break;
            
                default:
                   System.out.println("choix invalid");
                    break;
            }
        } while (choix != 3);

    }
}