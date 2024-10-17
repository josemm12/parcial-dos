package vista;

import java.util.List;

import interfaces.IMostrarMensaje;
import modelo.Grade;


public class ViewGrade implements IMostrarMensaje {
     public void  displayListGrades( List<Grade> grades) {
        System.out.println(" == Lista de calificaciones ==");
        for(Grade grade : grades) {
            System.out.println("id calificaciones " + grade.getId() + ", Enrollment id" + grade.getEnrollmentId() + ", Grade Type id " + grade.getGradeTypeId() + ", Grade " + grade.getGrade());
        }
    }
}
