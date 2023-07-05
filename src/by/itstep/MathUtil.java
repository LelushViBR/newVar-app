package by.itstep;

public class    MathUtil {
    public static void main(String[] args) {
        System.out.println("старт мейна ");
//        varTester(7.342);
//        forTester(10,10,true);
//        int val = genRandom(50,20);
//        System.out.println(val);
        int x = genRandom();
        System.out.println(x);
       System.out.println("main end. ");

    }

    public static void varTester(double val) {
        double d;
        d = val;
        System.out.println(d);
        d += d;
        System.out.println(d);
    }
    public static void forTester(int num,double val, boolean flag){
        System.out.println("for Tester Begin");
        for(int i = 0 ; i < num ; i ++){
            if(flag){
                val += val;
                System.out.print(val + " ");
            }
            else {
                val += val;
                System.out.println(val);
            }
        }
        System.out.println("for Tester end");
    }

    /**
     * Returns a integer value with a positive sign,
     * greater than or equal to 0.0 and less or equal than Max bound
     * @param maxBound
     * @return a pseudorandom integer from 0 to maxbound inclusive
     */
    public static int genRandom(int maxBound){
        return genRandom(maxBound,0);
    }
    public static int genRandom(int maxBound , int minBound ){
        int i = maxBound - minBound + 1;
        int z =(int) (Math.random() * i) + minBound;
        return z;
    }
    public static int genRandom() {
        return genRandom(10);
    }
}





