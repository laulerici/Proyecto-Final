
package nutricionista;

import accesoADatos.ComidaData;
import accesoADatos.Conexion;
import accesoADatos.PacienteData;
import entidades.Comida;
import entidades.Paciente;
import java.sql.Connection;


public class Nutricionista {

 
    public static void main(String[] args) {
        
      Connection con = Conexion.conectar("nutricionista");
        
      PacienteData pacienteD = new PacienteData();
      ComidaData comidaD = new ComidaData();
      
      Paciente paciente = new Paciente(3,"Claudio Facundo", "Suarez", "LaMadrid 13", 37457682,"123456567",true);
      Comida comida = new Comida(2,"empanada de pollo", "disco de masa con atún y pollo", 255, true);
      
      //pacienteD.altaPaciente(paciente);
     // pacienteD.bajaPacienteAp("Diaz");
     
     //pacienteD.modificarPaciente(paciente);
     
    // comidaD.altaComida(comida);
    
    //comidaD.bajaComidaN("arroz amarillo");
    
    comidaD.modificarComida(comida);
    
    
    }
    
    
    
}
