
package adapter_main;


public class Mp4_Player implements AdvancedPlayer {
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}


