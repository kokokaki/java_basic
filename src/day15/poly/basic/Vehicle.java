package day15.poly.basic;

class Bus extends Vehicle {}
class Taxi extends Vehicle {}
class Airplane extends Vehicle {}

class Student {

    Vehicle vehicle;

    void goToSchool() {
        vehicle = new Airplane();
    }
}

public class Vehicle {
}
