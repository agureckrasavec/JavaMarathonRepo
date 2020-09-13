package battleShip;

public class GameField {
    private final GameCell[][] gameCells; //Основная матрица использующеся для расстановки кораблей
    private final GameCell[][] tempGameCells; //Дополнительная матрица используемая для отображения выстрела
    private final int MAX_X = 10; //Эти константы добавил для вроде как реализации метода поиска соседних ячеек,
    private final int MIN_X = 0; //но как я понял они там не особо нужны, конкретно в моей реализации, но пусть тут побудут:)
    private final int MAX_Y = 10;
    private final int MIN_Y = 0;
    private int shipCount;
    private int playerID;

    public GameCell[][] getGameCells() {
        return gameCells;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getShipCount() {
        return shipCount;
    }

    public void setShipCount(int shipCount) {
        this.shipCount = shipCount;
    }

    //Конструктор
    public GameField(int playerID) {
        this.playerID = playerID;
        this.shipCount = 20;
        gameCells = new GameCell[10][10];
        tempGameCells = new GameCell[10][10];
        for (int i = 0; i < gameCells.length; i++) {
            for (int j = 0; j < gameCells[i].length; j++) {
                gameCells[i][j] = GameCell.FREE_CELL;
            }
        }
        for (int i = 0; i < tempGameCells.length; i++) {
            for (int j = 0; j < tempGameCells[i].length; j++) {
                tempGameCells[i][j] = GameCell.FREE_CELL;
            }
        }

    }

    //Метод отрисовки основного игрового поля
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

    //Метод орисовки дополнительного игрового поля
    public void showTempGameField() {
        for (int i = 0; i < this.tempGameCells.length; i++) {
            for (int j = 0; j < this.tempGameCells[i].length; j++) {
                System.out.print(this.tempGameCells[i][j]);
            }
            System.out.println();
        }
    }

    //Метод добавления однопалубного корабля
    public void cellLoad(int x, int y) {
        haloLoad(x, y);
        gameCells[x][y] = GameCell.SHIP_CELL;
    }

    //Метод добавления двухпалубного корабля
    public void cellLoad(int a, int b, int x, int y) {
        haloLoad(a, b);
        haloLoad(x, y);
        gameCells[a][b] = GameCell.SHIP_CELL;
        gameCells[x][y] = GameCell.SHIP_CELL;
    }

    //Метод добавления трехпалубного корабля
    public void cellLoad(int a, int b, int x, int y, int i, int j) {
        haloLoad(a, b);
        haloLoad(x, y);
        haloLoad(i, j);
        gameCells[a][b] = GameCell.SHIP_CELL;
        gameCells[x][y] = GameCell.SHIP_CELL;
        gameCells[i][j] = GameCell.SHIP_CELL;
    }

    //Метод добавления четырехпалубного корабля
    public void cellLoad(int a, int b, int x, int y, int i, int j, int k, int l) {
        haloLoad(a, b);
        haloLoad(x, y);
        haloLoad(i, j);
        haloLoad(k, l);
        gameCells[a][b] = GameCell.SHIP_CELL;
        gameCells[x][y] = GameCell.SHIP_CELL;
        gameCells[i][j] = GameCell.SHIP_CELL;
        gameCells[k][l] = GameCell.SHIP_CELL;
    }

    // Метод проверяющий валидность двухпалубного корабля
    public boolean isValidShip(int a, int b, int x, int y) {
        if (x == a && y == b + 1 || x == a && y == b - 1) {
            return true;
        }
        if (y == b && x == a - 1 || y == b && x == a + 1) {
            return true;
        } else
            return false;
    }

    // Метод проверяющий валидность трехпалубного корабля
    public boolean isValidShip(int a, int b, int x, int y, int i, int j) {
        if (x == a && y == b + 1 && i == x && j == y + 1 || x == a && y == b - 1 && i == x && j == y - 1) {
            return true;
        }
        if (y == b && x == a - 1 && j == y && i == x - 1 || y == b && x == a + 1 && j == y && i == x + 1) {
            return true;
        } else
            return false;
    }

    // Метод проверяющий валидность четырехпалубного корабля
    public boolean isValidShip(int a, int b, int x, int y, int i, int j, int k, int l) {
        if (x == a && y == b + 1 && i == x && j == y + 1 && k == i && l == j + 1 || x == a && y == b - 1 && i == x && j == y - 1 && k == i && l == j - 1) {
            return true;
        }
        if (y == b && x == a - 1 && j == y && i == x - 1 && l == j && k == i - 1 || y == b && x == a + 1 && j == y && i == x + 1 && l == j && k == i + 1) {
            return true;
        } else
            return false;
    }

    //Метод проверяющий свободна ли ячейка
    public boolean isCellFree(int x, int y) {
        if (this.gameCells[x][y].equals(GameCell.FREE_CELL)) {
            return true;
        } else
            return false;
    }

    //Метод добавляющий ореол корабля
    public void haloLoad(int x, int y) {
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
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
    }

    public boolean isMultiDecksShip(int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                try {
                    if (y < MIN_Y || y > MAX_Y) {
                        continue;
                    }
                    if (x < MIN_X || x > MAX_X) {
                        continue;
                    }
                    if (gameCells[x][y - 1].equals(GameCell.SHIP_CELL) || gameCells[x][y + 1].equals(GameCell.SHIP_CELL) || gameCells[x - 1][y].equals(GameCell.SHIP_CELL)
                            || gameCells[x + 1][y].equals(GameCell.SHIP_CELL)) {
                        return true;
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
        return false;
    }

    //Метод проверяющий попал ли игрок по кораблю
    public boolean isHit(int x, int y) {
        return this.gameCells[x][y].equals(GameCell.SHIP_CELL);
    }
    //Метод выстрела
    public void fire(int x, int y) {
        if (isMultiDecksShip(x, y) && gameCells[x][y].equals(GameCell.SHIP_CELL)) {
            gameCells[x][y] = GameCell.PADDED_CELL;
            this.tempGameCells[x][y] = GameCell.PADDED_CELL;
            this.shipCount--;
            System.out.println("Попал");
        }
        else if(!isMultiDecksShip(x, y) && gameCells[x][y].equals(GameCell.SHIP_CELL)) {
            gameCells[x][y] = GameCell.PADDED_CELL;
            this.tempGameCells[x][y] = GameCell.PADDED_CELL;
            this.shipCount--;
            System.out.println("Потопил");
        }
        else if(gameCells[x][y].equals(GameCell.FREE_CELL) || gameCells[x][y].equals(GameCell.PADDED_CELL)
                || gameCells[x][y].equals(GameCell.MISS_CELL) || gameCells[x][y].equals(GameCell.SHIP_HALO)) {
            this.tempGameCells[x][y] = GameCell.MISS_CELL;
            System.out.println("Мимо");
        }

    }

}
