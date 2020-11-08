/*
 Generar un algoritmo que permita calcular y mostrar el costo de una computadora
de escritorio. La misma es comprada por partes; CPU, teclado, pantalla, ratón.

Algoritmo:

1. Inicio.
2. Se pide ingresar el costo del CPU.
3. Se pide ingresar el costo del teclado.
4. Se pide ingresar el costo de la pantalla.
5. Se pide ingresar el costo del ratón.
6. Se suman todos los costos.
7. Se muestra en pantalla el costo de una computadora de escritorio.
8. Fin.
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio4 {
    // 1. Inicio
    public static void main (String[] args){
        // Declaro variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. costo_cpu, d[0, n]
        double costo_cpu;
        // 3. costo_teclado, d[0, n]
        double costo_teclado;
        // 4. costo_pantalla, d[0, n]
        double costo_pantalla;
        // 5. costo_ratón, d[0, n]
        double costo_ratón;
        // 6. costo_computadora, d[0, n]
        double costo_computadora;
        
        // pido datos por teclado - entradas
                
        // 7. << "Ingresar el costo del CPU"
        System.out.println("Ingresar el costo del CPU");
        // 8. >> costo_cpu
        costo_cpu = entrada.nextDouble();
        // 9. << "Ingresar el costo del teclado"
        System.out.println("Ingresar el costo del teclado");
        // 10. >> costo_teclado
        costo_teclado = entrada.nextDouble();
        // 11. << "Ingresar el costo de la pantalla"
        System.out.println("Ingresar el costo de la pantalla");
        // 12. >> costo_pantalla
        costo_pantalla = entrada.nextDouble();
        // 13. << "Ingresar el costo del ratón"
        System.out.println("Ingresar el costo del raton");
        // 14. >> costo_ratón
        costo_ratón = entrada.nextDouble();
        
        // proceso
        
        /* 15. costo_computadora <-- costo_cpu 
        + costo_teclado + costo_pantalla + costo ratón */
        
        costo_computadora = costo_cpu + costo_teclado + costo_pantalla 
                + costo_ratón;
        
        // Salida 
        
        // 16. >> "El costo de la computadora es: " + costo_de_la_computadora
        System.out.printf("El costo de la computadora es: %.2f $\n"
                ,costo_computadora);              
    } // 17. Fin
    
}
