package singleton;

public class TesteSingleton {

    public static void main(String[] args) {

        SingletonLazy s5 = SingletonLazy.getInstance();
        SingletonLazy s6 = SingletonLazy.getInstance();
        System.out.println(s5 == s6);

        SingletonEager s3 = SingletonEager.getInstance();
        SingletonEager s4 = SingletonEager.getInstance();
        System.out.println(s3 == s4);

        SingletonLazyHolder s1 = SingletonLazyHolder.getInstance();
        SingletonLazyHolder s2 = SingletonLazyHolder.getInstance();
        System.out.println(s1 == s2);

    }

}
