package umg.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

private static final String URL = "jdbc:mysql://localhost:3306/db_paqueteria?allowPublicKeyRetrieval=true&serverTimezone=America/Guatemala";

    private static final String USER = "root";
    private static final String PASS = "12345678";

    // Método para abrir la conexión directamente
    public static Connection abrir() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // Método getConexion para que no dé error en CamionDAO ni en otros DAOs
    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}