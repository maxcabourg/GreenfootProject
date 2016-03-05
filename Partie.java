import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

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
    private ArrayList<Acteur> acteurs; //Vehicules et autres

    /**
     * Constructor for objects of class Partie.
     * 
     */
    public Partie()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, 1);
        acteurs = new ArrayList<Acteur>();
        personnage = new Personnage();
        addObject(personnage, Partie.WIDTH/2,Partie.HEIGHT); //On demarre au milieu de la ligne
        score = 0;
        Vehicule v = new Vehicule(2);
        acteurs.add(v);
        addObject(v, 0, Partie.HEIGHT/2);
    }
    
    public void act()
    {

    }
}
