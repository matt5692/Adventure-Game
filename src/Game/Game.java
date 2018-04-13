package Game;
import java.util.Scanner;
import Character.*;
import Encounter.Encounter;
import Location.*;
import Monster.*;

public class Game {

    public Game(){

    }

    public void playerTurn(Player p){
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do? (You can move, attack,use an item, or wait)");
    }

    public void enemyTurn(Monster m){

    }

    public void playerPhase(Cavalier cavalier, Knight knight, Mercenary mercenary, Tactician tactician, Map map){
        playerTurn(cavalier);
        playerTurn(knight);
        playerTurn(mercenary);
        playerTurn(tactician);
    }

    public void enemyPhase(Monster levelThree, Monster levelFive, Monster levelTen){
        enemyTurn(levelThree);
        enemyTurn(levelFive);
        enemyTurn(levelTen);
    }
}
