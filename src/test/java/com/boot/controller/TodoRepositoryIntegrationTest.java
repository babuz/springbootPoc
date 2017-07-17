package com.boot.controller;

/**
 * Created by Babu_2 on 08-07-2017.
 */

import com.boot.App;
import com.boot.model.ToDo;
import com.boot.repository.TodoRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.boot.test.SpringApplicationConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class TodoRepositoryIntegrationTest {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void testFindAll(){
        List<ToDo> list = todoRepository.findAll();
        System.out.println("test result : List Count : " + list.size());

        assertThat(list.size(), is(greaterThanOrEqualTo(0)));
    }
}
