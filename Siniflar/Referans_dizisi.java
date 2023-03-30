public class Referans_dizisi {
    public static void main(String[] args) {
        Sinif[] dizi = new Sinif[50];

        for(int i = 0 ; i < 50; i++)
            dizi[i] = new Sinif();
        
        System.out.println("dizi[25] den sonra kaçtane eleman olusturuldu: " + dizi[25].BendenSonraKacNesne());
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
