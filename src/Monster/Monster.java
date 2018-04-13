package Monster;

import Location.Location;

public class Monster {
    Location loc;
    private int hitPoints, baseAttack, baseDefence;
    private String monsterName;

    public Monster(Location loc, int hitPoints, int baseAttack, int baseDefence, String monsterName){
        this.loc = loc;
        this.hitPoints = hitPoints;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
        this.monsterName = monsterName;
    }

    public void move(){

    }

    public void attack(){

    }

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

    public String getMonsterName() {
        return monsterName;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "loc=" + loc +
                ", hitPoints=" + hitPoints +
                ", baseAttack=" + baseAttack +
                ", baseDefence=" + baseDefence +
                ", monsterName='" + monsterName + '\'' +
                '}';
    }
}
