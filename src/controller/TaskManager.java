package controller;

import entity.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList = new ArrayList<>();

    public TaskManager() {

    }

    public void addNewTask(String taskName, String taskDescription) {
        taskList.add(new Task(taskName, taskDescription));
    }

//    public void getAllTasks() {
//        for (Task task : taskList) {
//           System.out.println(task.getTaskName());
//           System.out.println(task.getTaskDescription());
//        }
//    }

    public List<Task> getTasksList() {
        return taskList;
    }
}

