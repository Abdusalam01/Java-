public class NesneDizisi {
    public static void main(String[] args) {
		Nesne dizi[] = new Nesne[2] ;
	     
		dizi[0] = new Nesne();
		dizi[1] = new Nesne();
	     
		dizi[0].degerAktar(1,2);
		dizi[1].degerAktar(3,4);
	    System.out.println("0. nesne ---------------------");
	    dizi[0].ekranYazdir();
	    System.out.println("1. nesne ---------------------");
	    dizi[1].ekranYazdir();
		
	}
 
}
 
class Nesne{
    int a;
    int b;
    public void degerAktar(int c,int d){
        a=c;
        b=d;
    }
    public void ekranYazdir(){
        System.out.println("a değişkeni = " + a);
        System.out.println("b değişkeni = " + b);
    }
}

