public class MusicianFactory {
    private MusicianFactory() {
    }

    public static Musician createRitaLinter() {
        String name = "Rita Linter";
        MusicalInstrument instrument = InstrumentFactory.createRitaLintersInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createHazyBaar() {
        String name = "Hazy Baar";
        MusicalInstrument instrument = InstrumentFactory.createHazyBaarsInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createBeatwin() {
        String name = "Beatwin";
        MusicalInstrument instrument = InstrumentFactory.createBeatwinsInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createTheVoid() {
        String name = "The Void";
        MusicalInstrument instrument = InstrumentFactory.createTheVoidsInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createStringsteen() {
        String name = "Stringsteen";
        MusicalInstrument instrument = InstrumentFactory.createStringsteensInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createZindea() {
        String name = "Zindea";
        MusicalInstrument instrument = InstrumentFactory.createZindeasInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createCaptor() {
        String name = "Captor";
        MusicalInstrument instrument = InstrumentFactory.createCaptorsInstrument();
        return new Musician(name, instrument);
    }

}
