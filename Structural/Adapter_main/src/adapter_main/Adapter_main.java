

package adapter_main;

public class Adapter_main {

    public static void main(String[] args) {

        MediaPlayer player = new Mp3Player();
        player.play("mp3", "song.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "movie.vlc");
    }
}
    
 
