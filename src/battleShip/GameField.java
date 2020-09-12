package battleShip;

public class GameField {
    private GameCell[][] gameCells;
    private final int MAX_X = 10;
    private final int MIN_X = 0;
    private final int MAX_Y = 10;
    private final int MIN_Y = 0;

    public GameField() {
        gameCells = new GameCell[10][10];
        for (int i = 0; i < gameCells.length; i++) {
            for (int j = 0; j < gameCells[i].length; j++) {
                gameCells[i][j] = GameCell.FREE_CELL;
            }
        }
    }

    public void showGameField() {
        for (int i = 0; i < this.gameCells.length; i++) {
            for (int j = 0; j < this.gameCells[i].length; j++) {
                System.out.print(this.gameCells[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public void cellLoad(int x, int y) {
            haloLoad(x, y);
            gameCells[x][y] = GameCell.SHIP_CELL;
        }

    public boolean isCellFree(int x, int y) {
        if (this.gameCells[x][y].equals(GameCell.FREE_CELL)) {
            return true;
        }
        else
            return false;
    }

    private void haloLoad(int x, int y) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    try {
                        if (y < MIN_Y || y > MAX_Y) {
                            continue;
                        }
                        if (x < MIN_X || x > MAX_X) {
                            continue;
                        }
                        gameCells[i][j] = GameCell.SHIP_HALO;
                    }catch (ArrayIndexOutOfBoundsException e) {
                        continue;
                    }
                }
            }
        }


}
