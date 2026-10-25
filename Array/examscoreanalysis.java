package Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems.ArraySample.Array;

public class examscoreanalysis {
    public static void main(String[] args) {
        int[] scores = {75, 80, 65, 90, 55, 85, 70, 95};
        int total = 0;
        int passCount = 0;
        for(int i=0; i < scores.length; i++) {
            total += scores[i];
        }
        double average = (double) total / scores.length;
        System.out.println("Average score:" + average);
        System.out.println("scores above average:");
        for(int i=0; i < scores.length; i++) {
            if(scores[i] > average) {
                System.out.println(scores[i]);
            }
        }
        for(int i= 0; i < scores.length; i++) {
            if(scores[i] >= 70) {
                passCount++;
            }
        }
        System.out.println("Students who passed:" + passCount);

        double percentage = (double) passCount / scores.length * 100;
        System.out.println("passpercentage:" + percentage + "%");
    }

}
            

        
    

