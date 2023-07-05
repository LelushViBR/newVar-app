package by.itstep.strs;

public class Student {

    private int id;
    private String name;
    private String lastName;
    private int courseNum;
    private double awg;

    private Student(){

    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Student(int id, String name, String lastName, int courseNum) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.courseNum = courseNum;
    }

    public Student(int id, String name, String lastName, int courseNum, double awg) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.courseNum = courseNum;
        this.awg = awg;
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

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public double getAwg() {
        return awg;
    }

    public void setAwg(double awg) {
        this.awg = awg;
    }
}
