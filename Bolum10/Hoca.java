public class Hoca {
    
    private String isim;
    private String bolum;
    private int yas;
    private String egitimDurumuVeUnvan;
    private String cinsiyet;
    
    public String getIsim()
    {
        return isim;
    }
    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getEgitimDurumuVeUnvan() {
        return egitimDurumuVeUnvan;
    }

    public void setEgitimDurumuVeUnvan(String egitimDurumuVeUnvan) {
        this.egitimDurumuVeUnvan = egitimDurumuVeUnvan;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
        
    
    public Hoca()
    {
        System.out.println("Empty Constructor Called!!");
    }
    public Hoca(String isim, String bolum, int yas, String egitimDurumuVeUnvan, String cinsiyet)
    {
        this.isim = isim;
        this.bolum = bolum;
        this.yas = yas;
        this.egitimDurumuVeUnvan = egitimDurumuVeUnvan;
        this.cinsiyet = cinsiyet;
        System.out.println("Parameterized Constructor Called!!");
    }
    
    public Hoca(String isim, String bolum)
    {
        this.isim = isim;
        this.bolum = bolum;
        yas = 0;
        egitimDurumuVeUnvan = "";
        cinsiyet = "";
        System.out.println("Custom Constructor Called!!");
    }

    @Override
    public String toString() {
        return "Isim : " + isim + " " + 
                "Cinsiyet : " + cinsiyet + " " +
                "Yas: " + yas + " " + 
                "Bolum: " + bolum + " " +
                "Unvan: " + egitimDurumuVeUnvan;
    }
    
    
    
    
    
}
