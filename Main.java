import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Semester semester = Semester.SPRING;
        LocalDate year = LocalDate.now();
        Module module = new Module(semester, year, "Programming");
        //System.out.println(module);
        Student student = new Student("123456", "John", "Doe", LocalDate.of(2000, 1, 1), module);
        System.out.println(student);
    }
}
