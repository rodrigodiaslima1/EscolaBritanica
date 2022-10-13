import java.util.List;

public class Person {

    private String id;
    private String name;
    private String nationality;
    private int age;

    public Person(String id, String name,
                  String nationality, int age){
        this.age = age;
        this.id = id;
        this.nationality = nationality;
        this.name = name;
    }

    public static List createPeople(){
        Person person1 = new Person("p1", "Rodrigo Dias", "Brazilian", 33);
        Person person2 = new Person("p2", "Elza Dias", "Brazilian", 55);
        Person person3 = new Person("p3", "George Harrison", "English", 65);
        Person person4 = new Person("p4", "Nina Hartley", "American", 50);

        return List.of(person1, person2, person3, person4);
    }

    // Getters and Setters:
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
