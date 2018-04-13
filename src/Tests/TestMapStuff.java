package Tests;
import Location.*;
import Character.Player;
import Encounter.Encounter;
public class TestMapStuff {

    public static void main(String[] args) {
        Player p=new Player(new Location(0,0));
        Map m=new Map();
        m.generateMap();

        m.inputPlayerLoc(p.getLoc());
        System.out.println("Player Start");
        m.printMap();

        System.out.println("Player moved");
        p.movePlayer(1, 1);
        m.inputPlayerLoc(p.getLoc());
        m.printMap();

        int encounterFromMap=m.getMap()[p.getLoc().getRow()][p.getLoc().getCol()];
        Encounter e=new Encounter(encounterFromMap);
        System.out.println(e.printEncounterType());

    }

}
