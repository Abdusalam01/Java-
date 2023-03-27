import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Deneme2 {
    public static void main(String[] args) {

        JFrame f = new JFrame("JFrame Deneme");  // JFrame Deneme adinda bir pencere oluşturur
        String[][] dersler = {{"Matematik","Mat1","6"},{"NYP","NYP","5"},{"Fizik","Fiz2","6"},{"EDT","Edt","5"}};  // iki boyutlu dizi tanimlamasi
        String[] basliklar = {"ders adi","derse kodu","ders kiredisi"}; // tek boyutlu dizi tanimlanmasi

        JTable jt = new JTable(dersler,basliklar); // tablo olusturur ve tablo icine dersler ve basliklar parametrelerini yaziyor

        JScrollPane sp = new JScrollPane(jt); // tamlodaki bütün verileri gorebilmemizi sağlıyor

        jt.setBounds(30,40,200,300); // tabloyun boyutu
        f.add(sp);  // olusan tablonun pencereye eklenmesi

        f.setSize(500,500); // pencerenin boyutunu ayarla
        f.setVisible(true);  // pencerenin görünürlüğü
    }
}
