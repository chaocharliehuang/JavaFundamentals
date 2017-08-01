import java.util.HashMap;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Stockholm Syndrome", "This is the last time I'll abandon you");
        trackList.put("Time is Running Out", "Our time is running out");
        trackList.put("Apocalypse Please", "Declare this an emergency");
        trackList.put("Hysteria", "I want it now");
        System.out.println(trackList.get("Stockholm Syndrome"));
        for (String key : trackList.keySet()) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}