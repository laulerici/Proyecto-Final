
package entidades;

import java.time.LocalDate;


public class Dieta {
    
    private int idDieta;
    private String nombre;
    private int idPaciente;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private double pesoInicial;
    private double pesoFinal;
    private boolean estado;


    public Dieta() {
    }

    public Dieta(String nombre, int idPaciente, LocalDate fechaIni, LocalDate fechaFin, double pesoInicial, double pesoFinal,boolean estado) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public Dieta(int idDieta, String nombre, int idPaciente, LocalDate fechaIni, LocalDate fechaFin, double pesoInicial, double pesoFinal,boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
         this.estado = estado;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    @Override
    public String toString() {
        return "Dieta{" + "idDieta=" + idDieta + ", nombre=" + nombre + ", idPaciente=" + idPaciente + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", pesoInicial=" + pesoInicial + ", pesoFinal=" + pesoFinal + '}';
    }
    
    
    
}
