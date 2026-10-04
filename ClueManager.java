public class ClueManager{
  String[] clues = {
    "The Office Door was opened at 2:15 PM. ",
    "CCTV shows someone entering the office.",
    "A torn piece of paper was found near the printer.",
    "A suspect's ID card was found inside the office.",
    "The printer was used shortly before the questions paper disappeared."
    };
  boolean[] collected = new boolean[5];
  public void displayAvailableClues(){
    System.out.println("Available Clues:");
    for(int i =0; i < clues.length ; i++) {
      if (!collected[i]) {
        System.out.println((i + 1) + " " + clues[i]);
      }
    }
  }
  public void collectClue(int clueNumber){
    if(clueNumber < 1 || clueNumber > 5){
      System.out.println("Invaild clue number");
      return; 
    }
    int index = clueNumber - 1;
    if(collected[index]){
      System.out.println("This clue has already been collected.");
    }
    else{
      collected[index] = true;
      System.out.println("Clue collected:");
      System.out.println(clues[index]);
    }
  }
  public void displayCollectedClues(){
    boolean found = false;
    System.out.println("Collected Clues :");
    for (int i =0; i < clues.length; i++){
      if(collected[i]){
        System.out.println((i+1) + " " + clues[i]);
        found = true ;
      }
    }
    if (!found){
      System.out.println("No clues have been collected yet.");
    }
  }
}
  
