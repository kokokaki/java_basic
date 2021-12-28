package day15.poly.car;

public class Main {

    public static void main(String[] args) {

        Tucson t1 = new Tucson();
        Tucson t2 = new Tucson();
        Tucson t3 = new Tucson();

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();
        Sonata s4 = new Sonata();

        Car[] cars = {t1, s1, t2, s2, t3, s3, s4};

        for (Car c : cars) {
            c.run();
        }

        System.out.println("=====================================");

        Driver park = new Driver();

        park.drive(new Stinger());

        System.out.println("=======================================");

        Sonata mySonata = (Sonata) park.buyCar("소나타");
        System.out.println(mySonata);
        mySonata.run();
        mySonata.joinSonataClub();

        cars[0] = mySonata;

        System.out.println("===============================");

        CarShop shop = new CarShop();

        int money = shop.sellCar(mySonata);
        System.out.println("money = " + money);

    }
}
