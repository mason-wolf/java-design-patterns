/**
 * Ensure a class only has one instance, and provide a global
 * point of access to it.
 */
public class Main {
    public static void main(String[] args) {
        // Only once instance of Battle Manager can be created.
        // This reduces static methods & fields from being scattered
        // throughout the app.
        BattleManager battleManager = BattleManager.init();
        battleManager.createMission("Destroy targets at x, y: Mission 1");
        battleManager.createMission("Destroy targets at x, y: Mission 2");
        battleManager.getMissions();
    }
}