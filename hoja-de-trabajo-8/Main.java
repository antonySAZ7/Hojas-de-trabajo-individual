import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println(" Bienvenidos al sistema de emergencias");
        System.out.println("¿Que implementacion de cola deseas usar?");
        System.out.println("1. VectorHeap propia");
        System.out.println("2. PriorityQueue de Java");
        System.out.print("Ingresa tu opción : ");
        int opción = entrada.nextInt();
        entrada.nextLine();

    }


}