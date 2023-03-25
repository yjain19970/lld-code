package liveclass.designpattern.singlethreaded;

public class DBConn {
    private static DBConn dbConn = null;
    private DBConn(){}

    public static DBConn getInstance(){
        if(dbConn ==null){
            dbConn = new DBConn();
        }
        return dbConn;
    }

}
