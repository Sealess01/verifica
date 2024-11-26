/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_4id_bolivar_verifica.zip;
import java.util.Scanner;
/**
 *
 * @author ospite
 */
public class studenti {
    
    ;
    private int studenti;
    private float media;
    
    Scanner scan = new Scanner(System.in);
    
    
    public void nstudenti(){
        
        
        System.out.println("inserire il numero di studenti");
        studenti  = scan.nextInt();
         
    }
    
   
       
    
    public void mediastudent(){
        
        
        
        float []voto = new float[3];
        
        int contatore = 1;
        
        
        
        for(int g = 0; g > 3  ; g++){
            
            System.out.println("inserire il cognome del prof");
          String nomeprof = scan.nextLine();
          
          System.out.println("inserire la materia");
          String materia = scan.nextLine();
            
        
        for(int i = 0; i < studenti; i++){
            
            for(int j = 0; j < 3; i++ ){
                
                do{
                
               System.out.println("inserire voto "+contatore);
                voto[j]=scan.nextFloat();
                
                media = media + voto[j];
                
                }while(media < 2 && media > 10);
                
                contatore++;
              
            }
            
            if(media < 6){
                
                System.out.println("questo studente è insufficente in "+ materia );
                System.out.println("con la media del "+media);
                System.out.println("insegnata dal prof "+nomeprof);
                
            }else{
                
                System.out.println("questo studente è sufficente "+materia);
                System.out.println("con la media del "+media);
                System.out.println("insegnata dal prof "+nomeprof);
                
                
                
                
            }
            
            contatore = 1;
        }
   
        
    }
        
    }
     
    
}
