public class TaskVersion {
    private String name;
    private String description;
    private boolean isCompleted;

    public TaskVersion(String name, String description, boolean isCompleted) {
        this.name = name;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "TaskVersion{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
