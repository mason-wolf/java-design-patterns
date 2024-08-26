public class FighterAircraft implements Aircraft, CombatCapable {

    private int fuel;
    @Override
    public int getFuel() {
        this.fuel = 0;
        return this.fuel;
    }

    @Override
    public void getAircraftDetails() {
        System.out.println("Prepping fighter aircraft..");
    }

    @Override
    public void weaponize(Weapon weapon) {

    }
}
