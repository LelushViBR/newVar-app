package by.itstep.oop;

public abstract class JavaProgrammer {
    
    abstract void makeCode();
    
    public void playTennis(){
        System.out.println("Playing Tennis...");
    }
    
    
    
}

class MeddleJavaDeveloper extends JavaProgrammer{
    @Override
    void makeCode() {
        System.out.println("Write same good code here.");
        playTennis();
    }
}
class SeniorJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write same perfect code here.");
        playTennis();
    }

    void leaveOffice(){
        System.out.println("Good bay .");
    }

}
class JuniorJavaDeveloper extends JavaProgrammer{
    @Override
    void makeCode() {
        System.out.println("????????");
    }
}
class Company{
    public static void main(String[] args) {
        JuniorJavaDeveloper junior = new JuniorJavaDeveloper();
        JavaProgrammer programmer = (JavaProgrammer) junior;
        Object o =(Object) new SeniorJavaDeveloper();
        Object o2 =(Object) (JavaProgrammer) new MeddleJavaDeveloper();
        
        JavaProgrammer jp = new JuniorJavaDeveloper();//SeniorJavaDeveloper
        if (jp instanceof SeniorJavaDeveloper){
            SeniorJavaDeveloper sjd = (SeniorJavaDeveloper) jp;
            sjd.leaveOffice();
        }
        else if (jp.getClass() == JuniorJavaDeveloper.class){
            JuniorJavaDeveloper jun = (JuniorJavaDeveloper) jp;
        }
        JavaProgrammer[] programmers = {junior,(JavaProgrammer) o,(JavaProgrammer) o2,jp};

        System.out.println("programmer " + programmers.length);

        for(JavaProgrammer prog:programmers){
            prog.makeCode();
        }

    }
}
