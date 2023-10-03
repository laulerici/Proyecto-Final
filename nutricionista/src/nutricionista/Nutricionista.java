
package nutricionista;

import accesoADatos.Conexion;
import accesoADatos.PacienteData;
import entidades.Paciente;
import java.sql.Connection;


public class Nutricionista {

 
    public static void main(String[] args) {
        
      Connection con = Conexion.conectar("nutricionista");
        
      PacienteData pacienteD = new PacienteData();
      
      Paciente paciente = new Paciente("Facundo", "Suarez", "LaMadrid 13", 37457682,"123456567",true);
      
      
      pacienteD.altaPaciente(paciente);
     
    }
    
}
