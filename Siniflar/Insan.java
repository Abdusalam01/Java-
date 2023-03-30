public class Insan{

    String ad;
    int yas;

    void adYaz(String a){
        ad = a;
    }
    void yasyaz(int b){
        yas = b;
    }

    String adVer() 
    {
        return ad;
    }
    
    int yasVer(){
        return yas;
    }
    public static void main(String[] args) {
        Insan kisi = new Insan();
        kisi.ad = "Mustafa";
        kisi.yas = 27;

        System.out.println(kisi.ad + "\t" + kisi.yas);

        System.out.println(kisi.adVer() + "\t" + kisi.yasVer());

        kisi.adYaz("Turan");
        kisi.yasyaz(23);
        System.out.println(kisi.adVer() + "\t" + kisi.yasVer());

        /** 
        new Insan();
        System.out.println("yeni insan yasi: " + new Insan().yasVer(39));*/
    }
}