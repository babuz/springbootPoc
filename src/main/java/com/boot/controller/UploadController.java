package com.boot.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;

/**
 * Created by Babu_2 on 15-07-2017.
 */
@RestController
public class UploadController {

    //private final static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Value("${multipart.location}")
    private String location;

    @RequestMapping(value="/upload",method = RequestMethod.POST,produces = MediaType.TEXT_PLAIN_VALUE)
    public String upload(@RequestParam("start") int start,
                         @RequestParam("end") int end,
                         @RequestParam("speed") int speed,
                         @RequestParam("repeat") boolean repeat) throws IOException {

        //log.info(String.format("Save file to {0}",videoFile.getAbsolutePath()));

        return "we have done it";
    }


    @RequestMapping(value="/upload",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
    public String upload(){

        return "Hi I reached upload controller";
    }

    @RequestMapping(value="/test",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
    public String test(){

        return "Hi I reached upload controller";
    }
}