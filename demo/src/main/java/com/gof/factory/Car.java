/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package com.gof.factory;

/**
 * @author shaozk
 * @Description: TODO
 */
public interface Car {
    void run();
}

class Audi implements Car {

    @Override
    public void run() {
        System.out.println("奥迪");
    }
}


class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪");
    }
}

class Client1 {
    public static void main(String[] args) {
        Car c1 = new Byd();
        Car c2 = new Audi();
        c1.run();
        c2.run();
    }
}

class CarFactory {
    public static Car CreateCar(String brand) {
        switch (brand) {
            case "byd":
                return new Byd();
            case "audi":
                return new Audi();
            default:
                return null;
        }
    }
}

class Client2 {
    public static void main(String[] args) {
        Car car1 = CarFactory.CreateCar("byd");
        Car car2 = CarFactory.CreateCar("audi");
        car1.run();
        car2.run();

    }
}

