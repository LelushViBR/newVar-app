package by.itstep.oop.init;

public class Parent {

    private int p;
    private static int pStatic;

    static {
        System.out.println("Parent static block bebin");
        System.out.println(pStatic);
        pStatic = 123;
        System.out.println(pStatic);
        System.out.println("Parent static block end");
    }
    {
        System.out.println("Parent non-static block bebin");
        System.out.println(p);
        p = 123;
        System.out.println(p);
        System.out.println("Parent non-static block end");
    }

    public Parent(){
        System.out.println("Parent constructor begin");
        p = 321;
        System.out.println(p);
        System.out.println("Parent constructor end");
    }

    public int getP() {
        return p;
    }
    public static int getpStatic(){
        return pStatic;
    }
}
