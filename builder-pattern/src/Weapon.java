
enum WeaponStatus {
    READY,
    OFFLINE,
    ERROR,
    TRANSIT,
    MAINTENANCE
}
public class Weapon {
    private int range = 0;
    private boolean armed = false;
    private boolean operational = false;
    private String type = "UNSPECIFIED";
    private WeaponStatus status = WeaponStatus.OFFLINE;

    public void getStatus() {
        System.out.println("WEAPON STATUS: " + this.status.toString());
        System.out.println("TYPE: " + this.type);
        System.out.println("ARMED: " + this.armed);
        System.out.println("OPERATIONAL: " + this.operational);
    }

    public static class WeaponBuilder {
        private Weapon weapon;

        public WeaponBuilder() {
            weapon = new Weapon();
        }
        public WeaponBuilder setRange(int range) {
            weapon.range = range;
            return this;
        }

        public WeaponBuilder armed(boolean armed) {
            weapon.armed = armed;
            return this;
        }

        public WeaponBuilder operational(boolean operational) {
            weapon.operational = operational;
            return this;
        }

        public WeaponBuilder type(String type) {
            weapon.type = type;
            return this;
        }

        public WeaponBuilder status(WeaponStatus status) {
            weapon.status = status;
            return this;
        }

        public Weapon build() {
            return weapon;
        }
    }
}
