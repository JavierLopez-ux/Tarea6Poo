
/**
 *
 * @author Maynor Javier Coello
 */
public class Recursos {
   public static void main(String arg[ ]) {
   Mensajes mensajes = new Mensajes();//Instancia de la clase Mensajes
   
mensajes.Saludo();                  
mensajes.edad(25);  
mensajes.multiplicacion(5, 4);
mensajes.ListaNumeros(1);
   }
   
    public static class Mensajes {
         //Método que no recibe parámetro de entrada ni retorna valor
  public void Saludo() {
    System.out.println("Programación Orientada a Objetos 2021");
}
    
  //Método que  recibe parámetro entero para imprimir un valor
public void edad(int edad) {
  if (edad >= 21){
     System.out.println("Eres mayor de edad");
  }else{
     System.out.println("Eres menor de edad");
     }

       
       
       
       }

    
       public int multiplicacion (int val1, int val2){
           int multiplicacion;
           multiplicacion = 3*7;
           System.out.println("La multiplicacion es:" + multiplicacion);
           return val1*val2;
          
       }
       public int ListaNumeros (int n){
          int nums;
          System.out.println("Secuencia de numeros");
        System.out.println("Del 1 a X");
        System.out.print("Serie: ");
            for (nums=1;nums<=40;nums++)
            
           
           System.out.print(nums+",");
      return nums;
       
    }
    }
}
