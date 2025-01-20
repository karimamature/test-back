package project_1.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import project_1.entity.TodoEntity;
import project_1.repository.TodoRepository;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/todo")
@AllArgsConstructor
public class TodoController {

    private final TodoRepository todoRepository;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public TodoEntity createTodo(@RequestBody TodoEntity todoEntity){
        return todoRepository.save(todoEntity);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TodoEntity> getTodos() {
       return todoRepository.findAll();
    }

    @DeleteMapping ("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTodos(@PathVariable UUID id) {
         todoRepository.deleteById(id);
    }
}
