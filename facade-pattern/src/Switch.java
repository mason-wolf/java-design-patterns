public class Switch implements Device {

    private String deviceName;

    public Switch(String deviceName) {
        this.deviceName = deviceName;
    }
    @Override
    public void start() {
        System.out.println("Starting switch " + this.getDeviceName());
    }

    @Override
    public String getDeviceName() {
        return this.deviceName;
    }
}
