public class Static_degiskeni {
    public static void main(String[] args) {

        Sinif x = new Sinif();
        Sinif y = new Sinif();
        Sinif z = new Sinif();

        System.out.println("Static degiskenin suanki degeri : " + Sinif.sayi + "\n");

        System.out.println("X ten sonra kac nesne olusturuldu : " + x.BendenSonraKacNesne());
        System.out.println("Y ten sonra kac nesne olusturuldu : " + y.BendenSonraKacNesne());
        System.out.println("Z ten sonra kac nesne olusturuldu : " + z.BendenSonraKacNesne() + "\n");
        
        
    }
}

class Sinif {
    static int sayi = 0;
    int indis = 0;

    Sinif(){
        sayi++;
        indis = sayi;
    }

    int BendenSonraKacNesne(){
        return sayi - indis;
    }
}