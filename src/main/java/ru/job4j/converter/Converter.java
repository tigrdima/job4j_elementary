package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        float inDollar = 240;
        float expectedDollar = 4;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("240 rubles are 4. Test result : " + passedDollar);

        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(240);
        System.out.println("140 rubles are " + euro + " euro." + "\n" + "200 rubles are " + dollar + " dollar.");
    }
}
