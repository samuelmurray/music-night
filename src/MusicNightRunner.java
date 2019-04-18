import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicNightRunner {
    private final List<Musician> musiciansNotInBand;
    private final List<Band> bands;
    private List<Musician> musiciansAddedToBands;

    public MusicNightRunner() {
        musiciansNotInBand = new ArrayList<>();
        musiciansNotInBand.add(MusicianFactory.createRitaLinter());
        bands = new ArrayList<>();
        bands.add(BandFactory.createFrayrats());
        bands.add(BandFactory.createWeekendSkaters());
    }

    public void playOneNight() {
        removeRandomMemberFromBands();
        addMusiciansToNewBands();
    }

    private void removeRandomMemberFromBands() {
        for (Band band : bands) {
            if (!band.hasNoMembers()) {
                Musician removedMusician = band.removeAndReturnRandomMember();
                musiciansNotInBand.add(removedMusician);
            }
        }
    }

    private void addMusiciansToNewBands() {
        musiciansAddedToBands = new ArrayList<>();
        addMusiciansNotInBandToRandomBand();
        updateMusiciansNotInBand();
    }

    private void addMusiciansNotInBandToRandomBand() {
        for (Musician musician : musiciansNotInBand) {
            Band bandToJoin = getRandomBand();
            addMusicianToBand(musician, bandToJoin);
        }
    }

    private Band getRandomBand() {
        Random r = new Random();
        int randomBandIndex = r.nextInt(numberOfBands());
        return bands.get(randomBandIndex);
    }

    private void addMusicianToBand(Musician musician, Band band) {
        if (band.musicianCanBeAdded(musician)) {
            band.addMember(musician);
            musiciansAddedToBands.add(musician);
        }
    }

    private void updateMusiciansNotInBand() {
        for (Musician musician : musiciansAddedToBands) {
            musiciansNotInBand.remove(musician);
        }
    }

    private int numberOfBands() {
        return bands.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (!musiciansNotInBand.isEmpty()) {
            builder.append("Musicians not in band: ");
            builder.append(musiciansNotInBand);
            builder.append('\n');
        }
        for (Band band : bands) {
            builder.append(band.toString());
            builder.append('\n');
        }
        return builder.toString();
    }
}
