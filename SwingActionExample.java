package lab15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingActionExample extends JFrame implements ActionListener{
    private TextField txt;
    private JButton but1;
    private JButton but2;
    private JButton but3;

    public SwingActionExample(){
        setBounds(400,400,150,300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        txt = new TextField("Click Button");
        txt.setEditable(false);
        add(txt);

        but1 = new JButton("Button 1");
        but2 = new JButton("Button 2");
        but3 = new JButton("Button 3");

        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);

        add(but1);
        add(but2);
        add(but3);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getActionCommand().equals("Button 1")){
            txt.setText("You pressed Button 1");
        }
        else if(a.getActionCommand().equals("Button 2")){
            txt.setText("You pressed Button 2");
        }
        else if(a.getActionCommand().equals("Button 3")){
            txt.setText("You pressed Button 3");
        }
    }
    public static void main(String[] args) {
        new SwingActionExample();
    }
}
