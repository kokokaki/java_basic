package day13.inherit;

public class Player extends Object {

    public String name;
    public int level;
    public int hp;
    public int exp;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 50;
    }
    public void info() {
        System.out.println("\n=========== 캐릭터 정보 =============");
        System.out.println("# 아이디: " + name);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }
    public void attack() {
        System.out.println(name + "님이 공격합니다.");
    }
}
