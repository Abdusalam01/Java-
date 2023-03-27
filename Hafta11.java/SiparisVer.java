import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SiparisVer extends JFrame implements ActionListener {
    JLabel label1 , label2;
    JCheckBox cb1, cb2, cb3;
    JButton b;
    JRadioButton rb1,rb2;

    SiparisVer() {

        // Pizza çeşitlerinin JComboBox ile tanimlanmasi
        String[] pizzaCesitleri = {"Sucuklu","Kasarli","Zeytinli","Karisik"};
        final JComboBox<String> cb = new JComboBox<>(pizzaCesitleri);
        cb.setBounds(240,140,100,20);
        add(cb);

        // Pencerenin başlığı
        this.setTitle("Yemek siparis Programi");

        // 
        label2 = new JLabel("Siparis turu");
        label2.setBounds(50,20,300,20);

        label1 = new JLabel("Yemek Siparisi");
        label1.setBounds(50,110,300,20);

        rb1 = new JRadioButton("Eve siparis");
        rb1.setBounds(100,40,100,30);

        rb2 = new JRadioButton("Gel al");
        rb2.setBounds(100,70,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        cb1 = new JCheckBox("Pizza : 60₺");
        cb1.setBounds(100,140,120,20);

        cb2 = new JCheckBox("Burger : 40₺");
        cb2.setBounds(100,180,120,20);

        cb3 = new JCheckBox("Kola : 8₺");
        cb3.setBounds(100,220,120,20);

        b = new JButton("Siparisi ver");
        b.setBounds(100,250,120,30);
        b.addActionListener(this);

        add(label2);    add(label1);
        add(rb1);       add(rb2);
        add(cb1);       add(cb2);       add(cb3);
        add(b);

        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // pencere kapatildiginda program sonlanacak

    }
    public static void main(String[] args) {
        SiparisVer sv = new SiparisVer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        float toplam = 0;
        String msg = "";
        
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Eve siparis verdiniz");
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Gel al siparisi verdiniz");
        }
        if (cb1.isSelected()) {

            toplam += 60;
            msg += "Pizza: 60₺\n";
        }
        if (cb2.isSelected()) {
            toplam += 40;
            msg += "Burger: 40₺\n";
        }
        if (cb3.isSelected()) {
            toplam += 8;
            msg += "Kola: 8₺\n";
        }
        msg += "-----------------------------\n";
        JOptionPane.showMessageDialog(this, msg + "Toplam: " + toplam);
    }

}
