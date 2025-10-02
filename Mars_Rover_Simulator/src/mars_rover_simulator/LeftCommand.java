
package mars_rover_simulator;

public class LeftCommand implements Command {
    private Rover rover;
    public LeftCommand(Rover rover) { this.rover = rover; }
    public void execute() { rover.turnLeft(); }
}


