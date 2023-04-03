import java.io.*;

public class CSVOyunverisi extends OyunVerisi {
    public static void main(String[] args) {
    
    }
    public void kayitVerileriniYukle() {

    }
    public static void OyunVerileriniYukle() throws IOException {
        String str = "Bunu dosyaya yazdir";

        File file = new File("dosya.txt"); // dosya.txt adinda bir dosya olusturur
    
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();

    }
}
