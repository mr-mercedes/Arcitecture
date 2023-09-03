package main.java.ru.geekbrains.lesson3.lesson3;

import java.awt.*;

public class BMW_528d extends Car implements Fueling, Wiping{

    Refueling refueling;
    Wiping wiping;
    public BMW_528d(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
        this.fuelType = FuelType.Diesel;
    }

    public void setRefueling(Refueling refueling) {
        this.refueling = refueling;
    }

    public void setWiping(Wiping wiping) {
        this.wiping = wiping;
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void wipMirrors() {
        if (wiping != null) {
            wiping.wipMirrors();
        }
    }

    @Override
    public void wipWindshield() {
        if (wiping != null) {
            wiping.wipWindshield();
        }
    }

    @Override
    public void wipHeadlights() {
        if (wiping != null) {
            wiping.wipHeadlights();
        }
    }
}
