import java.util.ArrayList;
import java.util.List;

public class Band {
    private final String name;
    private final List<Musician> musicians;

    public Band(String name) {
        this(name, new ArrayList<>());
    }

    public Band(String name, List<Musician> musicians) {
        this.name = name;
        this.musicians = musicians;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", musicians=" + musicians +
                '}';
    }
}
