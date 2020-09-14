package finalProject;

import battleShip.GameCell;

public class GameField {
    public final battleShip.GameCell[][] gameCells; //Основная матрица использующеся для расстановки кораблей
    public final battleShip.GameCell[][] tempGameCells; //Дополнительная матрица используемая для отображения выстрела
    private final int MAX_X = 10;
    private final int MIN_X = 0;
    private final int MAX_Y = 10;
    private final int MIN_Y = 0;
    public int shipCount;
    private int playerID;
    private int twoShip1 = 0;
    private int twoShip2 = 0;
    private int twoShip3 = 0;
    private int treeShip1 = 0;
    private int treeShip2 = 0;
    private int fourShip = 0;

    public battleShip.GameCell[][] getGameCells() {
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
        gameCells = new battleShip.GameCell[10][10];
        tempGameCells = new battleShip.GameCell[10][10];
        for (int i = 0; i < gameCells.length; i++) {
            for (int j = 0; j < gameCells[i].length; j++) {
                gameCells[i][j] = battleShip.GameCell.FREE_CELL;
            }
        }
        for (int i = 0; i < tempGameCells.length; i++) {
            for (int j = 0; j < tempGameCells[i].length; j++) {
                tempGameCells[i][j] = battleShip.GameCell.FREE_CELL;
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


    public void cellLoadTwoDeck1(int a, int b, int x, int y) {
        haloLoad(a, b);
        haloLoad(x, y);
        gameCells[a][b] = battleShip.GameCell.SHIP21_CELL;
        gameCells[x][y] = battleShip.GameCell.SHIP21_CELL;
        twoShip1 = 2;
    }
    public void cellLoadTwoDeck2(int a, int b, int x, int y) {
        haloLoad(a, b);
        haloLoad(x, y);
        gameCells[a][b] = battleShip.GameCell.SHIP22_CELL;
        gameCells[x][y] = battleShip.GameCell.SHIP22_CELL;
        twoShip2 = 2;
    }
    public void cellLoadTwoDeck3(int a, int b, int x, int y) {
        haloLoad(a, b);
        haloLoad(x, y);
        gameCells[a][b] = battleShip.GameCell.SHIP23_CELL;
        gameCells[x][y] = battleShip.GameCell.SHIP23_CELL;
        twoShip3 = 2;
    }

    public void cellLoadTreeDeck1(int a, int b, int x, int y, int i, int j) {
        haloLoad(a, b);
        haloLoad(x, y);
        haloLoad(i, j);
        gameCells[a][b] = battleShip.GameCell.SHIP31_CELL;
        gameCells[x][y] = battleShip.GameCell.SHIP31_CELL;
        gameCells[i][j] = battleShip.GameCell.SHIP31_CELL;
        treeShip1 = 3;
    }
    public void cellLoadTreeDeck2(int a, int b, int x, int y, int i, int j) {
        haloLoad(a, b);
        haloLoad(x, y);
        haloLoad(i, j);
        gameCells[a][b] = battleShip.GameCell.SHIP32_CELL;
        gameCells[x][y] = battleShip.GameCell.SHIP32_CELL;
        gameCells[i][j] = battleShip.GameCell.SHIP32_CELL;
        treeShip2 = 3;
    }
    public void cellLoadFourDeck(int a, int b, int x, int y, int i, int j, int k, int l) {
        haloLoad(a, b);
        haloLoad(x, y);
        haloLoad(i, j);
        haloLoad(k, l);
        gameCells[a][b] = battleShip.GameCell.SHIP4_CELL;
        gameCells[x][y] = battleShip.GameCell.SHIP4_CELL;
        gameCells[i][j] = battleShip.GameCell.SHIP4_CELL;
        gameCells[k][l] = battleShip.GameCell.SHIP4_CELL;
        fourShip = 4;
    }

    //Метод добавления однопалубного корабля
    public void cellLoad(int x, int y) {
        haloLoad(x, y);
        gameCells[x][y] = battleShip.GameCell.SHIP_CELL;
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
        if (this.gameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
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
                    gameCells[i][j] = battleShip.GameCell.SHIP_HALO;
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
    }
    //Метод проверяющий попал ли игрок по кораблю
    public boolean isHit(int x, int y) {
        return tempGameCells[x][y].equals(battleShip.GameCell.MISS_CELL);
    }

    public boolean winner() {
        int counter = 0;
        for (int i = 0; i < gameCells.length; i++) {
            for (int j = 0; j < gameCells[i].length; j++) {
                if (gameCells[i][j].equals(battleShip.GameCell.SHIP_CELL) || gameCells[i][j].equals(battleShip.GameCell.SHIP21_CELL)
                        || gameCells[i][j].equals(battleShip.GameCell.SHIP22_CELL) || gameCells[i][j].equals(battleShip.GameCell.SHIP23_CELL)
                        || gameCells[i][j].equals(battleShip.GameCell.SHIP31_CELL) || gameCells[i][j].equals(battleShip.GameCell.SHIP32_CELL)
                        || gameCells[i][j].equals(battleShip.GameCell.SHIP4_CELL))
                    counter++;
            }
        }
        if (counter != 0) {
            return true;
        }
        else
            return false;
    }


    //Метод выстрела
    public void fire(int x, int y) {
        if (gameCells[x][y].equals(battleShip.GameCell.SHIP21_CELL)) {
            this.shipCount--;
            twoShip1--;
            gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
            if (twoShip1 == 0) {
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
                System.out.println("Потопил");
            } else {
                this.shipCount--;
                System.out.println("Попал");
                gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
            }
        }

        if (gameCells[x][y].equals(battleShip.GameCell.SHIP22_CELL)) {
            this.shipCount--;
            twoShip2--;
            gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
            if (twoShip2 == 0) {
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
                System.out.println("Потопил");
            } else {
                this.shipCount--;
                System.out.println("Попал");
                gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
            }
        }

        if (gameCells[x][y].equals(battleShip.GameCell.SHIP23_CELL)) {
            this.shipCount--;
            twoShip3--;
            gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
            if (twoShip3 == 0) {
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
                System.out.println("Потопил");
            } else {
                this.shipCount--;
                System.out.println("Попал");
                gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
            }
        }
        if (gameCells[x][y].equals(battleShip.GameCell.SHIP31_CELL)) {
            this.shipCount--;
            treeShip1--;
            gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
            if (treeShip1 == 0) {
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
                System.out.println("Потопил");
            } else {
                this.shipCount--;
                System.out.println("Попал");
                gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
            }
        }

        if (gameCells[x][y].equals(battleShip.GameCell.SHIP32_CELL)) {
            this.shipCount--;
            treeShip2--;
            gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
            if (treeShip2 == 0) {
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
                System.out.println("Потопил");
            } else {
                this.shipCount--;
                System.out.println("Попал");
                gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
            }
        }

        if (gameCells[x][y].equals(battleShip.GameCell.SHIP4_CELL)) {
            this.shipCount--;
            fourShip--;
            gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
            if (fourShip == 0) {
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
                System.out.println("Потопил");
            } else {
                this.shipCount--;
                System.out.println("Попал");
                gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                    tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
                }
            }
        }
        if (gameCells[x][y].equals(battleShip.GameCell.SHIP_CELL)) {
            this.shipCount--;
            gameCells[x][y] = battleShip.GameCell.PADDED_CELL;
            if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL)) {
                tempGameCells[x][y] = battleShip.GameCell.PADDED_CELL;
            }
            System.out.println("Потопил");
        }
        if (gameCells[x][y].equals(battleShip.GameCell.FREE_CELL) || gameCells[x][y].equals(battleShip.GameCell.SHIP_HALO)) {
            System.out.println("Мимо");
            if (tempGameCells[x][y].equals(battleShip.GameCell.FREE_CELL))
                tempGameCells[x][y] = GameCell.MISS_CELL;
        }
    }
}

