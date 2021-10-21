package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
    public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String expected = "Привет, умник.";
        String in = "Привет, Бот.";
        String result = DummyBot.answer(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
            String expected = "До скорой встречи";
            String in = "Пока.";
            String result = DummyBot.answer(in);
            Assert.assertEquals(expected, result);
        }

    @Test
    public void whenUnknowBot() {
            String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
            String in = "Как тебя зовут?";
            String result = DummyBot.answer(in);
            Assert.assertEquals(expected, result);
        }
}