package gamelevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("개빨리 달린다");
    }

    @Override
    public void jump() {
        System.out.println("점프잘함");
    }

    @Override
    public void turn() {
        System.out.println("잘 돌 수 있음");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급레벨");
    }
}
