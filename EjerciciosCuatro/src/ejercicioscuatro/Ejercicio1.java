/*
Generar un algoritmo que permite calcular y presentar el área de un triángulo.
Los datos deben ser pedidos al usuario.
Algoritmo:
1. Inicio
2. Se pide ingresar la base
3. Se pide ingresar la altura
4. Se calcula el area del triangulo multiplicando su base por la altura
5. Se realiza la división para 2 
6. Se presenta en pantalla el resultado del área del triangulo.
7. Fin

*/
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio1 {
    // 1. Inicio
    public static void main(String[] args) {
        //Declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. base, d[0, n]
        double base;
        // 3. altura, d[0, n]
        double altura;
        // 4. area del triangulo, d[0, n]
        double area_triangulo;
        
        // pido datos por teclado - entradas
        
        // 5. << "Ingresar la base del triangulo"
        System.out.println("Ingresar la base del triangulo");
        // 6. >> base
        base = entrada.nextDouble();
        // 7. << "Ingresar la altura del trinagulo"
        System.out.println("Ingresar la altura del triangulo");
        // 8. >> altura
        altura = entrada.nextDouble();
        
        // proceso
        
        // 9.area<--base * altura / 2
        area_triangulo = base * altura / 2;
        
        //salida
        
        // 10. << "El area del triangulo es: " + area del triangulo
        System.out.printf("El area del trinagulo es: %.2f\n"
                   ,area_triangulo);  
        } // 11. Fin
    
}
