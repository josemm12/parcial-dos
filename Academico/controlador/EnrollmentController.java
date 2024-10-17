package controlador;

import java.util.List;

import modelo.Enrollment;
import vista.ViewEnrollment;


public class EnrollmentController {
   private ViewEnrollment view;

public EnrollmentController(ViewEnrollment view) {
    this.view = view;
}

    public void insertNewEnrollment(Enrollment newEnrollment) {
        Enrollment.insertEnrollment(newEnrollment);
        view.mostrarMensaje("\n Aprobacion guardado correctamente");
    }

    public void displayAllEnrollments() {
        List<Enrollment> enrollments = Enrollment.getAllEnrollments();
        view.displayListEnrollments(enrollments);
    }
   
   
}
