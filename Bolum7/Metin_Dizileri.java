import java.util.StringTokenizer;

public class Metin_Dizileri {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Portakal;Elma", ";");

        StringTokenizer str = new StringTokenizer("Protakal ,Elma ,Muz ", ",");

        System.out.println(st.nextToken());

        System.out.println(str.countTokens());

        System.out.println("----------------------------------------\n");

        /* .hasMoreTokens() ile yazdirma */
        while(str.hasMoreTokens())
            System.out.println(str.nextToken());
        System.out.println("----------------------------------------\n");

        
        /* .countTokens ile yazdirma 
        for(int i = 0; i <= str.countTokens() + 1; i++){
            System.out.println(str.nextToken());
        }*/

        StringTokenizer kelime = new StringTokenizer("Cilek Mandalina Nar");

        while(kelime.hasMoreTokens())
            System.out.println(kelime.nextToken());


        System.out.println("----------------------------------------\n");
        // 3.bölüm
        String cumle3= "Javada;StringTokenizer,Sinifi-Kullanimi?ve!Ornekleri.";
        String delims = ";,-!.";
        StringTokenizer st3= new StringTokenizer (cumle3, delims);
        System.out.println("Token sayisi="+st3.countTokens ()) ;
        while (st3. hasMoreElements ( ))
            System.out.println(st3.nextToken ()) ;

    }
}
