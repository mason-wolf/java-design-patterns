public class Main {
    public static void main(String[] args) {
        FlightComponent altitudeIndicator = new FlightComponent("Altitude Indicator");
        FlightComponent attitudeIndicator = new FlightComponent("Attitude Indicator");

        Display avionics = new Display("Avionics");
        avionics.addComponent(altitudeIndicator);
        avionics.addComponent(attitudeIndicator);

        Display dashboard = new Display("Dashboard");
        dashboard.addComponent(avionics);
        dashboard.getStatus();
    }
}