package com.education.model;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class Event {

    @Size(min = 2,max = 30)
    private String name;
}
