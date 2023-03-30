public class AlaniniDondur {
    /** Main method */
    public static void main(String[] args) {
        // Yarıçapı 1 olan bir daire oluşturun
        basitdaire daire1 = new basitdaire();
        System.out.println("Yaricapi   " + daire1.radius + " olan cemberinin alani: "+ daire1.getArea());

        // Yarıçapı 25 olan bir daire oluşturun
        basitdaire daire2 = new basitdaire(25);
        System.out.println("Yaricapi  " + daire2.radius + " olan cemberinin alani: " + daire2.getArea());

        // Yarıçapı 125 olan bir daire oluşturun
        basitdaire daire3 = new basitdaire(125);
        System.out.println("Yaricapi " + daire3.radius + " olan cemberinin alani: " + daire3.getArea());

        // Daire yarıçapını değiştir
        daire2.radius = 100; // or circle2.setRadius(100)
        System.out.println("Yaricapi " + daire2.radius + " olan cemberinin alani: " + daire2.getArea());
    }
}

// Daire sınıfını iki kurucu ile tanımlayın
class basitdaire {
    double radius; // radius -- yaricap

    /** Yarıçapı 1 olan bir daire oluşturun*/
    basitdaire() {
        radius = 1;
    }

    /** Belirli bir yarıçapa sahip bir daire oluşturun */
    basitdaire(double newRadius) {
        radius = newRadius;
    }

    /** Bu dairenin alanını döndür */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /** Bu dairenin çevresini döndür */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Bu daire için yeni bir yarıçap belirleyin */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
