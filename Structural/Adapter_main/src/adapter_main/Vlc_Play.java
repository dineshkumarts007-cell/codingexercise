

package adapter_main;
    

public class Vlc_Play implements AdvancedPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
      
    }
}