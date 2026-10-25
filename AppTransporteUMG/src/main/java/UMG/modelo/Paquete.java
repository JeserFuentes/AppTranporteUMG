package umg.modelo;

public class Paquete {
    private int idPaquete;
    private String codigo;
    private String descripcion;
    private String destinatario;
    private String direccionDestinatario;
    private int idCiudad; // Clave foránea hacia la tabla ciudad

    public Paquete() {
    }

    public Paquete(int idPaquete, String codigo, String descripcion, String destinatario, String direccionDestinatario, int idCiudad) {
        this.idPaquete = idPaquete;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.idCiudad = idCiudad;
    }

    // Getters y Setters
    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
}