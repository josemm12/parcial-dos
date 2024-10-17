package vista;

import java.util.List;

import interfaces.IMostrarMensaje;
import modelo.Student;

public class ViewStudent implements IMostrarMensaje {
    public void  displayListStudents( List<Student> students) {
        System.out.println(" == Lista de estudiantes ==");
        for(Student student : students) {
            System.out.println("id estudiante " + student.getId() + ", Nombre " + student.getName() + ", Correo " + student.getEmail());
        }
    }
}
