public interface Database {
    void save(String data);
}

public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving data to MySQL database: " + data);
    }
}

public class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}
