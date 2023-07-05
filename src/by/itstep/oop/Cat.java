package by.itstep.oop;

public class Cat {

    private String name;
    private String type;
    private char gender;
    private int age;
    private String intelligence;
    boolean hasGame;


    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char newGender) {
        gender = newGender;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int newAge){
        if(newAge < 0){
            System.out.println("Incorrect age: " + newAge);
        }
        else {
            age = newAge;
        }
    }
    public String getType(){
        return type;
    }
    public void setType(String newType){
        type = newType;
    }
    public String getIntelligence(){
        return intelligence;
    }
    public void setIntelligence(String newIntelligence){
        intelligence = newIntelligence;
    }

    public void play(){
        if(hasGame == true){
            System.out.println(name + "is playing");
        }
        else {
            System.out.println(name + " no playing");
        }
    }

    public void sleep(){
        if (hasGame == true){
            System.out.println(name + " no sleep");
        }
        else {
            System.out.println(name + " sleep");
        }
    }

    public void eat(){
        System.out.println("The " + name + " eats");
    }


    public void hasGame(boolean b) {
    }
}
class catTester{
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("barsik");
        cat.setGender('f');
        char g = cat.getGender();
        cat.setAge(4);
        cat.setType("MaineCoon");
        cat.setIntelligence("verySmart");
        cat.hasGame(true);

        System.out.println("Cat name is " + cat.getName());
        System.out.println("Cat gender is " + g);
        System.out.println("Cat age is " + cat.getAge());
        System.out.println("Cat type is " + cat.getType());
        System.out.println("Cat intelligence is " + cat.getIntelligence());

        cat.play();
        cat.sleep();
        cat.eat();
    }
}