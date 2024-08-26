public class Main {
    public static void main(String[] args) {
        Battleship battleship = new Battleship(new NavalGeoAPI());
        battleship.getShipDetails();
        battleship.navalGeoAPI.getLocation();
    }
}