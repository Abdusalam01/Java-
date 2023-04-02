public class Araba {
    private String marka;
    private String renk;
    private String model;
    private int kapiSayisi;
    private int yil;
    private String Yakit_turu;
    private int beygir_gucu;
    private int Bagaj_kapasitesi;

    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getKapiSayisi() {
        return kapiSayisi;
    }
    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi == 2 || kapiSayisi == 4)
            this.kapiSayisi = kapiSayisi;
        else 
            System.out.println("Arabanin kapisayisi sadece 2 veya 4 olabilir!!!");
    }
    public int getYil() {
        return yil;
    }
    public void setYil(int yil) {
        this.yil = yil;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getYakit_turu() {
        return Yakit_turu;
    }
    public void setYakit_turu(String yakit_turu) {
        Yakit_turu = yakit_turu;
    }
    public int getBeygir_gucu() {
        return beygir_gucu;
    }
    public void setBeygir_gucu(int beygir_gucu) {
        this.beygir_gucu = beygir_gucu;
    }
    public int getBagaj_kapasitesi() {
        return Bagaj_kapasitesi;
    }
    public void setBagaj_kapasitesi(int bagaj_kapasitesi) {
        Bagaj_kapasitesi = bagaj_kapasitesi;
    }

    
    public void satilik(){
        System.out.println("Araba satilik...");
    }
    public void satildi(){
        System.out.println("Araba satilmistir...");
    }
    
    
}
