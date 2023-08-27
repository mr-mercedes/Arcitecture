package main.java.ru.geekbrains.lesson1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private List<Point3D> locations = new ArrayList<>();

    public List<Point3D> getLocations() {
        return locations;
    }

    public void setLocations(List<Point3D> locations) {
        this.locations = locations;
    }
}
