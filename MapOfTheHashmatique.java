import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
        Map<String, String> trackList = new HashMap<String, String>();
        trackList.put("Stockholm Syndrome", "This is the last time I'll abandon you");
        trackList.put("Time is Running Out", "Our time is running out");
        trackList.put("Apocalypse Please", "Declare this an emergency");
        trackList.put("Hysteria", "I want it now");
        System.out.println(trackList.get("Stockholm Syndrome"));
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // public HashMap createTrackList() {
    //     Map<String, String> trackList = new HashMap<String, String>();
    //     trackList.put("Stockholm Syndrome", "This is the last time I'll abandon you");
    //     trackList.put("Time is Running Out", "Our time is running out");
    //     trackList.put("Apocalypse Please", "Declare this an emergency");
    //     trackList.put("Hysteria", "I want it now");
    //     return trackList;
    // }
}