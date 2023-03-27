import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Deneme1 extends JFrame implements ActionListener,ItemListener,MouseListener,MouseMotionListener,KeyListener, java.awt.event.ActionListener{

    JButton[] butonlar;
	JTextField jtf; // metin alani
	JLabel jlbl;  // etiket
	JCheckBox jcb1,jcb2;  // onay kutusu

    Deneme1(){
		super("NYP");
		butonlar = new JButton[20]; // botonlar nesnesinin tanimlanmasi

		for(int i=0;i<butonlar.length;i++) {
			butonlar[i]=new JButton("Dugme"+(i+1)); // dugme butonlarının yaratılışı
			butonlar[i].addActionListener(this);  // Butonu tiklamak, checkbox’u isaretlemek gibi islemleri bu interface sayesinde yönetiriz.
			this.add(butonlar[i]); // butonlara[i]'yi pencereye ekler
		}
		
		
		jtf=new JTextField("1234567891045435");  // metin alanina yazilacak olanlar
		//jtf.setSize(180, 30);
		this.add(jtf);  // meetin alianinn pencerede aktif hale getirilmesi
		
		jlbl=new JLabel("Bu bir etikettir:");  // etiken alaninin tanimlanmasi ve etiket alanina yazilacak olanlar
		this.add(jlbl);  // etiket alanini pencereye ekler  
		
        // onay kutularının tanimlanmas,
		jcb1=new JCheckBox("Java");  
		jcb2=new JCheckBox("Python");
		jcb2.setSelected(true); //Düğme Modeli. Bir seferde grupta sadece bir düğme seçilebilir.
		jcb1.addItemListener(this); // Onay kutusuna her tıkladığınızda Java ItemListener bildirilir.
		jcb2.addItemListener(this);
        // onay kutularının pencereye ekler
		this.add(jcb1);
		this.add(jcb2);
		
		// butonlar[5].addMouseListener(this);
		// this.addMouseMotionListener(this);
		// jtf.addKeyListener(this);
		
		

		this.setSize(600, 420);  // pencerenin poyutunun ayarlanmasi
		this.setResizable(false);
		this.setVisible(true);  // pencerenin aktif hale getirmek icin true ver, false verirsen penceren görünmeyecektir.
		this.setLayout(new FlowLayout()); // Flowlayout() metodu butonlerın pencerediki görünümünü belirler,
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

    public void actionPerformed(ActionEvent e) { // eylem Gerçekleştirildi
		/*
		for(int i=0;i<butonlar.length;i++) {
			if(e.getSource().equals(butonlar[i]))
				JOptionPane.showMessageDialog(null,butonlar[i].getText(),"Olay var!",2);
		}
		*/
		
		for(int i=0;i<butonlar.length;i++) {
			if(e.getActionCommand().equals(butonlar[i].getText())) {
				String metin=jtf.getText();
				int f=Integer.parseInt(metin);
				JOptionPane.showMessageDialog(null,f+1,"Olay var!",2);
			}
		}
		
	}

    public void itemStateChanged(ItemEvent e) {
		if(e.getSource().equals(jcb1) && jcb1.isSelected())
			System.out.println("Java jcb aktif");
		else if(e.getSource().equals(jcb1) && !jcb1.isSelected())
			System.out.println("Java jcb inaktif");
		else if(e.getSource().equals(jcb2) && jcb2.isSelected())
			System.out.println("Python jcb aktif");
		else if(e.getSource().equals(jcb2) && !jcb2.isSelected())
			System.out.println("Python jcb inaktif");
	}

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {  
        System.out.println(e.getKeyChar()+" tusuna basildi");
    }

    @Override
    public void keyReleased(KeyEvent e) {  
        System.out.println(e.getKeyChar()+" tusu birakildi");
    }

    @Override
    public void mouseDragged(MouseEvent e) { 
        System.out.println("Dragci var!");
    }

    @Override
    public void mouseMoved(MouseEvent e) {  
        jtf.setText(e.getX()+","+e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) { 
        System.out.println(e.getButton()+" "+e.getX()+","+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {  
    }

    @Override
    public void mouseReleased(MouseEvent e) { 
    }

    @Override
    public void mouseEntered(MouseEvent e) {  
        System.out.println("Buton6 sinirlarina girildi.");
    }

    @Override
    public void mouseExited(MouseEvent e) {  
        System.out.println("Buton6 disina cikildi.");
    }

    public static void main(String[] args) {
		Deneme1 x = new Deneme1();
	}

}