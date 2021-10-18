package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("Super mario")) {
            System.out.println("Start - Super mario");
        }
        if (name.equals("Tanks")) {
                System.out.println("Start - Tanks");
            }
        if (name.equals("Tetris")) {
                System.out.println("Start - Tetris");
            }

        }

    public static void main(String[]args) {
        Game.menu("Tanks");
        }
}
