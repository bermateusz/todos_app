package com.bereda.todo_app.repository;

import com.bereda.todo_app.entity.ToDoItem;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDoItem, Long> {
}
