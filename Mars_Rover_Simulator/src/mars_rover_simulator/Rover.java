
package mars_rover_simulator;

public class Rover {
    
    private int x, y;
    private Direction dir;
    private Grid grid;

    public Rover(int x, int y, Direction dir, Grid grid) {
        this.x = x; this.y = y; this.dir = dir; this.grid = grid;
    }

    public void move() {
        int newX = x, newY = y;
        switch(dir) {
            case NORTH: newY++; break;
            case SOUTH: newY--; break;
            case EAST:  newX++; break;
            case WEST:  newX--; break;
        }
        if (grid.isInside(newX, newY)) {
            x = newX; y = newY;
        } else {
            System.out.println("Cannot move outside grid!");
        }
    }

    public void turnLeft() { dir = dir.turnLeft(); }
    public void turnRight() { dir = dir.turnRight(); }

    public void status() {
        System.out.println("Rover at (" + x + "," + y + ") facing " + dir);
    }
}

