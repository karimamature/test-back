package project_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project_1.entity.TodoEntity;


import java.util.UUID;

public interface TodoRepository extends JpaRepository<TodoEntity, UUID> {

}
