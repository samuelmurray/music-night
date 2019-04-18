import java.util.ArrayList;
import java.util.List;

public class Instrument {
    private final String type;
    private final String manufacturer;
    private final List<InstrumentProperty> properties;

    public Instrument(String type, String manufacturer) {
        this(type, manufacturer, new ArrayList<InstrumentProperty>());
    }

    public Instrument(String type, String manufacturer, List<InstrumentProperty> properties) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.properties = properties;
    }
}
