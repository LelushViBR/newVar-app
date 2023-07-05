package by.itstep;

public class IfTask {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;

        int cash = 1000000,age = 26, iq = 135;


        boolean isRich = false;
        if(cash > 100000){
            isRich = true;
        }
        boolean isOld = false;
        if(age < 27){
            isOld = true;

        }
        boolean isClever = false;
        if(iq > 100){
            isClever = true;

        }if(isClever && isOld && isRich){
            System.out.println("Yes!!!");
        }else
            System.out.println("No!!");
    }
}
