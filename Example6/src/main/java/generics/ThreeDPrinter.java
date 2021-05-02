package generics;

public class ThreeDPrinter<T extends Material> {//Material에서 상속받은 애만 사용할 수 있다.

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;

        material.doPrinting();

    }

    public void printing(){
        material.doPrinting();
    }
    private T material;

    @Override
    public String toString() {
        return material.toString();
    }
}
