package singleton.doubleCheckLocking;

public class DatabaseConnection {
    private static singleton.singleThreaded.DatabaseConnection db = null;
    private DatabaseConnection(){}

    public static singleton.singleThreaded.DatabaseConnection getInstance(){
        if(db==null){
            synchronized (DatabaseConnection.class) {
                if(db==null){
                    db = new singleton.singleThreaded.DatabaseConnection();
                }
            }
        }
        return db;
    }

    /**
     * this is the best solution to implement singleton in concurrent env. But this is not THE BEST solution
     * for normal cases.
     * Best solution is: USING ENUMS.
     */
}
