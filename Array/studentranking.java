package Basiclooping.intermediatelooping.nestedloops.Analyticalandcomplexproblems.ArraySample.Array;

public class studentranking {
    public static void main(String[] args) {
        int[] scores ={78, 90, 65, 90, 85, 72, 95, 85};

        for(int i = 0; i < scores.length - 1; i++) {
            for(int j = i + 1; j < scores.length; j++) {
                if(scores[i] < scores[j]) {
                    int temp = scores [i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        System.out.println("Scores from highest to lowest:");
        for(int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "");
        }

        System.out.println("\n\nThree highest distinct scores:");
        int count = 0;
        int previous = -1;

        for(int i = 0; i < scores.length; i++) {
            if(scores[i] != previous) {
                System.out.println(scores[i]);
                previous = scores[i];
                count++;
                if(count == 3) {
                    break;
                }
            }
        }

        System.out.println("\nstudent rankings:");
        int rank = 1;

        for(int i = 0; i < scores.length; i++) {
            if(i > 0 && scores[i] != scores[i - 1]) {
                rank = i + 1;
            }

            System.out.println("Score" + scores[i] + " - Rank" + rank);
        }
    }
}
    

