import java.time.LocalDate;

public interface Course {
    public Semester getSemester();
    public LocalDate getYear();
    public String getCourseCode();
    public String getCourseName();
}
