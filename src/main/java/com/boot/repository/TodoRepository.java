package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.boot.model.ToDo;

/**
 * Created by Babu_2 on 05-07-2017.
 */
public interface TodoRepository extends JpaRepository<ToDo,Long> {
}
