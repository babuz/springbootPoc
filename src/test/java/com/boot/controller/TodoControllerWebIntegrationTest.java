package com.boot.controller;

import com.boot.App;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

/**
 * Created by Babu_2 on 16-07-2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
@WebIntegrationTest
public class TodoControllerWebIntegrationTest {

    @Test
    public void testAll() throws IOException {
        RestTemplate template = new RestTemplate();
        ResponseEntity response = template.exchange("http://localhost:8080/api/v1/todos",
                                        HttpMethod.GET,null,String.class);
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonResponse = objectMapper.readTree(response.getBody().toString());
        assertThat(jsonResponse.isMissingNode(),is(false));
        assertThat(jsonResponse.toString(),is("[]"));
        assertThat(response.getBody().toString(),equalTo("[]"));
    }
}
