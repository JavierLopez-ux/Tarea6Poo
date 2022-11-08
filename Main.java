

package com.mycompany.estudiante;

/**
 *
 * @author Maynor Javier Coello
 */
public class Main {

    public static void main(String[] args) {
           Estudiante estudiante = new Estudiante();
    estudiante.setNombre("Javier");
    estudiante.setApellido("Lopez");
    estudiante.setEdad (19);
    estudiante.setSexo ("M");
    estudiante.setCarrera ( "Ingenieria en Electronica");
    estudiante.setFechaNac("11/25/2002");
    estudiante.setIdentidad("00506200300706");
    estudiante.setInstitucion("Universidad Tecnológica de Honduras");
    estudiante.setCorreo("maynorjaviercoellolopez@gmail.com");
    
System.out.println("Nombre: " + estudiante.getNombre() );
System.out.println("apellido: " + estudiante.getApellido() );
System.out.println("Edad: " + estudiante.getEdad() );
System.out.println("Sexo: " + estudiante.getSexo() );
System.out.println("Carrera:" + estudiante.getCarrera());
System.out.println("Fecha de Nacimiento: " + estudiante.getFechaNac() );
System.out.println("Identidad: " + estudiante.getIdentidad() );
System.out.println("Institucion: " + estudiante.getInstitucion() );
System.out.println("Correo electrónico: " + estudiante.getCorreo() );
    }
    public static class Estudiante{
          private String nombre;
    private String apellido;
    private int edad;
    private String sexo; 
    private String carrera;
    private String fechanac;
    private String identidad;
    private String institucion;
    private String correo;
    
     public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    public String getCarrera(){
        return carrera;   
    }
    public String getFechaNac(){
        return fechanac;
    }
    public String getIdentidad(){
        return identidad;
    }
    public String getInstitucion(){
        return institucion;
    }
    public String getCorreo(){
        return correo;
    }
    
      public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setFechaNac(String fechanac){
        this.fechanac = fechanac;
    }
    public void setIdentidad(String identidad){
        this.identidad = identidad;
    }
    public void setInstitucion(String institucion){
        this.institucion = institucion;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    }
}
