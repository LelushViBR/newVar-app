package by.itstep.oop.inh;

import by.itstep.oop.Cat;

//класс child расширяет класс Parent |||||||||||| 'Is - A' - relationship.(когда наследник есть родитель)
public class Child extends Parent {

    // 'Has - A' relationship.
    private Cat cat;

    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void jump(){
        System.out.println("jumping " + getName());
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    //при определение- способность изменить функционал который был в данном классе
    @Override
    public void sayMyName() {
        //super - ссылка на супер класс
        super.sayMyName();
        System.out.println("My name is " + getName());
    }
}
