package by.itstep.oop.inh.task;

import javax.jws.soap.SOAPBinding;
import java.util.concurrent.Callable;

public class Client {
    private int id;
    private String name;
    private String email;
    private String password;
    private String password2;
    private String role;

    public Client() {
        this.role="Default user";
    }

    public Client(int id, String name, String email) {
        this(id,name,email , null,null,null);
    }

    public Client(int id, String name, String email, String password, String password2, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.password2 = password2;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getRoll() {
        return role;
    }

    public void setRoll(String roll) {
        this.role = roll;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name ='"+ name +"'"+
                ", email='" + email + '\'' +
                ", password='********'" +
                ", roll='" + role + '\'' +
                '}';
    }

}
class Test{
    public static void main(String[] args) {
        Client c1 = new Client(100,"Petr",
                "sabaka@mail.com","privetpoka","privetpoka","petux");
        System.out.println(c1);
        Client c2 = new Client();
        c2.setId(213);
        c2.setName("Kortoshka");
        c2.setEmail("Default@mail.com");
        c2.setPassword("12321");
        c2.setPassword2("12321");
        System.out.println(c2);

        SuperClient sc1 = new SuperClient();
        System.out.println(sc1);
    }
}
