
package mars_rover_simulator;


public class RightCommand implements Command {
    private Rover rover;
    public RightCommand(Rover rover) { this.rover = rover; }
    public void execute() { rover.turnRight(); }
}


