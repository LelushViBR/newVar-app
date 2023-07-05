package by.itstep.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My app");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,500);

        frame.setLayout(null);

        JButton button = new JButton();
        button.setText("Push me");
        button.setSize(80,50);

        frame.add(button);
        button.setLocation(350,175);

        JLabel lbl = new JLabel("Name:");
        JTextField field = new JFormattedTextField();
        lbl.setBounds(350, 115,80,25);
        field.setBounds(350,145,80,25);


        frame.add(lbl);
        frame.add(field);

        JLabel lbl2 = new JLabel(" " );
        lbl2.setBounds(350,230,80,25);


        frame.add(lbl2);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new Date() + ": click");
                String name = field.getText();
                System.out.println("Hello " + name);
                lbl2.setText("Hello " + name);
            }
        });




    }
}
