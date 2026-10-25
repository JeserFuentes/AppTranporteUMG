package umg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import umg.modelo.Ciudad;

public class CiudadDAO {

    public void insertar(Ciudad ciudad) throws SQLException {
        String sql = "INSERT INTO ciudad (nombre) VALUES (?)";
        try (Connection cn = ConexionDB.abrir();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, ciudad.getNombre());
            int filas = ps.executeUpdate();
            if (filas == 0) {
                throw new SQLException("No se pudo insertar el registro.");
            }
        }
    }

    public void actualizar(Ciudad ciudad) throws SQLException {
        String sql = "UPDATE ciudad SET nombre=? WHERE idCiudad=?";
        try (Connection cn = ConexionDB.abrir();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, ciudad.getNombre());
            ps.setInt(2, ciudad.getCiudad());
            int filas = ps.executeUpdate();
            if (filas == 0) {
                throw new SQLException("No se pudo actualizar el registro.");
            }
        }
    }

    public void eliminar(int id) throws SQLException {
        String sql = "DELETE FROM ciudad WHERE idCiudad=?";
        try (Connection cn = ConexionDB.abrir();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            if (filas == 0) {
                throw new SQLException("No se pudo eliminar el registro.");
            }
        }
    }

    public List<Ciudad> listar() throws SQLException {
        List<Ciudad> listaCiudades = new ArrayList<>();
        String sql = "SELECT idCiudad, nombre FROM ciudad";
        try (Connection cn = ConexionDB.abrir();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                listaCiudades.add(ciudad);
            }
        }
        return listaCiudades;
    }
}