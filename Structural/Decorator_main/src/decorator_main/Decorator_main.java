

package decorator_main;

public class Decorator_main {

    public static void main(String[] args) {
       
        Coffee coffee = new Normal_Coffee();
        System.out.println(coffee.description() + " $" + coffee.cost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.description() + " $" + coffee.cost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.description() + " $" + coffee.cost());
    }
}

    
