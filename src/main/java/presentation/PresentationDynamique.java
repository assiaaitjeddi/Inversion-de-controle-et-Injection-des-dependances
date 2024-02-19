package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationDynamique {
    public static void main(String[] args) throws Exception {
        System.out.println("La méthode dynamique");

        Scanner scanner = new Scanner(new File("config.txt"));  // Lire le fichier texte

        String daoClassName = scanner.nextLine(); // Lire la première ligne
        Class cDao = Class.forName(daoClassName); // Chargement dynamique de la classe
        IDao dao = (IDao) cDao.getConstructor().newInstance(); // Instanciation du DAO

        String metierClassName = scanner.nextLine(); // Lire la deuxième ligne
        Class cMetier = Class.forName(metierClassName); // Chargement dynamique de la classe
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); // Injection du DAO dans le MetierImpl

        metier.calcul(); // Appel de la méthode calcul() sur le MetierImpl

        scanner.close(); // Fermeture du scanner
    }

}