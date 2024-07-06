import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];

    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup group;
    JButton next, submit, help;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    Quiz(String name) {
        this.name = name;
        qno = new JLabel();
        qno.setBounds(150, 450, 100, 45);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 21));
        add(qno);

        question = new JLabel();
        question.setBounds(200, 440, 1000, 65);
        question.setFont(new Font("Tahoma", Font.BOLD, 21));
        add(question);

        questions[0][0] = "Number of primitive data types in Java are?";
        questions[0][1] = "6";
        questions[0][2] = "7";
        questions[0][3] = "8";
        questions[0][4] = "9";

        questions[1][0] = "What is the size of float and double in java?";
        questions[1][1] = "32 and 64";
        questions[1][2] = "32 and 32";
        questions[1][3] = "64 and 64";
        questions[1][4] = "64 and 32";

        questions[2][0] = "Automatic type conversion is possible in which of the possible cases?";
        questions[2][1] = "Byte to int";
        questions[2][2] = "Int to Long";
        questions[2][3] = "Long to int";
        questions[2][4] = "Short to int";

        questions[3][0] = "When an array is passed to a method, what does the method receive?";
        questions[3][1] = "The reference of the array";
        questions[3][2] = "A copy of the array";
        questions[3][3] = "Length of the array";
        questions[3][4] = "Copy of first element";

        questions[4][0] = "Arrays in java are?";
        questions[4][1] = "Object References";
        questions[4][2] = "Objects";
        questions[4][3] = "Primitive data type";
        questions[4][4] = "None";

        questions[5][0] = "When is the object created with new keyword?";
        questions[5][1] = "At rum time";
        questions[5][2] = "At compile time";
        questions[5][3] = "Depends on the code";
        questions[5][4] = "None";

        questions[6][0] = "Identify the corrected definition of a package?";
        questions[6][1] = "A package is a collection of editing tools";
        questions[6][2] = "A package is a collection of Classes";
        questions[6][3] = "A package is a collection of Classes and interfaces";
        questions[6][4] = "A package is a collection of interfaces";

        questions[7][0] = "compareTo() returns";
        questions[7][1] = "True";
        questions[7][2] = "False";
        questions[7][3] = "An int value";
        questions[7][4] = "None";

        questions[8][0] = "To which of the following does the class string belong to.";
        questions[8][1] = "java.lang";
        questions[8][2] = "java.awt";
        questions[8][3] = "java.applet";
        questions[8][4] = "java.String";

        questions[9][0] = "Total constructor string class have?";
        questions[9][1] = "3";
        questions[9][2] = "7";
        questions[9][3] = "13";
        questions[9][4] = "20";

        answers[0][1] = "8";
        answers[1][1] = "32 and 64";
        answers[2][1] = "Int to Long";
        answers[3][1] = "The reference of the array";
        answers[4][1] = "Objects";
        answers[5][1] = "At rum time";
        answers[6][1] = "A package is a collection of Classes and interfaces";
        answers[7][1] = "An int value";
        answers[8][1] = "java.lang";
        answers[9][1] = "13";

        opt1 = new JRadioButton();
        opt1.setBounds(180, 500, 800, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 21));
        opt1.setForeground(Color.BLACK);
        opt1.setOpaque(false);
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(180, 540, 800, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 21));
        opt2.setForeground(Color.BLACK);
        opt2.setOpaque(false);
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(180, 580, 800, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 21));
        opt3.setForeground(Color.BLACK);
        opt3.setOpaque(false);
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(180, 620, 800, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 21));
        opt4.setForeground(Color.BLACK);
        opt4.setOpaque(false);
        add(opt4);

        group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

        next = new JButton("Next");
        next.setBounds(1030, 630, 110, 30);
        next.setFont(new Font("Dialog", Font.BOLD, 21));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLUE);
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(1160, 630, 110, 30);
        submit.setFont(new Font("Dialog", Font.BOLD, 21));
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLUE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        // help = new JButton("Help");
        // help.setBounds(1030, 630, 110, 30);
        // help.setFont(new Font("Dialog", Font.BOLD, 21));
        // help.setBackground(Color.WHITE);
        // help.setForeground(Color.BLUE);
        // help.addActionListener(this);
        // add(help);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizback.jpg"));
        Image i = i1.getImage().getScaledInstance(1400, 390, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 1400, 390);
        add(image);

        setSize(1500, 900);
        setLocation(0, 0);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);

        start(count);
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time Left: " + timer + " Seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 23));

        if (timer > 0) {
            g.drawString(time, 1000, 500);
        } else {
            g.drawString("Times up!!", 1000, 500);
        }
        timer--;
        repaint();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {// submit button
                if (group.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = group.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }

                }
                setVisible(false);
                new Score(name, score);

            } else {// next button

                if (group.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = group.getSelection().getActionCommand();
                }

                count++;
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText(count + 1 + ".");
        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        group.clearSelection();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == next) {
            repaint();
            ans_given = 1;

            if (group.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = group.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);

        } else if (e.getSource() == submit) {
            ans_given = 1;
            if (group.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = group.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }

            }

            new Score(name, score);
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Quiz("User");
    }

}
