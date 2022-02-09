
import java.util.Comparator;

public class CompareStudentAge implements Comparator<Student> {

    /**
     * In a way we can compare it decreasingly we should first
     * use the student2 then the student1 like the following:
     *
     * return Double.compare(student2.getAge(), student1.getAge());
     *
     * @param student1
     * @param student2
     * @return
     */
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getAge(), student2.getAge());
    }
}
