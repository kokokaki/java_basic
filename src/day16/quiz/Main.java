package day16.quiz;

public class Main {

    public static void main(String[] args) {

        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        System.out.println(tire);

        snowTire.roll();
        snowTire.chargeAir();
        tire.roll();
//        tire.chargeAir();

    }
}
