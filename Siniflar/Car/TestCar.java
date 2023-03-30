package Car;
public class TestCar {
    public static void main(String[] args) {
        Car araba1 = new Car();
        araba1.setModel("Mercedes GT63S");
        araba1.setYil(2022);
        araba1.setRenk("Mavi");
        araba1.setKapiSayisi(1);

        System.out.println("Araba modeli:         " + araba1.getModel());
        System.out.println("Araba model yili:     " + araba1.getYil());
        System.out.println("Araba rengi:          " + araba1.getRenk());
        System.out.println("Araba kapi sayisi:    " + araba1.getKapiSayisi());

        araba1.satilik();
    }
}
