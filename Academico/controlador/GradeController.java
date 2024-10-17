package controlador;

import java.util.List;

import modelo.Grade;
import vista.ViewGrade;

public class GradeController {
     private ViewGrade view;

    public GradeController(ViewGrade view) {
        this.view = view;
    }

      public void insertNewGrade(Grade newGrade) {
        Grade.insertGrade(newGrade);
        view.mostrarMensaje("\n Calificacion guardado correctamente");
    }

    public void displayAllGrades() {
        List<Grade> grades = Grade.getAllGrades();
        view.displayListGrades(grades);
    }
}
