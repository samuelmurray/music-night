public class App {
    public static void main(String[] args) {
        MusicalInstrument instrument = new MusicalInstrument("Synthesizer", "Suzuki");
        Musician musician = new Musician("Captor", instrument);
        System.out.println(musician);
    }
}
