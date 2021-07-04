package leson1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoAWT extends Frame implements ActionListener {

    private Button btnVang, btnDo, btnExit;
    private Label lblText;

    public DemoAWT(String title) {
        this.setTitle(title);
        this.setLayout(new FlowLayout());
        this.btnDo = new Button("Red");
        this.btnVang = new Button("Yellow");
        this.btnExit = new Button("Exit");
        this.lblText = new Label("Hello");
        this.btnVang.addActionListener(this);
        this.btnDo.addActionListener(this);
        this.btnExit.addActionListener(this);
        this.add(this.btnDo);
        this.add(this.btnVang);
        this.add(this.btnExit);
        this.add(this.lblText);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nut = e.getActionCommand();
        if (nut.equalsIgnoreCase("Yellow")) {
            this.setBackground(Color.yellow);
            this.lblText.setText("Hello ong vàng");
        }
        if (nut.equalsIgnoreCase("Red")) {
            this.setBackground(Color.red);
            this.lblText.setText("Hello ong nâu");

        }
        if (nut.equalsIgnoreCase("Exit")) {
            System.exit(0);
        }
    }

}
