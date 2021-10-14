# job4j
Проект содержит решения блока "Базовый синтаксис" курса Job4j.

- 1.1.2. Тип данных

  - 4.1. Аргументы

  В этом уроке изучил синтаксис написания метода :
  Java - строго типизированный язык. Если аргумент имеет
  тип String, то вызывать метод можно, только указав
  аргумент с типом String.


  И исправил неверный код :

  public class ArgMethod {

      public static void hello(String name, int age) {
          System.out.println("Hello, " + name + ", age = " + age);
      }

      public static void main(String[] args) {
          String name = "Job4j";
          int age = 6;
          ArgMethod.hello(name);
          ArgMethod.hello(name, age);
          ArgMethod.hello(age);
          ArgMethod.hello(age, name);
      }
  }