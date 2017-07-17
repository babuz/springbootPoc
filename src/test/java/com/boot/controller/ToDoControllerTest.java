package com.boot.controller;


import com.boot.model.ToDo;
import com.boot.repository.TodoRepository;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Created by Babu_2 on 06-07-2017.
 */
public class ToDoControllerTest {

    @InjectMocks
    private ToDoController toDoController;

    @Mock
    private TodoRepository todoRepository;

    @Before
    public  void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testTodoListReturnsObjects(){
        ToDo todo = new ToDo() ;
        todo.setId(1l);

        when(todoRepository.findOne(1l)).thenReturn(todo);
       // verify(todoRepository).findOne(1l);

        ToDo item = this.toDoController.find(1l);
        assertNotNull(item);
        //assertEquals(1l,item.getId().longValue());
        assertThat(item.getId(),is(1l));
    }
}
