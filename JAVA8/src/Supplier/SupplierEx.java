package Supplier;

import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<Double> sn= ()->Math.random();
        System.out.println(sn.get());
    }
}
