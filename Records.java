import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;

public class Records extends World
{
    public Records(World world){
       super(960, 540, 1);
       cargarRecords();
       addObject(new ButtonRegresar(world),860,430);
    }
    
    private void cargarRecords(){
       try{
           
           File Score = new File("Scores.txt");
           Scanner sc = new Scanner(Score);
           Scanner sc2 = new Scanner(Score);
           for(int j = 0; j < 5; j++){
               String nombre = sc.next();
               String Puntuacion = sc.next();
               showText(nombre + " " + Puntuacion,480, 200 + 40*j);
           }
       }catch (FileNotFoundException e){Greenfoot.stop();}
    }
    
    public void EscribeFichero(String archivo, String NvoNombre, String NvaPuntuacion)
    {
       File Oarchivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      String[] TopP = new String[5];
      String[] TopJ = new String[5];
      int[] PuntuacionTop = new int[5];
       
       
        PrintWriter pw = null;
        try {
         Oarchivo = new File (archivo);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String Nombre;
         int Puntuacion;
         FileWriter fichero = new FileWriter(Oarchivo);
         for (int i=0; i < 5; i++){
            TopJ[i] = br.readLine();
            TopP[i] = br.readLine();
            }
         int PuntuacionNva = Integer.parseInt(NvaPuntuacion);
         int aux;
         for(int i=0; i<5 ; i++){
             PuntuacionTop[i] = Integer.parseInt(TopP[i]); 
            if (PuntuacionNva > PuntuacionTop[i] ){
                for(int j=i; j<5 ; j++){
                aux = PuntuacionTop[i];
                PuntuacionTop[i] = PuntuacionNva;
                PuntuacionNva = aux;
                for(int k = 0; k<5;k++)
                {
                fichero.write(TopJ[i] + "\n" + PuntuacionTop[i] + "\n");
                }
                }
            }
            
            }
         
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
    }
      
    }


