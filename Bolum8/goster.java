public class goster {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = array.length - 1; i >= 0; i--) { // diziyi sondan başa doğru yeniden oluştur.
            for (int j = array[i].length - 1; j >= 0; j--) 
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) // dizi satirlarinin ilk elemanin toplami.  1 + 3 + 5 = 9
            sum += array[i][0]; 
        System.out.println(sum);

        System.out.println();
        int[][] dizi = {{1, 2, 3, 4}, {5, 6, 7, 8}}; 
        System.out.println(m1(dizi)[0]);
        System.out.println(m1(dizi)[1]);
        
    }
    public static int[] m1(int[][] m) {
        int[] result = new int[2]; 
        result[0] = m.length;
        result[1] = m[0].length;
        return result; }
}
