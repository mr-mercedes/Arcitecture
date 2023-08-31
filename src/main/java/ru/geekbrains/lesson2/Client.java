package main.java.ru.geekbrains.lesson2;

public class Client {
    public static void approve(Object code){
        System.out.println("Заказчик принимает " + code);
    }

    public static void main(String[] args) {
        Programmer programmer = new ProgrammerAdapter();
        Object juneCode = programmer.cry();
        approve(juneCode);
        Object middleCode = programmer.debug();
        approve(middleCode);
        Object seniorCode = programmer.refactoring();
        approve(seniorCode);
    }


}
