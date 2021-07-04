/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Thuy Linh
 */
public class FormHSinh extends JFrame {

    private JFrame frame;
    private JLabel lblname, lblpass, lblcomfirm;
    private JTextField txtName;
    private JPasswordField txtPass, txtConfirm;
    private JPanel control;

    public FormHSinh() {
        hienThi();
    }

    public static void main(String[] args) {
        FormHSinh hs = new FormHSinh();
        hs.checkForm();
    }

    private void hienThi() {
        setLocationRelativeTo(null);
        frame = new JFrame("Check Form Hs");
        frame.setSize(400, 250);
        frame.setLayout(getLayout());
        frame.addWindowListener(new WindowAdapter() {
            public void window(WindowEvent e) {
                System.exit(0);
            }
        });
        lblname = new JLabel("Name:");
        lblname.setBounds(40, 20, 50, 20);
        lblpass = new JLabel("Password");
        lblpass.setBounds(40, 50, 90, 20);
        lblcomfirm = new JLabel("Confirm:");
        lblcomfirm.setBounds(40, 80, 50, 20);
        txtName = new JTextField();
        txtName.setBounds(150, 20, 200, 20);
        txtPass = new JPasswordField();
        txtPass.setBounds(150, 50, 200, 20);
        txtConfirm = new JPasswordField();
        txtConfirm.setBounds(150, 80, 200, 20);
        control = new JPanel();
        control.setLayout(getLayout());
        frame.add(lblname);
        frame.add(lblpass);
        frame.add(lblcomfirm);
        frame.add(txtConfirm);
        frame.add(txtName);
        frame.add(txtPass);
        frame.add(control);
        frame.setVisible(true);
    }

    private void checkForm() {
        JButton btnSign = new JButton("Sign Up");
        btnSign.setBounds(150, 110, 80, 20);
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(270, 110, 80, 20);
        btnSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ("".equals(txtName.getText())) {
                    JOptionPane.showMessageDialog(null, "Tên không được để trống");
                    txtName.requestFocus();
                    return;
                }
                String pas = String.valueOf(txtPass.getPassword());
                String repas = String.valueOf(txtConfirm.getPassword());
                if ("".equals(pas)) {
                    JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống");
                    txtPass.requestFocus();
                    return;
                }
                if (!pas.equals(repas)) {
                    JOptionPane.showMessageDialog(null, "Sai confirm mật khẩu, nhập lại");
                    txtConfirm.requestFocus();
                    return;
                }
                JOptionPane.showMessageDialog(null, "Successfull");
            }
        });
        btnCancel.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        control.add(btnSign);
        control.add(btnCancel);

    }

}
