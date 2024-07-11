
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("file: ");
        String fileName = scanner.nextLine();
        
        System.out.println("Team:");
        String searchForTeam = scanner.nextLine().toLowerCase();
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            
            while (scan.hasNextLine()) {
                String row = scan.nextLine().toLowerCase();
                String [] parts = row.split(",");
                
                String firstTeam = parts[0];
                String secondTeam = parts[1];
                int firstTeamScore = Integer.valueOf(parts[2]);
                int secondTeamScore = Integer.valueOf(parts[3]);
                
                if(row.equals("")) {
                    continue;
                }
                
                if (searchForTeam.equals(firstTeam)) {
                    count++;
                    
                    if (firstTeamScore > secondTeamScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                 if (searchForTeam.equals(secondTeam)) {
                    count++;
                    
                    if (firstTeamScore < secondTeamScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
          System.out.println("Games: " + count);
          System.out.println("Wins: " + wins);
          System.out.println("Losses: " + losses);
    }

}
