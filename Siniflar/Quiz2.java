public class Quiz2 {
    public static void main(String[] args) {
        java.util.Random uret = new java.util.Random();
        for ( int i = 0; i < 5 ; i++){
            System.out.print(uret.nextInt(100) + " ");
        }
    }
}