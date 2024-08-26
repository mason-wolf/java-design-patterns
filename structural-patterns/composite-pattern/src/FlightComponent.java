public class FlightComponent implements AircraftComponent {

    private String data;

    public FlightComponent(String data) {
        this.data = data;
    }
    @Override
    public void getStatus() {
        System.out.println(this.data + " is online...");
    }
}
