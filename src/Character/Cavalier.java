package Character;
import Location.Location;
public class Cavalier extends Player {

    public Cavalier(Location loc, int hitPoints, int baseAttack, int baseDefence, int level, int experience, int moveSpaces, String characterName){
        super(loc, hitPoints, baseAttack, baseDefence, level, experience, 3, characterName);
    }

    public void attack(){

    }
}
