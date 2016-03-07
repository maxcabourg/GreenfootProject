import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicule here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicule extends Acteur
{
    
    public static final double LENT = 1;
    public static final double MOYEN = 1.2;
    public static final double RAPIDE = 1.5;
    
    public Vehicule(int nbCases, double vitesse)
    {
        super();
        vitesseAuto = vitesse;
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
            setLocation(getX()+(int)(vitesseAuto*Partie.LARGEUR_CASE), getY());   
    }    
}
