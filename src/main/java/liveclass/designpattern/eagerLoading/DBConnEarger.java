package liveclass.designpattern.eagerLoading;

public class DBConnEarger {
    private static DBConnEarger dbConn = new DBConnEarger();
    private DBConnEarger(){}

    public static DBConnEarger getInstance(){
        return dbConn;
    }

}
