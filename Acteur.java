import greenfoot.*; 
/**
 * Write a description of class Acteur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Acteur extends Actor 
{
    // instance variables - replace the example below with your own
    protected int width = Partie.LARGEUR_CASE;// largeur de l'acteur, une case par défaut
    protected boolean bloquant; //indique si l'acteur bloque les autres, typiquement un sol ne bloque pas et un arbre bloque
    protected double vitesseAuto; //vitesse à laquelle évolue l'acteur sans intervention extérieur
    

    /**
     * Constructor for objects of class Acteur
     */
    public Acteur()
    {
        super();
    }
    
    public void setBloquant(boolean bloquant){
        this.bloquant = bloquant;
    }
    
    public int getWidth(){
        return this.width;
    }
    

    //Indique si l'acteur et l'acteur passé en paramètre sont en collision en X
    private boolean collisionX(Acteur a){
        if (this.getX()<a.getX() && a.getX()<this.getX()+this.getWidth()){// le point d'origine de "a" est compris entre this.x et sa largeur
            return true;
        }
        
        if (a.getX()<this.getX() && this.getX()<a.getX()+a.getWidth()){// le point au bout de "a" a dépassé l'origine de this, donc collision
            return true;
        }
        
        return false;
   
    }
    
    //Indique si l'acteur et l'acteur passé en paramètre sont en collision en Y
    private boolean collisionY(Acteur a){
        return this.getY()==a.getY();
    }
    
     public boolean collision(Acteur a){
        return (this.collisionX(a) && this.collisionY(a));
    }
    
    
}
