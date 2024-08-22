/**
 * Avoid coupling the sender of a request to its receiver by giving more than one
 * object a change to handle the request. Chain the receiving objects and pass the
 * request along the chain until an object handles it.
 */
public class Main {
    
    public static void main(String[] args) {
        StrikePackage reconGroup = new ReconUnit();
        StrikePackage airToAirGroup = new AirToAirUnit();
        StrikePackage navalGroup = new NavalUnit();
        
        reconGroup.setNext(airToAirGroup);
        airToAirGroup.setNext(navalGroup);
        
        Target groundTarget = new Target(TargetType.GROUND, " Ground Target at 37.7749, -122.4194.");
        Target airTarget = new Target(TargetType.AIR, " Bogey ID'd at 34.0522, -118.2437 at 5000ALT.");
        Target navalTarget = new Target(TargetType.NAVAL, " Hostile Vessel detected at 40.7128, -74.0060.");
        
        reconGroup.handleTarget(groundTarget);
        reconGroup.handleTarget(airTarget);
        reconGroup.handleTarget(navalTarget);
    }
}