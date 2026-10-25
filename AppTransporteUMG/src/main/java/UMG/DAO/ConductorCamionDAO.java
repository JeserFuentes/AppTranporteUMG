package umg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConductorCamionDAO {

    public boolean asignar(int idCamionero, int idCamion, String fecha) {
        String sql = "INSERT INTO conductor_camion (idCamionero, idCamion, fecha_asignacion) VALUES (?, ?, ?)";
        try (Connection con = ConexionDB.abrir();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idCamionero);
            ps.setInt(2, idCamion);
            ps.setString(3, fecha);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al asignar conductor y camión: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int idCamionero, int idCamion) {
        String sql = "DELETE FROM conductor_camion WHERE idCamionero = ? AND idCamion = ?";
        try (Connection con = ConexionDB.abrir();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idCamionero);
            ps.setInt(2, idCamion);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al eliminar asignación: " + e.getMessage());
            return false;
        }
    }
}