package com.mycompany.futbolista;



/**
 *
 * @author Maynor Javier Coello
 */
public class Equipo  {
    public static void main (String[] args){
        
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        Equipo equipo3 = new Equipo();
        
        Equipo captain1 = new Equipo();
        Equipo captain2 = new Equipo();
        Equipo captain3 = new Equipo();
        
          equipo1.setEquipo1("Real madrid");
        equipo2.setEquipo2("Atlético de Madrid");
        equipo3.setEquipo3("Olimpia");
        
        captain1.setCaptain1("Forentino Perez");
        captain2.setCaptain2("Enrique Cerezo");
        captain3.setCaptain3("Rafael Ferrari");
        
       
        System.out.println("Equipo: " + equipo1.getEquipo1()); System.out.print("Presidente: " + captain1.getCaptain1());
        System.out.println("\nEquipo: " + equipo2.getEquipo2()); System.out.print("Presidente: " + captain2.getCaptain2());
        System.out.println("\nEquipo: " + equipo3.getEquipo3()); System.out.print("Presidente: " + captain3.getCaptain3());
    }
    
     protected String equipo1; 
     protected String equipo2;
     protected String equipo3;
     
     protected String captain1; 
     protected String captain2;
     protected String captain3;
     
      public String getEquipo1(){
        return equipo1;
      }
        public String getEquipo2(){
        return equipo2;
        }
        public String getEquipo3(){
        return equipo3;
      }
         public String getCaptain1(){
        return captain1;
      }
         public String getCaptain2(){
        return captain2;
      }
        public String getCaptain3(){
        return captain3;
      }
        
          public void setEquipo1(String equipo){
        this.equipo1 = equipo;
          }
          public void setEquipo2(String equipo){
        this.equipo2 = equipo;
          }
          public void setEquipo3(String equipo){
        this.equipo3 = equipo;
          }
          public void setCaptain1(String captain){
        this.captain1 = captain;
          }
          public void setCaptain2(String captain){
        this.captain2 = captain;
          }
          public void setCaptain3(String captain){
        this.captain3 = captain;
          }
          
    }
