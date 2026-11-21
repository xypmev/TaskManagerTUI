package ui;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import entity.Task;
import controller.TaskManager;

public class Interface {
    private TaskManager taskManager = new TaskManager();
    private Scanner scanner = new Scanner(System.in);

    private boolean isRunning = true;

    public Interface() {

    }

    public void runUi() {
        System.out.println("TaskManagerTUI");
        while (isRunning) {
            System.out.println("Введите действие. (? - справка)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Введите название задачи: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Введите описание задачи: ");
                    String taskDescription = scanner.nextLine();
                    createNewTask(taskName, taskDescription);
                }
                case 2 -> printAllTasks();
                case 0 -> exitUi();
                default -> System.out.println("Неверная команда");
            }
        }
    }

    private void createNewTask(String taskName, String taskDescription) {
        taskManager.addNewTask(taskName, taskDescription);
    }

    private void printAllTasks() {
        List<Task> tasksList= new ArrayList<>(taskManager.getTasksList());
        for (Task task : tasksList) {
            System.out.println(task.getTaskName());
            System.out.println(task.getTaskDescription());
        }
    }

    private void exitUi() {
        System.out.println("Выход из программы...");
        isRunning = false;
    }

}
