public class Karakterler {
    private String ad;
    private int id;
    private boolean aktif;

    Karakterler(String ad, int id) {
        this.ad = ad;
        this.id = id;
    }
    

    public String getAd() {
        return ad;
    }


    public void setAd(String ad) {
        this.ad = ad;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
    @Override
    public String toString() {
        return "\nSovalye Adi: " + ad + "\nSovalye ID: " + id;
    }

}