package list;

public class Student implements Comparable<Student> {

    private String name;
    private String subject;
    private double grade;
    private String room;


    public Student(){}
    public Student(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public Student(String name, String subject, double grade, String room){
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.room = room;
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    public double getGrade(){ return this.grade; }
    public void setGrade(double grade){ this.grade = grade; }

    public String getRoom(){ return this.room; }
    public void setRoom(String room){ this.room = room; }


    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                '}';
        return name;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }
}
