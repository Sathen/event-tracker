package com.education.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class Event {

    @Size(min = 2,max = 30)
    private String name;
}
