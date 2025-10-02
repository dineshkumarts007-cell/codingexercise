
package mars_rover_simulator;

public class Grid {
    private int width, height;
    public Grid(int width, int height) {
        this.width = width; this.height = height;
    }
    public boolean isInside(int x, int y) {
        return x >= 0 && y >= 0 && x < width && y < height;
    }
}

