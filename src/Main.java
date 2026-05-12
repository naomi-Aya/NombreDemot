import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            // Ouvrir le fichier
            File file = new File("texte.txt");

            // Scanner pour lire le fichier
            Scanner fileScanner = new Scanner(file);

            int totalWords = 0;

            // Lire chaque ligne
            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();

                // Vérifier que la ligne n'est pas vide
                if (!line.trim().isEmpty()) {

                    // Séparer les mots
                    String[] words = line.trim().split("\\s+");

                    // Ajouter le nombre de mots
                    totalWords += words.length;
                }
            }

            // Affichage du résultat
            System.out.println("Nombre total de mots : " + totalWords);

            fileScanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("Fichier introuvable !");
        }
    }
}