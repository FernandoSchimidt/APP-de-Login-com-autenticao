package com.example.loginauthapi.domain.user;

import com.example.loginauthapi.domain.todo.Todo;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JsonProperty("id")
    private String id;
    private String name;
    private String email;
    private String password;
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "course")
//    private List<Todo> todo = new ArrayList<>();
}
