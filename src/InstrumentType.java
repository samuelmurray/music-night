public class InstrumentType {
    private final String type;

    private InstrumentType(String type) {
        this.type = type;
    }

    public static InstrumentType banjo() {
        return new InstrumentType("Banjo");
    }

    public static InstrumentType drums() {
        return new InstrumentType("Drums");
    }

    public static InstrumentType guitar() {
        return new InstrumentType("Guitar");
    }

    public static InstrumentType piano() {
        return new InstrumentType("Piano");
    }

    public static InstrumentType synthesizer() {
        return new InstrumentType("Synthesizer");
    }

    public static InstrumentType ukulele() {
        return new InstrumentType("Ukulele");
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
