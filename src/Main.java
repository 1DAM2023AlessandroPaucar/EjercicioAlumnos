public class Main {
    public static void main(String[] args) {
        //-- Alumnos
        Student student1 = new Student();
        student1.setId("0001F");
        student1.setName("Daniel");
        student1.setSurname("Villalba");

        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getSurname());

        //--Cursos
        Year year = new Year();
        year.setCode("001");
        year.setName("1 DAM");

        //--Asignaturas

        Subject subject = new Subject();
        subject.setCode("001");
        subject.setName("Entornos de Desarollo");
        subject.setYear("year");

        Enroll enroll = new Enroll();
        enroll.setStudent(student1);
        enroll.getSubject().get(0).getYear().getName();
    }
}