import java.util.HashMap;
import java.util.Map;

public class MenuManager {
    private Map<String, Command> commands = new HashMap<>();
    
    public void setCommand(String option, Command command) {
        commands.put(option, command);
    }
    
    public void executeCommand(String option) {
        Command command = commands.get(option);
        if (command != null) {
            command.execute();
        }
        else {
            System.out.println("Command not found.");
        }
    }
}