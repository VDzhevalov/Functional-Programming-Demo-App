package app;

import app.model.MathOperation;

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
    }
}
