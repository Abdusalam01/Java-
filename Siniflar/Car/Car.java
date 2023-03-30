package Car;
public class Car {
    private String renk;
    private String model;
    private int kapiSayisi;
    private int yil;
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


    public void satilik(){
        System.out.println("Araba satilik...");
    }
    public void satildi(){
        System.out.println("Araba satilmistir...");
    }
    
}
