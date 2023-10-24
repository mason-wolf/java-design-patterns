public class CASAircraft implements Aircraft, CombatCapable {

    TargetPrototype target;

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public void getAircraftDetails() {
        System.out.println("Prepping Close Air Support aircraft..");
    }

    @Override
    public void weaponize(Weapon weapon) {

    }

    @Override
    public void acquireTarget(TargetPrototype target) {
        System.out.println("CAS Aircraft acquiring target");
    }
}
