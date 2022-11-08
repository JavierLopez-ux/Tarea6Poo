
package com.mycompany.formas;

/**
 *
 * @author Maynor Javier Coello
 */


    public class Formas {
        public static void main (String[] args){
         
            //Para el Círculo
            Formas circle = new Formas();
            Formas colorcircle = new Formas(); 
            Formas radio = new Formas();
            
            //Para la Línea
             Formas line = new Formas();
            Formas colorline = new Formas(); 
            
            //Para el Triangulo
            Formas triangle = new Formas();
            Formas colortriangle = new Formas();
            Formas base = new Formas();
            Formas altura = new Formas();
            Formas areatriangulo = new Formas();
            
            //Para el Cuadrado
            Formas square = new Formas();
            Formas lado = new Formas();
            Formas colorcuadrado = new Formas();
            Formas areacuadrado = new Formas();
            
            
            //Impresión del círculo
        class Circulo extends Formas {
        }
       circle.SetDibujarCirculo("Circulo");
       colorcircle.SetColorCirculo("Azul");
       radio.SetRadio(5);
       
       System.out.println("Forma: " + circle.GetDibujarCirculo()); System.out.println("El color del circulo es: " + colorcircle.GetColor());
       System.out.println("El radio del ciruclo es:" + radio.GetRadio());
       
          
       //Impresión de la Línea
        class Linea extends Formas {
        }
       line.SetDibujarLinea("LInea");
       colorline.SetColorLinea("Rojo");
     
       System.out.println("Forma: " + line.GetDibujarline()); System.out.println("El color de la linea es: " + colorline.GetColorline());
  
       
       //Impresión del Triándulo
       class Triangulo extends Formas{
       }
       base.SetBase(10);
       altura.SetAltura(16);
       areatriangulo.SetAreaTriangulo(10, 16);
       triangle.SetDibujarTriangulo("Triangulo");
        colortriangle.SetColorTriangulo("Verde");
        
        System.out.println("Forma: " + triangle.GetDibujarTriangulo());   System.out.println("El color del triangulo es: " + colortriangle.GetColorTriangulo());
        System.out.println("La base del triangulo mide: " + base.GetBase()); System.out.println("La altura del triangulo mide: " + altura.GetAltura());
        System.out.println("El area del triangulo es:" + areatriangulo.GetAreaTriangulo());
        
        
        //Impresión del Cuadrado
        class Cuadrado extends Formas{       
    }
        lado.SetLado(5);
        square.SetDibujarCuadrado("Cuadrado");
        colorcuadrado.SetColorCuadrado("Morado");
        areacuadrado.SetAreaCuadrado(5);
        
        System.out.println("Forma: " + square.GetDibujarCuadrado()); System.out.println("El color del cuadrado es: " + colorcuadrado.GetColorCuadrado()); 
        System.out.println("Los lados del cuadrado miden: " + lado.GetLado()); System.out.println("El area del cuadrado es: " + areacuadrado.GetAreaCuadrado());
        }
        
    //Para el Círculo
    public String circle;
    public String colorcircle;
    public int radio;
        
    //Para la Línea
    public String line;  
    public String colorline;
    
    //Para el Triangulo
    public String triangle;
    public String colortriangle;
    public int base;
    public int altura;
    public int areatriangulo;
     
     
    //Para el Cuadrado
    public String square;
    public int lado;
    public int areacuadrado;
    public String colorcuadrado;
    
    //Circulo
            public String GetDibujarCirculo(){
                return circle; 
            } 
            public String GetColor(){
            return colorcircle;
            
            }
         public int GetRadio(){
           return radio;
         
         }
         public void SetDibujarCirculo(String circulo){
             this.circle = circulo;
         }
         public void SetColorCirculo(String color){
             this.colorcircle = color;
         }
         public void SetRadio(int radio){
             this.radio = radio;
         }
         
         //linea
             public String GetDibujarline(){
                return line; 
            } 
            public String GetColorline(){
            return colorline;
         }
         public void SetDibujarLinea(String linea){
             this.line = linea;
         }
         public void SetColorLinea(String color){
             this.colorline = color;
         }
         
         //triangulo
           public String GetDibujarTriangulo(){
                return triangle; 
            } 
            public String GetColorTriangulo(){
            return colortriangle;
         }
            public int GetAreaTriangulo(){
                return areatriangulo;
            }
            public int GetBase(){
                return base;
            }
            public int GetAltura(){
                return altura;
            }
         public void SetDibujarTriangulo(String triangulo){
             this.triangle = triangulo;
         }
         public void SetColorTriangulo(String color){
             this.colortriangle = color;
         }
          public void SetBase(int base){
            this.base = base;
            
        }
           public void SetAltura(int altura){
            this.altura = altura;
           }
         
        public void SetAreaTriangulo(int base, int altura  ){
            areatriangulo = base*altura/2;
            
            
        }
         //Cuadrado
             public String GetDibujarCuadrado(){
                return square; 
            } 
            public String GetColorCuadrado(){
            return colorcuadrado;
         }
            public int GetAreaCuadrado(){
                return areacuadrado;
            }
            public int GetLado(){
                return lado;
            }
           
         public void SetDibujarCuadrado(String cuadrado){
             this.square = cuadrado;
         }
         public void SetColorCuadrado(String color){
             this.colorcuadrado = color;
         }
           public void SetLado(int lado){
            this.lado = lado;
           }
        public void SetAreaCuadrado(int lado  ){
            this.areacuadrado = lado*lado;   
        }
         
        }
        
    