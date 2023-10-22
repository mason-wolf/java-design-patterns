public class FighterAircraftFactory extends AircraftFactory {
    @Override
    Aircraft getAircraft() {
        FighterAircraft fighterAircraft = new FighterAircraft();
        return fighterAircraft;
    }
}
