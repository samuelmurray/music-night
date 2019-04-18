import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicNightRunner {
    private final List<Musician> musiciansNotInBand;
    private final List<Band> bands;

    public MusicNightRunner() {
        musiciansNotInBand = new ArrayList<>();
        musiciansNotInBand.add(MusicianFactory.createRitaLinter());
        bands = new ArrayList<>();
        bands.add(BandFactory.createFrayrats());
        bands.add(BandFactory.createWeekendSkaters());
    }

    public void playOneNight() {
        removeRandomMemberFromBands();
        addMusciansNotInBandToRandomBand();
    }

    private void removeRandomMemberFromBands() {
        for (Band band :
                bands) {
            if (!band.hasNoMembers()) {
                Musician removedMusician = band.removeAndReturnRandomMember();
                musiciansNotInBand.add(removedMusician);
            }
        }
    }

    private void addMusciansNotInBandToRandomBand() {
        Random r = new Random();
        for (Musician musician :
                musiciansNotInBand) {
            int bandIndex = r.nextInt(numberOfBands());
            bands.get(bandIndex).addMember(musician);
        }
    }

    private int numberOfBands() {
        return bands.size();
    }

    @Override
    public String toString() {
        return "MusicNightRunner{" +
                "musiciansNotInBand=" + musiciansNotInBand +
                ", bands=" + bands +
                '}';
    }
}
