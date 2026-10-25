package Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems.ArraySample.Array;

public class productinventory {
    public static void main(String[] args) {
        int[] stock = {12, 8, 15, 6};
        System.out.println("First product: " + stock[0]);
        System.out.println("Last product: " + stock[3]);
        stock[1] = 10;
        for(int i = 0; i < stock.length; i++) {
            System.out.println(stock[i]);
        }
        // Accessing stock[4] cause an Arrayindexoutofboundsexception bacause
        // valid indexes are 0, 1, 2 and 3.

    }
}
