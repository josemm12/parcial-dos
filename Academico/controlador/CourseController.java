package controlador;

import java.util.List;

import modelo.Course;
import vista.ViewCourse;


public class CourseController {
      private ViewCourse view;

    public CourseController(ViewCourse view) {
        this.view = view;
    }
 
    public void insertNewCourse(Course newCourse) {
        Course.inserCourse(newCourse);
        view.mostrarMensaje("\n Curso guardado correctamente");
    }

    public void displayAllCourses() {
        List<Course> courses = Course.getAllCourses();
        view.displayListCourses(courses);
    }
      
}
