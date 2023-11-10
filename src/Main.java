import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //-- Alumnos
        Student student1 = new Student();
        student1.setId("0001F");
        student1.setName("Daniel");
        student1.setSurname("Villalba");

        //--Cursos
        Year year = new Year();
        year.setCode("001");
        year.setName("1º DAM");

        //--Asignaturas

        Subject subject = new Subject();
        subject.setCode("001");
        subject.setName("Entornos de Desarollo");
        subject.setYear(year);

        //Enroll

        Enroll enroll = new Enroll();
        enroll.setStudent(student1);
        enroll.setSubjects(new ArrayList<>());
        enroll.getSubjects().add(subject);

        //Acceder e imprimir
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getSurname());
        System.out.println( enroll.getSubjects().get(0).getYear().getName());
    }
}