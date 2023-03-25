package liveclass.designpattern.doublecheckloading;

public class DBConnDCL {
    private static DBConnDCL dbConn = null;
    private DBConnDCL(){}

    public static DBConnDCL getInstance(){
        if(dbConn == null){
            synchronized (DBConnDCL.class){
                if(dbConn == null){
                    dbConn = new DBConnDCL();
                }
            }
        }
        return dbConn;
    }

}
