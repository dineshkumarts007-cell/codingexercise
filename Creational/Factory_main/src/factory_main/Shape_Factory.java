
package factory_main;

public class Shape_Factory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("Pentagon")) return new Pentagon();
        return null;
    }
}


