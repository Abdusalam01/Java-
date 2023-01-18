public class degiskenler {

    
    void metod1(){//**  Local degişkenler */
        int n=1;
        System.out.println(n);
    }

    final int x=20; // SABİT DEĞİŞKEN TANIMLAMASI.

    

    public static void main(String[] args){
        
        /**
        int a=47;
        System.out.println(a);

        double d=3.3;
        System.out.println(d);

        char c='A';
        System.out.println(c);

        String sayi="Murat";
        System.out.println(sayi + " - " + "Kara");*/
         
        // TİP DÖNÜŞĞMLERİ
        String y="5";
        int a=Integer.parseInt(y); // --> string tipindeki y degişkenini int tipine dönüşturme işlemi.
        int b=Integer.valueOf(y); // parseInt ve valueOf metodların ikisinide tip dönüşüm yapmak için kullanabiliriz.
        System.out.println(a*a);
        System.out.println(b*b);

        double c=21.89;
        int v= (int) c;
        System.out.println(v);

        float f=44.4f;
        byte g=(byte) f;
        System.out.println(g);





        

    }
}
