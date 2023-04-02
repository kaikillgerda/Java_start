package homework_05_OOP_11;

public interface CommandHandler {
    String commandName();

    void handleCommand(RobotMap map, String[] args);
}
