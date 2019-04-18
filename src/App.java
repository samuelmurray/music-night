public class App {
    public static void main(String[] args) {
        Band frayrats = BandFactory.createFrayrats();
        System.out.println(frayrats);
        frayrats.removeRandomMember();
        System.out.println(frayrats);
        frayrats.addMember(MusicianFactory.createCaptor());
        System.out.println(frayrats);
    }
}
