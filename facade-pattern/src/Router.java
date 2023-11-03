public class Router implements Device {

    private String deviceName;

    public Router(String deviceName) {
        this.deviceName = deviceName;
    }
    @Override
    public void start() {
        System.out.println("Starting router " + this.getDeviceName());
    }

    @Override
    public String getDeviceName() {
        return this.deviceName;
    }
}
