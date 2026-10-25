package umg.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import umg.modelo.Camionero;

public class CamioneroDAO {

    public void insertar(Camionero camionero) throws SQLException {
        String sql = "INSERT INTO camionero (nombre, apellidos, direccion, salario, poblacion, dpi, telefono) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection cn = ConexionDB.abrir();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, camionero.getNombre());
            ps.setString(2, camionero.getApellidos());
            ps.setString(3, camionero.getDireccion());
            ps.setBigDecimal(4, camionero.getSalario());
            ps.setString(5, camionero.getPoblacion());
            ps.setString(6, camionero.getDpi());
            ps.setString(7, camionero.getTelefono());
            ps.executeUpdate();
        }
    }

    public void actualizar(Camionero camionero) throws SQLException {
        String sql = "UPDATE camionero SET nombre=?, apellidos=?, direccion=?, salario=?, poblacion=?, dpi=?, telefono=? WHERE idCamionero=?";
        try (Connection cn = ConexionDB.abrir();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, camionero.getNombre());
            ps.setString(2, camionero.getApellidos());
            ps.setString(3, camionero.getDireccion());
            ps.setBigDecimal(4, camionero.getSalario());
            ps.setString(5, camionero.getPoblacion());
            ps.setString(6, camionero.getDpi());
            ps.setString(7, camionero.getTelefono());
            ps.setInt(8, camionero.getIdCamionero());
            ps.executeUpdate();
        }
    }

    public void eliminar(int idCamionero) throws SQLException {
        String sql = "DELETE FROM camionero WHERE idCamionero=?";
        try (Connection cn = ConexionDB.abrir();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, idCamionero);
            ps.executeUpdate();
        }
    }

    public List<Camionero> listar() throws SQLException {
        List<Camionero> lista = new ArrayList<>();
        String sql = "SELECT idCamionero, nombre, apellidos, direccion, salario, poblacion, dpi, telefono FROM camionero";
        try (Connection cn = ConexionDB.abrir();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Camionero c = new Camionero();
                c.setIdCamionero(rs.getInt("idCamionero"));
                c.setNombre(rs.getString("nombre"));
                c.setApellidos(rs.getString("apellidos"));
                c.setDireccion(rs.getString("direccion"));
                c.setSalario(rs.getBigDecimal("salario"));
                c.setPoblacion(rs.getString("poblacion"));
                c.setDpi(rs.getString("dpi"));
                c.setTelefono(rs.getString("telefono"));
                lista.add(c);
            }
        }
        return lista;
    }
}