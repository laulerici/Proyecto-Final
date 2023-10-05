
package entidades;


public class DietaComida {
    
    private int idDC;
    private int idComida;
    private int idDieta;
    private boolean estado;

    public DietaComida() {
    }

    public DietaComida(int idComida, int idDieta, boolean estado) {
        this.idComida = idComida;
        this.idDieta = idDieta;
        this.estado = estado;
    }

    public DietaComida(int idDC, int idComida, int idDieta) {
        this.idDC = idDC;
        this.idComida = idComida;
        this.idDieta = idDieta;
        this.estado = estado;
    }

    public int getIdDC() {
        return idDC;
    }

    public void setIdDC(int idDC) {
        this.idDC = idDC;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DietaComida{" + "idComida=" + idComida + ", idDieta=" + idDieta + '}';
    }


    
    
}
