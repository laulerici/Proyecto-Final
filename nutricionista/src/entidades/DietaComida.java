
package entidades;


public class DietaComida {
    
    private int idDC;
    private int idComida;
    private int idDieta;

    public DietaComida() {
    }

    public DietaComida(int idComida, int idDieta) {
        this.idComida = idComida;
        this.idDieta = idDieta;
    }

    public DietaComida(int idDC, int idComida, int idDieta) {
        this.idDC = idDC;
        this.idComida = idComida;
        this.idDieta = idDieta;
    }
    
    
    
}
