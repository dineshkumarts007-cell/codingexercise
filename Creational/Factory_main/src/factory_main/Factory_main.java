
package factory_main;

public class Factory_main {


    public static void main(String[] args) {
        Shape_Factory factory = new Shape_Factory();
        Shape shape1 = factory.getShape("circle");
        shape1.draw();
        Shape shape2 = factory.getShape("Pentagon");
        shape2.draw();
    }
}


