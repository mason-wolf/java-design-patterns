public class ShortRangeMissile extends Weapon implements Missile {

    private int impactRadius = 0;
    private final Weapon weapon;

    public ShortRangeMissile() {
        weapon = new Weapon.WeaponBuilder()
                .type(MissileType.SHORT_RANGE.toString())
                .armed(true)
                .operational(true)
                .setRange(0)
                .status(WeaponStatus.READY)
                .build();
    }
    @Override
    public void setRange(int range) {
        this.weapon.setRange(range);
    }

    @Override
    public int getRange() {
        return this.weapon.getRange();
    }

    @Override
    public void setImpactRadius(int radius) {
        this.impactRadius = radius;
    }

    @Override
    public int getImpactRadius() {
        return this.impactRadius;
    }

    @Override
    public void getMissileStatus() {
        this.weapon.getStatus();
        System.out.println("IMPACT RADIUS: " + this.impactRadius);
    }

}
