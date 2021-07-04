/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Thuy Linh
 */
public class MayTinh extends JFrame {

    private JFrame frame;
    private JLabel lblFirst, lblSecond, lblRessult;
    private JTextField txtFirst, txtSecond, txtRessult;
    private JPanel control1,control2,control3;

    public MayTinh() {
        hienThi();
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MayTinh fr = new MayTinh();
        fr.Tinh();
    }

    private void hienThi() {
        setLocationRelativeTo(null);
        frame = new JFrame("Máy tính");
        frame.setSize(400, 250);
        frame.setLayout(getLayout());
        frame.addWindowListener(new WindowAdapter() {
            public void window(WindowEvent e) {
                System.exit(0);
            }
        });
        lblFirst = new JLabel("First Number:");
        lblFirst.setBounds(20, 20, 120, 20);
        lblSecond = new JLabel("Second Number:");
        lblSecond.setBounds(20, 50, 120, 20);
        lblRessult = new JLabel("Result:");
        lblRessult.setBounds(20, 80, 50, 20);
        txtFirst = new JTextField();
        txtFirst.setBounds(150, 20, 200, 20);
        txtSecond = new JTextField();
        txtSecond.setBounds(150, 50, 200, 20);
        txtRessult = new JTextField();
        txtRessult.setBounds(150, 80, 200, 20);
        control1 = (JPanel) getContentPane();
        control1.add(lblFirst);
        control1.add(lblSecond);
        control1.add(lblRessult);
        
        frame.add(control1);
        control2=(JPanel) getContentPane();
        control2.add(txtFirst);
        control2.add(txtRessult);
        control2.add(txtSecond);
        frame.add(control2);
        frame.add(control3);
        control1.setLayout(null);
        control2.setLayout(null);
        control3.setLayout(null);
        frame.setVisible(true);

    }

    public boolean checkNull() {
        if ("".equals(txtFirst.getText())) {
            JOptionPane.showMessageDialog(null, "Nhập số thứ nhất");
            txtFirst.requestFocus();
            return false;
        }
        if ("".equals(txtSecond.getText())) {
            JOptionPane.showMessageDialog(null, "Nhập số thứ hai");
            txtSecond.requestFocus();
            return false;
        }
        return true;
    }
    double so1, so2;

    private void Tinh() {

        JButton btnCong = new JButton("Cộng");
        btnCong.setBounds(10, 120, 80, 20);
        JButton btnTru = new JButton("Trừ");
        btnTru.setBounds(100, 120, 80, 20);
        JButton btnNhan = new JButton("Nhân");
        btnNhan.setBounds(190, 120, 80, 20);
        JButton btnChia = new JButton("Chia");
        btnChia.setBounds(280, 120, 80, 20);
        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(280, 150, 80, 20);
        btnCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkNull()) {
                    so1 = Double.valueOf(txtFirst.getText());
                    so2 = Double.valueOf(txtSecond.getText());
                    txtRessult.setText(String.valueOf(so1 + so2));
                }
            }
        });
        btnTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkNull()) {
                    so1 = Double.valueOf(txtFirst.getText());
                    so2 = Double.valueOf(txtSecond.getText());
                    txtRessult.setText(String.valueOf(so1 - so2));
                }
            }
        });

        btnNhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkNull()) {
                    so1 = Double.valueOf(txtFirst.getText());
                    so2 = Double.valueOf(txtSecond.getText());
                    txtRessult.setText(String.valueOf(so1 * so2));
                }
            }
        });
        btnChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkNull()) {
                    so1 = Double.valueOf(txtFirst.getText());
                    so2 = Double.valueOf(txtSecond.getText());
                    txtRessult.setText(String.valueOf(so1 / so2));
                }
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        control3.add(btnChia);
        control3.add(btnCong);
        control3.add(btnNhan);
        control3.add(btnTru);
        control3.add(btnExit);
    }

}
