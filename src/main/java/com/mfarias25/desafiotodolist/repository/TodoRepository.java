package com.mfarias25.desafiotodolist.repository;

import com.mfarias25.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>  {

}
