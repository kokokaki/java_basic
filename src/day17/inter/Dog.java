package day17.inter;

public class Dog extends Animal implements Pet {

    @Override
    public void play() {
        System.out.println("강아지는 산책하면서 놀아요~");
    }

    @Override
    public void eat() {
        System.out.println("강아지는 사료를 먹어요~");
    }
}
