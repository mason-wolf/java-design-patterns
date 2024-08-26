/**
 * Encapsulate a request as an object, thereby letting you parametize clients
 * with different requests, queue or log requests, and support undoable operations.
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Command openFile = new OpenFileCommand(menu);
        
        MenuManager menuManager = new MenuManager();
        menuManager.setCommand("1", openFile);
        String choice = "1";
        menuManager.executeCommand(choice);
    }
}