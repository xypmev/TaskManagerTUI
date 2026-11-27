package repository;

import java.util.List;

public interface CRUDRepository<Entity> {
    void save(Entity entity);
    Entity findById(Long id);
    void changeById(Long id, Entity entity);
    void deleteById(Long id);
    List<Entity> getAll();
    boolean exitById(Long id);
}
