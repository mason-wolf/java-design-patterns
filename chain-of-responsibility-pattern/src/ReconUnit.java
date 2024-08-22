public class ReconUnit implements StrikePackage {
    private StrikePackage next;
    
    @Override
    public void handleTarget(Target target) {
        if (target.getType() == TargetType.GROUND) {
            System.out.println("Recon Unit: Assessing target - " + target.getDescription());
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