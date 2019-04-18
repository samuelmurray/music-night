import java.util.ArrayList;
import java.util.List;

public class MusicalInstrument {
    private final String type;
    private final String manufacturer;
    private final List<InstrumentProperty> properties;

    public MusicalInstrument(String type, String manufacturer) {
        this(type, manufacturer, new ArrayList<InstrumentProperty>());
    }

    public MusicalInstrument(String type, String manufacturer, List<InstrumentProperty> properties) {
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
}
