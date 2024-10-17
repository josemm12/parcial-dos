package vista;

import java.util.List;
import interfaces.IMostrarMensaje;
import modelo.Course;


public class ViewCourse implements IMostrarMensaje{
     public void  displayListCourses( List<Course> courses) {
        System.out.println(" == Lista de cursos ==");
        for(Course course : courses) {
            System.out.println("id curso " + course.getId() + ", Nombre " + course.getName() + ", Content " + course.getContent() + ", Status " + course.getStatus() + ", Teacher id" + course.getTeacherId());
        }
    }
}
