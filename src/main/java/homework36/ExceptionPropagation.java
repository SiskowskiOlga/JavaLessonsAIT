package homework36;

import java.io.IOException;

public class ExceptionPropagation {
    /*
    Задание: Проброс исключения через несколько методов
Напишите программу, где одно исключение пробрасывается через несколько методов и обрабатывается в методе main.

Задачи
Создайте класс ExceptionPropagation.
Напишите метод method1, который вызывает method2.
Напишите метод method2, который вызывает method3.
Напишите метод method3, который выбрасывает IOException.
Объявите throws IOException в сигнатуре методов method1, method2, method3.
В методе main вызовите method1 и обработайте исключение с помощью блока try-catch.

     */
    public void method1() throws IOException {
        method2();
    }


    public void method2() throws IOException {
        method3();
    }

    public void method3() throws IOException {
        throw new IOException("IO Exception !!!");
        //проверяемое исключение поэтому краснеет,
        //отправляем на верх в throws по цепочке всех


    }
}

