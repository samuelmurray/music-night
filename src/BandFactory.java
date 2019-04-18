import java.util.ArrayList;
import java.util.List;

public class BandFactory {
    private BandFactory() {
    }

    public static Band createWeekendSkaters() {
        String name = "Weekend Skaters";
        List<Musician> members = new ArrayList<>();
        members.add(MusicianFactory.createHazyBaar());
        members.add(MusicianFactory.createBeatwin());
        members.add(MusicianFactory.createTheVoid());
        return new Band(name, members);
    }

    public static Band createFrayrats() {
        String name = "Frayrats";
        List<Musician> members = new ArrayList<>();
        members.add(MusicianFactory.createStringsteen());
        members.add(MusicianFactory.createZindea());
        members.add(MusicianFactory.createCaptor());
        return new Band(name, members);
    }
}
