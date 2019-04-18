public class App {
    public static void main(String[] args) {
        Instrument instrument = new Instrument("Synthesizer", "Suzuki");
        Musician musician = new Musician("Captor", instrument);
        System.out.println(musician);
    }
}
