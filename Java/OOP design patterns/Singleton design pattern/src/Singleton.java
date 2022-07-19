public class Singleton {
    private static Singleton singleton;

    private static int num = 0;

    private Singleton() {
        System.out.println("Ben oluştum");
    }

    public static Singleton getSingleton() {

        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        num++;
        System.out.println(num);

        return singleton;
    }
}
