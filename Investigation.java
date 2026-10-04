public class Investigation {

    static class Suspect {
        int id;
        String name;
        int age;
        String occupation;

        Suspect(int id, String name, int age, String occupation) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.occupation = occupation;
        }
    }

    static Suspect[] suspects = {
        new Suspect(101, "Rahul", 25, "Engineer"),
        new Suspect(102, "Arun", 30, "Teacher"),
        new Suspect(103, "Kiran", 28, "Doctor")
    };

    static int culpritId = 103;
    static int attempts = 0;

    static Suspect searchSuspect(int id) {
        for (Suspect s : suspects) {
            if (s.id == id)
                return s;
        }
        return null;
    }

    static void displaySuspect(int id) {
        Suspect s = searchSuspect(id);

        if (s != null) {
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("Occupation: " + s.occupation);
        } else {
            System.out.println("Suspect not found.");
        }
    }

    static void accuse(int id) {
        if (attempts >= 3) {
            System.out.println("All 3 attempts are used.");
            return;
        }

        attempts++;

        if (id == culpritId)
            System.out.println("Correct! You found the culprit.");
        else
            System.out.println("Wrong accusation.");
    }

    public static void main(String[] args) {
        displaySuspect(101);

        accuse(101);
        accuse(102);
        accuse(103);
    }
}