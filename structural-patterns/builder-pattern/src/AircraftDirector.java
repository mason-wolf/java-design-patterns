public class AircraftDirector {
    public void constructAircraft(AircraftBuilder aircraftBuilder) {
        aircraftBuilder.createEngine();
        aircraftBuilder.createFuselage();
        aircraftBuilder.createWings();
    }
}
