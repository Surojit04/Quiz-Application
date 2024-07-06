import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame {
    JButton play_again, exit;

    Score(String name, int score) {

        JLabel heading = new JLabel("Thanks " + name + " for playing QUIZ TEST");
        heading.setBounds(310, 100, 1000, 65);
        heading.setFont(new Font("Tahoma", Font.BOLD, 45));
        heading.setForeground(Color.RED);
        add(heading);

        JLabel Score = new JLabel("Your Score is :" + score);
        Score.setBounds(550, 230, 1000, 65);
        Score.setFont(new Font("Tahoma", Font.BOLD, 35));
        Score.setForeground(new Color(0, 0, 0));
        add(Score);

        play_again = new JButton("Play Again");
        play_again.setBounds(620, 580, 150, 25);
        play_again.setFont(new Font("Railway", Font.BOLD, 21));
        play_again.setBackground(Color.WHITE);
        play_again.setForeground(Color.BLUE);
        // play_again.addActionListener(this);
        add(play_again);

        play_again.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Login();
            }

        });

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("score.png"));
        Image ii = i11.getImage().getScaledInstance(350, 200, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(ii);
        JLabel imagee = new JLabel(i22);
        imagee.setBounds(520, 320, 350, 200);
        imagee.setBackground(new Color(0, 0, 0, 0));
        add(imagee);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("picscoree.jpg"));
        Image i = i1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 1400, 800);
        add(image);

        setSize(1500, 2000);
        setLocation(0, 0);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Score("User", 0);
    }

}
