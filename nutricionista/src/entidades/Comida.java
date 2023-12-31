
package entidades;


public class Comida {
    
    private int idComida;
    private String nombre;
    private String detalle;
    private int cantCalorias;
    private boolean estado;

    public Comida() {
    }

    public Comida(String nombre, String detalle, int cantCalorias, boolean estado) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.estado = estado;
    }

    public Comida(int idComida, String nombre, String detalle, int cantCalorias, boolean estado) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.estado = estado;
    }

    public Comida(String text, String text0, int parseInt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    @Override
    public String toString() {
        return nombre;
                //"Comida{" + "idComida=" + idComida + ", nombre=" + nombre + ", detalle=" + detalle + ", cantCalorias=" + cantCalorias + '}';
    }   
    
}
