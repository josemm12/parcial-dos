package controlador;

import java.util.List;

import modelo.Student;
import vista.ViewStudent;

public class StudentController {
    private ViewStudent view;

    public StudentController(ViewStudent view) {
        this.view = view;
    }

    public void insertNewStudent(Student newStudent) {
        Student.insertStudent(newStudent);
        view.mostrarMensaje("\n Estudiante guardado correctamente");
    }

    public void displayAllStudents() {
        List<Student> students = Student.getAllStudents();
        view.displayListStudents(students);
    }
}
