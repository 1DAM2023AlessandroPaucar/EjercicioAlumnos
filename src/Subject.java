public class Subject {
    private String code;
    private String name;
    private Year Year;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Year year) {
        Year = year;
    }

    public Year getYear() {
        return Year;
    }
}
