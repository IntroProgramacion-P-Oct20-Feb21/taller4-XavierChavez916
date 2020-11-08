/*
 Generar un algoritmo que permite ingresar los gastos de tres hijos de un 
 padre de familia; calcular y mostrar el total de gastos de los hijos del 
 padre de familia.
Algoritmo: 

1. Inicio
2. Se pide ingresar gasto del primer hijo.
3. Se pide ingresar gasto del segundo hijo.
4. Se pide ingresar gasto del tercer hijo.
5. Se Suman los gastos de los 3 hijos.
6. Se presenta en pantalla el total de los gastos de los 3 hijos
7. Fin

 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio2 {
    // 1. Inicio
    public static void main(String[] args) {
    // Declaro variables 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. gasto_primer_hijo, d[0, n]
        double gasto_primer_hijo;
        // 3. gasto_segundo_hijo, d[0, n]
        double gasto_segundo_hijo;
        // 4. gasto_tercer_hijo, d[0, n]
        double gasto_tercer_hijo;
        // 5. total_gastos, d[0, n]
        double total_gastos;
        
         // pido datos por teclado - entradas
         
         // 6. << "Ingrese el gasto del primer hijo"
         System.out.println("Ingrese el gasto del primer hijo");
         // 7. >> gasto_primer_hijo
         gasto_primer_hijo = entrada.nextDouble();
         // 8. << "Ingrese el gasto del segundo hijo"
         System.out.println("Ingrese el gasto del segundo hijo");
         // 9. >> gasto_segundo_hijo
         gasto_segundo_hijo = entrada.nextDouble();
         // 10. << "Ingrese el gasto del tercer hijo"
         System.out.println("Ingrese el gasto del tercer hijo");
         // 11. >> gasto_tercer_hijo
         gasto_tercer_hijo = entrada.nextDouble();
         
         // proceso
         /*
         12. total_gastos<-- gastos_primer_hijo+gastos_segundo_hijo+
         gastos_tercer_hijo
         */
        total_gastos = gasto_primer_hijo + gasto_segundo_hijo + 
                gasto_tercer_hijo;
         
         // salida
        
         //13. <<"El total de gastos es:" + total_gastos
         System.out.printf("El costo total es: $%.2f\n"
                     ,total_gastos);
    } // 14. Fin
    
}
