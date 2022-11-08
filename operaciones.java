
package com.mycompany.tarea1;

/**
 *
 * @author Maynor Javier Coello
 */
public class operaciones {
     public static void main(String[] args) {

         //Declaración de las variables
    double suma, resta, multiplicacion, division, mod;
    int n1 = 10, n2 = 5;
    
    //realización de las operaciones
     suma = n1+n2;
     resta = n1-n2;
     multiplicacion = n1*n2;
     mod = n1%5;
       if(n2 != 0){
           division = n1 / n2;
       
  
     
     //Imprimimos los resultados en consola
     System.out.println("La suma es: " + suma);
     System.out.println("La resta es: " + resta);
     System.out.println("La multiplicacion es: " + multiplicacion);
     System.out.println("La division es: " + division);
     System.out.println("El Mod es: " + mod);
     }
}
}