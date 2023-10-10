
package entidades;

import java.time.LocalDate;


public class Consulta {
    private int idConsulta;
    private LocalDate fecha;
    private double peso;
    private double altura;
    private double imc;
    private Paciente paciente;

    public Consulta(int idConsulta, LocalDate fecha, double peso, double altura, double imc, Paciente paciente) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.paciente = paciente;
    }

    public Consulta(LocalDate fecha, double peso, double altura, double imc, Paciente paciente) {
        this.fecha = fecha;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.paciente = paciente;
    }

   
    public Consulta() {
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" + "idConsulta=" + idConsulta + ", fecha=" + fecha + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", paciente=" + paciente + '}';
    }
 
    }
    
    
    
    

