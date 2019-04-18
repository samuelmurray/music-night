import java.util.ArrayList;
import java.util.List;

public class InstrumentFactory {
    private InstrumentFactory() {
    }

    public static Instrument createRitaLintersInstrument() {
        InstrumentType instrumentType = InstrumentType.ukulele();
        String manufacturer = "Brick";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of strings: 7"));
        properties.add(new InstrumentProperty("String size: 1.2mm"));
        return new Instrument(instrumentType, manufacturer, properties);
    }

    public static Instrument createHazyBaarsInstrument() {
        InstrumentType instrumentType = InstrumentType.guitar();
        String manufacturer = "Bender";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of strings: 5"));
        properties.add(new InstrumentProperty("String size: 0.4mm"));
        return new Instrument(instrumentType, manufacturer, properties);
    }

    public static Instrument createBeatwinsInstrument() {
        InstrumentType instrumentType = InstrumentType.piano();
        String manufacturer = "Bender";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of keys: 51"));
        properties.add(new InstrumentProperty("Is acoustic"));
        return new Instrument(instrumentType, manufacturer, properties);
    }

    public static Instrument createTheVoidsInstrument() {
        InstrumentType instrumentType = InstrumentType.synthesizer();
        String manufacturer = "Lorg";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of keys: 47"));
        properties.add(new InstrumentProperty("Has LED"));
        return new Instrument(instrumentType, manufacturer, properties);
    }

    public static Instrument createStringsteensInstrument() {
        InstrumentType instrumentType = InstrumentType.banjo();
        String manufacturer = "Gibson";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of strings: 4"));
        properties.add(new InstrumentProperty("String size: 8mm"));
        return new Instrument(instrumentType, manufacturer, properties);
    }

    public static Instrument createZindeasInstrument() {
        InstrumentType instrumentType = InstrumentType.drums();
        String manufacturer = "Toyota";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Has hi-hat"));
        return new Instrument(instrumentType, manufacturer, properties);
    }

    public static Instrument createCaptorsInstrument() {
        InstrumentType instrumentType = InstrumentType.synthesizer();
        String manufacturer = "Suzuki";
        List<InstrumentProperty> properties = new ArrayList<>();
        properties.add(new InstrumentProperty("Number of keys: 72"));
        properties.add(new InstrumentProperty("Has no LED"));
        return new Instrument(instrumentType, manufacturer, properties);
    }
}
