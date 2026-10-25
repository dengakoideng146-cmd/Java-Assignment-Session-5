package Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems.ArraySample.Array;

public class averagescores {
    public static void main(String[] args) {
        
        //1. create an array of student scores
        int[] scores = {80, 70, 90, 60};
        int total = 0;

        //2. Calculate the total of all scores
        for(int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        //3. Calculate the correct average using double division
        double average = (double) total / scores.length;

        //4. Display the average
        System.out.println("Average:" + average);

        //5. Using double division prevents integer truncation.
        // Changing total to double to also fixes this issue.
    }
}
