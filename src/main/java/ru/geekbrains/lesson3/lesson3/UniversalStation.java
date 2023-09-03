package main.java.ru.geekbrains.lesson3.lesson3;

public class UniversalStation implements Refueling, Wiping{

    public void complexService(Car car){
        fuel(car.fuelType);
        wipHeadlights();
        wipMirrors();
        wipWindshield();
    }

    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }

    @Override
    public void wipMirrors() {
        System.out.println("Wip mirrors");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Wip wind shield");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Wip head lights");
    }
}
