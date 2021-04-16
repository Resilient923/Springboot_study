package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("james",5000);
        Student Thomas = new Student("Thomas",10000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway(2);
        Thomas.takeSubway(subwayGreen);
        Thomas.showInfo();
        subwayGreen.showInfo();

    }
}
 