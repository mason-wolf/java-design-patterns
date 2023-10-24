/**
 * Define an interface for creating an object, but let subclasses
 * decide which class to instantiate. Factory Method lets a class
 * defer instantiation to subclasses.
 */
public class Main {
    public static void main(String[] args) {
        MissileFactory missileFactory = new MissileFactory();
        Missile shortRangeMissile = missileFactory.createMissile(MissileType.SHORT_RANGE);
        shortRangeMissile.setRange(242);
        shortRangeMissile.setImpactRadius(1000);
        shortRangeMissile.getMissileStatus();
    }
}