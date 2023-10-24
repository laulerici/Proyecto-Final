
package entidades;


public class Paciente {
    private int idPaciente;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int dni;
    private String telef;   
    private boolean estado;


    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String domicilio, int dni, String telef,boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telef = telef;
        this.estado = estado; 
    }

    public Paciente(int idPaciente, String nombre, String apellido, String domicilio, int dni, String telef, boolean estado) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telef = telef;
        this.estado = estado;
    }
// Borrar una vez desicidida la vista de agregar paciente
    public Paciente(String nombre, String apellido, String domicilio, Integer dni, String telefono) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", dni=" + dni + ", telef=" + telef + '}';
    }
   
    
    
}


