package lab1;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{

    JTextField txtFirst = new JTextField();
    JTextField txtSecond = new JTextField();
    JTextField txtResult = new JTextField();
    JLabel lblFirst = new JLabel("First: ");
    JLabel lblSecond = new JLabel("Second: ");
    JLabel lblResult = new JLabel("Result: ");
    JButton btnC = new JButton("+");
    JButton btnT = new JButton("-");
    JButton btnN = new JButton("*");
    JButton btnChi = new JButton("/");
    Container container = getContentPane();

    public Calculator() {
        setLocationRelativeTo(null);
        container.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Máy tính");
        this.setSize(400,300);
        setBounds();
        addContainer();
        addAction ();
    }

    private void setBounds() {
        txtFirst.setBounds(20, 30, 80, 20);
    }

    private void addContainer() {
        container.add(txtFirst);
    }

    private void addAction() {
        btnC.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnC){
            //thực hiện 
        }
    }
    
}
