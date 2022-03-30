package src;

/**
 * 
 */
public class EneignantCreator extends UserCreator {

    /**
     * Default constructor
     */
    public EneignantCreator() {
    }

    /**
     * @return
     */
    public  Enseignant factory() {
        return new Enseignant();
    }

}