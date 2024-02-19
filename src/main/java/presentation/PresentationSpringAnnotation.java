package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args){
        System.out.println("La méthode du framework Spring (Annotation)");
        ApplicationContext context =
                new AnnotationConfigApplicationContext("dao","metier");

        IMetier metier = context.getBean(IMetier.class); // IMetier.class : dans le cas ou je ne sais pas le nom
        metier.calcul();
    }

}
