package controlador;

import java.util.List;

import modelo.GradeType;
import vista.ViewGradeType;

public class GradeTypeController {
    private ViewGradeType view;

    public GradeTypeController(ViewGradeType view) {
        this.view = view;
    }

    public void insertNewGradeType(GradeType newGradeType) {
        GradeType.insertGradeType(newGradeType);
        view.mostrarMensaje("\n Grado guardado correctamente");
    }

    public void displayAllGradeTypes() {
        List<GradeType> gradeTypes = GradeType.getAllGradeTypes();
        view.displayListGradeTypes(gradeTypes);
    }
    
}
