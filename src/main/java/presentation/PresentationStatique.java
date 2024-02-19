package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class PresentationStatique {
    public static void main(String[] args){
        // Injection statique
        System.out.println("La méthode statique");
        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl(dao);
        metier.calcul();
    }
}
