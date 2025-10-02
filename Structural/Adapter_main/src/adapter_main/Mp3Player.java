

package adapter_main;


public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            // delegate unsupported formats to adapter
            Media_Adapter adapter = new Media_Adapter(audioType);
            adapter.play(audioType, fileName);
        }
    }
}


