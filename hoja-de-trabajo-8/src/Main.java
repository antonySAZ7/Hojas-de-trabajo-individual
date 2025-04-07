package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

// Esta es la clase principal z
public class Main{

// metodo para cargar los paciente del archivo para el vectorheap
    public static void cargarPacientes(VectorHeap<Paciente> cola) throws FileNotFoundException{
        File archivo = new File("pacientes.txt");
        Scanner entrada = new Scanner(archivo);
        while(entrada.hasNext()){
            String[] datos = entrada.nextLine().split(",");
            if(datos.length == 3){
                String nombre = datos[0].trim();
                String sintoma = datos[1].trim();
                String codigoPrioridad = datos[2].trim();
                cola.add(new Paciente(nombre, sintoma, codigoPrioridad));
            }
        }
        entrada.close();
    }

    // metodo para atender los pacientes del vectorheap
    public static void atenderPacientes(VectorHeap<Paciente> cola) {
        while(!cola.isEmpty()){
            System.out.println("Atendiendo a: " + cola.remove());
        }
    }   


    // metodo para cargar los pacientes del archivo para la cola de prioridad de java

    public static void cargarPacientesJCF(PriorityQueue<Paciente> cola) throws FileNotFoundException{
        Scanner entrada = new Scanner(new File("pacientes.txt"));
        while(entrada.hasNext()){
            String[] datos  = entrada.nextLine().split(",");
            if(datos.length ==3){
                String nombre = datos[0].trim();
                String sintoma = datos[1].trim();
                String codigoPrioridad = datos[2].trim();
                cola.add(new Paciente(nombre, sintoma, codigoPrioridad));
            }
            }
            entrada.close();
    }


    // metodo para atender los pacientes de la cola de prioridad de java
    public static void atenderPacientesJCF(PriorityQueue<Paciente> cola) {
        while(!cola.isEmpty()){
            System.out.println("Atendiendo a: " + cola.poll());
        }
    }

// metodo principal
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println(" Bienvenidos al sistema de emergencias");
        System.out.println("¿Que implementacion de cola deseas usar?");
        System.out.println("1. VectorHeap propia");
        System.out.println("2. PriorityQueue de Java");
        System.out.print("Ingresa tu opción : ");
        int opcion = entrada.nextInt();
        entrada.nextLine();


        try{
                if(opcion == 1){
                    VectorHeap<Paciente> pacientes = new VectorHeap<>();
                    cargarPacientes(pacientes);
                    atenderPacientes(pacientes);
                }else if (opcion ==2){
                    PriorityQueue<Paciente> pacientes = new PriorityQueue<>();
                    cargarPacientesJCF(pacientes);
                    atenderPacientesJCF(pacientes);
                }else{
                    System.out.println("Opcion no valida, elija una opcino correcta");
                }
            } catch(FileNotFoundException e){
                System.out.println("Error al cargar el archivo de pacientes: " + e.getMessage());
            }
            System.out.println("Error al cargar el archivo de pacientes: ");
        }
        




    }


