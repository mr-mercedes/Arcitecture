package main.java.ru.geekbrains.lesson3.lesson3;

public class WipingStation implements Wiping{
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
