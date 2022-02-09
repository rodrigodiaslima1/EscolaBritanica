public class Student implements Comparable {

    private String name;
    private Integer year;

    public Student(String name, Integer year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString(){
        return "| Student: " + this.name + " " + this.year;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public int compareToYear(Student student){
        return this.year.compareTo(student.getYear());
    }

    public int compareToName(Student student) {
        return this.name.compareTo(student.getName());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
