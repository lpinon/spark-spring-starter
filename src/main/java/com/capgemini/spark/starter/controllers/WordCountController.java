package com.capgemini.spark.starter.controllers;

import com.capgemini.spark.starter.services.WordCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class WordCountController {

    @Autowired
    WordCountService service;

    @RequestMapping(method = RequestMethod.GET, path = "/wordcount")
    public Map<String, Long> count() {
        List<String> wordList = Arrays.asList("Siddhant|Agnihotry|Technocrat|Siddhant|Sid".split("\\|"));
        return service.getCount(wordList);
    }
}