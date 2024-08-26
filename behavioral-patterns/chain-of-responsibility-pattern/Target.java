public class Target {
    private TargetType type;
    private String description;
    
    public Target(TargetType type, String description) {
        this.type = type;
        this.description = description;
    }
    
    public TargetType getType() {
        return type;
    }
    
    public String getDescription() {
        return description;
    }
}