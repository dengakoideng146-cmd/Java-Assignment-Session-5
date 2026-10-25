package Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems.ArraySample.Array;
import java.util.Scanner;
public class productsearch {
    public static void main(String[] args) {
        int[] codes ={101, 105, 110, 115, 120, 125};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product code:");
        int searchcode = input.nextInt();
        boolean found = false;
        int checked = 0;

        for(int i = 0; i < codes.length; i++) {
            checked++;
            if(codes[i] == searchcode) {
                
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Product is unavailable.");
        }

        System.out.println("Element checked:" + checked);
        input.close();

    }
    }