package gamelevel;

public class AdvancedLevel extends PlayerLevel{
    
    @Override
    public void run() {
        System.out.println("빨리 달린다");
    }

    @Override
    public void jump() {
        System.out.println("점프가능");
    }

    @Override
    public void turn() {
        System.out.println("돌줄 몰라");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급레벨");
    }
}
