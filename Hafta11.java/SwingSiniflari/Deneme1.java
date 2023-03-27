
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.event.*;

public class Deneme1 extends JFrame implements ActionListener {

    JRadioButton b1,b2,b3,b4;
    JLabel jl1;
    JButton button;
    Deneme1() {
        super("Bilet Al");
        jl1 = new JLabel("--Gideceginiz sehiri seciniz--");
        jl1.setBounds(50, 30, 200, 40);

        String[] otogarlar = {"Dudulu","Sultanbeyli","umraniye","Fatih","Esenler","avcilar","Beylikduzu"};
        final JComboBox<String> cb = new JComboBox<>(otogarlar);
        cb.setBounds(220, 80, 120, 40);
        add(cb);

        b1 = new JRadioButton("Istanbul");
        b1.setBounds(70, 80, 120, 40);

        b2 = new JRadioButton("Ankara");
        b2.setBounds(70, 110, 120, 40);

        b3 = new JRadioButton("Bursa");
        b3.setBounds(70, 150, 120, 40);

        b4 = new JRadioButton("Izmir");
        b4.setBounds(70, 190, 120, 40);

        button = new JButton("Odene yap");
        button.setBounds(150, 250,120,40);
        button.addActionListener(this);

        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);

        add(jl1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(button);


        this.setLayout(null);
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Deneme1 d1 = new Deneme1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (b1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Istanbul'a otobus fiyari: 370");
        }
        if (b2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ankara'ya otobus fiyari: 200");
        }
        if (b3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bursa'ya otobus fiyari: 480");
        }
        if (b4.isSelected()) {
            JOptionPane.showMessageDialog(this, "izmir'e otobus fiyari: 600");
        }

    }
    
}
