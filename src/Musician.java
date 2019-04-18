public class Musician {
    private final String name;
    private final Instrument instrument;

    public Musician(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "name='" + name + '\'' +
                ", instrument=" + instrument +
                '}';
    }
}
