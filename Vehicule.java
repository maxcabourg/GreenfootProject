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
     * Le vehicule avance à chaque tour et revient à gauche de l'écran dès qu'il en sort.
     */
    public void act() 
    {
        super.act();
        if(getX()+width >= Partie.WIDTH)
            setLocation(0, getY());
        else
            setLocation(getX()+Partie.LARGEUR_CASE, getY());   
    }    
}
