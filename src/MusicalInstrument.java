import java.util.ArrayList;
import java.util.List;

public class MusicalInstrument {
    private final InstrumentType type;
    private final String manufacturer;
    private final List<InstrumentProperty> properties;

    public MusicalInstrument(InstrumentType type, String manufacturer) {
        this(type, manufacturer, new ArrayList<>());
    }

    public MusicalInstrument(InstrumentType type, String manufacturer, List<InstrumentProperty> properties) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", properties=" + properties +
                '}';
    }

    public InstrumentType getType() {
        return type;
    }
}
