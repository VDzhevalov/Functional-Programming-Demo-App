package app;

import app.model.MathOperation;
import app.model.StringManipulator;

import static app.view.UIOperator.getOutput;

public class Main {

    public static void main(String[] args) {
        //1. Створіть функціональний інтерфейс MathOperation, який має один метод int operate(int a, int b).
        //2. Використовуючи анонімний клас, створіть об'єкт інтерфейсу MathOperation, який виконує операцію додавання.
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b){
                return a + b;
            }
        };
        getOutput("Анонімний клас MathOperation", mathOperation.operate(10, 20));
        //2.1 Те ж саме, але використовуючи посилання на метод
        MathOperation mathOperationMethodRef = Integer::sum;
        getOutput("MathOperation Посилання на статичний метод = Integer::sum", mathOperationMethodRef.operate(15, 40) );

        //3. Створіть лямбда-вираз, який реалізує функціональний інтерфейс StringManipulator і перетворює вхідний рядок у верхній регістр
        StringManipulator stringManipulator = s -> s.toUpperCase();
        getOutput("Лямбда-вираз s -> s.toUpperCase()", stringManipulator.transform("Hello"));
        //3.1 Те ж саме, але використовуючи посилання на метод
        StringManipulator stringManipulatorMethodRef = String::toUpperCase;
        getOutput("Посилання на статичний метод String::toUpperCase", stringManipulatorMethodRef.transform("Hello"));
    }
}
