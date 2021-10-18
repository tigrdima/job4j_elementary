package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";

        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        }
        if ("Пока.".equals(question)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(DummyBot.answer("Кто ты?"));
        System.out.println(DummyBot.answer("Привет, Бот."));
        System.out.println(DummyBot.answer("Пока."));
    }
}
