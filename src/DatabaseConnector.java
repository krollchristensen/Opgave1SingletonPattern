public class DatabaseConnector {
    // Enkelt instans, der bliver initialiseret som null.
    private static DatabaseConnector instance = null;

    // Privat konstruktor for at forhindre instansiering udefra.
    private DatabaseConnector() {
        // Konfiguration eller initialisering her
    }

    // Statisk metode for at oprette og/eller returnere instansen.
    public static synchronized DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database connection established.");
        // Forbindelseslogik her
    }
}
