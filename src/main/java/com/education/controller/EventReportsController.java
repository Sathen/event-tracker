package com.education.controller;

import com.education.model.Event;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class EventReportsController {

    @RequestMapping(value = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> getEvents(){
        try (Stream<Event> eventStream = Stream.of(
                new Event("runing"),
                new Event("swiming"))) {
            return eventStream.collect(Collectors.toList());
        }
    }
}
