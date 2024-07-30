/**
 * Represents a recon service. Recon missions utilize
 * real-world weapon system payload events.
 */
public class ReconService implements MissionService {
    public void startMission() {
        System.out.println("**REAL WORLD** STARTING MISSION");
        System.out.println("**REAL WORLD** CALIBRATING PAYLOAD DATA");
    }
}
