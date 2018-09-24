import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HelloGUI {

        public static void main(String[] args) {
                JFrame okno = new JFrame("Nase okno");
                okno.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent arg0) {
                                System.exit(1);
                        }
                });
                okno.setSize(600,400);
                okno.setLocation(500,300);
                okno.getContentPane().setBackground(Color.cyan);
                okno.setLayout(null);
                JButton tlacitko = new JButton("Stiskni me");
                tlacitko.setBounds(200, 80, 200, 200);
                tlacitko.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                                JOptionPane.showMessageDialog(okno,"Ahoj Viktorko");
                        }
                });
                okno.add(tlacitko);
                okno.setVisible(true);
        }
}