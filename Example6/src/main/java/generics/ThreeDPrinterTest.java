package generics;

public class ThreeDPrinterTest {

    public static void main(String[] args) {
        ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<Powder>();
        ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
        printer1.setMaterial(new Powder());
        printer2.setMaterial(new Plastic());

        Powder powder = printer1.getMaterial();



        System.out.println(printer1);
        System.out.println(printer2);
        printer1.printing();
        printer2.printing();


    }
}
