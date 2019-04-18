public class Musician {
    private final String name;
    private final Instrument instrument;

    public Musician(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "Musician " + name + " playing " + instrument;
    }
}
