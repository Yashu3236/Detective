import java.util.Scanner;
public class DetectiveGame {
    public static void main(String[] args) {        
        ClueManager clue = new ClueManager();
        //GAME MENU
        System.out.println("===========================");
        System.out.println("DETECTIVE INVESTIGATION");
        System.out.println("===========================");
        System.out.println("1. View Suspects");
        System.out.println("2. Investigate Suspect");
        System.out.println("3. Collect Clue");
        System.out.println("4. View Collected Clues");
        System.out.println("5. Accuse Suspect");
        System.out.println("6. Exit");
        int choice = 0;
         Scanner sc = new Scanner(System.in);

        //Select Choice
        while (true){
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();           
            switch (choice) {
                case 1 :
                    System.out.println("Choice = "+choice);
                    Suspect.displayAllSuspects(Suspect.suspects);
                    System.out.println("----------------------------------");
                    break;                   
                case 2 :
                    System.out.println("Choice = "+choice);
                    System.out.print("Enter Suspect ID:");
                    int id = sc.nextInt();
                    Investigation.displaySuspect(id);
                    System.out.println("-------------------");
                    System.out.println("----------------------------------");
                    break;                                        
                case 3 :
                    System.out.println("Choice = "+choice);
                    System.out.print("Enter a number between 1-6 : ");
                    int clues = sc.nextInt();
                    clue.collectClue(clues);
                    
                    System.out.println("----------------------------------");
                    break;
                    
                case 4 :
                    System.out.println("Choice = "+choice);
                    clue.displayCollectedClues();
                    System.out.println("----------------------------------");
                    break;
                case 5 :
                    System.out.println("Choice = "+choice);
                    //accuse
                    System.out.println("Enter Suspect ID to accuse: ");
                    int susId = sc.nextInt();
                    Investigation.accuse(susId);
                    
                    System.out.println("----------------------------------");
                    break;
                case 6 :
                    System.out.println("Choice = "+choice);
                    System.out.println("Investigation terminated\n");
                    System.out.println("----------------------------------");
                    sc.close();
                    System.exit(0);
                    break;                    
                default :
                    System.out.println("Invalid choice\n");
                    break;
            }            
        }

    }
    
}
