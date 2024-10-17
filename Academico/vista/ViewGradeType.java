package vista;

import java.util.List;

import interfaces.IMostrarMensaje;
import modelo.GradeType;


public class ViewGradeType implements IMostrarMensaje {
     public void  displayListGradeTypes( List<GradeType> gradeTypes) {
        System.out.println(" == Tipo de grados ==");
        for(GradeType gradeType : gradeTypes) {
            System.out.println("id grado " + gradeType.getId() + ", Nombre " + gradeType.getName() + ", Weight " + gradeType.getWeight());
        }
    }
}
