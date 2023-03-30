public class Quiz3 {
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        int[] numara = new int[100000];

        for (int i = 0; i < numara.length ; i++) {
            numara[i] = r.nextInt(10000);
        }
        StopWatch durdur = new StopWatch();
        SecimleriSrala(numara);
        durdur.stop();
        System.out.println("100,000 sayiyi siralamak " + durdur.getElapsedTime() + " millisanine surdu");

    }
    public static void SecimleriSrala(int[] liste){
        for (int i = 0; i < liste.length ; i++) {
            int enKucuk = liste[i];
            int index = i;
            for (int j = i + 1 ; j < liste.length ; j++ ) {
                if (enKucuk > liste[j]){
                    enKucuk = liste[j];
                    index = j;
                }
            }
            if (index != i){
                liste[index] = liste[i];
                liste[i] = enKucuk;
            }
        }
    }
}
class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime = startTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

