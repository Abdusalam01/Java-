import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hesapla extends JFrame implements ActionListener {

    JButton buton1, buton2, buton3, buton4;
    JTextField text1, text2; // kullanicidan veri almak için
    JLabel label1;

    Hesapla() {
        text1 = new JTextField();
        text1.setBounds(90,50,150,30);

        text2 = new JTextField();
        text2.setBounds(90,90,150,30);

        label1 = new JLabel("sonuc: ");
        label1.setBounds(190,140,150,30);

        buton1 = new JButton("+");
        buton1.setBounds(50,200,100,30);

        buton2 = new JButton("-");
        buton2.setBounds(150,200,100,30);

        buton3 = new JButton("*");
        buton3.setBounds(250,200,100,30);

        buton4 = new JButton("/");
        buton4.setBounds(350,200,100,30);

        add(text1);
        add(text2);
        add(label1);
        add(buton1);
        add(buton2);
        add(buton3);
        add(buton4);

        // butonlari takip edebilmemiz için
        buton1.addActionListener(this);
        buton2.addActionListener(this);
        buton3.addActionListener(this);
        buton4.addActionListener(this);

        //objeleri pencereye tanimladigimiz sekilde gorebilmemiz için
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        Hesapla j = new Hesapla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(text1.getText());
        int b = Integer.parseInt(text2.getText());
        int c = 0;

        if (e.getSource().equals(buton1)) {
            c = a + b;
            label1.setText(String.valueOf(c));
        }
        else if (e.getSource().equals(buton2)) {
            c = a - b;
            label1.setText(String.valueOf(c));
        }
        else if (e.getSource().equals(buton3)) {
            c = a * b;
            label1.setText(String.valueOf(c));
        }
        else if(e.getSource().equals(buton4)) {
            c = a / b;
            label1.setText(String.valueOf(c));
        }
    }
}
