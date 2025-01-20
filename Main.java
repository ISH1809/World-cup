# World-cup
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String[] teams = { "England", "France", "Portugal", "Morroco","Brazil", "Netherlands", "Croatia", "Argentina"};

        System.out.println("Welcome to the World Cup Knockout Tournament!");
        System.out.println("Quarter-Finals:");
        String[] semiFinalists = playRound(teams);

        System.out.println("\nSemi-Finals:");
        String[] finalists = playRound(semiFinalists);

        System.out.println("\nFinal:");
        String winner = playFinal(finalists);

        System.out.println("\nCongratulations to " + winner + " for winning the World Cup!");
    }

    
    public static String[] playRound(String[] teams) {
        String[] winners = new String[teams.length / 2];

        for (int i = 0; i < teams.length; i += 2) {
            int score1 = random.nextInt(5); 

            System.out.println(teams[i] + " (" + score1 + ") vs " + teams[i + 1] + " (" + score2 + ")");

            
            if (score1 > score2) {
                winners[i / 2] = teams[i];
            } else if (score2 > score1) {
                winners[i / 2] = teams[i + 1];
            } else {
                
                System.out.println("Match tied! Deciding winner...");
                winners[i / 2] = (random.nextBoolean()) ? teams[i] : teams[i + 1];
                System.out.println("Winner after tie-break: " + winners[i / 2]);
            }
        }

        return winners;
    }

    
    public static String playFinal(String[] teams) {
        Random random = new Random();

        int score1 = random.nextInt(5);
        int score2 = random.nextInt(5);

        System.out.println(teams[0] + " (" + score1 + ") vs " + teams[1] + " (" + score2 + ")");

        if (score1 > score2) {
            return teams[0];
        } else if (score2 > score1) {
            return teams[1];
        } else {
            System.out.println("Match tied! Deciding winner...");
            return (random.nextBoolean()) ? teams[0] : teams[1];
        }
    }
}
