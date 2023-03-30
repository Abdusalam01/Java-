package TV;
public class TestTv {  
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.ac();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.ac();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1'in kanali " + tv1.channel 
          + " ve ses seviyesi " + tv1.volumeLevel);
        System.out.println("tv2'in kanali " + tv2.channel 
          + " ve ses seviyesi " + tv2.volumeLevel);
    }
}
