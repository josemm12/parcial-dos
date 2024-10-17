package controlador;

import java.util.List;

import modelo.Teacher;
import vista.ViewTeacher;

public class TeacherController {
    private ViewTeacher view;

    public TeacherController(ViewTeacher view) {
        this.view = view;
    }

    public void insertNewTeacher(Teacher newTeacher) {
        Teacher.inserTeacher(newTeacher);
        view.mostrarMensaje("\nProfesor guardado correctamente");
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = Teacher.getAllTeachers();
        view.displayListTeachers(teachers);
    }
}
