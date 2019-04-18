import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.NoSuchElementException;

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

    public void addMember(Musician member) throws IllegalArgumentException {
        if (!musicianCanBeAdded(member)) {
            throw new IllegalArgumentException("Can't add member with existing instrument");
        }
        members.add(member);
    }

    public Musician removeAndReturnRandomMember() {
        if (hasNoMembers()) {
            throw new NoSuchElementException("Can't remove member from empty band");
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

    private List<String> instrumentsInBand() {
        List<String> instruments = new ArrayList<>();
        for (Musician member : members) {
            instruments.add(member.getInstrumentTypeName());
        }
        return instruments;
    }

    public boolean musicianCanBeAdded(Musician musician) {
        String instrumentType = musician.getInstrumentTypeName();
        for (String currentInstrument : instrumentsInBand()) {
            if (instrumentType.equals(currentInstrument)) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Band ");
        builder.append(name);
        if (hasNoMembers()) {
            builder.append(" with no members");
        } else {
            builder.append(" with members:");
            for (Musician member : members) {
                builder.append("\n\t* ");
                builder.append(member);
            }
        }
        return builder.toString();
    }
}
