public class OpenFileCommand implements Command {
    private Menu menu;
    
    public OpenFileCommand(Menu menu) {
        this.menu = menu;
    }
    
    @Override
    public void execute() {
        menu.openFile();
    }
}