
package com.mycompany.futbolista;

/**
 *
 * @author Maynor Javier Coello
 */
public class Futbolista {
 public static void main(String[] args) {
    Futbolista futbolista = new Futbolista();
   
    futbolista.setNombre("javier");
    futbolista.setEdad(19);
    futbolista.setEquipoactual("Real madrid");
     
       System.out.println("Nombre: " + futbolista.getNombre());
System.out.println("Equipo actual: " + futbolista.getEquipoactual());
System.out.println("Edad: " + futbolista.getEdad());
    }
    
    protected String nombre;
    protected int edad;
    protected String equipoactual; 
    
         public String getNombre(){
        return nombre;
    }
    public String getEquipoactual(){
        return equipoactual;
    }
    public int getEdad(){
        return edad;
    }
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEquipoactual(String equipoactual){
        this.equipoactual = equipoactual;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
  
    }
    
