import controlador.CourseController;
import controlador.EnrollmentController;
import controlador.GradeController;
import controlador.GradeTypeController;
import controlador.StudentController;
import controlador.TeacherController;
import modelo.Course;
import modelo.Enrollment;
import modelo.Grade;
import modelo.GradeType;
import modelo.Student;
import modelo.Teacher;
import vista.ViewCourse;
import vista.ViewEnrollment;
import vista.ViewGrade;
import vista.ViewGradeType;
import vista.ViewStudent;
import vista.ViewTeacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro sistema academico");

        // Inicializar vistas
        ViewStudent viewStudent = new ViewStudent();
        ViewTeacher viewTeacher = new ViewTeacher();
        ViewCourse viewCourse = new ViewCourse();
        ViewEnrollment viewEnrollment = new ViewEnrollment();
        ViewGradeType viewGradeType = new ViewGradeType();
        ViewGrade viewGrade = new ViewGrade();

        // Inicializar controladores
        StudentController studentController = new StudentController(viewStudent);
        TeacherController teacherController = new TeacherController(viewTeacher);
        CourseController courseController = new CourseController(viewCourse);
        EnrollmentController enrollmentController = new EnrollmentController(viewEnrollment);
        GradeTypeController gradeTypeController = new GradeTypeController(viewGradeType);
        GradeController gradeController = new GradeController(viewGrade);


        // Inicializar objeto estudiante
        Student newStudent = new Student(1234, "Jose", "jose@gmail.com");
        // Insertar o guardar estudiantes en la base de datos
        studentController.insertNewStudent(newStudent);
        // Mostrar datos en la vista
        studentController.displayAllStudents();
        
        Teacher newTeacher = new Teacher(123, "Gabriel", "Ingenieria");
        teacherController.insertNewTeacher(newTeacher);
        teacherController.displayAllTeachers();

        Course newCourse = new Course(123, "Programacion", "POO, Polimorfismo, Interfaces, UML", true, newTeacher.getId());
        courseController.insertNewCourse(newCourse);
        courseController.displayAllCourses();

        Enrollment newEnrollment = new Enrollment(111, newStudent.getId(), newCourse.getId());
        enrollmentController.insertNewEnrollment(newEnrollment);
        enrollmentController.displayAllEnrollments();

        GradeType newGradeType = new GradeType(111, "Universidad", 12.5);
        gradeTypeController.insertNewGradeType(newGradeType);
        gradeTypeController.displayAllGradeTypes();

        Grade newGrade = new Grade(111, newEnrollment.getId(), newGradeType.getId(), 2.0);
        gradeController.insertNewGrade(newGrade);
        gradeController.displayAllGrades();



    }
}