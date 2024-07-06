import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JTextField text;
    JButton button, button2;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("QUIZ TIME");
        heading.setBounds(170, 160, 600, 65);
        heading.setFont(new Font("Railway", Font.BOLD, 61));
        heading.setForeground(Color.RED);
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(200, 300, 300, 45);
        name.setFont(new Font("Railway", Font.BOLD, 31));
        name.setForeground(Color.white);
        add(name);

        text = new JTextField(21);
        text.setBounds(170, 360, 320, 25);
        text.setFont(new Font("Railway", Font.BOLD, 21));
        add(text);

        button = new JButton("Back");
        button.setBounds(210, 410, 90, 25);
        button.setFont(new Font("Railway", Font.BOLD, 21));
        button.setBackground(Color.WHITE);
        button.setForeground(Color.blue);
        button.addActionListener(this);
        add(button);

        button2 = new JButton("Next");
        button2.setBounds(370, 410, 90, 25);
        button2.setFont(new Font("Railway", Font.BOLD, 21));
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.blue);
        button2.addActionListener(this);
        add(button2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizpic.jpg"));
        Image i = i1.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 1500, 800);
        add(image);

        setSize(1500, 2000);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.exit(50);
        } else if (e.getSource() == button2) {
            String name = text.getText();
            new Rules(name);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
