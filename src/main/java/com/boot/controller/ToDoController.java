package com.boot.controller;

import com.boot.model.ToDo;

import java.util.ArrayList;
import java.util.List;

import com.boot.repository.TodoRepository;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * Created by Babu_2 on 04-07-2017.
 */
@RestController
@RequestMapping("api/v1/")
public class ToDoController {

    @Autowired
    private TodoRepository repository;

    @RequestMapping(value="todos",method = RequestMethod.GET)
    public List<ToDo> list(){
        return repository.findAll();
    }

    @RequestMapping(value="todo", method=RequestMethod.POST)
    public ToDo create(@RequestBody ToDo todo){
        return repository.saveAndFlush(todo);
    }

    @RequestMapping(value="todos/{id}",method=RequestMethod.GET)
    public  ToDo find(@PathVariable Long id){
        return repository.findOne(id);
    }

    @RequestMapping(value="todos/{id}", method = RequestMethod.PUT)
    public ToDo update(@RequestBody ToDo todo, @PathVariable Long id){
        ToDo existing = this.repository.findOne(id);
        BeanUtils.copyProperties(todo, existing);
        return this.repository.saveAndFlush(existing);
    }

    @RequestMapping(value = "todos/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        ToDo todo = this.repository.findOne(id);
        this.repository.delete(todo);
    }
}
