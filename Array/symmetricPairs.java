package Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems.ArraySample.Array;
import java.util.Arrays;
public class symmetricPairs {
    public static void main(String[] args) {
        
        //1. Create the original array
        int[] data = {1, 2, 3, 4, 5};

        //2. Copy the original array to changing source values
        int[]  original = data.clone();

        //3. Calculate every symmetric pair using original values
        for(int i = 0; i < data.length; i++) {
            data[i] = original[i] + original[data.length - 1 - i];
        }

        //4. Display the corected output
        System.out.println(Arrays.toString(data));

        // The original code has a bug because changes
        // array elements while using them in later calculations.
        // Using a copy ensures every calculations uses original values
    }
}

    

