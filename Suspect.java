class Suspect {

    int suspectId;
    String name;
    String location;

    // Constructor
    Suspect(int suspectId, String name, String location) {
        this.suspectId = suspectId;
        this.name = name;
        this.location = location;
    }

    // Display suspect details
    void displaySuspect() {
        System.out.println("Suspect ID: " + suspectId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println();
    }

    // Display all suspects
    static void displayAllSuspects(Suspect[] suspects) {
        for (Suspect suspect : suspects) {
            suspect.displaySuspect();
        }
    }

    // Main method
    public static void main(String[] args) {

        Suspect[] suspects = {
            new Suspect(101, "Ravi", "Bangalore"),
            new Suspect(102, "Priya", "Mysore"),
            new Suspect(103, "Kiran", "Tumkur")
        };

        displayAllSuspects(suspects);
    }
}