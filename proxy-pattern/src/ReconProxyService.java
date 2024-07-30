/**
 * Represents a recon proxy service. Recon missions utilize
 * simulated weapon system payload events, particularly for exercises.
 */
public class ReconProxyService implements MissionService {
    public void startMission() {
        System.out.println("**EXERCISE** STARTING MISSION");
        System.out.println("**EXERCISE** CALIBRATING SIMULATED PAYLOAD DATA");
    }
}
