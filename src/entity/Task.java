package entity;

public class Task {
    private String taskName;
    private String taskDescription;
    private boolean taskIsComplete;
    private int taskId;

    public Task(String taskName, String taskDescription, int taskId) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskId = taskId;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }

    public int getTaskId() {
        return taskId;
    }

}
