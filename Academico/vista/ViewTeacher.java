package vista;

import java.util.List;

import interfaces.IMostrarMensaje;
import modelo.Teacher;

public class ViewTeacher implements IMostrarMensaje {
     public void  displayListTeachers( List<Teacher> teachers) {
        System.out.println(" == Lista de profesores ==");
        for(Teacher teacher : teachers) {
            System.out.println("id profesor " + teacher.getId() + ", Nombre " + teacher.getName() + ", Role " + teacher.getRole());
        }
    }
}
