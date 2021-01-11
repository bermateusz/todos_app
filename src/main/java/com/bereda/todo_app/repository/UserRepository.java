package com.bereda.todo_app.repository;

import com.bereda.todo_app.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
