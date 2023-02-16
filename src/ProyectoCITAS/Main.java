
package ProyectoCITAS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Cita> citas = new ArrayList<>();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n1. Agregar paciente");
            System.out.println("2. Agregar medico");
            System.out.println("3. Agregar cita");
            System.out.println("4. Mostrar cita de paciente o medico");
            System.out.println("5. salir");
            System.out.println("\nIngrese una opción");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:// agregar paciente
                    System.out.println("\nIngrese el nombre del paciente: ");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese la dirección del paciente: ");
                    String direccion = entrada.nextLine();
                    System.out.println("Ingrese el teléfono del paciente: ");
                    String telefono = entrada.nextLine();
                    //creamos un objeto
                    pacientes.add(new Paciente(nombre, direccion, telefono));
                    System.out.println("Paciente agregado correctamente");
                    break;

                case 2://agregar médico
                    System.out.println("\nIngrese el nombre del médico: ");
                    entrada.nextLine();
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese el apellido del médico: ");
                    String apellido = entrada.nextLine();
                    System.out.println("Ingrese la especialidad del médico: ");
                    String especialidad = entrada.nextLine();
                    System.out.println("Ingrese el teléfono del médico: ");
                    telefono = entrada.nextLine();
                    //creamos un objeto
                    medicos.add(new Medico(nombre, apellido, especialidad, telefono));
                    System.out.println("médico agregado correctamente");
                    break;
                case 3:// agregar cita
                    System.out.println("\nIngrese la fecha de la cita (dd/mm/yyyy): ");
                    entrada.nextLine();
                    String fecha = entrada.nextLine();
                    System.out.println("Ingrese la hora de la cita (hh:mm): ");
                    String hora = entrada.nextLine();
                    System.out.println("Ingrese el motivo de la cita: ");
                    String motivo = entrada.nextLine();

                    System.out.println("\nSeleccione un paciente");
                    //motrar la lista de pacientes y le pedimos al usuario que selecciones uno
                    for (int i = 0; i < pacientes.size(); i++) {
                        System.out.println((i + 1) + ". " + pacientes.get(i).getNombre());
                    }
                    int pacienteSeleccionado = entrada.nextInt() - 1;

                    //motrar la lista de médicos y le pedimos al usuario que selecciones uno
                    System.out.println("\nSeleccione un médico");
                    for (int i = 0; i < medicos.size(); i++) {
                        System.out.println((i + 1) + ". " + medicos.get(i).getNombre());
                    }
                    int medicoSeleccionado = entrada.nextInt() - 1;

                    //creamos un objeto de tipo lista y lo agregamos a la lista dinámica
                    citas.add(new Cita(pacientes.get(pacienteSeleccionado), medicos.get(medicoSeleccionado), fecha, hora, motivo));
                    System.out.println("cita agregada correctamente");
                    break;

                case 4://mostrar citas de un paciente o médico
                    System.out.println("Ingrese el nombre del médico o paciente");
                    entrada.nextLine();
                    nombre = entrada.nextLine();

                    boolean encontrado = false;
                    for (Cita cita : citas) {
                        if (cita.getPaciente().getNombre().equals(nombre) || cita.getMedico().getNombre().equals(nombre)) {
                            System.out.println("\nPaciente: " + cita.getPaciente().getNombre());
                            System.out.println("Médico: " + cita.getMedico().getNombre());
                            System.out.println("Fecha: " + cita.getFecha());
                            System.out.println("Hora: " + cita.getHora());
                            encontrado = true;
                        }

                    }
                    if(!encontrado){
                        System.out.println("no se ha encontrado citas para el paciente o médico");
                    }
                    break;
                    
                case 5://salir
                    System.out.println("hasta la próxima....");
                    break;
                    
                default:
                    System.out.println("opción no valida, intente de nuevo");
                    

            }
        }
    }

}