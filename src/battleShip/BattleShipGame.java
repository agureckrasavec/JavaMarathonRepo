package battleShip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BattleShipGame {
    public static void main(String[] args) throws IOException {
        GameField gameField = new GameField();
        GameField gameField1 = new GameField();
        System.out.println("Игра начинается! Первый игрок расставляет корабли,\nа второй пытается не подглядывать!");
        singleDeckShip(gameField);

    }

    public static void singleDeckShip(GameField gameField) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи координаты однопалубного корабля (формат: x, y)");
        int counter = 0;
        gameField.showGameField();
        while (counter < 4) {
            String s = null;
            try {
                s = rd.readLine();
                String[] stringArr = s.split(",");
                if (gameField.isCellFree(Integer.parseInt(stringArr[0]), Integer.parseInt(stringArr[1]))) {
                    gameField.cellLoad(Integer.parseInt(stringArr[0]), Integer.parseInt(stringArr[1]));
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


}
