
package umg.modelo;

public class Ciudad {
    int Ciudad;
    String nombre;

    public Ciudad(int Ciudad, String nombre) {
        this.Ciudad = Ciudad;
        this.nombre = nombre;
    }
    
    public Ciudad(){
        
    }
    
    //getters y setters

    public int getCiudad() {
        return Ciudad;
    }

    public void setCiudad(int Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "Ciudad=" + Ciudad + ", nombre=" + nombre + '}';
    }
    
    
}
