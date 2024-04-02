package com.example.loginauthapi.repositories;

import com.example.loginauthapi.domain.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, String> {
}
