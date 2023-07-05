package by.itstep.oop.patterns;

import java.util.Date;

public class Singleton {

     private static Singleton singleton;
     private String value;

    private Singleton() {
        System.out.println("new Instance created");
    }

    public static Singleton getInstance() {
        if(singleton == null){
            singleton = new Singleton();
            singleton.value = new Date().toString();
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
//lazy implementation. создание экземпляра по первому требованию клиента
class SingleDemo{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton.getValue());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3);
    }
}