import java.util.Scanner; 

public class Fit_Metre {   
    public static double main(Double feet) {   // double main metodu.
        double metre;  
        metre = feet * 0.305; // girilen fit digerinin kaç metre oldugunu hesaplar.   
        System.out.printf(feet + " fit " + "%.4f Metreye tekabul ediyor. \n", metre);   
        return 0;   
    }

    public static void main(String args []) {   
        Scanner input = new Scanner (System.in); // kullanıcıdan fit digerini iste
        System.out.print("fit digerini giriniz: ");
        double fit = input.nextDouble();   
        main(fit); // girilen fir miktarını main metoduna gonderir.
        input.close(); // input işleminin kapat.  
    }  
}  
