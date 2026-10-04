public class DetectiveGame {
    public static void main(String[] args) {        
        ClueManager clue = new ClueManager();
        //GAME MENU
        System.out.println("===========================\n");
        System.out.println("DETECTIVE INVESTIGATION\n");
        System.out.println("===========================\n");
        System.out.println("1. View Suspects\n");
        System.out.println("2. Investigate Suspect\n");
        System.out.println("3. Collect Clue\n");
        System.out.println("4. View Collected Clues\n");
        System.out.println("5. Accuse Suspect\n");
        System.out.println("6. Exit\n");
        int choice = 1;
        //Select Choice
        while (choice != 6){
            switch (choice) {
                case 1 :
                    System.out.println("Choice = "+choice);
                    Suspect.displayAllSuspects(Suspect.suspects);
                    System.out.println("\n----------------------------------\n");
                    break;                   
                case 2 :
                    System.out.println("Choice = "+choice);
                    for(int i =0; i< Investigation.suspects.length; i++){
                        int id = Investigation.suspects[i].id;
                        Investigation.displaySuspect(id);
                        System.out.println("\n-------------------\n");
                    }
                    System.out.println("\n----------------------------------\n");
                    break;                                        
                case 3 :
                    System.out.println("Choice = "+choice);
                    clue.displayAvailableClues();
                    System.out.println("\n----------------------------------\n");
                    for(int i = 1; i<6; i++){
                        clue.collectClue(i);
                    }
                    System.out.println("\n----------------------------------\n");
                    break;
                    
                case 4 :
                    System.out.println("Choice = "+choice);
                    clue.displayCollectedClues();
                    System.out.println("\n----------------------------------\n");
                    break;
                case 5 :
                    System.out.println("Choice = "+choice);
                    //accuse
                    for(Investigation.Suspect sus : Investigation.suspects){
                        Investigation.accuse(sus.id);
                    }
                    System.out.println("\n----------------------------------\n");
                    break;
                case 6 :
                    System.out.println("Choice = "+choice);
                    System.out.println("Investigation terminated\n");
                    System.out.println("\n----------------------------------\n");
                    break;                    
                default :
                    System.out.println("Invalid choice");
                    break;
            }
            choice++;            
        }

    }
    
}
