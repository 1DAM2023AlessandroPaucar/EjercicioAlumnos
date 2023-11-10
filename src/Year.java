import java.util.ArrayList;
    public class Year {
        private String code;
        private String name;
        private ArrayList<Subject>subjects;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Subject> getSubjects() {
            return subjects;
        }

        public void setSubjects(ArrayList<Subject> subjects) {
            this.subjects = subjects;
        }
    }
