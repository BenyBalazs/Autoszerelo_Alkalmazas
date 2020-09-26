package database;

import models.Car;

public final class DataTransfer {

    private static Car car;

    private DataTransfer(){ }

    public static Car getCar(){

        return car;
    }

    public static void setCar(Car paramCar){

        car = paramCar;
    }
}

