package gamelevel;

public class BegginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("천천히 달린다");
    }

    @Override
    public void jump() {
        System.out.println("점프할줄몰라");
    }

    @Override
    public void turn() {

        System.out.println("돌줄 몰라");
    }

    @Override
    public void showLevelMessage() {

        System.out.println("초보자레벨");
    }
}
