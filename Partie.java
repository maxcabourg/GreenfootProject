import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Partie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Partie extends World
{
    
    public static final int WIDTH = 600;
    public static final int HEIGHT = 800;
    public static final int NOMBRE_LIGNES = 20;
    public static final int NOMBRE_COLONNES = 20;
    public static final int HAUTEUR_CASE = HEIGHT / NOMBRE_LIGNES;
    public static final int LARGEUR_CASE = WIDTH / NOMBRE_COLONNES;
    
    private int score;
    private Personnage personnage;

    /**
     * Constructor for objects of class Partie.
     * 
     */
    public Partie()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, 1);
        personnage = new Personnage();
        addObject(personnage, personnage.getX(), personnage.getY()); //On demarre au milieu de la ligne
        score = 0;
    }
    
    public void act()
    {
        personnage.act();
    }
}
