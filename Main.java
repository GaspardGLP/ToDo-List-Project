import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Modifier une tâche");
            System.out.println("3. Supprimer une tâche");
            System.out.println("4. Afficher toutes les tâches");
            System.out.println("5. Afficher l'historique d'une tâche");
            System.out.println("6. Quitter");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nom de la tâche :");
                    String name = scanner.nextLine();
                    System.out.println("Description de la tâche :");
                    String description = scanner.nextLine();
                    toDoList.addTask(name, description);
                    break;
                case 2:
                    toDoList.showTasks();
                    System.out.println("Index de la tâche à modifier :");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nouveau nom :");
                    String newName = scanner.nextLine();
                    System.out.println("Nouvelle description :");
                    String newDescription = scanner.nextLine();
                    System.out.println("Est-elle terminée ? (true/false) :");
                    boolean newStatus = scanner.nextBoolean();
                    toDoList.modifyTask(index, newName, newDescription, newStatus);
                    break;
                case 3:
                    toDoList.showTasks();
                    System.out.println("Index de la tâche à supprimer :");
                    int deleteIndex = scanner.nextInt();
                    toDoList.deleteTask(deleteIndex);
                    break;
                case 4:
                    toDoList.showTasks();
                    break;
                case 5:
                    toDoList.showTasks();
                    System.out.println("Index de la tâche pour afficher l'historique :");
                    int historyIndex = scanner.nextInt();
                    toDoList.showTaskHistory(historyIndex);
                    break;
                case 6:
                    running = false;
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}
