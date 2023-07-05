package by.itstep.oop;

public class Student {

    private String name;
    private double awg;
    // has - a - relationship
    private  University university;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAwg() {
        return awg;
    }

    public void setAwg(double awg) {
        this.awg = awg;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
class University{
    private String name;
    private String location;
    private int numberOfStudents;

    private Teacher[] teachers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
class Teacher{
    private String name;
    private int exp;
    private long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

class Test{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.setName("John");
        t1.setExp(5);
        t1.setSalary(2000);
        Teacher t2 = new Teacher();
        t2.setName("Nike");
        t2.setSalary(3500);
        t2.setExp(7);

        Teacher[] teachers = {t1,t2};

        University university = new University();
        university.setName("Yel");
        university.setLocation("New-Hawen");
        university.setTeachers(teachers);
        university.setNumberOfStudents(20000);

        Student student = new Student();

        student.setName("Make");
        student.setAwg(100);
        student.setUniversity(university);



    }
}