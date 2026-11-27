package entity;

public class Task {
    private String taskName;
    private String taskDescription;
    private boolean taskIsComplete;
    private Long taskId;

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

    public Long getTaskId() {
        return taskId;
    }
    public void setTaskId(Long id) {
        this.taskId = id;
    }

}
