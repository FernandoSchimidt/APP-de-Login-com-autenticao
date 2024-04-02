package com.example.loginauthapi.services;

import com.example.loginauthapi.domain.todo.Todo;
import com.example.loginauthapi.repositories.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository repository;


    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> create(Todo todo) {
        repository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("priority").descending().and(
                Sort.by("name").ascending()
        );
        return repository.findAll(sort);
    }

}
