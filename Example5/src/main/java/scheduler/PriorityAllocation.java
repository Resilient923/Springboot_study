package scheduler;

public class PriorityAllocation implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("고객등급높은 상담전화를 먼저 가져온다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 skill이 가장 높은 상담원이 대기열에 앞에 우선 배분한다");
    }
}
