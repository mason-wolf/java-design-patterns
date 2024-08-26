/**
 * Separate the construction of a complex object from its
 * representation so that the same construction process can
 * create different representations.
 */
public class Main {
    public static void main(String[] args) {

        AircraftDirector aircraftDirector = new AircraftDirector();
        FighterAircraftBuilder fighterAircraft = new FighterAircraftBuilder();
        aircraftDirector.constructAircraft(fighterAircraft);

        Weapon weapon = new Weapon.WeaponBuilder()
                .type("Missile")
                .armed(true)
                .operational(true)
                .setRange(800)
                .status(WeaponStatus.READY)
                .build();

        fighterAircraft.weaponize(weapon);
    }
}