package day16.abs;

public class Dog extends Pet {

    public Dog(String name, String kind) {
        super(name, kind);
    }

    @Override
    public void takeNap() {
        System.out.println("강아지는 이불안에서 낮잠을 잡니다~");
    }

    public void eatFood() {
        System.out.println("강아지는 곡식사료를 먹어요~");
    }
}
