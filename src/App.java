import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        MusicalInstrument instrument = new MusicalInstrument("Synthesizer", "Suzuki");
        Musician musician = new Musician("Captor", instrument);
        List<Musician> musicians = new ArrayList<>();
        musicians.add(musician);
        Band band = new Band("Frayrats", musicians);
        System.out.println(band);
    }
}
