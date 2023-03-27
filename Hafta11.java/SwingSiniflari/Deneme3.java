import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.*;

public class Deneme3 extends JFrame implements ActionListener {
    JLabel isim,cinsiyet ,kurslar;
    JTextField isimKutusu;
    JRadioButton erkek,kadin,bos,ingilizce, cince, japonca, rusca;
    JButton button;

    Deneme3() {

        super("Kayit pernceresi");

        isim = new JLabel("Ad-Soyad ");
        isim.setBounds(30, 30, 100, 30);
        this.add(isim);

        isimKutusu = new JTextField(20);
        isimKutusu.setBounds(105, 30, 200, 30);
        this.add(isimKutusu);

        cinsiyet = new JLabel("Cinsiyet: ");
        cinsiyet.setBounds(30, 70, 100, 30);
        this.add(cinsiyet);

        erkek = new JRadioButton("Erkek");
        erkek.setBounds(100, 70, 70, 30);
        this.add(erkek);

        kadin = new JRadioButton("Kadin");
        kadin.setBounds(170, 70, 70, 30);
        this.add(kadin);

        bos = new JRadioButton("Belirtmek istemiyorum");
        bos.setBounds(240, 70, 180, 30);
        this.add(bos);

        ButtonGroup bg = new ButtonGroup();
        bg.add(erkek);
        bg.add(kadin);
        bg.add(bos);

        kurslar = new JLabel("Kayit yaptirmak istadiginiz kurs:");
        kurslar.setBounds(30, 110, 250, 40);
        this.add(kurslar);

        ingilizce = new JRadioButton("Ingilizce");
        ingilizce.setBounds(50, 150, 90, 30);
        this.add(ingilizce);

        cince = new JRadioButton("Çince");
        cince.setBounds(50, 180, 90, 30);
        this.add(cince);

        japonca = new JRadioButton("Japonca");
        japonca.setBounds(50, 210, 90, 30);
        this.add(japonca);

        rusca = new JRadioButton("Rusca");
        rusca.setBounds(50, 240, 90, 30);
        this.add(rusca);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(ingilizce);
        bg2.add(cince);
        bg2.add(japonca);
        bg2.add(rusca);


        button = new JButton("Tamamla");
        button.setBounds(150, 300, 120, 40);
        button.addActionListener(this);
        this.add(button);
        


        this.setLayout(null);
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Deneme3 d3 = new Deneme3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String title = "Kayit bilgileri";
        String ad = isimKutusu.getText();
        
        // System.out.println("                Kayir bilgileri             ");
        // System.out.println("---------------------------------------------\n");
        // System.out.println("Ad-Soyad: " + isimKutusu.getText());
        
        String c = "";
        if (erkek.isSelected()) {
            c = "Cinsiyet:   Erkek";
        }
        else if (kadin.isSelected()) {
            c = "Cinsiyet:   Kadin";
        }
        else if (bos.isSelected()) {
            c = "Cinsiyet:   Belirtirmedi";
        }

        String kurs ="";
        if (ingilizce.isSelected()) {
            kurs = "Ingilizce";
        }
        else if (cince.isSelected()) {
            kurs = "Çince";
        }
        else if (japonca.isSelected()) {
            kurs = "Japonca";
        }
        else if (rusca.isSelected()) {
            kurs = "Rusça";
        }
        JOptionPane.showMessageDialog(this, "------------   Kayit bilgileri   -------------\n" + 
                                            "Ad-Soyad:   " + ad + "\n" + c + "\n" + "Secilen kurs:   " +kurs + 
                                            "\n---------------------------------------\n", title, JOptionPane.PLAIN_MESSAGE);
    }
    
}
