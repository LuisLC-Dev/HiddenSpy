import greenfoot.*; 
import java.util.ArrayList;
/**
 * Write a description of class Animacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animacion  
{
    // instance variables - replace the example below with your own
    private int fila;
    private int columna;
    private int frameActual;
    private ArrayList<ArrayList<GreenfootImage>> sprites;
    private ArrayList<ArrayList<Integer>> frames;
    private ArrayList<ArrayList<Integer>> direcciones;
    //1 derecha 0 izquierda
    private int direccionOriginal;
    /**
     * Constructor for objects of class Animacion
     */
    public Animacion()
    {
        frameActual=0;
        fila = 0;
        columna= 0;
        sprites = new ArrayList<>();
        frames = new ArrayList<>();
        direcciones=new ArrayList<>();
        
    }
    public int getFila()
    {
        // put your code here
        return this.fila;
    }
    public int getColumna()
    {
        return this.columna;
    }
    public GreenfootImage getImagen()
    {
        return this.sprites.get(this.fila).get(this.columna);
    }
    public Integer getFrame()
    {
        return this.frames.get(this.fila).get(this.columna);
    }
     public int getFrameActual()
    {
        return frameActual;
    }
    public int getArraySize()
    {
        return sprites.get(fila).size();
    }
    public Integer getDireccion()
    {
        return this.direcciones.get(this.fila).get(this.columna);
    }
    public int getFirstArraySize()
    {
        return direcciones.size();
    }
    public void setFila(int nFila)
    {
        this.fila=nFila;
    }
    public void setColumna(int nColumna)
    {
        this.columna = nColumna;
    }
    public void setFrameActual(int nFrameActual)
    {
        frameActual=nFrameActual;
    }
    public void setDireccion(int nDireccion)
    {
        this.direcciones.get(this.fila).set(this.columna,nDireccion);
    }
    public void setDireccionOriginal(int nDireccionOriginal)
    {
        direccionOriginal=nDireccionOriginal;
    }
    public void addAnimacion(ArrayList <GreenfootImage> nSprites, ArrayList <Integer> nFrames)
    {
        this.sprites.add(nSprites);
        this.frames.add(nFrames);
    }
    public void addFrameActual(int num)
    {
        frameActual+=num;
    }
    public void addDirecciones(int nDireccion)
    {
        for(int y=0; y<sprites.size(); y++)
        {
            ArrayList<Integer> nArray=new ArrayList<>();
            for(int x=0; x<sprites.get(y).size(); x++)
            {
             nArray.add(new Integer(nDireccion));   
            }
            direcciones.add(nArray);
        }
        ArrayList<Integer> nArray=new ArrayList<>();
        direcciones.add(nArray);
           
    }
}