import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicNightRunner {
    private final List<Musician> musiciansNotInBand;
    private final List<Band> bands;
    private List<Musician> musiciansAddedToBands;
    private StringBuilder changeLogBuilder;

    public MusicNightRunner() {
        musiciansNotInBand = new ArrayList<>();
        musiciansNotInBand.add(MusicianFactory.createRitaLinter());
        bands = new ArrayList<>();
        bands.add(BandFactory.createFrayrats());
        bands.add(BandFactory.createWeekendSkaters());
    }

    public void playOneNight() {
        changeLogBuilder = new StringBuilder();
        addMusiciansToNewBands();
        removeRandomMemberFromBands();
        System.out.println(changeLogBuilder.toString());
    }

    private void removeRandomMemberFromBands() {
        for (Band band : bands) {
            if (!band.hasNoMembers()) {
                Musician removedMusician = band.removeAndReturnRandomMember();
                musiciansNotInBand.add(removedMusician);
                logMusicianLeftBand(removedMusician, band);
            }
        }
    }

    private void addMusiciansToNewBands() {
        musiciansAddedToBands = new ArrayList<>();
        addMusiciansNotInBandToRandomBand();
        updateListOfMusiciansNotInBand();
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
            logMusicianJoinedBand(musician, band);
        } else {
            logMusicianTriedToJoinBand(musician, band);
        }
    }

    private void updateListOfMusiciansNotInBand() {
        for (Musician musician : musiciansAddedToBands) {
            musiciansNotInBand.remove(musician);
        }
    }

    private int numberOfBands() {
        return bands.size();
    }

    private void logMusicianLeftBand(Musician musician, Band band) {
        logMusicianInteractionBand(musician, "left", band);
    }

    private void logMusicianJoinedBand(Musician musician, Band band) {
        logMusicianInteractionBand(musician, "joined", band);
    }

    private void logMusicianTriedToJoinBand(Musician musician, Band band) {
        logMusicianInteractionBand(musician, "tried to join", band);
    }

    private void logMusicianInteractionBand(Musician musician, String interaction, Band band) {
        String log = musician.getName() + ' ' + interaction + ' ' + band.getName() + '\n';
        changeLogBuilder.append(log);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (!musiciansNotInBand.isEmpty()) {
            builder.append("Musicians not in band: ");
            for (Musician musician : musiciansNotInBand) {
                builder.append("\n\t* ");
                builder.append(musician);
            }
            builder.append('\n');
        }
        for (Band band : bands) {
            builder.append(band.toString());
            builder.append('\n');
        }
        return builder.toString();
    }
}
