
package nutricionista;

import accesoADatos.*;
import entidades.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;


public class Nutricionista {

 
    public static void main(String[] args) {
        
      Connection con = Conexion.conectar("nutricionista");
        
      PacienteData pacienteD = new PacienteData();
      ComidaData comidaD = new ComidaData();
      DietaData dietaD = new DietaData();
      DietaComidaData dietacomidaD=new DietaComidaData();
      
      Paciente paciente = new Paciente(3,"Claudio Facundo", "Suarez", "LaMadrid 13", 37457682,"123456567",true);
      Comida comida = new Comida(2,"empanada de verduras", "disco de masa con vegetales", 115, true);
      Dieta dieta = new Dieta("Dieta de la Luna", 2, LocalDate.of(2023,9,1), LocalDate.of(2023,10, 1), 80, 70, true);
      DietaComida dietacomida = new DietaComida(1,4,true);
      
      //pacienteD.altaPaciente(paciente);
      //pacienteD.bajaPacienteAp("Diaz");
      //pacienteD.modificarPaciente(paciente);
     
       comidaD.altaComida(comida);
      //comidaD.bajaComidaN("arroz amarillo");
      //comidaD.modificarComida(comida);
      
      //dietaD.altaDieta(dieta);
      //dietaD.bajaDietaN("Dieta Keto");
      //dietaD.modificarDieta(dieta);
      
      //dietacomidaD.altaDietaComida(dietacomida);
    
    }
    
    
    
}
