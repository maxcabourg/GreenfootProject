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
        addObject(personnage, Partie.WIDTH/2,Partie.HEIGHT);//On demarre au milieu de la ligne
        score = 0;
        Vehicule v = new Vehicule(2, Vehicule.MOYEN);
        acteurs.add(v);
        addObject(v, 0, Partie.HEIGHT/2);
        Vehicule v1 = new Vehicule(3, Vehicule.LENT);
        acteurs.add(v1);
        addObject(v1, 0, Partie.HEIGHT/2+Partie.HAUTEUR_CASE);
        Vehicule v2 = new Vehicule(2, Vehicule.RAPIDE);
        acteurs.add(v2);
        addObject(v2, 0, Partie.HEIGHT/2-Partie.HAUTEUR_CASE);
    }
    
    public void act()
    {
        
        super.act();
        boolean trouve = false;
        int i=0;
        while( !trouve && i < acteurs.size()){
            if(personnage.collision(acteurs.get(i))){
               trouve = true;
            }
            i++;
        }
        if (trouve){
            this.stopped(); //On a trouve un acteurs en collision avec le personnage
            this.showText("Collision",300,400);
            Greenfoot.stop();
        }
        
        if(personnage.getY()==0){
            this.showText("Fin de la partie",300,400);
            Greenfoot.stop();
        }
    }
}
