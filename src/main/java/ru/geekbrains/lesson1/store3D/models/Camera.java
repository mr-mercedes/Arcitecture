package main.java.ru.geekbrains.lesson1.store3D.models;

public class Camera implements Movable{
    //TODO: Доработать в рамках ДР
    private Location location;
    private Angle3D angle;

    public Camera(Location location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    @Override
    public void rotate(Angle3D angle3D) {

    }

    @Override
    public void move(Point3D point3D) {

    }
}
