package template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이운전");
        System.out.println("사람이 핸들조정");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크 밟는다");
    }

    @Override
    public void wiper() {
        System.out.println("비나 눈이오면작동");
    }
}
