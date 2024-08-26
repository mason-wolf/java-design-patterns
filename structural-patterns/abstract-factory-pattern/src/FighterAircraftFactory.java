public class FighterAircraftFactory extends AircraftFactory {
    @Override
    Aircraft getAircraft() {
        return new FighterAircraft();
    }
}
