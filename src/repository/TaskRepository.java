package repository;

import entity.Task;

import java.util.List;
import java.util.TreeMap;

public class TaskRepository implements CRUDRepository<Task> {
    private final TreeMap<Long, Task> map = new TreeMap<>();

    @Override
    public void save(Task task) {
        if (map.isEmpty()) {
            task.setTaskId(1L);
            map.put(1L, task);
        }
    }

    @Override
    public Task findById(Long id) {
        return null;
    }

    @Override
    public void changeById(Long id, Task task) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Task> getAll() {
        return List.of();
    }

    @Override
    public boolean exitById(Long id) {
        return false;
    }
}
