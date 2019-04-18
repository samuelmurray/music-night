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

    public List<String> instrumensInBand() {
        List<String> instruments = new ArrayList<>();
        for (Musician member :
                members) {
            instruments.add(member.getInstrumentTypeName());
        }
        return instruments;
    }

    public boolean musicianCanBeAdded(Musician musician) {
        String instrumentType = musician.getInstrumentTypeName();
        for (String currentInstrument :
                instrumensInBand()) {
            if (instrumentType.equals(currentInstrument)){
                return false;
            }
        }
        return true;
    }
}
