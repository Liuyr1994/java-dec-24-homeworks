package ru.otus.java.basic.homeworks.homework7.transport;

public class Car implements Transport {
    private int fuel;
    
    @Override
    public boolean moveToDistance(int distance, TypesOfTerrain typesOfTerrain) {
        if (distance > 0 && distance * 3 < fuel && typesOfTerrain != TypesOfTerrain.DENSE_FOREST && typesOfTerrain != TypesOfTerrain.SWAMP) {
            fuel -= distance * 3;
            System.out.println("Машина проехала " + distance + " по местности " + typesOfTerrain);
            return true;
        }

        System.out.println("Машина не смогла проехать нужное расстояние " + distance);
        return false;
    }
}
