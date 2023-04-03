public class Sovalye extends Karakterler {

    public static Sovalye toString;
    private boolean durum;
    private int vurusHakki;
    private Sans sans;
    private String sovalyeTipi;
    
    Sovalye(String ad, int id, String sovalyeTipi, int vurusHakki) {
        super(ad, id);
        this.sovalyeTipi = sovalyeTipi;
        this.vurusHakki = vurusHakki;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    public int getVurusHakki() {
        return vurusHakki;
    }

    public void setVurusHakki(int vurusHakki) {
        this.vurusHakki = vurusHakki;
    }

    public Sans getSans() {
        return sans;
    }

    public void setSans(Sans sans) {
        this.sans = sans;
    }

    public String getSovalyeTipi() {
        return sovalyeTipi;
    }

    public void setSovalyeTipi(String sovalyeTipi) {
        this.sovalyeTipi = sovalyeTipi;
    }
    
    public void vur(Dusman d) {

    }

    @Override
    public String toString() {
        return super.toString() + "\nSovalye Tipi: " + sovalyeTipi + "\nSovalye Vurus Hakki: " + vurusHakki;
    }
    
}
