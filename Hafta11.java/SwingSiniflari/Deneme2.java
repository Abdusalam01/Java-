import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Deneme2 extends JFrame implements ActionListener {

    JButton[] button;

    Deneme2() {
        super("sayi->harf");
        button = new JButton[26];
        
        this.setLayout(new FlowLayout());
        int sayac = 1;
        for (JButton d: button) {
            d = new JButton("" + sayac++);
            d.addActionListener(this);
            this.add(d);
        }

        this.setSize(500, 210);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Deneme2 d2 = new Deneme2();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton x = (JButton) e.getSource();

        try {
            char t = (char)(Integer.parseInt(x.getText()) + 64);
            x.setText("" + t);
        } catch(Exception ex) { }
        
    }

    
}