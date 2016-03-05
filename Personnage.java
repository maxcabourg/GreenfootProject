import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personnage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personnage extends Acteur
{
    /**
     * Act - do whatever the Personnage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Personnage()
    {
        super();
        this.setBloquant(false);
        this.setLocation(Partie.WIDTH/2,Partie.HEIGHT);
        getImage().scale(Partie.LARGEUR_CASE, Partie.HAUTEUR_CASE);
        
    }
    
    public void act() 
    {
        gestionClavier();
    }
    
    private void gestionClavier()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), (getY()-Partie.HAUTEUR_CASE));
        }else if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+Partie.LARGEUR_CASE, getY());
        }else if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-Partie.LARGEUR_CASE, getY());
        }
    }
    
}
