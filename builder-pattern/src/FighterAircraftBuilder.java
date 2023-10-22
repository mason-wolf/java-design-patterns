public class FighterAircraftBuilder implements AircraftBuilder, CombatCapable {
    @Override
    public void createFuselage() {
        System.out.println("Creating fuselage for fighter..");
    }

    @Override
    public void createWings() {
        System.out.println("Creating wings for fighter..");
    }

    @Override
    public void createEngine() {
        System.out.println("Creating engine for fighter..");
    }

    @Override
    public void weaponize(Weapon weapon) {
        weapon.getStatus();
    }
}
