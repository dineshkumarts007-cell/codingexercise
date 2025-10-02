

package singleton;

public class Singleton_main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Are both instances same? " + (s1 == s2));
        
    }
}
