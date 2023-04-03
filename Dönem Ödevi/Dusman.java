public class Dusman extends Karakterler{

    private boolean durum;
    private String dusmanTipi;
    private String ad;
    private int id;
    Dusman(String ad, int id) {
        super(ad, id);
        this.ad = ad;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Dusman Adi: " + ad ;
    }
}
