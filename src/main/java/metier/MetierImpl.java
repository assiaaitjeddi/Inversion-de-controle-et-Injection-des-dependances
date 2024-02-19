package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")   //déclarer au tant que bean(version XML)

public class MetierImpl implements IMetier{
    @Autowired  //pour faire l'injection par Annotation

    private IDao dao; // Couplage faible

    public MetierImpl(IDao dao) {    //Constructeur
        this.dao = dao;
    } // Constructeur

    @Override
    public void calcul() {
        //implémentation de la méthode calcul
        System.out.println("Calcul en cours ....");
        String date = dao.getDate();
        System.out.println(date);
    }

    public void setDao(IDao dao) {this.dao = dao;}
}
