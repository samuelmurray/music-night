public class Musician {
    private final String name;
    private final MusicalInstrument instrument;

    public Musician(String name, MusicalInstrument instrument) {
        this.name = name;
        this.instrument = instrument;
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
