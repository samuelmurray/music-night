public class MusicianFactory {
    private MusicianFactory() {
    }

    public static Musician createRitaLinter() {
        String name = "Rita Linter";
        Instrument instrument = InstrumentFactory.createRitaLintersInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createHazyBaar() {
        String name = "Hazy Baar";
        Instrument instrument = InstrumentFactory.createHazyBaarsInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createBeatwin() {
        String name = "Beatwin";
        Instrument instrument = InstrumentFactory.createBeatwinsInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createTheVoid() {
        String name = "The Void";
        Instrument instrument = InstrumentFactory.createTheVoidsInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createStringsteen() {
        String name = "Stringsteen";
        Instrument instrument = InstrumentFactory.createStringsteensInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createZindea() {
        String name = "Zindea";
        Instrument instrument = InstrumentFactory.createZindeasInstrument();
        return new Musician(name, instrument);
    }

    public static Musician createCaptor() {
        String name = "Captor";
        Instrument instrument = InstrumentFactory.createCaptorsInstrument();
        return new Musician(name, instrument);
    }

}
