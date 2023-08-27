package main.java.ru.geekbrains.lesson1.store3D.models;

public class Flash implements Movable{
    //TODO: Доработать в рамках ДР
    private Location location;
    private Angle3D angle;
    private Color color;
    private Float power;

    public Flash(Location location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    @Override
    public void rotate(Angle3D angle3D) {
    }

    @Override
    public void move(Point3D point3D) {
    }
}
