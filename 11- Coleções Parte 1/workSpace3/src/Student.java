/**
 * In a way to use the compareTo() mehtod the class must
 * implement the Comparable<> Interface
 *
 */


public class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student(){}

    @Override
    public String toString() {
        return String.format("Name: %s | Age: %d", name, age);
    }

/*
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    This Happens if we do not define the type whem implementing the Comparable Interface
    public static Student implements Comparable{}
    instead of
    public static Student implements Comparable<Student>{}
    */

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(){
        this.age = age;
    }



}
