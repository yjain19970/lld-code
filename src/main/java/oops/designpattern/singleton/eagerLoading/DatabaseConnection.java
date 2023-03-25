package oops.designpattern.singleton.eagerLoading;

public class DatabaseConnection {
    private static DatabaseConnection db = new DatabaseConnection();
    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        return db;
    }
    // works fine in concurrent env
    // disadvantages --> load at class load_time + if you need some params, you cannot give.

}
