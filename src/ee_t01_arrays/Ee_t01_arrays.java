package ee_t01_arrays;

/*
 * @author Duxabner
 */
import java.util.*;
import java.io.*;

public class Ee_t01_arrays {

    private int tamanio;
    private int[] entrada;  
    

    public void leer() {

                
        try {
            
        
        FileReader fr = new FileReader("Leer.txt");
        BufferedReader br = new BufferedReader(fr);
         
        String cadena="";
        
        tamanio = Integer.parseInt(br.readLine());
        entrada=new int[tamanio];
            for (int i = 1; i <= tamanio; i++) {
                entrada[i-1]=i;  
                }
            System.out.println(" Entrada del arrchivo:" +tamanio) ;
           
            while((cadena=br.readLine())!=null){
                System.out.println(cadena);
           }
            
           
        } catch (Exception e) {
            System.out.println("Archivo no encontrado.");

        }
        
        
        }
            
           public void ordenar(){
           System.out.println("Arreglo en forma ascndente");       
            for (int i = tamanio; i > 0; i--) {
            System.out.println( entrada[i-1]);
            }
           
           
           
           } 
        
    



    public static void main(String[] args) {

        Ee_t01_arrays l = new Ee_t01_arrays();
        l.leer();
        l.ordenar();
        }
}





/*for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {

                if (arreglo[i] < arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            } 
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(" " + arreglo[i]);

        }*(Integer.parseInt(sc.nextLine())
                */
