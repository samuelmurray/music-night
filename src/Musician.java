public class Musician {
    private final String name;
    private final Instrument instrument;

    public Musician(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public String getInstrumentTypeName() {
        return instrument.getType().toString();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Musician " + name + " playing " + instrument;
    }

}
