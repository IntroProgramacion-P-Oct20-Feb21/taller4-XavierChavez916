/*
 Generar un algoritmo que permita calcular y mostrar el valor de la planilla 
 de teléfono de un casa. Se debe ingresar el costo por minutos, el número de 
 minutos consumidos en el mes.

Algoritmo:

1. Inicio.
2. Se pide ingresar el costo por minutos.
3. Se pide ingresar el número de minutos consumidos por el mes.
4. Se calcula multiplicando el costo por el número de minutos.
5. Se presenta en pantalla el valor de la planilla de teléfono de una casa.
5. Fin
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio3 {
    // 1. Inicio 
    public static void main (String[] args) {
        //Declaro variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. costo_por_minuto, d[0, n]
        double costo_por_minuto;
        // 3. número_de_minutos_consumidos_por_el_mes, d[0, n]
        double número_de_minutos_consumidos_por_el_mes;
        // 4. valor_planilla, d[0, n]
        double valor_planilla;
        
        // pido datos por teclado - entradas  
        
        // 5. << "Ingresar el costo por minuto"
        System.out.println("Ingresar el costo por minuto");
        // 6. >> costo_por_minuto
        costo_por_minuto = entrada.nextDouble();
        // 7. << "Ingresar el número de minutos consumidos por el mes"
        System.out.println("Ingresar el número de minutos consumidos "
                + "por el mes");
        // 8. << número_de_minutos_consumidos_por_el_mes
        número_de_minutos_consumidos_por_el_mes = entrada.nextDouble();
        
        // proceso
        
        /* 9. valor_planilla<--costo_por_minuto*
        número_de_minutos_consumidos_por_el_mes
        */
        valor_planilla = costo_por_minuto *
                número_de_minutos_consumidos_por_el_mes;
        
        // salida
        
        /* 10. <<"El valor de la planilla de teléfono de una 
        casa es:"+valor_planilla */
        
        System.out.printf("El valor de la planilla de teléfono es: %.2f\n"
                   ,valor_planilla);    
    }// 11. Fin
         
    
}
