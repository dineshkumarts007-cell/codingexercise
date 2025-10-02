
package mars_rover_simulator;

public class MoveCommand implements Command {
    private Rover rover;
    public MoveCommand(Rover rover) { this.rover = rover; }
    public void execute() { rover.move(); }
}


