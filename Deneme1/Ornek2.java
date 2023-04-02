import javax.swing.JOptionPane;

public class Ornek2 {
    public static void main(String[] args) {
        String metin = "Lütfen Seçiminizi yapın: \n---------------------------\n\n\n";
        String liste = "1- Listeye yeni isim ekle\n" + 
                       "2- Listeden ismi sil\n" + 
                       "3- Listeyi Göster\n" + 
                       "(0 veya Cancel) Programı Sonlandır\n";
        String n = (String)JOptionPane.showInputDialog(null, metin + liste,"Menü", JOptionPane.QUESTION_MESSAGE, null,null,"1");

        System.out.println(n);
    }
}
