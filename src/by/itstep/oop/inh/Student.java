package by.itstep.oop.inh;

public class Student extends Person{
    private double avg;
    private int scholarship;

    public Student(){
    }
    public Student(int id , String name){
        super(id,name);
    }
    public Student(int id , String name , String lastName){
        super(id, name );
        this.setLastName(lastName);
    }
    public Student(int id , String name , String lastName , char gender){
        super(id, name, lastName, gender);
    }
    public Student(int id , String name , String lastName,char gender , double avg){
        super(id, name, lastName, gender);
        this.setAvg(avg);
    }
    public Student (int id , String name , String lastName, char gender , double avg , int scholarship){
        super(id, name, lastName, gender);
        this.setAvg(avg);
        this.setScholarship(scholarship);
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", avg=" + avg +
                ", scholarship=" + scholarship +
                '}';
    }

}
