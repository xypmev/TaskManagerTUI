package ui;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import entity.Task;
import service.TaskService;

public class Interface {
    private final TaskService taskService = new TaskService();
    private final Scanner scanner = new Scanner(System.in);

    private boolean isRunning = true;

    public void runUi() {
        System.out.println("TaskManagerTUI");
        while (isRunning) {
            List<Task> tasksList = new ArrayList<>(taskService.getTasksList());
            System.out.println("Введите действие (? - справка)");
            String choice = scanner.nextLine().trim().toLowerCase();
            switch (choice) {
                case "1" -> enterTaskInfo();
                case "2" -> printAllTasks(tasksList);
                //case "3" -> removeTask();
                case "5" -> removeTask();
                case "0" -> exitUi();
                case "?" -> getInfo();
                default -> invalidCommand();
            }
        }
    }

    private void enterTaskInfo() {
        System.out.println("---Создание задачи---");
        System.out.print("Введите название задачи: ");
        String taskName = scanner.nextLine();
        System.out.print("Введите описание задачи: ");
        String taskDescription = scanner.nextLine();
        createNewTask(taskName, taskDescription);
//        for (Task task : taskManager.getTasksList()) {
//            System.out.println("Присвоен ID: " + task.getTaskId());
//        }
        System.out.println("Задача успешно создана!");
    }

    private void createNewTask(String taskName, String taskDescription) {
        taskService.addNewTask(taskName, taskDescription);
    }

    private void removeTask() {
        System.out.println("---Удаление задачи---");
        System.out.print("Введите ID задачи которую хотите удалить: ");
        int idToDelete = Integer.parseInt(scanner.nextLine().trim());
        taskService.deleteTask(idToDelete);
        System.out.println("Задача удалена");

    }

    private void printAllTasks(List<Task> tasksList) {
        tasksListIsEmpty(tasksList);
        for (Task task : tasksList) {
            System.out.println("---Просмотр задачи---");
            System.out.println("Название: " + task.getTaskName());
            System.out.println("Описание: " + task.getTaskDescription());
            System.out.println("ID: " + task.getTaskId());
        }
    }

    private void getInfo() {
        System.out.println("""
                ---Справка---
                1 - Создать задачу
                2 - Просмотр всех задач
                3 - Изменить задачу
                5 - Удалить задачу
                0 - Выход
                ? - Информация (Вы уже здесь)
                """);
    }

    private void tasksListIsEmpty(List<Task> tasksList) {
        if (tasksList.isEmpty()) {
            System.out.println("Список задач пуст");
        }
    }

    private void invalidCommand() {
        System.out.println("Неверная команда");
    }

    private void exitUi() {
        System.out.println("Выход из программы...");
        isRunning = false;
    }

}
