public class CASAircraftFactory extends AircraftFactory  {

    TargetPrototype target;
    @Override
    Aircraft getAircraft() {
        return new CASAircraft();
    }
}
