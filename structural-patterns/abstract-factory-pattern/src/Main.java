/**
 * Abstract Factory Pattern
 * Provide an interface for creating families of related or dependent
 * objects without specifying their concrete classes.
 */
public class Main {
    public static void main(String[] args) {
        Sortie sortie = new Sortie();
        Aircraft aircraft = sortie.getAircraft(new FighterAircraftFactory());
        aircraft.getAircraftDetails();
    }
}