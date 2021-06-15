import greenfoot.*;

public class InformacionNinja  
{
    private int vida;
    private int nivel;
    
    public InformacionNinja(int vida, int nivel)
    {
        this.vida = vida;
        this.nivel = nivel;
    }
    
    public int getVida(){
        return vida;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void quitarVida(){
        vida--;
    }
    
    public void subirNivel(){
        nivel++;
    }
    
    public void draw(World world){
        world.showText("Vida: " + vida,1200,100);
        world.showText("Nivel: " + nivel,1200,200);
    }
}
