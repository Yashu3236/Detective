public class Suspect {

    int suspectId;
    String name;
    String location;
    String alibi;

    Suspect(int suspectId, String name, String location, String alibi) {
        this.suspectId = suspectId;
        this.name = name;
        this.location = location;
        this.alibi = alibi;
    }
    static Suspect[] suspects = {
            new Suspect(101, "Ravi", "Bangalore", "At home"),
            new Suspect(102, "Priya", "Mysore", "At work"),
            new Suspect(103, "Kiran", "Tumkur", "At college")
        };
    void displaySuspect() {
        System.out.println("ID: " + suspectId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Alibi: " + alibi);
        System.out.println("----------------------");
    }

    static void displayAllSuspects(Suspect[] suspects) {
        System.out.println("===== ALL SUSPECTS =====");

        for (Suspect s : suspects) {
            s.displaySuspect();
        }
    }

    // Main method
    public static void main(String[] args) {
        displayAllSuspects(Suspect.suspects);
    }
}