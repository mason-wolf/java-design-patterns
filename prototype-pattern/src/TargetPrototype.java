public class TargetPrototype extends Target implements Cloneable {

    public TargetPrototype(String id, double latitude, double longitude) {
        this.setId(id);
        this.setLatitude(latitude);
        this.setLongitude(longitude);
    }
    public TargetPrototype clone() throws CloneNotSupportedException {
        return (TargetPrototype) super.clone();
    }
}
