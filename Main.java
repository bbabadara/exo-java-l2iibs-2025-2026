import java.util.Scanner;

class Main{
    public static void main(String[] args) {
       final int taille = 1;
       int cpt = 0;
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
                    if (cpt<taille) {
                    System.out.println("=======Ajout d'un etudiant=======");
                    sc.nextLine();
                    System.out.println("Entrer le nom");
                    noms[cpt]=sc.nextLine();
                    System.out.println("Entrer le prenom");
                    prenoms[cpt]=sc.nextLine();
                    System.out.println("Entrer l'age");
                    ages[cpt]=sc.nextInt();
                    System.out.println("Entrer la note");
                    notes[cpt]=sc.nextDouble();
                    cpt++;
                    System.out.println("Etudiant Ajouter avec succes");
                     } else {
                        System.out.println("Le tableau est plein");
                     }

                    
                    break;
                case 2:
                    System.out.println("======Liste des etudiant=====");
                    for (int i = 0; i < cpt; i++) {
                        System.out.println("-------------------------");
                        System.out.println("Nom: "+ noms[i]);
                        System.out.println("Prenom: "+ prenoms[i]);
                        System.out.println("Age: "+ ages[i]);
                        System.out.println("Note: "+ notes[i]);
                        System.out.println("-------------------------");

                    }
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