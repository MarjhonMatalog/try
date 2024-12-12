import java.util.Scanner;

class UserDashboard extends Dashboard {
    private UserAccount user;

    public UserDashboard(UserAccount user) {
        this.user = user;
    }

    @Override
    public void displayMenu() {
        System.out.println("\nUser Dashboard");
        System.out.println("1. Add Animal Sighting");
        System.out.println("2. View Sightings");
        System.out.println("3. Logout");
    }

    @Override
    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSighting(scanner);
                    break;
                case 2:
                    viewSightings();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void addSighting(Scanner scanner) {
        System.out.print("Enter animal name: ");
        String animalName = scanner.nextLine();
        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        WildWatcher.sightings.add(new AnimalSighting(WildWatcher.sightingIdCounter++, animalName, location, date, description));
        System.out.println("Sighting added successfully.");
    }

    private void viewSightings() {
        if (WildWatcher.sightings.isEmpty()) {
            System.out.println("No sightings found.");
        } else {
            System.out.println("Animal Sightings:");
            for (AnimalSighting sighting : WildWatcher.sightings) {
                System.out.println(sighting.getDetails());
            }
        }
    }
}
