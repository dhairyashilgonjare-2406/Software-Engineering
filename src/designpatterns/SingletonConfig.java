package designpatterns;

public class SingletonConfig {
    private static SingletonConfig instance;
    private String databaseUrl;

    private SingletonConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/default_db";
    }

    public static synchronized SingletonConfig getInstance() {
        if (instance == null) {
            instance = new SingletonConfig();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }
}
