public class Battleship implements Ship {

    public NavalGeoAPI navalGeoAPI;

    public Battleship(NavalGeoAPI navalGeoAPI) {
        this.navalGeoAPI = navalGeoAPI;
    }
    @Override
    public void getShipDetails() {
        System.out.println("Getting battleship details..");
    }
}
