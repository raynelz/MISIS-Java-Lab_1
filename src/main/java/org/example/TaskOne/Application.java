package org.example.TaskOne;

class Connection {
    private static Connection instance;

    public static Connection getInstance() {
        if (null != instance)
            return instance;

        instance = new Connection();
        return instance;
    }
}

class SingletonService {
    public void exec() {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();

        System.out.println(connection1.toString());
        System.out.println(connection2.toString());
    }
}

public class Application {
    public static void main(String[] args) {
        SingletonService shared = new SingletonService();
        shared.exec();
    }
}