import java.util.ArrayList;
import java.util.List;

public class Instrument {
    private final InstrumentType type;
    private final String manufacturer;
    private final List<InstrumentProperty> properties;

    public Instrument(InstrumentType type, String manufacturer) {
        this(type, manufacturer, new ArrayList<>());
    }

    public Instrument(InstrumentType type, String manufacturer, List<InstrumentProperty> properties) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.properties = properties;
    }

    public InstrumentType getType() {
        return type;
    }

    public boolean hasSameTypeAs(Instrument other) {
        String myTypeName = type.toString();
        String othersTypeName = other.type.toString();
        return myTypeName.equals(othersTypeName);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(type);
        builder.append(" (Manufacturer: ");
        builder.append(manufacturer);
        for (InstrumentProperty property : properties) {
            builder.append(", ");
            builder.append(property);
        }
        builder.append(')');
        return builder.toString();
    }
}
