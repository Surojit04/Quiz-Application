import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Rules extends JFrame implements ActionListener {
    JButton button1, button2;
    String name;

    Rules(String name) {
        this.name = name;

        JLabel heading = new JLabel("Welcome " + name + " To Quiz Test");
        heading.setBounds(60, 40, 1000, 65);
        heading.setFont(new Font("Railway", Font.BOLD, 51));
        heading.setForeground(Color.RED);
        add(heading);

        // Rules

        // JLabel rule = new JLabel("RULES:");
        // rule.setBounds(20, 120, 600, 45);
        // rule.setFont(new Font("Railway", Font.BOLD, 20));
        // rule.setForeground(Color.WHITE);
        // add(rule);

        // Rule1
        JLabel rule1 = new JLabel("1. You can't use your mobile phone.");
        rule1.setBounds(100, 180, 600, 55);
        rule1.setFont(new Font("Railway", Font.BOLD, 28));
        rule1.setForeground(Color.WHITE);
        add(rule1);

        // Rule2
        JLabel rule2 = new JLabel("2. You should not leave the camera's frame.");
        rule2.setBounds(100, 240, 600, 55);
        rule2.setFont(new Font("Railway", Font.BOLD, 28));
        rule2.setForeground(Color.WHITE);
        add(rule2);

        // Rule3
        JLabel rule3 = new JLabel("3. You only have 15 seconds to answer.");
        rule3.setBounds(100, 300, 600, 55);
        rule3.setFont(new Font("Railway", Font.BOLD, 28));
        rule3.setForeground(Color.WHITE);
        add(rule3);

        // Rule4
        JLabel rule4 = new JLabel("4. No talking.");
        rule4.setBounds(100, 360, 600, 55);
        rule4.setFont(new Font("Railway", Font.BOLD, 28));
        rule4.setForeground(Color.WHITE);
        add(rule4);

        // Rule5
        JLabel rule5 = new JLabel("5. No one else can be in the room with you.");
        rule5.setBounds(100, 420, 600, 55);
        rule5.setFont(new Font("Railway", Font.BOLD, 28));
        rule5.setForeground(Color.WHITE);
        add(rule5);

        // Button1
        button1 = new JButton("Back");
        button1.setBounds(180, 520, 100, 25);
        button1.setFont(new Font("Railway", Font.BOLD, 21));
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLUE);
        button1.addActionListener(this);
        add(button1);

        // Button2
        button2 = new JButton("Next");
        button2.setBounds(450, 520, 100, 25);
        button2.setFont(new Font("Railway", Font.BOLD, 21));
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.BLUE);
        button2.addActionListener(this);
        add(button2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizpic.jpg"));
        Image i = i1.getImage().getScaledInstance(1500, 900, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 1500, 200);
        add(image);

        setSize(1500, 900);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            setVisible(false);
            new Login();

        } else if (e.getSource() == button2) {

            new Quiz(name);
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}