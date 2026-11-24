package service;

import entity.Task;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class TaskService {
    private List<Task> taskList = new ArrayList<>();
    private Random getRandomId = new Random();

    public void addNewTask(String taskName, String taskDescription) {
        taskList.add(new Task(taskName, taskDescription, getRandomId.nextInt(0, 1024)));
    }

    public boolean deleteTask(int idToDelete) {
        return getTasksList().removeIf(task -> task.getTaskId() == idToDelete);
    }

//    public void getAllTasks() {
//        for (Task task : taskList) {
//           System.out.println(task.getTaskName());
//           System.out.println(task.getTaskDescription());
//           System.out.println(task.getTaskId());
//        }
//    }

    public List<Task> getTasksList() {
        return taskList;
    }
}

