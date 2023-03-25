package oops.designpattern.singleton.singleThreaded;

public class DatabaseConnection {
    private static DatabaseConnection db = null;
    public DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(db==null){
            db  = new DatabaseConnection();
        }
        return db;
    }
}
