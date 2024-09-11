import java.util.Scanner;

public class Polling {
    private int[][] ratings;
    private String[] topics;
    private int[][] countRatings;
    private int[] ratePoints;

    Polling(String[] topics) {
        ratings = new int[topics.length][10]; // [nTopics][nRatings]
        countRatings = new int[topics.length][10]; // [nTopics][nRatings]
        ratePoints = new int[topics.length];
        this.topics = topics;
    }

    public String[] getTopics() {
        return topics;
    }

    public int[][] getRatings() {
        return ratings;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public void rateTopics() {
        Scanner poll = new Scanner(System.in);
        System.out.println("Rate the following topics from 1 to 10: ");
        for (int i = 0; i < topics.length; i++) {
            System.out.println("\nTOPIC-" + (i + 1) + ": " + topics[i]);
            ratings[i] = new int[10];
            for (int j = 0; j < 10; j++) {
                System.out.print("Rating " + (j+1) + ": ");
                int input;
                input = Math.max(1, Math.min(10, poll.nextInt()));
                ratings[i][j] = input;
                ratePoints[i] += input;
                countRatings(i, input);
            }
        }
        poll.close();
    }

    private void countRatings(int row , int col) {
        countRatings[row][col-1]++;
    }

    private double getAverage(int[] ratings) {
        double sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += ratings[i];
        }
        return sum / ratings.length;
    }

    public void displayRatings() {
        System.out.printf("%-16s| %-2d | %-2d | %-2d | %-2d | %-2d | %-2d | %-2d | %-2d | %-2d | %-2d | %-7s\n",
                         "TOPICS", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "AVERAGE");
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < topics.length; i++) {
            System.out.printf("%-16s| ", topics[i]);
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-2d | ", countRatings[i][j]);
            }
            System.out.printf("%-7.2f\n", getAverage(ratings[i]));
        }
    }

    public void displayHighestRating() {
        int highest = ratePoints[0];
        int index = 0;
        for (int i = 1; i < ratePoints.length; i++)
            if (ratePoints[i] > highest)
            {
                highest = ratePoints[i];
                index = i;
            }
        System.err.println("Highest rating:\n" + "Topic: " + topics[index] + ", \tRating points: " + highest);
    }

    public void displayLowestRating() {
        int lowest = ratePoints[0];
        int index = 0;
        for (int i = 1; i < ratePoints.length; i++)
            if (ratePoints[i] < lowest)
            {
                lowest = ratePoints[i];
                index = i; 
            }
           System.out.println("Lowest rating:\n" + "Topic: " + topics[index] + ", \tRating points: " + lowest);
    }

}
