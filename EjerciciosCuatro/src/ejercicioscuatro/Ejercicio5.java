/*
 Generar un solución que permita calcular y mostrar el pago mensual de un 
 préstamo de 1 año de plazo. Se debe ingresar el monto del préstamo y el interés
 mensual a cobrar.

Algoritmo:

1. Inicio 
2. Se pide ingresar el monto del préstamo
3. Se pide ingresar el interés mensual a cobrar
4. Se divide el monto del préstamo para 12 meses y se suma el interés mensual
   a cobrar
5. Se muestra en pantalla el pago mensual de un préstamo.
6. Fin

 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio5 {
    // 1. Inicio
    public static void main (String[] args){
        // Declaro variables
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        // 2. monto_préstamo, d[0, n]
        double monto_préstamo;
        // 3. interés_mensual_cobrar, d[0, n]
        double interés_mensual_cobrar;
        // 4. pago_mensual, d[0, n]
        double pago_mensual;
        
        // pido datos por teclado - entradas
        
        // 5.<< "Ingresar el monto del préstamo"
        System.out.println("Ingresar el monto del préstamo");
        // 6. >> monto_prestamo
        monto_préstamo = entrada.nextDouble();
        // 7. << "Ingresar el interes mensual a cobrar"
        System.out.println("Ingresar el interés mensual a cobrar");
        // 8. >> interés_mensual_cobrar 
        interés_mensual_cobrar = entrada.nextDouble();
        
        // proceso
        
        // 9. pago_mensual = monto_préstamo / 12 + interés_mensual_cobrar
        pago_mensual = monto_préstamo / 12 + interés_mensual_cobrar;
        
        // salida
        
        // 10. << "El pago mensual del préstamo es: " + pago_mensual 
        System.out.printf("El pago mensual del préstamo es: %.2f\n",
                pago_mensual);       
    }// 11. Fin
    
}
