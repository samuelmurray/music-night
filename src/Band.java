import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public void removeRandomMember() {
        Random r = new Random();
        int randomMemberIndex = r.nextInt(numberOfMembers());
        members.remove(randomMemberIndex);
    }

    public int numberOfMembers() {
        return members.size();
    }
}
