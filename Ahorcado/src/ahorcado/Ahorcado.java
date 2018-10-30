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
                System.out.print(vector[i]); 
            }
        }
    //dibujamos el dibujo segun el fallo 
    public static boolean pintaMuñeco(int fallos,String palabra,boolean bandera){
        switch (fallos){
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
                
                System.out.println("Has perdido la palabra era " +palabra);
                
                return bandera;
            
        }
    }
    
    public static void main(String[] args) {
        String palabra="hola",vresultado[],letra;
        int longitud=palabra.length(),fallo=0;
        Scanner leer=new Scanner(System.in);
        String vpalabra[]=new String[longitud];
        vresultado= new String [longitud];
        inicializar(vresultado);
        mostrarvector(vresultado);
        iniciarpalabra(vpalabra, palabra);
        
        boolean bandera=true;
        do {
            System.out.println("Escriba una letra");
            letra=leer.next();
            for (int i = 0; i < vpalabra.length; i++) {
                vpalabra[i].equals(letra);
                vpalabra[i]=vresultado[i];
                System.out.println(vresultado); 
            }
        } while (bandera);
        
       
    }
     
    
}


