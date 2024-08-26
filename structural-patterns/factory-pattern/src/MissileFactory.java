import java.util.Objects;

public class MissileFactory {
    public Missile createMissile(MissileType missileType) {
        Missile missile = null;
        if (Objects.requireNonNull(missileType) == MissileType.SHORT_RANGE) {
            return new ShortRangeMissile();
        }
        else {
            missile = new ShortRangeMissile();
        }
        return missile;
    }
}
