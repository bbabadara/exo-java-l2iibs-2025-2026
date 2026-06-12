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
            afficheMenu();
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    if (cpt<taille) {
                    System.out.println("=======Ajout d'un etudiant=======");
                    sc.nextLine();
                    
                    noms[cpt]=saisiString("Entrer le nom", sc);
                    prenoms[cpt]=saisiString("Entrer le prenom", sc);
                    ages[cpt]=saisiIntInervalle(sc, 17, 35, "Entrer l'age");
                    
                    notes[cpt]=saisiIntInervalle(sc, 0, 20, "Entrer la note");
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

    public static void afficheMenu(){
            System.out.println("1- Ajouter");
            System.out.println("2- Lister");
            System.out.println("3- Quitter");
    }
    public static String saisiString(String message,Scanner sc) {
        String choix;
        do {
           System.out.println(message);
            choix = sc.nextLine().trim(); 
            if (choix.isEmpty()) {
                System.out.println("La saisie est obligatoire");
                
            }
        } while (choix.isEmpty());
        return choix;
    }
    public static int saisiIntInervalle(Scanner in,int min, int max, String message){
        int choix;
        do {
             System.out.println(message);
                    choix=in.nextInt();
                    if (choix<min || choix > max) {
                        System.out.println("La valeur doit etre "+min+" et "+max);
                    }
        } while (choix<min || choix > max);

        return choix;
        
    }
}