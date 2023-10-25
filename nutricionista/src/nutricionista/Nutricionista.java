
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
        DietaComidaData dietaComidaD = new DietaComidaData();
        ConsultaData consultaD = new ConsultaData();

       // Paciente paciente = new Paciente(4, "Claudio Facundo", "Suarez", "LaMadrid 13", 37457682, "123456567", true);
        //  Comida comida = new Comida(2, "sushi", "roll de salmón ahumado con queso Philadelfia", 150, true);
        //Dieta dieta = new Dieta("Dieta de la Luna", 2, LocalDate.of(2023, 9, 1), LocalDate.of(2023, 10, 1), 80, 70, true);
        // DietaComida dietacomida = new DietaComida(3, 3, true);
      //  Consulta consulta = new Consulta(1, LocalDate.of(2023, 10, 24), 56, 168, 15, pacienteD.buscarPacienteXApellido("Lerici")); //hacer metodo para buscar paciente por id
        //consultaD.agregarConsulta(consulta);

        //pacienteD.altaPaciente(paciente);
        //pacienteD.bajaPacienteAp("Diaz");
        //pacienteD.modificarPaciente(paciente);
        //comidaD.altaComida(comida);
        //comidaD.bajaComidaN("arroz amarillo");
        //comidaD.modificarComida(comida);
        //dietaD.altaDieta(dieta);
        //dietaD.bajaDietaN("Dieta Keto");
        //dietaD.modificarDieta(dieta);
        //dietaComidaD.altaDietaComida(dietacomida);
        //consultaD.agregarConsutla(consulta);
        //System.out.println(pacienteD.buscarPacienteXId(1));
       // System.out.println(pacienteD.buscarPacienteXApellido("Diaz"));
        /*
        for (Comida comida : comidaD.listarComidaXCal(500)) {
            
            System.out.println("idComida "+comida.getIdComida());
            System.out.println("nombre " + comida.getNombre());
            System.out.println("detalle " + comida.getDetalle());
            System.out.println("Calorias " + comida.getCantCalorias());

        }
         */
 /*
        for (Consulta consulta : consultaD.listarPesos(2)) {

  
  for (Consulta consulta : consultaD.listarPesos(1)) {

            
            System.out.println("peso "+consulta.getPeso());
            System.out.println("fecha"+consulta.getFecha());
           
        }
         */
 /*  
  for (Comida comida : comidaD.ordenarComidaXCalorias()) {
            
            System.out.println("nombre: "+comida.getNombre());
            System.out.println("calorias: "+comida.getCantCalorias());
            System.out.println("detalle: "+comida.getDetalle());
    }
         */
 /*
for (Comida comida : dietaComidaD.listarComidasPorDieta(2)) { 
            
            System.out.println("nombre: "+comida.getNombre());
            System.out.println("calorias: "+comida.getCantCalorias());
            System.out.println("detalle: "+comida.getDetalle());
    }
         */
        // dietaComidaD.sumarCaloriasXDieta(4);
        // consultaD.calculoImc(1.68, 60);
        //consultaD.modificarConsulta(consulta);
        
    for(Paciente paciente: pacienteD.listarPacientes()){
        
        System.out.println("idPaciente "+ paciente.getIdPaciente());  
        System.out.println("Apellido "+ paciente.getApellido());  
        System.out.println("Nombre "+ paciente.getNombre());  
              
    }
        
        
    }
}
