package finalProject;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BattleShipGame {
    private static BufferedReader rd;
    private static final Random random = new Random();
    private static final GameField gameField = new GameField(1);
    private static final GameField gameField1 = new GameField(2);

    public static void main(String[] args) {
        startGame();
    }

    //Растановка однопалубного корабля
    public static void singleDeckShip(GameField gameField) {
        rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи координаты однопалубного корабля (формат: x,y)");
        int counter = 0;
        gameField.showGameField();
        while (counter < 4) {
            String s = null;
            try {
                s = rd.readLine();
                String[] arr = s.split(",");
                if (gameField.isCellFree(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]))) {
                    gameField.cellLoad(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
                    gameField.showGameField();
                    counter++;
                }
                else {
                    System.out.println("Клетка занята или ореол корбля вошел в ореол другого корабля");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы игрового поля");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //Расстановка двухпалубного корабля
    public static void doubleDeckShip(GameField gameField) throws NullPointerException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи координаты двухпалубного корабля (формат: x,y;x,y)");
        gameField.showGameField();
        String s = null;
        while (true) {
            try {
                s = rd.readLine();
                String[] arr = s.split(",|\\;");
                if (gameField.isCellFree(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])) &&
                        gameField.isCellFree((Integer.parseInt(arr[2])), Integer.parseInt(arr[3]))) {
                    if (gameField.isValidShip(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]))) {
                        gameField.cellLoadTwoDeck1(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
                        gameField.showGameField();
                        break;
                    } else
                        System.out.println("Корабль не валидный");
                } else {
                    System.out.println("Клетка занята или ореол корбля вошел в ореол другого корабля");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы игрового поля");
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        while (true) {
            try {
                s = rd.readLine();
                String[] arr = s.split(",|\\;");
                if (gameField.isCellFree(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])) &&
                        gameField.isCellFree((Integer.parseInt(arr[2])), Integer.parseInt(arr[3]))) {
                    if (gameField.isValidShip(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]))) {
                        gameField.cellLoadTwoDeck2(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
                        gameField.showGameField();
                        break;
                    } else
                        System.out.println("Корабль не валидный");
                } else {
                    System.out.println("Клетка занята или ореол корбля вошел в ореол другого корабля");
                }
            }catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы игрового поля");
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        while (true) {
            try {
                s = rd.readLine();
                String[] arr = s.split(",|\\;");
                if (gameField.isCellFree(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])) &&
                        gameField.isCellFree((Integer.parseInt(arr[2])), Integer.parseInt(arr[3]))) {
                    if (gameField.isValidShip(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]))) {
                        gameField.cellLoadTwoDeck3(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
                        gameField.showGameField();
                        break;
                    } else
                        System.out.println("Корабль не валидный");
                } else {
                    System.out.println("Клетка занята или ореол корбля вошел в ореол другого корабля");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы игрового поля");
            } catch (IOException e) {
                e.getStackTrace();
            }
        }

    }
    //Расстановка трехпалубного корабля
    public static void tripleDeckShip(GameField gameField) {
        rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи координаты трехпалубного корабля (формат: x,y;x,y;x,y)");
        gameField.showGameField();
        String s = null;
        while(true) {
            try {
                s = rd.readLine();
                String[] arr = s.split(",|\\;");
                if (gameField.isCellFree(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])) &&
                        gameField.isCellFree((Integer.parseInt(arr[2])), Integer.parseInt(arr[3])) && gameField.isCellFree(Integer.parseInt(arr[4]), Integer.parseInt(arr[5]))) {
                    if (gameField.isValidShip(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]), Integer.parseInt(arr[5]))) {
                        gameField.cellLoadTreeDeck1(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
                                Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]));
                        gameField.showGameField();
                        break;
                    } else
                        System.out.println("Корабль не валидный");
                } else {
                    System.out.println("Клетка занята или ореол корбля вошел в ореол другого корабля");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы игрового поля");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try {
                s = rd.readLine();
                String[] arr = s.split(",|\\;");
                if (gameField.isCellFree(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])) &&
                        gameField.isCellFree((Integer.parseInt(arr[2])), Integer.parseInt(arr[3])) && gameField.isCellFree(Integer.parseInt(arr[4]), Integer.parseInt(arr[5]))) {
                    if (gameField.isValidShip(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]), Integer.parseInt(arr[5]))) {
                        gameField.cellLoadTreeDeck2(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
                                Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]));
                        gameField.showGameField();
                        break;
                    } else
                        System.out.println("Корабль не валидный");
                } else {
                    System.out.println("Клетка занята или ореол корбля вошел в ореол другого корабля");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы игрового поля");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //Расстановка четырехпалубного корабля
    public static void fourDeckShip(GameField gameField) {
        rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)");
        gameField.showGameField();
        String s = null;
        while (true) {
            try {
                s = rd.readLine();
                String[] arr = s.split(",|\\;");
                if (gameField.isCellFree(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])) &&
                        gameField.isCellFree((Integer.parseInt(arr[2])), Integer.parseInt(arr[3])) && gameField.isCellFree(Integer.parseInt(arr[4]), Integer.parseInt(arr[5]))
                        && gameField.isCellFree(Integer.parseInt(arr[6]), Integer.parseInt(arr[7]))) {
                    if (gameField.isValidShip(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]),
                            Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6]), Integer.parseInt(arr[7]))) {
                        gameField.cellLoadFourDeck(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
                                Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6]), Integer.parseInt(arr[7]));
                        gameField.showGameField();
                        break;
                    } else
                        System.out.println("Корабль не валидный");
                } else {
                    System.out.println("Клетка занята или ореол корбля вошел в ореол другого корабля");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы игрового поля");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void fire(GameField gameField) {
        System.out.println("Стреляют по игроку №" + gameField.getPlayerID());
        System.out.println("Координаты выстрела (формат: x,y)");
        rd = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = null;
            try {
                s = rd.readLine();
                String[] arr = s.split(",");
                gameField.fire(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
                gameField.showTempGameField();
                gameField.shipCount--;
                if (gameField.isHit(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])) || !gameField.winner())
                    break;
            } catch (IOException e) {
                System.out.println("Неверный формат ввода");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за пределы игрового поля");
            } catch (NumberFormatException e) {
                System.out.println("Пустая строка, либо неверный формат ввода");
            }
        }
    }

    public static void startGame() {
        System.out.println("Игра начинается! Первый игрок расставляет корабли, а второй пытается не подглядывать!");
        fourDeckShip(gameField);
        tripleDeckShip(gameField);
        doubleDeckShip(gameField);
        singleDeckShip(gameField);
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("Второй игрок расставляет корабли, а первый уходит пить чай");
        fourDeckShip(gameField1);
        tripleDeckShip(gameField1);
        doubleDeckShip(gameField1);
        singleDeckShip(gameField1);
        int randomInt = random.nextInt(2);
        if (randomInt == 1) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            fire(gameField);
            while(true) {
                if (!gameField.winner() || !gameField1.winner())
                    break;
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
                fire(gameField1);
                if (!gameField.winner() || !gameField1.winner())
                    break;
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
                fire(gameField);

            }
        }
        else {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            fire(gameField1);
            while (true) {
                if (!gameField.winner() || !gameField1.winner())
                    break;
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
                fire(gameField);
                if (!gameField.winner() || !gameField1.winner())
                    break;
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
                fire(gameField1);

            }
        }
        if (!gameField.winner()) {
            System.out.println("Игрок №2 выиграл!!!");
        }
        else {
            System.out.println("Игрок №1 выиграл!!!");
        }
    }
}
