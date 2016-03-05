import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicule here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicule extends Acteur
{
    
    public Vehicule(int nbCases)
    {
        super();
        width = nbCases * Partie.LARGEUR_CASE;
        getImage().scale(width, Partie.HAUTEUR_CASE);
    }
    /**
     * Act - do whatever the Vehicule wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX()+width >= Partie.WIDTH)
            setLocation(0, getY());
        else
            setLocation(getX()+Partie.LARGEUR_CASE, getY());   
    }    
}
