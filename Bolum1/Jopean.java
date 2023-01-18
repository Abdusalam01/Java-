import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jopean {
    
    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLocation(50,50);
        frame.setVisible(true);

        //String input = JOptionPane.showInputDialog(frame,"MErhaba","NYP GUI",JOptionPane.PLAIN_MESSAGE); // Input (Girdi)
        //System.out.println(input);  // showInputDialog kullanıcıdan bir girdi ister.
        

        //int confirm = JOptionPane.showConfirmDialog(frame,"MErhaba","NYP GUI", JOptionPane.INFORMATION_MESSAGE); // confirm (onaylamak)
        //System.out.println(confirm); // showConfirmDialog kullanıcıya bir onay penceresi açar.

        //int confirm = JOptionPane.showConfirmDialog(frame,"Merhaba","NYP GUI", JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
        //System.out.println(confirm);

        /**
         *    JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE   --> HATA İKONU
         *    JOptionPane.PLAIN_MESSAGE   --> BİLGİ İKONU
         *    JOptionPane.WARNING_MESSAGE   --> UYARI İKONU
         *    JOptionPane.QUESTION_MESSAGE    --> SORU İKONU
         *    JOptionPane.PLAIN_MESSAGE    --> SADE İKON
         */

        /** Seçenek penceresi
        String dizi[]={"Elma","Nar","cilek","Muz"};
        int option = JOptionPane.showOptionDialog(frame, "En Sevdiginiz meyve", "~~~~~~~~~~~~~", JOptionPane.PLAIN_MESSAGE,
            JOptionPane.QUESTION_MESSAGE, null,dizi,dizi[0] ); // Option (seçenek)
        System.out.println(option);
        */

        String input = JOptionPane.showInputDialog(frame,"Adinizi giriniz: ","MESAJ KUTUSU",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(frame, " Gunaydin Bay " + input + " ,Okunmamis mesajiniz yok efendim...");

        
    }
}