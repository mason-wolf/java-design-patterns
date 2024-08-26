public abstract class Target {
    private String id = "UNKNOWN";
    private Double latitude = 0.0;
    private Double longitude = 0.0;
    boolean Destroyed = false;
    public Double getLatitude() {
        return latitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public boolean isDestroyed() {
        return Destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        Destroyed = destroyed;
    }

    public String getLocation() {
        return "Lat: " + this.getLatitude().toString() + " Long: " + this.getLongitude().toString();
    }
}
