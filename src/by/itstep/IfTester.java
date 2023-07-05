package by.itstep;

public class IfTester {

    public static void main(String[] args) {
        System.out.println("Begin");

        int t = -30;

        if (t < -15){
            System.out.println("Шубка");
        }
        if (t > 20){
            System.out.println("Майка");
        }



        int m1 = 10, m2 = 8, m3 = 10, m4 = 10, m5 = 10;
        double ms = (m1 + m2 + m3 + m4 + m5)/5.0;
        System.out.println("ms = " + ms);
        if (ms == 10){
            System.out.println("Отличник");
        }
        else if (ms <= 8){
            System.out.println("Норм чел");
        }
        else if (ms <= 9.9){
            System.out.println("Неудачник");
        }
        else
            System.out.println("КиберЛох");

        int a = 5,b = 7,c = 10;

        a = b + c;
        b = a + c;
        c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);







        if ((a + b) <= c ){
            System.out.println("Invalid Triangle");

        }
        else if((a + c) <= b  ){
            System.out.println("Invalid Triangle");

        }
        else if((b + c ) <= a ){
            System.out.println("Invalid Triangle");
        }
        else
            System.out.println("Correct Triangle");
         double iq = 105.0, fq = 123.0;
         if (iq < fq){
             System.out.println("Глупый");

         }
         else if (iq > fq){
             System.out.println("МегаМозг");
         }
         else
             System.out.println("Средняк");
         double ran1 = 4.0, ran2 = 7.0, ran3 = 5.0;
         if (ran1 > ran2){
             if (ran1 > ran3){
                 System.out.println("ran1 Победитель!!!");
             }
             else
                 System.out.println("ran1 Проигравший!");
         }
         else if (ran1 < ran2){
             System.out.println("ran1 Проигравший!");

         }
         else if(ran1 > ran3){
             if(ran1 > ran2){
                 System.out.println("ran1 Победитель!!!");
             }
             else
                 System.out.println("ran1 Проигравший!");

         }

         if(ran2 > ran3){
             if(ran2 > ran1){
                 System.out.println("ran2 Победитель!!!");
             }
         }
         if(ran2 < ran3){
             System.out.println("ran2 Проигравший!");
         }





        System.out.println("End.");
    }
}
