package entity;

public class Task {
    private String taskName;
    private String taskDescription;
    private boolean isComplete;
    private int id;

    public Task(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }

}
