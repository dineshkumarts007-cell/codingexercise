
package mars_rover_simulator;

import java.util.ArrayList;
import java.util.List;

public class HybridCommand implements Command {
    private List<Command> commands = new ArrayList<>();
    public void addCommand(Command cmd) { commands.add(cmd); }
    public void execute() {
        for (Command c : commands) c.execute();
    }
}


