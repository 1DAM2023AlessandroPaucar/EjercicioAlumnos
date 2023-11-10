public class Enroll {
    private String code;
    private String initialDate;
    private String finalDate;

    private Student Student;

    private ArrayList<Subject>subject;

    public String getId() {
        return code;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setStudent(Student student) {
        Student = student;
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }
}
