package lesson2;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Thuy Linh
 */
public class DemoCodeTay extends JFrame {

    private JTextField txtEmpty, txtFullName, txtUser;

    public DemoCodeTay() {
        this.txtEmpty = new JTextField();
        this.txtFullName = new JTextField("Phạm Linh");
        this.txtUser = new JTextField(20);

        this.getContentPane().setLayout(new FlowLayout());

        this.getContentPane().add(this.txtEmpty);
        this.getContentPane().add(this.txtFullName);
        this.getContentPane().add(this.txtUser);

    }

    public static void main(String[] args) {
        DemoCodeTay gui = new DemoCodeTay();
        gui.setSize(400, 400);
        gui.setVisible(true);
    }

}
