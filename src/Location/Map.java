package Location;

public class Map {
    int[][]map;
    final int ROWS=20, COLS=20;
    private int playerRow, playerCol;


    public void generateMap() {
        map=new int[ROWS][COLS];

        for(int r=0; r<ROWS; r++) {
            for(int c=0; c<COLS; c++) {
                map[r][c]=(int)(Math.random()*20);
            }
        }
    }

    public void printMap() {
        for(int r=0; r<ROWS; r++) {
            for(int c=0; c<COLS; c++) {
                if(r==playerRow&&c==playerCol) {
                    System.out.print("P");
                }else {
                    System.out.print(map[r][c]);
                }
            }
            System.out.println();
        }
    }


    public void inputPlayerLoc(Location l) {
        playerRow = l.getRow();
        playerCol = l.getCol();
    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public int getPlayerRow() {
        return playerRow;
    }

    public void setPlayerRow(int playerRow) {
        this.playerRow = playerRow;
    }

    public int getPlayerCol() {
        return playerCol;
    }

    public void setPlayerCol(int playerCol) {
        this.playerCol = playerCol;
    }

    public int getROWS() {
        return ROWS;
    }

    public int getCOLS() {
        return COLS;
    }



}
