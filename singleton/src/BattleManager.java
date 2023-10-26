import java.util.ArrayList;

public class BattleManager {
    private final ArrayList<String> missions = new ArrayList<String>();
    private static BattleManager battleManager;

    private BattleManager() {};

    /**
     * Manages all things battle-related.
     * @return BattleManager
     */
    public static BattleManager init() {
        if (battleManager == null) {
            battleManager = new BattleManager();
        }
        else {
            System.out.println("Instance of Battle Manager already exists.");
        }
        return battleManager;
    }

    public void createMission(String mission) {
        this.missions.add(mission);
    }

    public void getMissions() {
        for (String mission: this.missions) {
            System.out.println(mission);
        }
    }
}
