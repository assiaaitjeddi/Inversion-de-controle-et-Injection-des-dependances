package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args){
        System.out.println("La méthode du framework Spring (XML)");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContent.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        metier.calcul();
    }
}
