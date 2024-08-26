public class NavalUnit implements StrikePackage {
    private StrikePackage next;
    
    @Override
    public void handleTarget(Target target) {
        if (target.getType() == TargetType.NAVAL) {
            System.out.println("Naval Unit: Assessing target - " + target.getDescription());
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