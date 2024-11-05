import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String description;
    private boolean isCompleted;
    private List<TaskVersion> history;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.isCompleted = false;
        this.history = new ArrayList<>();
        saveVersion(); // Sauvegarde initiale de la tâche
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        saveVersion();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        saveVersion();
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
        saveVersion();
    }

    public void saveVersion() {
        history.add(new TaskVersion(this.name, this.description, this.isCompleted));
    }

    public List<TaskVersion> getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
