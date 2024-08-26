public interface StrikePackage {
    void handleTarget(Target target);
    void setNext(StrikePackage next);
}