import java.util.Scanner;

public class Onaltilik_ikilik {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir dize girmesini isteyin
        System.out.print("Bir onaltilik sayi girin: ");
        String hex = input.nextLine();

        System.out.println("Onaltilik sayi icin ondalik deger karsiligi "
        + hex + " = " + hexToDecimal(hex.toUpperCase()));
        input.close();
    }
    public static int hexToDecimal(String hex) {
        int onaltilikDeger = 0; 
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            onaltilikDeger = onaltilikDeger * 16 + donusum(hexChar);
        }
        return onaltilikDeger;
    }

    public static int donusum(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }  
}
