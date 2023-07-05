package by.itstep.swing;

import by.itstep.MathUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class GuessNumberFrame extends JFrame {
    private int attempts = 0;
    private int result = 0;

    public GuessNumberFrame(){



        setTitle("Guess Number Game");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        // set Frame size

        // add 'from' , 'to' JTextField
        // add 'Generate' JButton


        JButton button=new JButton();
        button.setText("Generate");
        button.setSize(250,40);
        add(button);
        button.setLocation(40,300);


        JLabel lbl=new JLabel("from");
        JTextField field=new JTextField("0");
        lbl.setBounds(40,65,120,20);
        field.setBounds(40,90,120,20);
        add(lbl);
        add(field);

        JLabel lbl1=new JLabel("to");
        JTextField field1=new JTextField("10");
        lbl1.setBounds(240,65,120,20);
        field1.setBounds(240,90,120,20);
        add(lbl1);
        add(field1);

        JLabel lbl2=new JLabel("attempts");
        JTextField field2=new JTextField("3");
        lbl2.setBounds(440,65,120,20);
        field2.setBounds(440,90,120,20);
        add(lbl2);
        add(field2);



        JLabel msg = new JLabel("");
        msg.setBounds(30,200,320,20);
        add(msg);

        JButton guessButton=new JButton();
        guessButton.setText("GO!");
        guessButton.setSize(120,20);
        add(guessButton);

        guessButton.setLocation(440,200);
        guessButton.setVisible(false);

        JTextField answerField=new JTextField("0");
        answerField.setBounds(440,220,120,20);
        answerField.setVisible(false);
        add(answerField);

        JButton restartButton = new JButton("restart");
        add(restartButton);
        restartButton.setBounds(440,250,120,50);
        restartButton.setVisible(false);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int from = Integer.parseInt(field.getText()); // "20" -> 20
                int to = Integer.parseInt(field1.getText()); // "20" -> 20
                attempts = Integer.parseInt(field2.getText()); // "20" -> 20

                result = MathUtil.genRandom(from, to);


                field.setEditable(false);
                field1.setEditable(false);
                field2.setEditable(false);
                button.setVisible(false);

                msg.setText("Random value was generated! Try to guess!");
                answerField.setVisible(true);
                guessButton.setVisible(true);
                System.out.println("result: " + result);

            }
        });



        guessButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                while(attempts > 0){
//
//
//                    attempts--;
//                }
                if(attempts > 0){
                    int userX = Integer.parseInt(answerField.getText());
                    if(result == userX){
                        msg.setText("You WON! Yahoo! =]");
                        guessButton.setVisible(false);
                        answerField.setEditable(false);
                        restartButton.setVisible(true);
                    } else {
                        if(attempts == 1){
                            guessButton.setEnabled(false);
                            answerField.setEditable(false);
                            msg.setText("You LOSE! =[");
                            restartButton.setVisible(true);
                        }
                        else {
                            msg.setText("Your nu" +
                                    "ber is " + (userX > result ? "greater " : "less "));
                        }
                    }
                }

                attempts--;
                field2.setText(attempts + "");

            }

        });
        restartButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setEditable(true);
                field.setText("0");
                field1.setEditable(true);
                field1.setText("10");
                field2.setEditable(true);
                field2.setText("3");
                button.setVisible(true);

                restartButton.setVisible(false);

                msg.setText("");

                answerField.setVisible(false);
                answerField.setEditable(true);

                guessButton.setVisible(false);
                guessButton.setEnabled(true);


            }
        });

        setVisible(true);
    }


}
class Player{
    public static void main(String[] args) {
        GuessNumberFrame game = new GuessNumberFrame();
    }
}
