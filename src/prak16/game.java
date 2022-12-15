package prak16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class game extends JFrame
{
    int number = (int)(Math.random()*21);
    int attempt = 0;
    JTextField jta = new JTextField(10);
    JButton button = new JButton("Проверить");

    game()
    {
        super();
        System.out.println(number);
        setLayout(new FlowLayout());
        setSize(450, 150);
        add(new JLabel("Угадайте число от 0 до 20"));
        add(jta);
        add(button);
        String message;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                    int x = Integer.valueOf(jta.getText().trim());
                    if (x == number) {
                        JOptionPane.showMessageDialog(null, "Верно.", "Ответ:", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        System.exit(0);
                    }
                    else {
                        attempt++;
                        if (attempt >= 3) {
                            JOptionPane.showMessageDialog(null, "Вы проиграли...", "Предупреждение", JOptionPane.INFORMATION_MESSAGE);
                            setVisible(false);
                            System.exit(0);
                        }
                        else {
                            if (x > number)
                                JOptionPane.showMessageDialog(null, "Ваше число больше загаданного", "Ответ: ", JOptionPane.INFORMATION_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "Ваше число меньше загаданного", "Ответ: ", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }

            }
        });


        setVisible(true);
    }


    public static void main(String[] args) {
        new game();
    }

}
