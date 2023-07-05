package by.itstep.oop.inh;

public class Person {

    private int id;
    private String name;
    private String lastName;
    private char gender;


    //конструктор - единственный способ Java создать обьект
    public Person(){
        System.out.println("Person + 1");
        this.name = "Stranger";
    }
    public Person(int id , String name){
        this.id = id;
        this.name = name;
    }
    public Person(int id , String name , String lastName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    //конструктор котороый будет инициализировать поля обьекта
    public Person(int id , String name , String lastName , char gender){
        System.out.println("Person + 1");
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }



}
class Test{
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(124);
        p.setGender('m');
        p.setName("john");
        p.setLastName("Michael");

        System.out.println(p.toString());


        Employee e1 = new Employee();
        e1.setId(123);
        e1.setName("root");
        e1.setLastName("Admin");
        e1.setGender('h');
        e1.setSalary(5000000);

        System.out.println(e1);

        Person p2 = new Person(55,"Mike","Tyson",'m');
        System.out.println(p2);

        Person p3 = new Person(76,"Petr");
        System.out.println(p3);

        Employee e2 = new Employee();
        System.out.println(e2);

        Employee e3 = new Employee(23,"Bob","Pedirson",'f',1000000);
        System.out.println(e3);

        Student s1 = new Student(421,"Artem","Petux",'m',2.2);
        System.out.println(s1);
        Student s2 = new Student(421421,"Kirill","Petyx",'f',1.0,10);
        System.out.println(s2);
    }
}