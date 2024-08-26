public class AirToAirUnit implements StrikePackage {
    private StrikePackage next;
    
    @Override
    public void handleTarget(Target target) {
        if (target.getType() == TargetType.AIR) {
            System.out.println("Air-To-Air Unit: Assessing target - " + target.getDescription());
        }
        else if (next != null) {
            next.handleTarget(target);
        }
    }
    
    @Override
    public void setNext(StrikePackage next) {
        this.next = next;
    }
}