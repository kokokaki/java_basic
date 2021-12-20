package day10;

//실행용 클래스
public class Factory {

    public static void main(String[] args) {

        //객체의 생성
        Phone galaxy = new Phone();
        System.out.println("galaxy = " + galaxy);

        //객체의 속성과 기능을 참조할 때 : . 연산자
        galaxy.showSpec();

        System.out.println("====================================");

        Phone haptic = new Phone("햅틱2");
        haptic.showSpec();

        System.out.println("====================================");

        Phone iPhone = new Phone("아이폰X", "사파이어");
        iPhone.showSpec();

        System.out.println("===================================");
        
        iPhone.sendMessage(galaxy, "하이~~~");
        iPhone.sendMessage(galaxy, "뭐하니??");
        iPhone.sendMessage(galaxy, "헤헤헤히히흐흐흐");
        iPhone.sendMessage(galaxy, "ggzzㅋㅋㅋ");

        galaxy.checkMessages();

        haptic.sendMessage(iPhone, "안뇽~");
        galaxy.sendMessage(iPhone, "나는 갤럭시야~");

        iPhone.checkMessages();
        haptic.checkMessages();

    }
}
