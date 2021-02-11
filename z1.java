package lab15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class z1 extends JFrame{
    private JLabel lbl;
    private TextField txt;
    private JButton but1;
    private JButton but2;

    public z1(){
        setBounds(400,400,200,200);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        lbl = new JLabel("Число:");
        add(lbl);

        txt = new TextField("0");
        txt.setEditable(false);
        add(txt);

        but1 = new JButton("+1");
        but2 = new JButton("-1");

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int plus1 = Integer.parseInt(txt.getText());
                txt.setText(Integer.toString(plus1+1));
                int a4 = Integer.parseInt(txt.getText());
                if (a4 == 4) {
                    txt.setText("0");
                }
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int minus1 = Integer.parseInt(txt.getText());
                txt.setText(Integer.toString(minus1-1));
                int a6 = Integer.parseInt(txt.getText());
                if (a6 == -6){
                    txt.setText("0");
                }
            }
        });

        add(but1);
        add(but2);
        setVisible(true);
    }
    public static void main(String[] args) {
        new z1();
    }
}
