

class Car {

    String model;

    public Car(String model) {
        this.model = model;
    }

    void accel() {
        System.out.println(model + " 주행을 시작합니다.");
    }
}

public class Hello {

    public static void main(String[] args) {
        Car ferrari = new Car("페라리");
        ferrari.accel();
    }

}
