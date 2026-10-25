package umg.modelo;

public class Camion {
    private int idCamion;
    private String matricula;
    private String modelo;
    private String tipo;
    private int potencia;

    public Camion() {}

    public Camion(int idCamion, String matricula, String modelo, String tipo, int potencia) {
        this.idCamion = idCamion;
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public int getIdCamion() { return idCamion; }
    public void setIdCamion(int idCamion) { this.idCamion = idCamion; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
}