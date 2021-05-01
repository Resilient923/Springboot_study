package interfaceex;

public class Customer implements Buy,Sell{
    @Override
    public void buy() {
        System.out.println("물건을산다");
    }

    @Override
    public void order() {
        System.out.println("고객판매주문");
    }

    @Override
    public void sell() {
        System.out.println("물건을판다");
    }
}
