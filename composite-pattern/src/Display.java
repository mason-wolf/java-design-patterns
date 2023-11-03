import java.util.ArrayList;

public class Display implements AircraftComponent {

    private String name;
    public ArrayList<AircraftComponent> aircraftComponents = new ArrayList<AircraftComponent>();
    @Override
    public void getStatus() {
        System.out.println(this.name + " initializing..");
        for (AircraftComponent c: this.aircraftComponents) {
            c.getStatus();
        }
    }

    public void addComponent(AircraftComponent component) {
        this.aircraftComponents.add(component);
    }
    public Display(String name) {
        this.name = name;
    }
}
