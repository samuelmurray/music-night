import java.util.ArrayList;
import java.util.List;

public class InstrumentFactory {
    private InstrumentFactory() {
    }

    public static MusicalInstrument createRitaLintersInstrument() {
        InstrumentType instrumentType = InstrumentType.ukulele();
        String manufacturer = "Brick";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of strings: 7"));
        properties.add(new InstrumentProperty("String size: 1.2mm"));
        return new MusicalInstrument(instrumentType, manufacturer, properties);
    }

    public static MusicalInstrument createHazyBaarsInstrument() {
        InstrumentType instrumentType = InstrumentType.guitar();
        String manufacturer = "Bender";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of strings: 5"));
        properties.add(new InstrumentProperty("String size: 0.4mm"));
        return new MusicalInstrument(instrumentType, manufacturer, properties);
    }

    public static MusicalInstrument createBeatwinsInstrument() {
        InstrumentType instrumentType = InstrumentType.piano();
        String manufacturer = "Bender";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of keys: 51"));
        properties.add(new InstrumentProperty("Is acoustic"));
        return new MusicalInstrument(instrumentType, manufacturer, properties);
    }

    public static MusicalInstrument createTheVoidsInstrument() {
        InstrumentType instrumentType = InstrumentType.synthesizer();
        String manufacturer = "Lorg";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of keys: 47"));
        properties.add(new InstrumentProperty("Has LED"));
        return new MusicalInstrument(instrumentType, manufacturer, properties);
    }

    public static MusicalInstrument createStringsteensInstrument() {
        InstrumentType instrumentType = InstrumentType.banjo();
        String manufacturer = "Gibson";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of strings: 4"));
        properties.add(new InstrumentProperty("String size: 8mm"));
        return new MusicalInstrument(instrumentType, manufacturer, properties);
    }

    public static MusicalInstrument createZindeasInstrument() {
        InstrumentType instrumentType = InstrumentType.drums();
        String manufacturer = "Toyota";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Has hi-hat"));
        return new MusicalInstrument(instrumentType, manufacturer, properties);
    }

    public static MusicalInstrument createCaptorsInstrument() {
        InstrumentType instrumentType = InstrumentType.synthesizer();
        String manufacturer = "Suzuki";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of keys: 72"));
        properties.add(new InstrumentProperty("Has no LED"));
        return new MusicalInstrument(instrumentType, manufacturer, properties);
    }
}
