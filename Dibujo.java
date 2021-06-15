import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dibujo extends Actor
{
    private int direccion;
    private int velocidad;
    public Animacion animacion;
    
    public Dibujo()
    {
       animacion=new Animacion();
    }

    public Animacion getAnimacion()
    {
        // put your code here
        return animacion;
    }
    
    public int getDireccion()
    {
        return this.direccion;
    }
     
    public void setAnimacion(Animacion nAnimacion)
    {
        animacion=nAnimacion;
    }
    
    public void setDireccion(int nDireccion)
    {
        this.direccion=nDireccion;
    }
    
     
   public void initDireccion(int nDireccion)
   {
       direccion=nDireccion;
       animacion.addDirecciones(nDireccion);
    }
 
   
    
    public int nextSprite()
    {
            if(animacion.getColumna()==0 && animacion.getFrameActual()==0)
            {
                
              if(direccion!=animacion.getDireccion())
                {
                    animacion.setDireccion(direccion);
                }
                setImage(animacion.getImagen());
                animacion.addFrameActual(1);
         
            }
            else
            {
                if(animacion.getFrame()== animacion.getFrameActual())
                {
                    animacion.setFrameActual(0);
                    animacion.setColumna(animacion.getColumna()+1);
                    if(animacion.getColumna()<animacion.getArraySize())
                    {
                        // System.out.println("Prueba1 "+ animacion.getColumna()+" "+" "+(animacion.getArraySize()));
                        
                        if(direccion!=animacion.getDireccion())
                        {
                            animacion.setDireccion(direccion);
                        }
                        setImage(animacion.getImagen());
                        animacion.setFrameActual(0);
                    }
                    else
                    {
                        
                         animacion.setColumna(0);
                         if(direccion!=animacion.getDireccion())
                            {
                                animacion.setDireccion(direccion);
                            }
                         setImage(animacion.getImagen());
                     
                         return 1;
       
                    }
                
               }else
               animacion.addFrameActual(1);
        }
  
        return 0;
    }
     public int getRandomNumber(int start,int end)
    {
           int normal = Greenfoot.getRandomNumber(end-start+1);
           return normal+start;
    }
}
