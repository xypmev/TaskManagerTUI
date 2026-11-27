package service;

import entity.Task;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class TaskService {
    private List<Task> taskList = new ArrayList<>();

    public void addNewTask(String taskName, String taskDescription) {
        taskList.add(taskName, taskDescription);
    }

    public boolean deleteTask(Long idToDelete) {
        return getTasksList().removeIf(task -> task.getTaskId() == idToDelete);
    }

    public List<Task> getTasksList() {
        return taskList;
    }
}

