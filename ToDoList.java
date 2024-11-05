import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String name, String description) {
        Task task = new Task(name, description);
        tasks.add(task);
        System.out.println("Tâche ajoutée : " + task);
    }

    public void modifyTask(int index, String newName, String newDescription, boolean newStatus) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setName(newName);
            task.setDescription(newDescription);
            task.setCompleted(newStatus);
            System.out.println("Tâche modifiée : " + task);
        } else {
            System.out.println("Index invalide !");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Tâche supprimée : " + removedTask);
        } else {
            System.out.println("Index invalide !");
        }
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche à afficher.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }

    public void showTaskHistory(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            System.out.println("Historique des versions de la tâche :");
            for (TaskVersion version : task.getHistory()) {
                System.out.println(version);
            }
        } else {
            System.out.println("Index invalide !");
        }
    }
}
