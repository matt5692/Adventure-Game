package Character;
import java.util.Scanner;
import Location.Location;
public abstract class Player {
    Location loc;
    private int hitPoints, baseAttack, baseDefence, level, experience, moveSpaces;
    private String characterName;

    public Player(Location loc, int hitPoints, int baseAttack, int baseDefence, int level, int experience, int moveSpaces, String characterName) {
        this.loc = loc;
        this.hitPoints = hitPoints;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
        this.level = level;
        this.experience = experience;
        this.characterName = characterName;
        this.moveSpaces = moveSpaces;
    }


    public void movePlayer(int rowShift, int colShift, Location.Map map) {
        Scanner scan = new Scanner(System.in);

        System.out.println("You can move " + moveSpaces + " spaces. Which direction would you like to go? (left, right, up down");
        String response = scan.nextLine();
        switch (response){
            case "left":
                System.out.println("You can move " + moveSpaces + " spaces. How many spaces would you like to go");
                int spaces = scan.nextInt();
                if(map.isValidLocation(loc) && spaces <= moveSpaces){
                    loc.setRow(loc.getRow() + spaces);
                }
                break;
            case "right":



        }
        System.out.println("");


        loc.setRow(loc.getRow()+rowShift);
        loc.setCol(loc.getCol()+colShift);
    }

    public abstract void attack();


    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseDefence() {
        return baseDefence;
    }

    public void setBaseDefence(int baseDefence) {
        this.baseDefence = baseDefence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCharacterName() {
        return characterName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "loc=" + loc +
                ", hitPoints=" + hitPoints +
                ", baseAttack=" + baseAttack +
                ", baseDefence=" + baseDefence +
                ", level=" + level +
                ", experience=" + experience +
                ", characterName='" + characterName + '\'' +
                '}';
    }
}