public class main {

    public static void HocaBilgisiYazdir(Hoca hoca)
    {
        System.out.println("Isim : " + hoca.getIsim() + " " + 
                           "Cinsiyet : " + hoca.getCinsiyet() + " " +
                           "Yas: " + hoca.getYas() + " " + 
                           "Bolum: " + hoca.getBolum() + " " +
                           "Unvan: " + hoca.getEgitimDurumuVeUnvan()
                );
    }
    
    public static void HocaBilgisYazdir(Hoca[] hocalarArr)
    {
        for(int i = 0; i<hocalarArr.length; i++)
        {
            System.out.println(hocalarArr[i].toString());
        }
    } 
    
    public static void main(String[] args) {
        
        Hoca TurgayHoca = new Hoca();
        TurgayHoca.setBolum("Bilgisayar Muhendisligi");
        TurgayHoca.setCinsiyet("Erkek");
        TurgayHoca.setEgitimDurumuVeUnvan("Prof.");
        TurgayHoca.setIsim("Turgay Tugay");
        TurgayHoca.setYas(45);
        
        
        TurgayHoca.setYas(46);
        
        Hoca ErgunHoca = new Hoca("Ergun", "Bilgisayar Muhendisligi", 38, "Dr. ", "Erkek");
        
        Hoca HaydarHoca = new Hoca("Haydar", "Bilgisayar Muhendisligi");
        
        System.out.println("Turgay Hoca: " + TurgayHoca.getIsim() + TurgayHoca.getCinsiyet() + TurgayHoca.getBolum() + TurgayHoca.getEgitimDurumuVeUnvan());
        HocaBilgisiYazdir(TurgayHoca);
        System.out.println(TurgayHoca.toString());
        
        
        Hoca[] arrayHocalar = new Hoca[3];
        arrayHocalar[0] = TurgayHoca;
        arrayHocalar[1] = ErgunHoca;
        arrayHocalar[2] = HaydarHoca;
        
        HocaBilgisYazdir(arrayHocalar);
        
    }
    
}
