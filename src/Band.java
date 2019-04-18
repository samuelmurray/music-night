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

    public Musician removeRandomMember() {
        if (hasNoMembers()) {
            return;
        }
        Random r = new Random();
        int randomMemberIndex = r.nextInt(numberOfMembers());
        return members.remove(randomMemberIndex);
    }

    public int numberOfMembers() {
        return members.size();
    }

    public boolean hasNoMembers() {
        return numberOfMembers() == 0;
    }
}
