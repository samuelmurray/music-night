import java.util.ArrayList;
import java.util.List;

public class Band {
    private final String name;
    private final List<Musician> members;

    public Band(String name) {
        this(name, new ArrayList<>());
    }

    public Band(String name, List<Musician> members) {
        this.name = name;
        this.members = members;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public void addMember(Musician member) {
        members.add(member);
    }
}
