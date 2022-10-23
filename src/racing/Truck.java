package racing;

import java.util.concurrent.ThreadLocalRandom;

class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.printf("Грузовой автомобиль %s, %s стартовал\n", getBrand(), getModel());

    }

    @Override
    public void finish() {
        System.out.printf("Грузовой автомобиль %s, %s фигишировал\n", getBrand(), getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовой автомобиль %s, %s совершил пит стоп\n", getBrand(), getModel());

    }

    @Override
    public double bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public double maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 200);
    }
}
