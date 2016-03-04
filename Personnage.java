import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personnage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personnage extends Actor
{
    /**
     * Act - do whatever the Personnage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x;
    private int y; 
    
    public Personnage()
    {
        x = Partie.WIDTH/2;
        y = Partie.HEIGHT;
        getImage().scale(Partie.LARGEUR_CASE, Partie.HAUTEUR_CASE);
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), (getY()-(Partie.HEIGHT/Partie.NOMBRE_LIGNES)));
        else if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), (getY()+(Partie.HEIGHT/Partie.NOMBRE_LIGNES)));
        else if(Greenfoot.isKeyDown("right"))
            setLocation(getX()+(Partie.WIDTH/Partie.NOMBRE_COLONNES), getY());
        else if(Greenfoot.isKeyDown("left"))
            setLocation(getX()-(Partie.WIDTH/Partie.NOMBRE_COLONNES), getY());
    }
    
    private void gestionClavier()
    {
        
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
}
