package Encounter;

public class Encounter {
    int encounterType;

    public Encounter(int type, Character player) {
        encounterType = type;
    }

    public String printEncounterType() {
        String out = "";
        switch(encounterType) {
            case 1:
                out = "trap";
                break;
            case 2:
                Battle b = new Battle();
                break;
            case 3:
                out = "healer";
                break;
            case 4:
                out = "treasure";
                break;
            default:
                out = "empty room or whatever";

        }
        return out;
    }

    public int getEncounterType() {
        return encounterType;
    }

    public void setEncounterType(int encounterType) {
        this.encounterType = encounterType;
    }


}
