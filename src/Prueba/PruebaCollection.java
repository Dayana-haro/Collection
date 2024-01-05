/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class PruebaCollection {
         public static void main(String[] args) {
        // Crear una colección (ArrayList en este caso)
        Collection<String> lista = new ArrayList<>();

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese elementos
        System.out.println("Ingresa elementos para la colección (escribe 'fin' para terminar):");

        // Loop para recibir la entrada del usuario
        while (true) {
            String elemento = scanner.nextLine();

            // Verificar si el usuario quiere salir del bucle
            if (elemento.equalsIgnoreCase("fin")) {
                break;
            }

            // Agregar el elemento a la colección
            lista.add(elemento);
        }

        // Cerrar el scanner después de su uso
        scanner.close();
        String elementoEliminar = "CAJAS";
        // Verificar si el contenido de elementoEliminar es igual a "cajas" (insensible a mayúsculas o minúsculas)
        if (elementoEliminar.equalsIgnoreCase("cajas")) {
          // Realizar acciones si la comparación es verdadera
         System.out.println("El contenido de elementoEliminar es igual a 'cajas'");
           } else {
           // Realizar acciones si la comparación es falsa
             System.out.println("El contenido de elementoEliminar no es igual a 'cajas'");
           }
        lista.remove(elementoEliminar);
        System.out.println("Contenido después de eliminar '" + elementoEliminar + "':");
        imprimirColeccion(lista);
        // Imprimir la colección
        System.out.println("Elementos ingresados:");
        imprimirColeccion(lista);
    }

    // Método para imprimir los elementos de la colección
    private static void imprimirColeccion(Collection<String> coleccion) {
        for (String elemento : coleccion) {
            System.out.println(elemento);
        }
    }
}