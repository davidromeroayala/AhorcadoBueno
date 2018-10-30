/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ahorcado {

   //iniciamos vector de resultado con barras bajas
    public static void inicializar(String[] vector){
        for (int i = 0; i <vector.length; i++) {
                vector[i]=" _ ";
        }
    }
    //rellenamos vector con la palabra 
    public static void iniciarpalabra(String vector[],String palabra){
        for (int i = 0; i < vector.length; i++) {
                vector[i]=palabra.substring(i,i+1);
            }
        }
    //mostramos el vector resultado o la palbras segun que vector enviemos 
    public static void mostrarvector(String[] vector){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]!=null) {
                 System.out.print(vector[i]);
            } 
  
            
            
                
        }
        System.out.println("");
    }
    //rellenar con la letra pulsada 
    public static boolean igualar(String[] vpalabra,String[] vresultado,String[] vletra){
        String letra;
        boolean letraEncontrada=false;
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba una letra");
        letra=leer.next();
        for (int i = 0; i < vpalabra.length; i++) {
            if (vpalabra[i].equals(letra)){
                 vresultado[i]=vpalabra[i];
                 letraEncontrada = true;
            }
        }
            if (!letraEncontrada) {
                 for (int j = 0; j < 5; j++) {
                    if   (vletra[j]==null){
                      vletra[j]=letra; 
                      j=50;
                    }
                }
            
            }
            
        return letraEncontrada;
        
    }
    //has ganado
     public static boolean hasganado(String[] vresultado){
         boolean bandera=true;
         int encontrado=0;
        for (int i = 0; i < vresultado.length; i++) {
               if (vresultado[i].equals(" _ "))
                    encontrado++;
        }
        if (encontrado==0){
            System.out.println("HAS GANADO");
            bandera=false;
        }
        return bandera;
    }
    //dibujamos el dibujo segun el fallo 
    public static boolean pintaMuñeco(int fallos,String palabra){
        boolean bandera = true;
        switch (fallos){
           // case 0:
             //   break;
            case 1:
                //muñeco has fallado 1 vez
                System.out.println(" -------------------------");
            break;
            case 2:
                 //muñeco   has fallado dos veces
                System.out.println(" \n" +
                "    |      \n" +
                "    |      \n" +
                "    |        \n" +
                "    |        \n" +
                "    |        \n" +
                "    |      \n" +
                "    |       \n" +
                "    |          \n" +
                "    |       \n" +
                "    -------------------------");  
            break;
            case 3:
            //muñeco has fallado 3 veces
            System.out.println("     -------------\n" +
            "    |       \n" +
            "    |       \n" +
            "    |         \n" +
            "    |         \n" +
            "    |         \n" +
            "    |       \n" +
            "    |         \n" +
            "    |           \n" +
            "    |         \n" +
            "    -------------------------");
            break; 
            case 4:
                //muñeco has fallado 4 veces
                System.out.println("     -------------\n" +
                "    |           |\n" +
                "    |           |\n" +
                "    |         -----\n" +
                "    |         |   |\n" +
                "    |         -----\n" +
                "    |       \n" +
                "    |         \n" +
                "    |           \n" +
                "    |         \n" +
                "    -------------------------");
            break;
            case 5:
                //muñeco has perdido      
                System.out.println("     -------------\n" +
                "    |           |\n" +
                "    |           |\n" +
                "    |         -----\n" +
                "    |         |   |\n" +
                "    |         -----\n" +
                "    |           |\n" +
                "    |          /|\\\n" +
                "    |           |    \n" +
                "    |          / \\\n" +
                "    -------------------------");
                bandera=false;
                
                System.out.print("Has perdido la palabra era " +palabra);
            break;
               
            
        }
        
        return bandera;
    }
    
    public static void main(String[] args) {
        String palabra="hola",vresultado[];
        int longitud=palabra.length(),fallos=0;
        Scanner leer=new Scanner(System.in);
        String vpalabra[]=new String[longitud];
        String vletra[]=new String[5];
        vresultado= new String [palabra.length()];
        boolean bandera=true, perdido=false;
        
        inicializar(vresultado);
        iniciarpalabra(vpalabra, palabra);
        
         bandera = pintaMuñeco(fallos, palabra);
        do {
           
           mostrarvector(vletra);
           mostrarvector(vresultado);
          
            if (!igualar(vpalabra,vresultado,vletra)){ 
                fallos++;
                
            }else{
                perdido=hasganado(vresultado);
            }    
            bandera = pintaMuñeco(fallos, palabra);
        } while (bandera && perdido);
        
       
    }
      
    
}


