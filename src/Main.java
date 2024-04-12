public class Main {
    public static void main(String[] args) {
        // Henter singleton-instansen af DatabaseConnector
        DatabaseConnector connector = DatabaseConnector.getInstance();

        // Kalder connect metoden på den hentede instans
        connector.connect();

        // Test for at se, at der kun er en instans
        DatabaseConnector anotherConnector = DatabaseConnector.getInstance();
        System.out.println(connector == anotherConnector); // Skal udskrive "true"
    }
}
