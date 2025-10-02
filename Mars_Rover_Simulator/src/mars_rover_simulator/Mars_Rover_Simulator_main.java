

package mars_rover_simulator;

public class Mars_Rover_Simulator_main {

    public static void main(String[] args) {
        Grid grid = new Grid(10,10);
        Rover rover = new Rover(0,0,Direction.NORTH, grid);

        rover.status();

        // Use Command pattern
        Command move = new MoveCommand(rover);
        Command left = new LeftCommand(rover);
        Command right = new RightCommand(rover);

        move.execute(); // Move forward
        rover.status();

        right.execute(); // Turn right
        move.execute();  // Move
        rover.status();

        // Composite command
        HybridCommand mission = new HybridCommand();
        mission.addCommand(move);
        mission.addCommand(move);
        mission.addCommand(left);
        mission.addCommand(move);

        System.out.println("\nExecuting mission sequence...");
        mission.execute();
        rover.status();
    }
}

   
