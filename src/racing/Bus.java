package racing;

import java.util.concurrent.ThreadLocalRandom;

class Bus extends Transport implements Competing{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.printf("Автобус %s, %s совершил старт\n", getBrand(), getModel());

    }

    @Override
    public void finish() {
        System.out.printf("Автобус %s, %s финишировал\n", getBrand(), getModel());

    }


    @Override
    public void pitStop() {
        System.out.printf("Автобус %s, %s заехал на пит стоп\n", getBrand(), getModel());

    }

    @Override
    public double bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public double maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 250);
    }
}
