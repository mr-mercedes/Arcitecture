package main.java.ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Scene {
    //TODO: Доработать в рамках ДР

    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;

    public Scene(List<PoligonalModel> models, List<Flash> flashes) {
        this.models = models;
        this.flashes = flashes;
    }

    public int getId() {
        return id;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public Object method1(Object objects) {
        return new Object();
    }

    public Object method2(Object objects) {
        return new Object();
    }
}
