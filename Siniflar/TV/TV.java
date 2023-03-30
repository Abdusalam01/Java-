package TV;
public class TV {

    int channel = 1; // Varsayılan kanal 1'dir
    int volumeLevel = 1; // Varsayılan ses seviyesi 1'dir
    boolean on = false; // Varsayılan olarak TV kapalıdır
    
    public TV() {
    }
    
    public void ac() {
        on = true;
    }
    
    public void kapa() {
        on = false;
    }
    
    public void setChannel(int yeniKanal) {
        if (on && yeniKanal >= 1 && yeniKanal <= 120)
        channel = yeniKanal;
    }
    
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
        volumeLevel = newVolumeLevel;
    }
    
    public void channelUp() {
        if (on && channel < 120)
        channel++;
    }
    
    public void channelDown() {
        if (on && channel > 1)
        channel--;
    }
    
    public void volumeUp() {
        if (on && volumeLevel < 7)
        volumeLevel++;
    }
    
    public void volumeDown() {
        if (on && volumeLevel > 1)
        volumeLevel--;
    }
}
