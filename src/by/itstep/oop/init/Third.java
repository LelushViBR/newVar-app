package by.itstep.oop.init;

public class Third extends Child {

    private int p;
    private static int pStatic;

    static {
        System.out.println("Third static block bebin");
        System.out.println(pStatic);
        pStatic = 123;
        System.out.println(pStatic);
        System.out.println("Third static block end");
    }
    {
        System.out.println("Third non-static block bebin");
        System.out.println(p);
        p = 123;
        System.out.println(p);
        System.out.println("Third non-static block end");
    }

    public Third(){
        System.out.println("Third constructor begin");
        p = 321;
        System.out.println(p);
        System.out.println("Third constructor end");
    }

    public int getP() {
        return p;
    }
    public static int getpStatic(){
        return pStatic;
    }

}
