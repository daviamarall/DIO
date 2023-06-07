package pradroes.java;

public class SingletonLazyHolder {
        private SingletonLazyHolder() {
        }

        private static class InstanceHolder {
            public static SingletonLazyHolder instance = new SingletonLazyHolder();
        }

        public static SingletonLazyHolder getInstance() {
            return InstanceHolder.instance;
        }
    }


