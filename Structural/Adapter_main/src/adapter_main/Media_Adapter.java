

package adapter_main;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Media_Adapter implements MediaPlayer {
    private final AdvancedPlayer advancedPlayer;

    // Thread-safe map of available adapters
    private static final Map<String, Supplier<AdvancedPlayer>> adapterRegistry = new ConcurrentHashMap<>();

    static {
        adapterRegistry.put("vlc", Vlc_Play::new);
        adapterRegistry.put("mp4", Mp4_Player::new);
    }

    public Media_Adapter(String audioType) {
        this.advancedPlayer = adapterRegistry.get(audioType.toLowerCase()).get();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMp4(fileName);
        } else {
            System.out.println("Unsupported media type: " + audioType);
        }
    }
}


