package ru.otus.java.basic.homeworks.homework7.transport;

public class Horse implements Transport {
    int power;

    public Horse(int power) {
        this.power = power;
    }
    
    @Override
    public boolean moveToDistance(int distance, TypesOfTerrain typesOfTerrain) {
        if (distance > 0 && distance * 2 < power && typesOfTerrain != TypesOfTerrain.SWAMP) {
            power -= distance * 2;
            System.out.println("Лошадь успешно преодолелала дистанцию в " + distance + " по местности " + typesOfTerrain);
            return true;
        }
        System.out.println("Лошадь не смогла преодолеть дистанцию в " + distance);
        return false;
    }
}
